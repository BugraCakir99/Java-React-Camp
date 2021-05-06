package business.abstracts;

import Entities.concretes.Customer;

public interface ICustomerCheckService {

	boolean CheckIfRealPerson(Customer customer);
}
