package com.global.types;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


import com.global.payment.Payment;

@Entity
@Table(name="c1")
public class Card extends Payment{
	
	@Column(name = "cardnum")
	private int cardno;
	@Column(name="cardtype")
	private String cardType;
	public int getCardno() {
		return cardno;
	}
	public void setCardno(int cardno) {
		this.cardno = cardno;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	
}
