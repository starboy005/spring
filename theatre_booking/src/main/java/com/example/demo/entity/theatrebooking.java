package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Theatre_List")
public class theatrebooking 
{
	@Id
	@Column(name="movieId")
	private int mid;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	@Column(name="movie name")
	private String movieName ;
	@Column(name="total seats")
	private String TotalSeats;
	@Column(name="rating")
	private String rating ;
	@Column(name="ticket price")
	private String ticketPrice ;
	@Column(name="availability")
	private String availability ;
	@Column(name="Screen no")
	private String ScreenNo ;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getTotalSeats() {
		return TotalSeats;
	}
	public void setTotalSeats(String totalSeats) {
		TotalSeats = totalSeats;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getScreenNo() {
		return ScreenNo;
	}
	public void setScreenNo(String screenNo) {
		ScreenNo = screenNo;
	}
	

}
