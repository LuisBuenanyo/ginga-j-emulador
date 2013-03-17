package br.org.sbtvd.config;

import java.util.*;
import java.io.*;

import net.beiker.xletview.util.Constants;

public class Settings {

//	private static String property_filename = "config/settings.txt";

	private Properties properties;
	private static Settings instance;

	private Settings(InputStream filename) {
		properties = new Properties();

		try {
			properties.load( filename );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Settings getInstance() {
		if (instance == null) {
			instance = new Settings( Settings.class.getResourceAsStream( Constants.PATH_SETTINGS) );
		}

		return instance;
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}

}
