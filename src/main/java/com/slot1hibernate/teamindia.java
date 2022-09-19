package com.slot1hibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
@DiscriminatorValue("coach")
public class teamindia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int playerId;
	private String firstName;
	private String lastName;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "teamindia [playerId=" + playerId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	
}
