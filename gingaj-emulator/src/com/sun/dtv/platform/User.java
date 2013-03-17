/******************************************************************************
 * Este arquivo eh parte da implementacao do Projeto OpenGinga
 *
 * Direitos Autorais Reservados (c) 2005-2009 UFPB/LAVID
 *
 * Este programa eh software livre; voce pode redistribui-lo e/ou modificah-lo sob
 * os termos da Licenca Publica Geral GNU versao 2 conforme publicada pela Free
 * Software Foundation.
 *
 * Este programa eh distribuido na expectativa de que seja util, porem, SEM
 * NENHUMA GARANTIA; nem mesmo a garantia implicita de COMERCIABILIDADE OU
 * ADEQUACAO A UMA FINALIDADE ESPECIFICA. Consulte a Licenca Publica Geral do
 * GNU versao 2 para mais detalhes.
 *
 * Voce deve ter recebido uma copia da Licenca Publica Geral do GNU versao 2 junto
 * com este programa; se nao, escreva para a Free Software Foundation, Inc., no
 * endereco 59 Temple Street, Suite 330, Boston, MA 02111-1307 USA.
 *
 * Para maiores informacoes:
 * ginga @ lavid.ufpb.br
 * http://www.openginga.org
 * http://www.ginga.org.br
 * http://www.lavid.ufpb.br
 * ******************************************************************************
 * This file is part of OpenGinga Project
 *
 * Copyright: 2005-2009 UFPB/LAVID, All Rights Reserved.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License version 2 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU General Public License version 2 for more
 * details.
 *
 * You should have received a copy of the GNU General Public License version 2
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
 *
 * For further information contact:
 * ginga @ lavid.ufpb.br
 * http://www.openginga.org
 * http://www.ginga.org.br
 * http://www.lavid.ufpb.br
 * *******************************************************************************/
