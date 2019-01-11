package be.vdab.landenclient.soapclients;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import be.vdab.landenclient.soapmessages.Country;
import be.vdab.landenclient.soapmessages.GetCountryRequest;
import be.vdab.landenclient.soapmessages.GetCountryResponse;

@Component
public class DefaultCountryClient extends WebServiceGatewaySupport implements CountryClient {

	public DefaultCountryClient(Jaxb2Marshaller marshaller, @Value("${countryServiceURL}") String countryServiceURL) {
		super.setMarshaller(marshaller);
		super.setUnmarshaller(marshaller);
		super.setDefaultUri(countryServiceURL);
	}

	@Override
	public Country getCountry(String code) {
	    GetCountryRequest request = new GetCountryRequest();
	    request.setCode(code);
	    GetCountryResponse response = (GetCountryResponse) super.getWebServiceTemplate().marshalSendAndReceive(request);
	    return response.getCountry();
	}
	
}