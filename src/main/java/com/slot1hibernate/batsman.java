package com.slot1hibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("batsman")
public class batsman extends teamindia {

	
	private String battingHand;
	private int highestScore;
	public String getBattingHand() {
		return battingHand;
	}
	public void setBattingHand(String battingHand) {
		this.battingHand = battingHand;
	}
	public int getHighestScore() {
		return highestScore;
	}
	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}
	@Override
	public String toString() {
		return "batsman [battingHand=" + battingHand + ", highestScore=" + highestScore + "]";
	}
	
	
	
}
