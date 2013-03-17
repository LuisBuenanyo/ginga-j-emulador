package com.sun.dtv.net;

import java.net.Authenticator;
import java.net.Socket;
import java.util.Properties;

import com.sun.dtv.platform.User;
import com.sun.dtv.resources.ScarceResourceListener;

class NetworkDeviceImpl extends NetworkDevice {

	private ScarceResourceListener listener = null;
	private NetworkDeviceStatusListener netList = null;
	private boolean connected = false;
	private long timeout = -1;
	private Socket con = null;
	private String profile = null;
	private boolean reserved = false;
	private int type = -1;
	
	public NetworkDeviceImpl(ScarceResourceListener listener, int type) {
		
		super();
		this.listener = listener;
		
		if (type ==  NetworkDevice.TYPE_ANY) {
			
			type = NetworkDevice.TYPE_ETHERNET_DHCP;
		}
		
		this.type = type;
}
	
	@Override
	public boolean isAvailable() {

		return true;
	}
	
	@Override
	public boolean isConnected() {

		return this.connected;
	}

	@Override
	public void reserve(boolean force, long timeoutms,
			ScarceResourceListener listener) {

		this.reserved = true;
	}
	
	@Override
	public void release() {

		this.reserved = false;
		if (this.listener != null) {
			
			this.listener.released(this);
		}
	}
	
	@Override
	public int getType() {

		return this.type;
	}
	
	@Override
	public String getConnectionProfile() {

		if (this.connected) {
			
			return this.profile;
		} else {
			
			return null;
		}
	}
	
	@Override
	public void connect(Authenticator auth, String profile,
			NetworkDeviceStatusListener listener, long inactivityTimeout)
				throws NullPointerException,
			    IllegalArgumentException,
			    SecurityException,
			    IllegalStateException {

		if (listener == null) {
			
			throw new NullPointerException();
		}
		
		if (profile == null) {
			
			profile = "com.sun.dtv.net.if.profiles.default";
		}
		
		if (!profile.startsWith("com.sun.dtv.net.if.profiles.")) {
			
			throw new IllegalArgumentException("Profile does not start with com.sun.dtv.net.if.profiles");
		}
		
		Properties props = User.getProperties(profile + ".*");
		if (props.isEmpty()) {
			
			throw new IllegalArgumentException("Profile was not found in properties");
		}
		
		if (!this.reserved) {
			
			throw new IllegalStateException();
		}
		
		/*String host = props.getProperty(this.profile + ".host");
		String port = props.getProperty(this.profile + ".port");
		
		if (host == null) {
			
			listener.connectionFailed(this, "Unable to find host parameter");
		}
		
		if (port == null) {
			
			listener.connectionFailed(this, "Unable to find port parameter");
		}
		
		int portInt = -1;
		try {
			
			portInt = Integer.parseInt(port);
		} catch (Exception e) {
			
			listener.connectionFailed(this, "Invalid port parameter");
		}
		
		try {
			
			this.con = new Socket(host, portInt);
			
			this.connected = true;
			this.profile = profile;
			this.timeout = inactivityTimeout;
			this.netList = listener;
			this.netList.connected(this, NetworkInterface
					.getByInetAddress(this.con.getLocalAddress()));
		} catch (Exception e) {
			
			listener.connectionFailed(this, "Unable to connect");
		}*/
		
	}
	
	//TODO Implements timeout
	private class TimeoutThread extends Thread {
		
		
	}
}
