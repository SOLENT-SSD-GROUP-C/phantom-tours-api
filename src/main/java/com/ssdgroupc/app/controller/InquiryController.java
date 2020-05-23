package com.ssdgroupc.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssdgroupc.app.entity.Inquiry;
import com.ssdgroupc.app.service.InquiryService;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class InquiryController {

	@Autowired
	private InquiryService inquiryService;

	@GetMapping("/inquiries")
	public List<Inquiry> getAllInquires() {
		return inquiryService.getAllInquires();
	}

	@PostMapping("/inquiries")
	public void addInquiry(@Valid @RequestBody Inquiry inquiry) {
		inquiryService.addInquiry(inquiry);
	}

	@DeleteMapping("/inquiries/{id}")
	public void deleteInquiry(@PathVariable(value = "id") int id) {
		inquiryService.deleteInquiry(id);
	}

}
