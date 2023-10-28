package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Certificate;
import com.example.demo.service.CertificateService;

@RestController
public class CertificateController {
	
	
	@Autowired
	private CertificateService certificateService;
	
	  @PostMapping("/certificates")
	    public Certificate saveCertificate(@RequestBody Certificate certificate) {
	       
	        return certificateService.saveCertificate(certificate);
	    }
	  
	    @GetMapping("/certificates")
	    public List<Certificate> fetchCertificateList() {
	      
	        return certificateService.fetchCertificateList();
	    }
	    

	    @GetMapping("/certificates/{id}")
	    public Certificate fetchCertificateByid(@PathVariable("id") Long CertificateId)
	            {
	        return certificateService.fetchCertificateById(CertificateId);
	    }
	    
	    @DeleteMapping("/certificates/{id}")
	    public String deleteCertificateByid(@PathVariable("id") Long CertificateId) {
	        certificateService.deleteCertificateById(CertificateId);
	        return "Particular Certificate deleted Successfully!!";
	    }
	    
	    @PutMapping("/certificates/{id}")
	    public Certificate updateCertificate(@PathVariable("id") Long CertificateId,
	                                       @RequestBody Certificate certificate) {
	        return certificateService.updateCertificate(CertificateId,certificate);
	    }
	    

}
