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
import java.net.URL;

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

import net.beiker.cake.Log;
import net.beiker.cake.Logger;

public class ImagePlayer implements Player{

	private static final Logger log = Log.getLogger(ImagePlayer.class);
	
    private ImagePlayerVisualComponent visualComponent;
    private ControllerListener controllerListener;

    public ImagePlayer(URL imageURL){
        visualComponent = new ImagePlayerVisualComponent(imageURL);
        visualComponent.setVisible(false);
        log.debug("constructor");
    }

    @Override
	public void addController(Controller newController){}

    @Override
	public Component getControlPanelComponent(){ return null;}
    @Override
	public GainControl getGainControl(){return null;}
    
    @Override
	public Component getVisualComponent(){
        return visualComponent;
    }
    
    @Override
	public void removeController(Controller oldController){}

    @Override
	public void start(){
        //imagePlayerThread = new Thread(this, "imagePlayerThread");
        visualComponent.setVisible(true);
        //imagePlayerThread.start();
    }

    @Override
	public void stop(){
        visualComponent.setVisible(false);
    }


    // Methods inherited from interface javax.media.MediaHandler -->
    @Override
	public void setSource(DataSource source) throws java.io.IOException, IncompatibleSourceException{
    }
    // Methods inherited from interface javax.media.MediaHandler //

    // Methods inherited from interface javax.media.Duration -->
    @Override
	public Time getDuration(){return null;}
    // Methods inherited from interface javax.media.Duration //

    // Methods inherited from interface javax.media.Clock -->
    @Override
	public void setTimeBase(TimeBase master) throws IncompatibleTimeBaseException{}
    @Override
	public void syncStart(Time at){}
    @Override
	public void setStopTime(Time stopTime){}
    @Override
	public Time getStopTime(){return null;}
    @Override
	public void setMediaTime(Time now){}
    @Override
	public Time getMediaTime(){return null;}
    @Override
	public long getMediaNanoseconds(){return -1l;}
    @Override
	public Time getSyncTime(){return null;}
    @Override
	public TimeBase getTimeBase(){return null;}
    @Override
	public Time mapToTimeBase(Time t) throws ClockStoppedException{return null;}
    @Override
	public float getRate(){return -1f;}
    @Override
	public float setRate(float factor){return -1f;}
    // Methods inherited from interface javax.media.Clock //

    // Methods inherited from interface javax.media.Controller -->
    @Override
	public int getState(){return -1;}
    @Override
	public int getTargetState(){return -1;}
    @Override
	public void realize(){}
    @Override
	public void prefetch(){}
    @Override
	public void deallocate(){}
    @Override
	public void close(){}
    @Override
	public Time getStartLatency(){return null;}
    @Override
	public Control[] getControls(){return null;}
    @Override
	public Control getControl(java.lang.String forName){return null;}
    
    @Override
	public void addControllerListener(ControllerListener listener){
        this.controllerListener = listener;
    }
    @Override
	public void removeControllerListener(ControllerListener listener){
        this.controllerListener = null;
    }
    


}
