package be.vdab.landenclient.soapclients;

import be.vdab.landenclient.soapmessages.Country;

public interface CountryClient {
	Country getCountry(String code); 
}
