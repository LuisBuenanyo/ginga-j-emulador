package br.org.sbtvd.ui;

import br.org.sbtvd.ui.ColorCoding;

import com.sun.dtv.ui.*;
import com.sun.dtv.lwuit.geom.*;

public class GraphicCapabilities extends Capabilities {

	GraphicCapabilities() {
		supportedScreenResolutions = new Dimension[1];
		supportedPlaneAspectRatios = new Dimension[1];
		supportedPixelAspectRatios = new Dimension[1];

		supportedScreenResolutions[0] = new Dimension(1280, 720);
		supportedPlaneAspectRatios[0] = new Dimension(16, 9);
		supportedPixelAspectRatios[0] = new Dimension(1, 1);

		bitsPerPixel = 32;
		colorCodingModel = ColorCoding.ARGB8888;
	}

	@Override
	public Dimension[] getSupportedScreenResolutions() {
		return this.supportedScreenResolutions;
	}

	@Override
	public Dimension[] getSupportedPlaneAspectRatios() {
		return this.supportedPlaneAspectRatios;
	}

	@Override
	public Dimension[] getSupportedPixelAspectRatios() {
		return this.supportedPixelAspectRatios;
	}

	@Override
	public boolean isAlphaBlendingSupported() {
		return true;
	}

	@Override
	public boolean isRealAlphaBlendingSupported() {
		return true;
	}

	@Override
	public boolean isImageRenderingSupported() {
		return true;
	}

	@Override
	public boolean isJPEGRenderingSupported() {
		return true;
	}

	@Override
	public boolean isPNGRenderingSupported() {
		return true;
	}

	@Override
	public boolean isGIFRenderingSupported() {
		return true;
	}

	@Override
	public boolean isVideoRenderingSupported() {
		return false;
	}

	@Override
	public int getBitsPerPixel() throws SetupException {
		return this.bitsPerPixel;
	}

	@Override
	public int getColorCodingModel() throws SetupException {
		return this.colorCodingModel;
	}

	@Override
	public boolean isWidgetRenderingSupported() {
		return true;
	}

	@Override
	public boolean isGraphicsRenderingSupported() {
		return true;
	}
}
