package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Certificate;

public interface CertificateService {

	public Certificate saveCertificate(Certificate certificate);
	
	public List<Certificate> fetchCertificateList();
	
	public void deleteCertificateById(Long CertificateId);
	
	public Certificate updateCertificate(Long CertificateID,Certificate certificate);

	public Certificate fetchCertificateById(Long CertificateId);
}
