package com.expidia.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.expidia.domain.HotelDeals;
import com.expidia.services.OffersService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


public class OffersServiceTest {
	
	@Test
	public void  offersServiceTest() throws JsonParseException, JsonMappingException, IOException{
	OffersService offersService = new OffersService();
	assertNotNull(offersService.offersHotelList());
	
	} 
	
	@Test
	public void hotelJsonPareserTest() throws JsonParseException, JsonMappingException, IOException{
		
		OffersService offersService = new OffersService();
		HotelDeals hotelDeals = offersService.HotelJsonPareser();
		assertNotNull(hotelDeals);
	}
	
}
