/*

 This file is part of XleTView 
 Copyright (C) 2003 Martin Sveden
 
 This is free software, and you are 
 welcome to redistribute it under 
 certain conditions;

 See LICENSE document for details.

*/

package net.beiker.xletview.media;

import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;

import javax.media.ClockStoppedException;
import javax.media.Control;
import javax.media.Controller;
import javax.media.ControllerListener;
import javax.media.GainControl;
import javax.media.IncompatibleSourceException;
import javax.media.IncompatibleTimeBaseException;
import javax.media.Player;
import javax.media.Time;
import javax.media.TimeBase;
import javax.media.protocol.DataSource;

import xjavax.tv.locator.Locator;
import xjavax.tv.media.AWTVideoSizeControlImpl;
import xjavax.tv.service.selection.ServiceContentHandler;

import net.beiker.cake.Log;
import net.beiker.cake.Logger;
import net.beiker.xletview.ui.XContainer;
import net.beiker.xletview.util.Util;


/**
 * Displays the video, or an image symbolizing video
 */
public class VideoLayer extends XContainer implements ServiceContentHandler, Player {
	/** Debugging facility */
	private final static Logger logger = Log.getLogger(VideoLayer.class);
	
    private static VideoLayer THE_INSTANCE;
    private AWTVideoSizeControlImpl awtVideoSizeControl; 
    
    private VideoLayer() {        
    }

    public static VideoLayer getInstance() {
        if (THE_INSTANCE == null) {
            THE_INSTANCE = new VideoLayer();
            //THE_INSTANCE.setLayout(null);
            THE_INSTANCE.setLayout(null);
        }
        return THE_INSTANCE;
    }

    /**
     * Overrides the super implementation so
     * it's only possible to add one Component
     * 
     */
    @Override
	public Component add(Component comp){
        Component added = null;
        if(getComponentCount() < 1){
            added = super.add(comp);
        }
        else{
            try {
                throw new Exception("Component already added, can only contain one component");
            }
            catch (Exception e) {
                logger.warn(Util.getStackTrace(e));                
            }
        }
        return added;
    }
    
    @Override
	public Component add(Component comp, int index){
        return add(comp);
    }
    
    @Override
	public Component add(String name, Component comp){
        return add(comp);
    }

    //    public void setSize(AWTVideoSize size){
    //        int videoX          = size.getDestination().x;
    //        int videoY          = size.getDestination().y;
    //        int videoWidth      = size.getDestination().width;
    //        int videoHeight     = size.getDestination().height;
    //        setBounds(videoX, videoY, videoWidth, videoHeight);  
    //        validate();      
    //    }

    //    public void paint(Graphics g){
    //    	Debug.write(this, "paint");
    //    	Debug.write(this, "this = " + this);
    //        super.paint(g);
    //    }

    @Override
	public void paint(Graphics g) {
        for (int i = 0; i < getComponentCount(); i++) {
            getComponent(i).paint(g);
        }
    }

