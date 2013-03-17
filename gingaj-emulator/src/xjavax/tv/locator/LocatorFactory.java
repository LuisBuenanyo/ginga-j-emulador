package xjavax.tv.locator;

/**/

public abstract class LocatorFactory extends java.lang.Object {
	
	private static LocatorFactory instance = null;

	protected LocatorFactory() {}

	public static LocatorFactory getInstance() {
		
		if (instance == null) {
			
			instance = new xjavax.tv.locator.LocatorFactoryImpl();
		}
		
		return instance;
	}

	public abstract Locator createLocator(java.lang.String locatorString) throws MalformedLocatorException;

	public abstract Locator[] transformLocator( Locator source) throws javax.tv.locator.InvalidLocatorException, InvalidLocatorException;

}