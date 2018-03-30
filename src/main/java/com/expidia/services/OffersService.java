package com.expidia.services;

import java.io.IOException;
import org.springframework.stereotype.Service;
import com.expidia.domain.HotelDeals;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

@Service
public class OffersService {

	public OffersService() {
		
	}
	
	public HotelDeals offersHotelList() throws JsonParseException, JsonMappingException, IOException{
		return HotelJsonPareser();
	} 
	
	public String getHotelsDealsCLient(){
		Client client = Client.create();

		WebResource webResource = client
		   .resource("https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel");

		ClientResponse response = webResource.accept("application/json")
                   .get(ClientResponse.class);
		
		if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatus());
			}
		
		String offers = response.getEntity(String.class);
		System.out.println(offers);
		return offers;
	}
	
	public HotelDeals HotelJsonPareser() throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		String hotelOffers = getHotelsDealsCLient();
		HotelDeals	hotelDeals = mapper.readValue(hotelOffers.getBytes(), HotelDeals.class);
		System.out.println(hotelDeals);
		return hotelDeals;
	}
}
