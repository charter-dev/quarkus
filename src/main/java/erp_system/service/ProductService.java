package erp_system.service;



import java.util.List;

import erp_system.entity.master.Customer;
import erp_system.entity.master.Product;
import erp_system.repository.ProductRepository;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class ProductService {

    @Inject
    ProductRepository repo;

    public List<Product> list(){

        return repo.listAll();

    }
    
    public PanacheQuery<Product> search(String keyword) {

        if(keyword == null)
            return repo.findAll();

        return repo.find("name like ?1", "%"+keyword+"%");
    }

    @Transactional
    public Product create(Product p){

        repo.persist(p);
        return p;

    }

}
