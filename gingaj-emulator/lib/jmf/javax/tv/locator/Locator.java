package javax.tv.locator;

public interface Locator {
	public java.lang.String toExternalForm();

	public boolean hasMultipleTransformations();

	@Override
	public boolean equals(java.lang.Object o);

	@Override
	public int hashCode();

	@Override
	public java.lang.String toString();

}
