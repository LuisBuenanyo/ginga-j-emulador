package br.org.sbtvd.ui;

import br.org.sbtvd.ui.ColorCoding;

import com.sun.dtv.lwuit.geom.Dimension;
import com.sun.dtv.ui.Capabilities;
import com.sun.dtv.ui.SetupException;

public class StillCapabilities extends Capabilities {

	StillCapabilities() {
		supportedScreenResolutions = new Dimension[1];
		supportedPlaneAspectRatios = new Dimension[1];
		supportedPixelAspectRatios = new Dimension[1];

		supportedScreenResolutions[0] = new Dimension(1920, 1080);
		supportedPlaneAspectRatios[0] = new Dimension(16, 9);
		supportedPixelAspectRatios[0] = new Dimension(1, 1);

		bitsPerPixel = 16;
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
		return true;
	}

	@Override
	public boolean isRealAlphaBlendingSupported()
	{
		return false;
	}

	@Override
	public boolean isImageRenderingSupported()
	{
		return true;
	}
	
	@Override
	public boolean isJPEGRenderingSupported()
	{
		return true;
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
		return false;
	}

	@Override
	public int getBitsPerPixel() throws SetupException
	{
		return this.bitsPerPixel;
	}

	@Override
	public int getColorCodingModel() throws SetupException
	{
		return this.colorCodingModel;
	}

	@Override
	public boolean isWidgetRenderingSupported()
	{
		return true;
	}
	
	@Override
	public boolean isGraphicsRenderingSupported() {
		return false;
	}
	
}
