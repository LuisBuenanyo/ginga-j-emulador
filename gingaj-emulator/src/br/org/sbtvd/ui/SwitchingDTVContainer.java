package br.org.sbtvd.ui;

import com.sun.dtv.lwuit.Component;
import com.sun.dtv.lwuit.Image;
import com.sun.dtv.lwuit.animations.Transition;

import com.sun.dtv.ui.DTVContainer;

public class SwitchingDTVContainer extends DTVContainer {
    
    public SwitchingDTVContainer()
    {
	super();
	this.setType(DTVContainer.SWITCHING);
    }

    @Override
	public void addComponent(Component cmp) {
	if(cmp instanceof br.org.sbtvd.ui.SwitchArea)
	{
	    super.addComponent(cmp);
	}
    }

    @Override
	public void addComponent(Object constraints, Component cmp) {
	if(cmp instanceof br.org.sbtvd.ui.SwitchArea)
	{
	    super.addComponent(constraints, cmp);
	}
    }

    @Override
	public void addToBack(Component component) {
	if(component instanceof br.org.sbtvd.ui.SwitchArea)
	{
	    super.addToBack(component);
	}
    }

    @Override
	public void addToFront(Component component) {
	if(component instanceof br.org.sbtvd.ui.SwitchArea)
	{
	    super.addToFront(component);
	}
    }

    @Override
	public void pop(Component component) {
	if(component instanceof br.org.sbtvd.ui.SwitchArea)
	{
	    super.pop(component);
	}
    }

    @Override
	public void popInFrontOf(Component move, Component behind) {
	if(move instanceof br.org.sbtvd.ui.SwitchArea && behind instanceof br.org.sbtvd.ui.SwitchArea)
	{
	    super.popInFrontOf(move, behind);
	}
    }

    @Override
	public void popToFront(Component component) {
	if(component instanceof br.org.sbtvd.ui.SwitchArea)
	{
	    super.popToFront(component);
	}
    }

    @Override
	public void push(Component component) {
	if(component instanceof br.org.sbtvd.ui.SwitchArea)
	{
	    super.push(component);
	}
    }

    @Override
	public void pushBehind(Component move, Component front) {
	if(move instanceof br.org.sbtvd.ui.SwitchArea && front instanceof br.org.sbtvd.ui.SwitchArea)
	{
	    super.pushBehind(move, front);
	}
    }

    @Override
	public void pushToBack(Component component) {
	if(component instanceof br.org.sbtvd.ui.SwitchArea)
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
	if(cmp instanceof br.org.sbtvd.ui.SwitchArea)
	{
	    super.addComponent(index, cmp);
	}
    }

    @Override
	public boolean contains(Component cmp) {
	if(cmp instanceof br.org.sbtvd.ui.SwitchArea)
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
	if(cmp instanceof br.org.sbtvd.ui.SwitchArea)
	{
	    super.removeComponent(cmp);
	}
    }

    @Override
	public void replace(Component current, Component next, Transition t) {
	if(current instanceof br.org.sbtvd.ui.SwitchArea && next instanceof br.org.sbtvd.ui.SwitchArea)
	{
	    super.replace(current, next, t);
	}
    }

    @Override
	public void requestFocus()
    {
    }
}
