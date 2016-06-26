package de.allianz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.allianz.dao.CustomerDao;
import de.allianz.entity.CustomerEntity;

@Service
@Transactional
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public CustomerEntity getCustomerById(Integer id) {
		return customerDao.getCustomerById(id);
	}

}
