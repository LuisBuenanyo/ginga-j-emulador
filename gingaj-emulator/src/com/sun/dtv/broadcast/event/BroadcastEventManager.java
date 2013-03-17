/*
 * Copyright (c) 2009 LAViD
 *
 *  Copyright (C) 2009 Jefferson Ferreira <jefferson@lavid.ufpb.br>
 */
package com.sun.dtv.broadcast.event;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.tv.locator.InvalidLocatorException;
import javax.tv.locator.Locator;

import net.beiker.xletview.window.TvWindow;

import java.lang.Runnable;

import com.sun.dtv.locator.URLLocator;
import com.sun.dtv.lwuit.List;

/**
 * 
 */
public class BroadcastEventManager {
	// following variables are implicitely defined by getter- or setter-methods:
	private Locator locator;
	private String url;
	private ArrayList<BroadcastEventListener> listeners;
	private Locator eventLocator;
	Thread seGenerator;

	/**
	 * Creates a <code>BroadcastEventManager</code> instance that represents the
	 * events referenced by the given <code>Locator</code>.
	 * 
	 * 
	 * This constructor throws <code>java.io.IOException</code> if it determines
	 * immediately that the requested broadcast events cannot be accessed. Since
	 * this constructor may complete its work asynchronously, absence of an
	 * <code>IOException</code> is not a guarantee that the requested broadcast
	 * events are accessible.
	 * 
	 * 
	 * @param locator
	 *            - A Locator referencing the source of the BroadcastEvent.
	 * @throws InvalidLocatorException
	 *             - If locator does not refer to broadcast events.
	 * @throws IOException
	 *             - If the requested broadcast events cannot be accessed.
	 * @throws UnsupportedOperationException
	 *             - If broadcast filesystem is not supported.
	 */
	public BroadcastEventManager(Locator locator)
			throws InvalidLocatorException, IOException {
		listeners = new ArrayList<BroadcastEventListener>();
		// eventLocator = new URLLocator("dtv://1.1.1");
		//this.readEventLocator();
		this.locator = locator;
		TvWindow.getEventManagers().add(this);
		// seGenerator = new Thread(new SEGenerator(this));
		// seGenerator.start();
	}

	/**
	 * Creates a <code>BroadcastEventManager</code> instance that represents the
	 * events whose path name in the broadcast is the given path argument.
	 * 
	 * 
	 * This constructor throws <code>java.io.IOException</code> if it determines
	 * immediately that the requested broadcast events cannot be accessed. Since
	 * this constructor may complete its work asynchronously, absence of an
	 * <code>IOException</code> is not a guarantee that the requested broadcast
	 * events are accessible.
	 * 
	 * 
	 * @param url
	 *            - The stream path name.
	 * @throws IOException
	 *             - If the requested broadcast events cannot be accessed.
	 * @throws UnsupportedOperationException
	 *             - If broadcast filesystem is not supported.
	 */
	public BroadcastEventManager(String url) throws IOException {

		// TODO implement BroadcastEventManager

		listeners = new ArrayList<BroadcastEventListener>();
		this.url = url;
		// System.out.println("\nCriando BEM\n\n");
	}

	/**
	 * Subscribes a <code>BroadcastEventListener</code> to receive notifications
	 * of received <code>BroadcastReceivedEvent</code>. If the specified
	 * listener is currently subscribed then no action is performed.
	 * 
	 * 
	 * @param listener
	 *            - The BroadcastEventListener to be notified.
	 * @throws IOException
	 *             - If there are insufficient resources to support this
	 *             listener.
	 * @throws SecurityException
	 *             - If a security manager exists and its
	 *             SecurityManager.checkRead(java.lang.String) method denies
	 *             read access to the file.
	 * @see removeListener(com.sun.dtv.broadcast.event.BroadcastEventListener)
	 */
	public void addListener(BroadcastEventListener listener)
			throws IOException, SecurityException {
		// TODO implement addListener
		//if (alreadyListener(listener) == 0) {
			
		if(!listeners.contains(listener)) {
			System.out.println("Cadastrei um listener\n");
			listeners.add(listener);

			
			//if (seGenerator == null)
				//seGenerator = new Thread(new SEGenerator(this));

			//if (!seGenerator.isAlive())
				//seGenerator.start();

		}

	}

