package q2.com.model.service;

import q2.com.model.persistance.Customer;

public interface CustomerDto {
	void addCustomer(Customer c);
	Customer getById(int id);
}