package com.sun.dtv.platform;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public final class User {

	//Default property name for location country code.
	public static String PROPKEY_LOCATION_COUNTRY = "";

    //Default property name for parental rating.
	public static String PROPKEY_RATING_PARENTAL = "";

    //Default property name for UI font size.
	public static String PROPKEY_UI_FONT_SIZE = "26";

    //Default property name for user address.
	public static String PROPKEY_USER_ADDRESS = "";

    //Default property name for user email.
	public static String PROPKEY_USER_EMAIL = "";

    //Default property name for user languages.
	public static String PROPKEY_USER_LANGUAGES = "";

    //Default property name for user name.
	public static String PROPKEY_USER_NAME = "";
	
	private static HashMap<String, String> props = new HashMap<String, String>();
	private static HashMap<String, List<UserPropertyListener>> listeners = new HashMap<String, List<UserPropertyListener>>();
	private static final Object LIST_LOCK = new Object();
	private static final Object PROPS_LOCK = new Object();

    //Attaches a listener that is triggered for changes to any properties within the range defined by filter.
    public static void addListener(UserPropertyListener listener, String filter)
    						throws NullPointerException,
    								IllegalArgumentException {
		
    	if (listener == null || filter == null) {
    		
    		throw new NullPointerException();
    	}
    	
    	String[] filtersStrings = parseFilter(filter);
    	
    	synchronized (LIST_LOCK) {			
		
    		for (int i = 0; i < filtersStrings.length; i++) {
    			
    			String aFilter = filtersStrings[i];
		    	List<UserPropertyListener> list = null;
		    	if (listeners.containsKey(aFilter)) {
		    		
		    		list = listeners.get(aFilter);
		    	} else {
		    		
		    		list = new LinkedList<UserPropertyListener>();
		    	}
		    	
		    	if (!list.contains(listener)) {
		    		
		    		list.add(listener);
		    		listeners.put(aFilter, list);
		    	}
    		}
    	}
	}

    //Retrieves a copy of all user properties that matches filter and for which the application has read access right.
	public static Properties getProperties(String filter)
							throws SecurityException,
    								IllegalArgumentException,
    								NullPointerException {
		
		String[] filters = parseFilter(filter);
		Properties propr = new Properties();
		
		synchronized (PROPS_LOCK) {
			
			for (int i = 0; i < filters.length; i++) {
				
				if (filters[i].endsWith("*")) {
				
					String rFilter = filters[i].substring(0, filters[i].length() - 1);
					Iterator<String> iter = props.keySet().iterator();
					while (iter.hasNext()) {
						
						String key = iter.next();
						if (key.startsWith(rFilter)) {
					
							propr.put(key, props.get(key));
						}
					}
				} else {
					
					if (propr.containsKey(filters[i])) {
						
						propr.put(filters[i], props.get(filters[i]));
					}
				}
			}
		}
		
		return propr;
	}

    //Gets the user property indicated by the specified key.
    public static String getProperty(String key)
    						throws SecurityException,
    								IllegalArgumentException,
    								NullPointerException {
		
    	return getProperty(key, null);
    }

    //Gets the user property indicated by the specified key.
    public static String getProperty(String key, String def)		
    				throws SecurityException,
    						IllegalArgumentException,
    						NullPointerException {
    	
    	if (key == null) {
    	
    		throw new NullPointerException();
    	}
    	
    	if (key.isEmpty()) {
    		
    		throw new IllegalArgumentException();
    	}
    	
    	String value = def;
    	
    	synchronized (PROPS_LOCK) {
			
    		String get = props.get(key);
    		if (get != null) {
    			
    			value = get;
    		}
		}
    	
    	return value;    	
    }

    //Detaches a user property listener that was previously attached using addListener().
	public static void removeListener(UserPropertyListener listener){
		
		if (listener == null) {
			
			return;
		}
		
		synchronized (LIST_LOCK) {
		
			Set<String> keys = listeners.keySet();
			Iterator<String> inter = keys.iterator();
			while (inter.hasNext()) {
				
				String key = inter.next();
				List<UserPropertyListener> list = listeners.get(key);
				list.remove(listener);
			}
		}
	}

    //Removes this property and all of its descendants, invalidating any properties contained in the removed nodes.
    public static void removeProperties(String filter)
    					throws SecurityException,
    							IllegalArgumentException,
    							NullPointerException {
    	
    	if (filter == null) {
    		
    		throw new NullPointerException();
    	}
    	
    	synchronized (PROPS_LOCK) {
			
    		Properties gprops = getProperties(filter);
    		Iterator<Object> inte = gprops.keySet().iterator();
    		while (inte.hasNext()) {
    			
    			String key = (String) inte.next();
    			String value = (String) gprops.get(key);
    			props.remove(key);
    			dispatchRemoved(key, value);
    		}
		}
    }

    //Adds new properties and/or replaces existing properties.
    public static void setProperties(Properties properties)
    					throws NullPointerException,
    							SecurityException {
    	
    	if (properties == null) {
    		
    		throw new NullPointerException();
    	}
    	
    	Iterator<Object> iter = properties.keySet().iterator();
    	while (iter.hasNext()) {
    		
    		String key = (String) iter.next();
    		String value = (String) properties.get(key);
    		setProperty(key, value);
    	}
    }

    //Sets the user property indicated by the specified key.
    public static String setProperty(String key, String value)
						    throws SecurityException,
						    		NullPointerException,
						    		IllegalArgumentException {
    	
    	if (value == null) {
    		
    		throw new NullPointerException();
    	}
    	
    	synchronized (PROPS_LOCK) {
		
    		String oldValue = getProperty(key);
        	
        	if (oldValue != null && oldValue.equals(value)) {
        		
        		return oldValue;
        	}
        	
        	props.put(key, value);
        	dispatchChanged(key, oldValue, value);
        	
    		return oldValue;
		}    	
    }
    
    private static String[] parseFilter(String filter) throws IllegalArgumentException {
    	
    	if (!filter.matches("(([a-bA-Z0-9]+([.]?[*]?|[.]?))|[*]);+")) {
        	
    		throw new IllegalArgumentException("Invalid filter"); 
    	}
    	
    	return filter.split(";");
    }
    
    private static void dispatchRemoved(final String key, final String value) {
    	
    	Iterator<String> filters = listeners.keySet().iterator();
    	while (filters.hasNext()) {
    	
    		String filter = filters.next();			
			if (filter.endsWith("*")) {
			
				String rFilter = filter.substring(0, filter.length() - 1);
				if (key.startsWith(rFilter)) {
					
					final List<UserPropertyListener> list = listeners.get(filter);										
					for (int i = 0; i < list.size(); i++) {
						
						list.get(i).propertyRemoved(key, value);
					}
				}
			} else {
				
				if (key.equals(filter)) {
					
					final List<UserPropertyListener> list = listeners.get(filter);
					for (int i = 0; i < list.size(); i++) {
						
						list.get(i).propertyRemoved(key, value);
					}
				}
			}
		}
    }
    
    private static void dispatchChanged(final String key, final String oldValue,
    										final String newValue) {
    	
    	Iterator<String> filters = listeners.keySet().iterator();
    	while (filters.hasNext()) {
    	
    		String filter = filters.next();			
			if (filter.endsWith("*")) {
			
				String rFilter = filter.substring(0, filter.length() - 1);
				if (key.startsWith(rFilter)) {
					
					final List<UserPropertyListener> list = listeners.get(filter);
					for (int i = 0; i < list.size(); i++) {
								
							list.get(i).propertyChanged(key, oldValue, newValue);
					}
				}
			} else {
				
				if (key.equals(filter)) {
					
					final List<UserPropertyListener> list = listeners.get(filter);
					for (int i = 0; i < list.size(); i++) {
						
						list.get(i).propertyChanged(key, oldValue, newValue);
					}
				}
			}
		}
    }
}
