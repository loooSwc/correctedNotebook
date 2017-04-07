package com.notebook.customer.model;

import java.math.BigDecimal;

// Generated 2015-9-8 19:22:59 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "sys_selfcustomer")
public class BaseCustomer implements java.io.Serializable {

	private static final long serialVersionUID = -967224555515133782L;
	
	private String cusId;          //客户id
	private String cusName;        //客户名称
	@Id
	@GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "cus_id", unique = true, nullable = false, length = 32)
	public String getCusId() {
		return this.cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	@Column(name = "cus_name", length = 100)
	public String getCusName() {
		return this.cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}


	
}
