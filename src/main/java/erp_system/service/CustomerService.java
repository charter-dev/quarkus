package erp_system.service;

import erp_system.entity.master.Customer;
import erp_system.repository.CustomerRepository;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CustomerService {
	
	@Inject
    CustomerRepository repo;

    public PanacheQuery<Customer> search(String keyword) {

        if(keyword == null)
            return repo.findAll();

        return repo.find("name like ?1", "%"+keyword+"%");
    }

}
