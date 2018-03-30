package com.expidia.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HotelInfo {
	
	private String hotelId;
    private String hotelName;
    private String localizedHotelName;
    private String hotelDestination;
    private String hotelDestinationRegionID;
    private String hotelLongDestination;
    private String hotelStreetAddress;
    private String hotelCity;
    private String hotelProvince;
    private String hotelCountryCode;
    private double hotelLatitude;
    private double hotelLongitude;
    private String hotelStarRating;
    private double hotelGuestReviewRating;
    private double hotelReviewTotal;
    private String hotelImageUrl;
    private boolean vipAccess;
    private boolean isOfficialRating;
    
    
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getLocalizedHotelName() {
		return localizedHotelName;
	}
	public void setLocalizedHotelName(String localizedHotelName) {
		this.localizedHotelName = localizedHotelName;
	}
	public String getHotelDestination() {
		return hotelDestination;
	}
	public void setHotelDestination(String hotelDestination) {
		this.hotelDestination = hotelDestination;
	}
	public String getHotelDestinationRegionID() {
		return hotelDestinationRegionID;
	}
	public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
		this.hotelDestinationRegionID = hotelDestinationRegionID;
	}
	public String getHotelLongDestination() {
		return hotelLongDestination;
	}
	public void setHotelLongDestination(String hotelLongDestination) {
		this.hotelLongDestination = hotelLongDestination;
	}
	public String getHotelStreetAddress() {
		return hotelStreetAddress;
	}
	public void setHotelStreetAddress(String hotelStreetAddress) {
		this.hotelStreetAddress = hotelStreetAddress;
	}
	public String getHotelCity() {
		return hotelCity;
	}
	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}
	public String getHotelProvince() {
		return hotelProvince;
	}
	public void setHotelProvince(String hotelProvince) {
		this.hotelProvince = hotelProvince;
	}
	public String getHotelCountryCode() {
		return hotelCountryCode;
	}
	public void setHotelCountryCode(String hotelCountryCode) {
		this.hotelCountryCode = hotelCountryCode;
	}
	public double getHotelLatitude() {
		return hotelLatitude;
	}
	public void setHotelLatitude(double hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}
	public double getHotelLongitude() {
		return hotelLongitude;
	}
	public void setHotelLongitude(double hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}
	public String getHotelStarRating() {
		return hotelStarRating;
	}
	public void setHotelStarRating(String hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}
	public double getHotelGuestReviewRating() {
		return hotelGuestReviewRating;
	}
	public void setHotelGuestReviewRating(double hotelGuestReviewRating) {
		this.hotelGuestReviewRating = hotelGuestReviewRating;
	}
	public double getHotelReviewTotal() {
		return hotelReviewTotal;
	}
	public void setHotelReviewTotal(double hotelReviewTotal) {
		this.hotelReviewTotal = hotelReviewTotal;
	}
	public String getHotelImageUrl() {
		return hotelImageUrl;
	}
	public void setHotelImageUrl(String hotelImageUrl) {
		this.hotelImageUrl = hotelImageUrl;
	}
	public boolean isVipAccess() {
		return vipAccess;
	}
	public void setVipAccess(boolean vipAccess) {
		this.vipAccess = vipAccess;
	}
	@JsonProperty("isOfficialRating")
	public boolean isOfficialRating() {
		return isOfficialRating;
	}
	public void setOfficialRating(boolean isOfficialRating) {
		this.isOfficialRating = isOfficialRating;
	}
	@Override
	public String toString() {
		return "HotelInfo [hotelId=" + hotelId + ", hotelName=" + hotelName + ", localizedHotelName="
				+ localizedHotelName + ", hotelDestination=" + hotelDestination + ", hotelDestinationRegionID="
				+ hotelDestinationRegionID + ", hotelLongDestination=" + hotelLongDestination + ", hotelStreetAddress="
				+ hotelStreetAddress + ", hotelCity=" + hotelCity + ", hotelProvince=" + hotelProvince
				+ ", hotelCountryCode=" + hotelCountryCode + ", hotelLatitude=" + hotelLatitude + ", hotelLongitude="
				+ hotelLongitude + ", hotelStarRating=" + hotelStarRating + ", hotelGuestReviewRating="
				+ hotelGuestReviewRating + ", hotelReviewTotal=" + hotelReviewTotal + ", hotelImageUrl=" + hotelImageUrl
				+ ", vipAccess=" + vipAccess + ", isOfficialRating=" + isOfficialRating + "]";
	}
	

}
