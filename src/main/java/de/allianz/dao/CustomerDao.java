package de.allianz.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import de.allianz.entity.CustomerEntity;

@Repository
public class CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public CustomerEntity getCustomerById(Integer id) {
		System.out.println("Id = " + id);
		Criteria criteria = getSession().createCriteria(CustomerEntity.class);
		criteria.add(Restrictions.eq("id", id));
		CustomerEntity result = (CustomerEntity) criteria.uniqueResult();
		//System.out.println("Vorname: " + result.getFirstName());
		return result;
	}

}
