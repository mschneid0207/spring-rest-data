package de.allianz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.allianz.dao.CustomerDao;
import de.allianz.entity.Customer;

@Service
@Transactional
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public Customer getCustomerById(Integer id) {
		return customerDao.getCustomerById(id);
	}

}
