package net;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class AddressClass implements Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private boolean isStartAddress;
	private String strStreet;
	private String strCity;
	private String strState;
	private Integer intZipCode;
	private String strCountry;
	
	public AddressClass()
	{
		//
	}
	/*
	 *  setStartAddress sets the address of the beginning point of route.
	 *  This method takes street, city, state, and zip code.
	 * 
	 */
	public void setStartAddress(String street, String city, String state, String zipCode)
	{
		//
		isStartAddress = true;
		strStreet = street;
		strCity = city;
		strState = state;
		intZipCode = Integer.parseInt(zipCode);
		strCountry = "USA";
	}
	/*
	 *  setEndAddress is the final point of the chosen route.
	 *  This method takes name of street, city, state and zip code.
	 */	
	
	public void setEndAddress(String street, String city, String state, String zipCode)
	{
		//
		isStartAddress = false;
		strStreet = street;
		strCity = city;
		strState = state;
		intZipCode = Integer.parseInt(zipCode);
		strCountry = "USA";
	}
	
	/* 
	 * isStartAdress method checks if the server obtained the starting address of the route.
	 */
	public boolean isStartAddress()
	{
		return isStartAddress;
	}
	
	/*
	 * generateAddr method returns the full address.
	 */
	
	public String generateAddr()
	{
		//
		String tmpStr = strStreet + ", " + strCity + ", " + strState + ", " + intZipCode + ", " + strCountry;
		try {
			return URLEncoder.encode(tmpStr, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
