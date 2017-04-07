package com.notebook.customer.dao;

import org.springframework.data.repository.Repository;

import com.notebook.common.dao.IRepository;
import com.notebook.customer.model.BaseCustomer;

public interface CustomerDao extends IRepository<BaseCustomer, String>{

}
