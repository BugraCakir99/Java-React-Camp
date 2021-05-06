import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Entities.concretes.Customer;
import business.concretes.BaseCustomerManager;
import business.concretes.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.Save(new Customer(1, "Buðra", "Çakýr",LocalDate.of(1999,1,7), "11223344555"));

	}

}
