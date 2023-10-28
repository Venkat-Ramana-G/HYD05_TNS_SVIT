package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Certificate {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long CertificateId;
    private int year;
    private String college;
    
	public Certificate() {
		super();
	}

	public Certificate(long certificateId, int year, String college) {
		super();
		this.CertificateId = certificateId;
		this.year = year;
		this.college = college;
	}

	public long getCertificateId() {
		return CertificateId;
	}

	public void setCertificateId(long certificateId) {
		CertificateId = certificateId;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Certificate [CertificateId=" + CertificateId + ", year=" + year + ", college=" + college + "]";
	}
	

}
