package br.org.sbtvd.si;

import br.org.sbtvd.net.SBTVDLocator;


public interface SIBouquet extends SIInformation {

	/**
	 * 
	 * @return
	 */
	public int getBouquetID();
	
	/**
	 * 
	 */
	@Override
	public short[] getDescriptorTags();
	
	/**
	 * 
	 * @return
	 */
	public String getName();
	
	/**
	 * 
	 * @return
	 */
	public SBTVDLocator[] getSIServiceLocators();
	
	/**
	 * 
	 */
	@Override
	public SIRequest retrieveDescriptors(short retrieveMode,Object appData,
            SIRetrievalListener listener) throws SIIllegalArgumentException;
	
	/**
	 * 
	 */
	@Override
	public SIRequest retrieveDescriptors(short retrieveMode,Object appData,
            SIRetrievalListener listener, short[] someDescriptorTags)
            throws SIIllegalArgumentException;
	
	/**
	 * 
	 * @param retrieveMode
	 * @param appData
	 * @param listener
	 * @param someDescriptorTags
	 * @return
	 * @throws SIIllegalArgumentException
	 */
	
	public SIRequest retrieveSIBouquetTransportStreams(short retrieveMode,
            Object appData,
            SIRetrievalListener listener,
            short[] someDescriptorTags)
     throws SIIllegalArgumentException;
	
}
