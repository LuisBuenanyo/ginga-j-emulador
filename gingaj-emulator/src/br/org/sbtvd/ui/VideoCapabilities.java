package br.org.sbtvd.ui;

import br.org.sbtvd.ui.ColorCoding;

import com.sun.dtv.ui.*;
import com.sun.dtv.lwuit.geom.*;

public class VideoCapabilities extends Capabilities {

	VideoCapabilities() {
		supportedScreenResolutions = new Dimension[1];
		supportedPlaneAspectRatios = new Dimension[1];
		supportedPixelAspectRatios = new Dimension[1];

		supportedScreenResolutions[0] = new Dimension(1920, 1080);
		supportedPlaneAspectRatios[0] = new Dimension(16, 9);
		supportedPixelAspectRatios[0] = new Dimension(1, 1);

		bitsPerPixel = -1;
		colorCodingModel = ColorCoding.ARGB8888;
	}

	@Override
	public Dimension[] getSupportedScreenResolutions()
	{
		return this.supportedScreenResolutions;
	}

	@Override
	public Dimension[] getSupportedPlaneAspectRatios()
	{
		return this.supportedPlaneAspectRatios;
	}

	@Override
	public Dimension[] getSupportedPixelAspectRatios()
	{
		return this.supportedPixelAspectRatios;
	}

	@Override
	public boolean isAlphaBlendingSupported()
	{
		return false;
	}

	@Override
	public boolean isRealAlphaBlendingSupported()
	{
		return false;
	}

	@Override
	public boolean isImageRenderingSupported()
	{
		return false;
	}
	
	@Override
	public boolean isJPEGRenderingSupported()
	{
		return false;
	}

	@Override
	public boolean isPNGRenderingSupported()
	{
		return false;
	}

	@Override
	public boolean isGIFRenderingSupported()
	{
		return false;
	}

	@Override
	public boolean isVideoRenderingSupported()
	{
		return true;
	}

	@Override
	public int getBitsPerPixel() throws SetupException
	{
		throw new SetupException();
	}

	@Override
	public int getColorCodingModel() throws SetupException
	{
		throw new SetupException();
	}

	@Override
	public boolean isWidgetRenderingSupported()
	{
		return false;
	}
	
	@Override
	public boolean isGraphicsRenderingSupported() {
		return false;
	}

}
