package com.notebook.customer.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.notebook.customer.service.CustomerService;


@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	    @ResponseBody
	    @RequestMapping(value = "/addCustomer" , method = RequestMethod.POST)
	    public String getLastLogs(HttpServletRequest request, Map map) throws Exception {
	    	customerService.addCustomer();
	    	return JSONObject.toJSONString("6666");
	    }
}
