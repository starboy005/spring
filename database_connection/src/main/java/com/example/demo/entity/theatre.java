package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Theatre_List")
public class theatre 
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
	private int TotalSeats;
	@Column(name="rating")
	private float rating ;
	@Column(name="ticket price")
	private float ticketPrice ;
	@Column(name="availability")
	private int availability ;
	@Column(name="Screen no")
	private String ScreenNo ;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getTotalSeats() {
		return TotalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		TotalSeats = totalSeats;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public float getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	public String getScreenNo() {
		return ScreenNo;
	}
	public void setScreenNo(String screenNo) {
		ScreenNo = screenNo;
	}
}
