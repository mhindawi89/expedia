package com.expidia.domain;

import java.util.ArrayList;
import java.util.List;


public class OfferDateRange {
	
	private List<Integer> travelStartDate = new ArrayList<Integer>();
	private List<Integer> travelEndDate = new ArrayList<Integer>();
	private int lengthOfStay;
	
	public List<Integer> getTravelStartDate() {
		return travelStartDate;
	}
	public void setTravelStartDate(List<Integer> travelStartDate) {
		this.travelStartDate = travelStartDate;
	}
	public List<Integer> getTravelEndDate() {
		return travelEndDate;
	}
	public void setTravelEndDate(List<Integer> travelEndDate) {
		this.travelEndDate = travelEndDate;
	}
	public int getLengthOfStay() {
		return lengthOfStay;
	}
	public void setLengthOfStay(int lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}
	@Override
	public String toString() {
		return "OfferDateRange [travelStartDate=" + travelStartDate + ", travelEndDate=" + travelEndDate
				+ ", lengthOfStay=" + lengthOfStay + "]";
	}
	
	
	
	
}
 

