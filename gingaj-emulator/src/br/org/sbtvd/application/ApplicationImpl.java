package br.org.sbtvd.application;

import com.sun.dtv.application.*;

import javax.tv.locator.*;

public class ApplicationImpl implements Application {

	private String identifier;
	private String document;
	private String classpath;
	private String basedir;
	private String icon;
	private int oid;
	private int aid;
	private int type;
	private int code;
	private boolean isServiceBound;
	private boolean isStartable;
	private boolean isVisible;

	public ApplicationImpl(int oid, int aid, String document, String classpath, String basedir, String icon, int type, int code, boolean serviceBound, boolean startable, boolean visible) {
		System.out.println("Application:: [aid=" + aid + ", oid=" + oid + ", type=" + type + ", code=" + code + ", base=" + basedir + ", main=" + document + ", classpath=" + classpath + ", icon=" + icon + "]");

		this.oid = oid;
		this.aid = aid;
		this.document = document;
		this.classpath = classpath;
		this.basedir = basedir;
		this.icon = icon;
		this.type = type;
		this.isServiceBound = serviceBound;
		this.isStartable = startable;
		this.isVisible = visible;
	}

	@Override
	public String getAppId() {
		return com.sun.dtv.application.AppManager.getInstance().makeApplicationId(oid, aid);
	}

	@Override
	public int getIconFlags() {
		// Refer to ABNT NBR 15606-3:2007 Table 54 for Icon flag bits
		return 0;
	}

	@Override
	public Locator getIconLocator() {
		return null; // new javax.tv.locator.LocatorFactory.getInstance().createLocator(icon);
	}

	@Override
	public String getIxcFullyQualifiedName(String name, int scope) {
		return null;
	}

	@Override
	public String getName() {
		return document;
	}

	@Override
	public String getName(String locale) {
		return document;
	}

	@Override
	public String[] getNameLocales() {
		return new String[0];
	}

	@Override
	public int getPriority() {
		return 10;
	}

	@Override
	public String[] getProfiles() {
		return new String[0];
	}

	@Override
	public Locator getServiceLocator() {
		return null;
	}

	@Override
	public int getType() {
		return type;
	}

	@Override
	public short[] getVersion(String appProfile) {
		return new short[0];
	}

	@Override
	public boolean isServiceBound() {
		return isServiceBound;
	}

	@Override
	public boolean isStartable() {
		return isStartable;
	}

	@Override
	public boolean isVisible() {
		return isVisible;
	}

	// added by jeff
	public String getDocument() {
		return document;
	}

	public String getClasspath() {
		return classpath;
	}

	public String getBaseDirectory() {
		return basedir;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final ApplicationImpl other = (ApplicationImpl) obj;
		if (this.oid != other.oid) {
			return false;
		}
		if (this.aid != other.aid) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 41 * hash + this.oid;
		hash = 41 * hash + this.aid;
		return hash;
	}


}