	/* (non-Javadoc)
	 * @see xjavax.tv.service.selection.ServiceContentHandler#getServiceContentLocators()
	 */
	@Override
	public Locator[] getServiceContentLocators() {
		// TODO Auto-generated method stub
		logger.debug("getServiceContentLocators");
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.media.Player#getVisualComponent()
	 */
	@Override
	public Component getVisualComponent() {
		// TODO Auto-generated method stub
		logger.debug("getVisualComponent");
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.media.Player#getGainControl()
	 */
	@Override
	public GainControl getGainControl() {
		// TODO Auto-generated method stub
		logger.debug("getGainControl");
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.media.Player#getControlPanelComponent()
	 */
	@Override
	public Component getControlPanelComponent() {
		// TODO Auto-generated method stub
		logger.debug("getControlPanelComponent");
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.media.Player#start()
	 */
	@Override
	public void start() {
		// TODO Auto-generated method stub
		logger.debug("start");
		
	}

	/* (non-Javadoc)
	 * @see javax.media.Player#addController(javax.media.Controller)
	 */
	@Override
	public void addController(Controller arg0) throws IncompatibleTimeBaseException {
		// TODO Auto-generated method stub
		logger.debug("addController");
		
	}

	/* (non-Javadoc)
	 * @see javax.media.Player#removeController(javax.media.Controller)
	 */
	@Override
	public void removeController(Controller arg0) {
		// TODO Auto-generated method stub
		logger.debug("removeController");
		
	}

	/* (non-Javadoc)
	 * @see javax.media.MediaHandler#setSource(javax.media.protocol.DataSource)
	 */
	@Override
	public void setSource(DataSource arg0) throws IOException, IncompatibleSourceException {
		// TODO Auto-generated method stub
		logger.debug("setSource");
		
	}

	/* (non-Javadoc)
	 * @see javax.media.Controller#getState()
	 */
	@Override
	public int getState() {
		// TODO Auto-generated method stub
		logger.debug("getState");
		return 0;
	}

	/* (non-Javadoc)
	 * @see javax.media.Controller#getTargetState()
	 */
	@Override
	public int getTargetState() {
		// TODO Auto-generated method stub
		logger.debug("getTargetState");
		return 0;
	}

	/* (non-Javadoc)
	 * @see javax.media.Controller#realize()
	 */
	@Override
	public void realize() {
		// TODO Auto-generated method stub
		logger.debug("realize");
		
	}

	/* (non-Javadoc)
	 * @see javax.media.Controller#prefetch()
	 */
	@Override
	public void prefetch() {
		// TODO Auto-generated method stub
		logger.debug("prefetch");
		
	}

	/* (non-Javadoc)
	 * @see javax.media.Controller#deallocate()
	 */
	@Override
	public void deallocate() {
		// TODO Auto-generated method stub
		logger.debug("deallocate");
		
	}

	/* (non-Javadoc)
	 * @see javax.media.Controller#close()
	 */
	@Override
	public void close() {
		// TODO Auto-generated method stub
		logger.debug("close");
		
	}

	/* (non-Javadoc)
	 * @see javax.media.Controller#getStartLatency()
	 */
	@Override
	public Time getStartLatency() {
		// TODO Auto-generated method stub
		logger.debug("getStartLatency");
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.media.Controller#getControls()
	 */
	@Override
	public Control[] getControls() {
		// TODO Auto-generated method stub
		logger.debug("getControls");
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.media.Controller#getControl(java.lang.String)
	 */
	@Override
	public Control getControl(String s) {
		Control result = null;
		
			if(s.equals("javax.tv.media.AWTVideoSizeControl")){				
				result = AWTVideoSizeControlImpl.getInstance();
			}
		
		return result;
	}

	/* (non-Javadoc)
	 * @see javax.media.Controller#addControllerListener(javax.media.ControllerListener)
	 */
	@Override
	public void addControllerListener(ControllerListener arg0) {
		// TODO Auto-generated method stub
		logger.debug("addControllerListener");
		
	}

	/* (non-Javadoc)
	 * @see javax.media.Controller#removeControllerListener(javax.media.ControllerListener)
	 */
	@Override
	public void removeControllerListener(ControllerListener arg0) {
		// TODO Auto-generated method stub
		logger.debug("removeControllerListener");
		
	}

	/* (non-Javadoc)
	 * @see javax.media.Clock#setTimeBase(javax.media.TimeBase)
	 */
	@Override
	public void setTimeBase(TimeBase arg0) throws IncompatibleTimeBaseException {
		// TODO Auto-generated method stub
		logger.debug("setTimeBase");
		
	}

	/* (non-Javadoc)
	 * @see javax.media.Clock#syncStart(javax.media.Time)
	 */
	@Override
	public void syncStart(Time arg0) {
		// TODO Auto-generated method stub
		logger.debug("syncStart");
		
	}

	/* (non-Javadoc)
	 * @see javax.media.Clock#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		logger.debug("stop");
		
	}

	/* (non-Javadoc)
	 * @see javax.media.Clock#setStopTime(javax.media.Time)
	 */
	@Override
	public void setStopTime(Time arg0) {
		// TODO Auto-generated method stub
		logger.debug("setStopTime");
		
	}

	/* (non-Javadoc)
	 * @see javax.media.Clock#getStopTime()
	 */
	@Override
	public Time getStopTime() {
		// TODO Auto-generated method stub
		logger.debug("getStopTime");
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.media.Clock#setMediaTime(javax.media.Time)
	 */
	@Override
	public void setMediaTime(Time arg0) {
		// TODO Auto-generated method stub
		logger.debug("setMediaTime");
		
	}

	/* (non-Javadoc)
	 * @see javax.media.Clock#getMediaTime()
	 */
	@Override
	public Time getMediaTime() {
		// TODO Auto-generated method stub
		logger.debug("getMediaTime");
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.media.Clock#getMediaNanoseconds()
	 */
	@Override
	public long getMediaNanoseconds() {
		// TODO Auto-generated method stub
		logger.debug("getMediaNanoseconds");
		return 0;
	}

	/* (non-Javadoc)
	 * @see javax.media.Clock#getSyncTime()
	 */
	@Override
	public Time getSyncTime() {
		// TODO Auto-generated method stub
		logger.debug("getSyncTime");
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.media.Clock#getTimeBase()
	 */
	@Override
	public TimeBase getTimeBase() {
		// TODO Auto-generated method stub
		logger.debug("getTimeBase");
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.media.Clock#mapToTimeBase(javax.media.Time)
	 */
	@Override
	public Time mapToTimeBase(Time arg0) throws ClockStoppedException {
		// TODO Auto-generated method stub
		logger.debug("mapToTimeBase");
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.media.Clock#getRate()
	 */
	@Override
	public float getRate() {
		// TODO Auto-generated method stub
		logger.debug("getRate");
		return 0;
	}

	/* (non-Javadoc)
	 * @see javax.media.Clock#setRate(float)
	 */
	@Override
	public float setRate(float arg0) {
		// TODO Auto-generated method stub
		logger.debug("setRate");
		return 0;
	}

	/* (non-Javadoc)
	 * @see javax.media.Duration#getDuration()
	 */
	@Override
	public Time getDuration() {
		// TODO Auto-generated method stub
		logger.debug("getDuration");
		return null;
	}
}
