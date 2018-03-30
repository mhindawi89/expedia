package com.expidia.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Offers { 
	
	private List<Hotel> hotel;

	@JsonProperty("Hotel")
	public List<Hotel> getHotel() {
		return hotel;
	}

	public void setHotel(List<Hotel> hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Offers [hotel=" + hotel + "]";
	}

		
}
