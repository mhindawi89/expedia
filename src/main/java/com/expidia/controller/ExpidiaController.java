package com.expidia.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.expidia.domain.HotelDeals;
import com.expidia.services.OffersService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Controller
public class ExpidiaController {
	
	/*@Autowired
	private OffersService offersService;
	*/
	@RequestMapping("/offers/list")
	public void carList(Model model) throws JsonParseException, JsonMappingException, IOException {
		OffersService offersService = new OffersService();
		HotelDeals hotelDeals = offersService.offersHotelList();
		System.out.println(hotelDeals.getOffers().getHotel());
		model.addAttribute("hotelList", hotelDeals.getOffers().getHotel());
		
	}
	

}
