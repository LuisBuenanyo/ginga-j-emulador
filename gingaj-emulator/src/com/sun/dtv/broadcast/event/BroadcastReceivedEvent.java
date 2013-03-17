/*
 * Copyright (c) 2009 LAViD
 *
 *  Copyright (C) 2009 Jefferson Ferreira <jefferson@lavid.ufpb.br>
 */
package com.sun.dtv.broadcast.event;

import java.io.BufferedReader;
import com.sun.dtv.locator.URLLocator;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EventObject;
import javax.tv.locator.InvalidLocatorException;
import javax.tv.locator.Locator;


import net.beiker.xletview.window.TvWindow;

/**
 * 
 */
public class BroadcastReceivedEvent extends EventObject {
	// following variables are implicitely defined by getter- or setter-methods:
	private byte[] data;
	private long identifier;
	private String name;
	private long time;
	private long duration;
	protected Locator locator;
	private long timeToWait;
	Thread dispatcher;
	/**
	 * Creates a <code>BroadcastFileEvent</code> indicating that the specified
	 * <code>BroadcastFile</code> has changed.
	 * 
	 * 
	 * @param source
	 *            - The BroadcastFile whose contents have changed.
	 */
	public BroadcastReceivedEvent(BroadcastEventManager source) {
		super(source);
		//System.out.println("Criei um Evento BRE\n");
		this.loadEvent();
		
		if(timeToWait < 0) return;
		
		dispatcher = new Thread(new EventDispatcher(this, timeToWait*1000));
		dispatcher.start();
		
	}

	/**
	 * Retrieves the received data block of the
	 * <code>BroadcastReceivedEvent</code>.
	 * 
	 * 
	 * 
	 * @return the data
	 */
	public byte[] getData() {
		return this.data;
	}

	/**
	 * Returns the identifier this <code>BroadcastReceivedEvent</code>.
	 * 
	 * 
	 * 
	 * @return the identifier of this BroadcastReceivedEvent. Returns -1 if
	 *         unknown.
	 */
	public long getIdentifier() {
		return this.identifier;
	}

	/**
	 * Returns the name this <code>BroadcastReceivedEvent</code>.
	 * 
	 * 
	 * 
	 * @return the name of this BroadcastReceivedEvent. Returns null if unknown.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Returns the time of this <code>BroadcastReceivedEvent</code>.
	 * 
	 * 
	 * 
	 * @return the time of this BroadcastReceivedEvent in microseconds. Returns
	 *         -1 if unknown.
	 */
	public long getTime() {
		return this.time;
	}

	/**
	 * Returns the duration of this <code>BroadcastReceivedEvent</code>.
	 * 
	 * 
	 * 
	 * @return the duration of this broadcast event in microseconds. Returns -1
	 *         if unknown.
	 */
	public long getDuration() {
		return this.duration;
	}

	/**
	 * From this point only additional methods not visible for developers
	 */

	private void loadEvent() {
		//System.out.println("CreateEvent 1\n");

		try {
			//System.out.println("CreateEvent 2\n");
			BufferedReader in = new BufferedReader(new FileReader(TvWindow.getPathBCT()));
			//System.out.println("CreateEvent 3\n");
			String str;
			int cont_line=0;
			while (in.ready()) {
				str = in.readLine();
				if (cont_line == 0){
					try {
						this.locator = new URLLocator(str);
					} catch (InvalidLocatorException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//First line carries the locator
				}
				else if (cont_line == 1) {
					this.timeToWait = Integer.parseInt(str);
					long notificationTime = System.currentTimeMillis() + this.timeToWait*1000;
					long timeGone = notificationTime - TvWindow.getStartTime();
					//System.out.println("Time Gone: " + timeGone);
					this.time = timeGone*90;
				}
				else if (cont_line == 2)
					this.name = str;
				else if (cont_line == 3)
					this.identifier = Integer.parseInt(str);
				else if (cont_line == 4)
					this.duration = Integer.parseInt(str);
				else if (cont_line == 5){
					this.data = str.getBytes();
					//this.data = new byte[str.length()];
					//this.data = str.co;
				}
				else return;
				
				//System.out.println("Conteudo " + str + "\n");
				cont_line++;
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	Locator getLocator(){
		return this.locator;
	}
	
	
	
	private class EventDispatcher implements Runnable {
		BroadcastReceivedEvent event;
		long timeToWait;
		
		public EventDispatcher(BroadcastReceivedEvent event, long timeToWait) {
			this.event = event;
			this.timeToWait = timeToWait;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			//System.out.println("èvent waiting to be notified");
			try {
				Thread.sleep(this.timeToWait);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("èvent notified");			
			ArrayList<BroadcastEventManager> managers = new ArrayList<BroadcastEventManager>();
			managers = TvWindow.getEventManagers();
			
			for (BroadcastEventManager manager: managers){
				
				if (manager == null) continue;
				
				if (manager.getLocator() != null) {
					//System.out.println("Locator diferente de nulo!\n");
					if(event.getLocator() == null){
						//Do nothing, ignore locator
						//System.out.println("Locator incompativel\n");
						return;
					} else if (!manager.getLocator().equals(event.getLocator())) {
						//System.out.println("Evento nao eh deste locator\n");
						return;
					} else {
						//System.out.println("Locator compativel\n");
					}
				}
				
				manager.dispatchEvent(this.event);
			}

		}
		
	}

}
