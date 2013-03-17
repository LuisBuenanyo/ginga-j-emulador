package br.org.sbtvd.ui;

import com.sun.dtv.lwuit.Component;
import com.sun.dtv.lwuit.Image;
import com.sun.dtv.lwuit.animations.Transition;

import com.sun.dtv.ui.DTVContainer;

public class StillDTVContainer extends DTVContainer {

    public StillDTVContainer()
    {
	super();
	this.setType(DTVContainer.STILL);
    }

    @Override
	public void addComponent(Component cmp) {
	if(cmp instanceof br.org.sbtvd.ui.StillPicture)
	{
	    super.addComponent(cmp);
	}
    }

    @Override
	public void addComponent(Object constraints, Component cmp) {
	if(cmp instanceof br.org.sbtvd.ui.StillPicture)
	{
	    super.addComponent(constraints, cmp);
	}
    }

    @Override
	public void addToBack(Component component) {
	if(component instanceof br.org.sbtvd.ui.StillPicture)
	{
	    super.addToBack(component);
	}
    }

    @Override
	public void addToFront(Component component) {
	if(component instanceof br.org.sbtvd.ui.StillPicture)
	{
	    super.addToFront(component);
	}
    }

    @Override
	public void pop(Component component) {
	if(component instanceof br.org.sbtvd.ui.StillPicture)
	{
	    super.pop(component);
	}
    }

    @Override
	public void popInFrontOf(Component move, Component behind) {
	if(move instanceof br.org.sbtvd.ui.StillPicture && behind instanceof br.org.sbtvd.ui.StillPicture)
	{
	    super.popInFrontOf(move, behind);
	}
    }

    @Override
	public void popToFront(Component component) {
	if(component instanceof br.org.sbtvd.ui.StillPicture)
	{
	    super.popToFront(component);
	}
    }

    @Override
	public void push(Component component) {
	if(component instanceof br.org.sbtvd.ui.StillPicture)
	{
	    super.push(component);
	}
    }

    @Override
	public void pushBehind(Component move, Component front) {
	if(move instanceof br.org.sbtvd.ui.StillPicture && front instanceof br.org.sbtvd.ui.StillPicture)
	{
	    super.pushBehind(move, front);
	}
    }

    @Override
	public void pushToBack(Component component) {
	if(component instanceof br.org.sbtvd.ui.StillPicture)
	{
	    super.pushToBack(component);
	}
    }

    @Override
	public void setBackgroundImage(Image image) {
    }

    @Override
	public void setBackgroundImageRenderMode(int mode) {
    }

    @Override
	public void setBackgroundMode(int mode) {
    }

    @Override
	public void setToFront() {
    }

    @Override
	public void addComponent(int index, Component cmp) {
	if(cmp instanceof br.org.sbtvd.ui.StillPicture)
	{
	    super.addComponent(index, cmp);
	}
    }

    @Override
	public boolean contains(Component cmp) {
	if(cmp instanceof br.org.sbtvd.ui.StillPicture)
	{
	    return super.contains(cmp);
	}

	return false;
    }

    @Override
	public void pointerPressed(int x, int y) {
    }

    @Override
	public void removeComponent(Component cmp) {
	if(cmp instanceof br.org.sbtvd.ui.StillPicture)
	{
	    super.removeComponent(cmp);
	}
    }

    @Override
	public void replace(Component current, Component next, Transition t) {
	if(current instanceof br.org.sbtvd.ui.StillPicture && next instanceof br.org.sbtvd.ui.StillPicture)
	{
	    super.replace(current, next, t);
	}
    }

    @Override
	public void requestFocus()
    {
    }
}
