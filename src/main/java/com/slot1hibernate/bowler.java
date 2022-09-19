package com.slot1hibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("bowler")
public class bowler extends teamindia{

	private String bowlingHand;
	private String bestfigure;
	public String getBowlingHand() {
		return bowlingHand;
	}
	public void setBowlingHand(String bowlingHand) {
		this.bowlingHand = bowlingHand;
	}
	public String getBestfigure() {
		return bestfigure;
	}
	public void setBestfigure(String bestfigure) {
		this.bestfigure = bestfigure;
	}
	@Override
	public String toString() {
		return "bowler [bowlingHand=" + bowlingHand + ", bestfigure=" + bestfigure + "]";
	}
	
	
	
}
