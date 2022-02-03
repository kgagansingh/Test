package q2.com.model.service;

import q2.com.model.persistance.Customer;
import q2.com.model.persistance.CustomerDao;
import q2.com.model.persistance.CustomerDaoImpl;

public class CustomerDtoImpl implements CustomerDto{
	CustomerDao cs=new CustomerDaoImpl();
	@Override
	public void addCustomer(Customer c) {
		cs.addCustomer(c); 
	}

	@Override
	public Customer getById(int id) {
		return cs.getById(id);
	}

}