	/**
	 * Unsubscribes a <code>BroadcastEventListener</code> from receiving
	 * notifications of received <code>BroadcastEvent</code>. If the given
	 * <code>BroadcastFileListener</code> is not currently subscribed for
	 * notification then no action is performed.
	 * 
	 * 
	 * @param listener
	 *            - A currently registered BroadcastEventListener.
	 * @see addListener(com.sun.dtv.broadcast.event.BroadcastEventListener)
	 */
	public void removeListener(BroadcastEventListener listener) {
		// TODO implement removeListener
		// System.out.println("Tamanho do vetor: " + listeners.size());
		for (int i = 0; i < listeners.size(); i++) {
			if (listener == listeners.get(i)) {
				// System.out.println("\nRemovi um listener\n");
				listeners.remove(i);
			}
		}
	}

	/**
	 * Returns a <code>Locator</code> identifying this
	 * <code>BroadcastEvent</code>.
	 * 
	 * 
	 * 
	 * @return A Locator identifying this BroadcastEvent.
	 */
	public Locator getLocator() {
		return this.locator;
	}

	private int alreadyListener(BroadcastEventListener listener) {
		for (int i = 0; i < listeners.size(); i++) {
			if (listener == listeners.get(i)) {
				// /System.out.println("\nListener ja existente\n");
				return 1;
			}
		}
		// System.out.println("\nListener adicionado com sucesso\n");
		return 0;
	}

	void dispatchEvent(BroadcastReceivedEvent event){
		for (BroadcastEventListener listener : listeners) {
			listener.received(event);
		}
	}
	
	void sendEventToListeners() {

		if (locator != null) {
			//System.out.println("Locator diferente de nulo!\n");
			if(eventLocator == null){
				//Do nothing, ignore locator
				//System.out.println("Locator incompativel\n");
				return;
			} /*else if (eventLocator.toString().equalsIgnoreCase("dtv://99.99.99")){
				System.out.println("Locator ignorado\n");
			}*/ else if (!eventLocator.equals(locator)) {
				//System.out.println("Evento nao eh deste locator\n");
				return;
			} else {
				//System.out.println("Locator compativel\n");
			}
		}

		for (BroadcastEventListener listener : listeners) {
			listener.received(new BroadcastReceivedEvent(this));
		}
	}

	// Look supporting_files/broadcastevent.txt to change the event locator
	private void readEventLocator() {
		try {
			// System.out.println("CreateEvent 2\n");
			BufferedReader in = new BufferedReader(new FileReader(
					this.url));
			// System.out.println("CreateEvent 3\n");
			String str;

			while (in.ready()) {
				str = in.readLine();
				
				try {
					eventLocator = new URLLocator(str);
					return;
				} catch (InvalidLocatorException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private class SEGenerator implements Runnable {
		BroadcastEventManager manager;

		public SEGenerator(BroadcastEventManager manager) {
			this.manager = manager;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub

			// if (manager.listeners.get(0) == null) return;

			// BroadcastEventListener listener = manager.listeners.get(0);
			String filePath = TvWindow.getPathBCT();
			
			while (filePath == null){
				
				try {
					Thread.sleep(1000);
					filePath = TvWindow.getPathBCT();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Nome do Arquivo BCT: " + filePath);
			url = filePath;
			
			manager.readEventLocator();
			
			while (true) {
				try {
					Thread.sleep(5000);
					manager.sendEventToListeners();
					// if (listener != null)
					// listener.received(new BroadcastReceivedEvent(manager));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}
}
