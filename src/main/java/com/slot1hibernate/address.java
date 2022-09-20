package com.slot1hibernate;
//manytoone
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class address {

	@Id
	private int adId;
	private String adCity;
	private int adPincode;
	public int getAdId() {
		return adId;
	}
	public void setAdId(int adId) {
		this.adId = adId;
	}
	public String getAdCity() {
		return adCity;
	}
	public void setAdCity(String adCity) {
		this.adCity = adCity;
	}
	public int getAdPincode() {
		return adPincode;
	}
	public void setAdPincode(int adPincode) {
		this.adPincode = adPincode;
	}
	@Override
	public String toString() {
		return "address [adId=" + adId + ", adCity=" + adCity + ", adPincode=" + adPincode + "]";
	}
	
	
}
