package br.org.sbtvd.ui;

import java.awt.Color;

import com.sun.dtv.ui.*;
import com.sun.dtv.lwuit.*;
import com.sun.dtv.lwuit.geom.*;

import java.io.*;

public class GraphicPlaneSetup extends PlaneSetup {

	public GraphicPlaneSetup(Plane p) {
		planeAspectRatio = new Dimension(16, 9);
		pixelAspectRatio = new Dimension(1, 1);
		pixelResolution = new Dimension(1, 1);
		videoSource = null;
		videoController = null;
		pattern = createPattern();
		plane = p;
		color = new Color(0x0, 0x0, 0x0, 0x0);
		
		java.awt.Component window = Display.getInstance().getImplementation().getFrame();

		screenResolution = new Dimension(window.getWidth(), window.getHeight());
		screenArea = new Rectangle(0, 0, screenResolution);
	}

	@Override
	public Point convertPoint( PlaneSetup destination, Point source)
	{
		return null;
	}

	@Override
	public boolean isFlickeringFilterAvailable()
	{
		return false;
	}

	@Override
	public boolean isInterlaced()
	{
		return false;
	}

	@Override
	public Dimension getOffset( PlaneSetup setup)
	{
		return new Dimension(0, 0);
	}

	@Override
	public boolean isVideoMixingSupported()
	{
		return false;
	}

	@Override
	public boolean isGraphicsMixingSupported()
	{
		return false;
	}

	@Override
	public boolean isMatteSupported()
	{
		return false;
	}

	@Override
	public boolean isImageScalingSupported()
	{
		return true;
	}

	@Override
	public boolean isIndexedColorModelSupported()
	{
		return false;
	}

	@Override
	public boolean isDirectColorModelSupported()
	{
		return false;
	}

	@Override
	public void displayImage( Image image) throws IOException, IllegalArgumentException, SecurityException, NullPointerException, SetupException
	{
	}

	@Override
	public void displayImage( Image image, Rectangle rectangle) throws IOException, IllegalArgumentException, SecurityException, NullPointerException, SetupException
	{
	}

	@Override
	public Image adaptImage( Image input, boolean dither) throws SetupException
	{
		return null;
	}
	
	private PlaneSetupPattern createPattern(){
		PlaneSetupPattern pattern = new PlaneSetupPattern();
		
		pattern.setPreference(PlaneSetupPattern.NO_BACKGROUND_IMPACT, PlaneSetupPattern.REQUIRED);
		pattern.setPreference(PlaneSetupPattern.NO_GRAPHICS_IMPACT, PlaneSetupPattern.REQUIRED);
		pattern.setPreference(PlaneSetupPattern.NO_SUBTITLE_IMPACT, PlaneSetupPattern.REQUIRED);
		pattern.setPreference(PlaneSetupPattern.NO_VIDEO_IMPACT, PlaneSetupPattern.REQUIRED);
		pattern.setPreference(PlaneSetupPattern.NO_STILLVIDEO_IMPACT, PlaneSetupPattern.REQUIRED);
		pattern.setPreference(PlaneSetupPattern.INTERLACED_DISPLAY, PlaneSetupPattern.DONT_CARE);
		pattern.setPreference(PlaneSetupPattern.FLICKER_FILTERING, PlaneSetupPattern.PREFERRED);
		pattern.setPreference(PlaneSetupPattern.VIDEO_GRAPHICS_PIXEL_ALIGNED, PlaneSetupPattern.DONT_CARE);
		pattern.setPreference(PlaneSetupPattern.PIXEL_ASPECT_RATIO, pixelAspectRatio, PlaneSetupPattern.REQUIRED);
		pattern.setPreference(PlaneSetupPattern.PIXEL_RESOLUTION, pixelResolution, PlaneSetupPattern.REQUIRED);
		pattern.setPreference(PlaneSetupPattern.CHANGEABLE_SINGLE_COLOR, PlaneSetupPattern.DONT_CARE);
		pattern.setPreference(PlaneSetupPattern.STILL_IMAGE, PlaneSetupPattern.DONT_CARE);
		pattern.setPreference(PlaneSetupPattern.VIDEO_MIXING, PlaneSetupPattern.REQUIRED);
		pattern.setPreference(PlaneSetupPattern.GRAPHICS_MIXING, PlaneSetupPattern.REQUIRED);
		pattern.setPreference(PlaneSetupPattern.MATTE_SUPPORT, PlaneSetupPattern.DONT_CARE);
		pattern.setPreference(PlaneSetupPattern.IMAGE_SCALING_SUPPORT, PlaneSetupPattern.REQUIRED);
		pattern.setPreference(PlaneSetupPattern.INDEXED_COLOR_SUPPORT, PlaneSetupPattern.PREFERRED);
		pattern.setPreference(PlaneSetupPattern.DIRECT_COLOR_SUPPORT, PlaneSetupPattern.REQUIRED);
		
		return pattern;
	}

}
