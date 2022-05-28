package com.hibernate.hib;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name="student_address")
public class Address {
	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private int id;
	
	@Column(length = 50)
	private String street;
	
	private String city;
	
	private boolean isOpen;
	
	@Transient
	private double x;
	
	@Temporal(TemporalType.DATE)
	private Date addDate;
	
	@Lob
	private byte[] image;
	
	
	public Address(int id, String street, String city, boolean isOpen, Date addDate, byte[] image) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.addDate = addDate;
		this.image = image;
	}


	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen + ", addDate="
				+ addDate + ", image=" + Arrays.toString(image) + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public boolean isOpen() {
		return isOpen;
	}


	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}


	public Date getAddDate() {
		return addDate;
	}


	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}


	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	
}
