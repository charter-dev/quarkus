package erp_system.service;



import java.util.List;

import erp_system.entity.master.Product;
import erp_system.repository.ProductRepository;
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

    @Transactional
    public Product create(Product p){

        repo.persist(p);
        return p;

    }

}
