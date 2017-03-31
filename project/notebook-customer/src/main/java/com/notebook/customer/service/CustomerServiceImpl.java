package com.notebook.customer.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public void addCustomer() {
		System.out.println("service add");
	}
}
