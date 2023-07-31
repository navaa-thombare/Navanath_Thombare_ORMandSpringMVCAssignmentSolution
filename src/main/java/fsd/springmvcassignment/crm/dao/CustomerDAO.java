package fsd.springmvcassignment.crm.dao;

import java.util.List;

import fsd.springmvcassignment.crm.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

}
