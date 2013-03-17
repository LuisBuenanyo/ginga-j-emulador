package br.org.sbtvd.media;

import java.awt.Component;
import java.awt.Dimension;

import javax.tv.media.AWTVideoSize;
import javax.tv.media.AWTVideoSizeControl;

public class AWTVideoSizeControlImpl implements AWTVideoSizeControl {

	private AWTVideoSize size = new AWTVideoSize(
		new java.awt.Rectangle(0, 0, 1280, 720),
		new java.awt.Rectangle(0, 0, 1280, 720));
	
	private AWTVideoSize defaultSize = new AWTVideoSize(
		new java.awt.Rectangle(0, 0, 1280, 720),
		new java.awt.Rectangle(0, 0, 1280, 720));

	@Override
	public AWTVideoSize getSize() {
		return this.size;
	}

	@Override
	public AWTVideoSize getDefaultSize() {
		return this.defaultSize;
	}

	@Override
	public Dimension getSourceVideoSize() {
		return this.size.getSource().getSize();
		//return new Dimension(1280, 720);
	}

	@Override
	public boolean setSize(AWTVideoSize videoSize) {
		this.size = videoSize;

		return true;
	}

	@Override
	public AWTVideoSize checkSize(AWTVideoSize videoSize) {
		videoSize.getDestination().setBounds(videoSize.getDestination().x,
			videoSize.getDestination().y,
			videoSize.getDestination().width,
			videoSize.getDestination().height);
		return videoSize;
	}

	@Override
	public Component getControlComponent() {
		return null;
	}
}
