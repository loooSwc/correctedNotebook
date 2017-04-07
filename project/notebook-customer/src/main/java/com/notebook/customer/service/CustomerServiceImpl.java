package com.notebook.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.notebook.customer.dao.CustomerDao;
import com.notebook.customer.model.BaseCustomer;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	@Override
	public void addCustomer() {
		System.out.println("service add");
		Iterable<BaseCustomer> it=customerDao.findAll();
		for (BaseCustomer baseCustomer : it) {
			System.out.println(baseCustomer.getCusName());
		}
	}
}
