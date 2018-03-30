package com.expidia.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hotel { 
	
	private OfferDateRange offerDateRange;
	private Destination destination;
	private HotelInfo hotelInfo;
	private HotelPricingInfo hotelPricingInfo;
	private HotelUrls hotelUrls;
	
	@JsonProperty("offerDateRange")
	public OfferDateRange getOfferRange() {
		return offerDateRange;
	}
	public void setOfferRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}
	@JsonProperty("destination")
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	@JsonProperty("hotelInfo")
	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}
	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}
	@JsonProperty("hotelPricingInfo")
	public HotelPricingInfo getHotelPricingInfo() {
		return hotelPricingInfo;
	}
	public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}
	@JsonProperty("hotelUrls")
	public HotelUrls getHotlUrls() {
		return hotelUrls;
	}
	public void setHotlUrls(HotelUrls hotelUrls) {
		this.hotelUrls = hotelUrls;
	}
	@Override
	public String toString() {
		return "Hotel [offerRange=" + offerDateRange + ", destination=" + destination + ", hotelInfo=" + hotelInfo
				+ ", hotelPricingInfo=" + hotelPricingInfo + ", hotlUrls=" + hotelUrls + "]";
	}
	
	
}
