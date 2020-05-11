package com.ssdgroupc.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssdgroupc.app.entity.Inquiry;
import com.ssdgroupc.app.repository.InquiryRepository;

@Service
public class InquiryService {

	@Autowired
	private InquiryRepository inquiryRepository;

	public Inquiry addInquiry(Inquiry inquiry) {
		return inquiryRepository.save(inquiry);
	}

	public List<Inquiry> getAllInquires() {
		List<Inquiry> inquiries = new ArrayList<>();
		inquiryRepository.findAll().forEach(inquiries::add);
		return inquiries;
	}

	public void deleteInquiry(int id) {
		inquiryRepository.deleteById(id);
	}

}
