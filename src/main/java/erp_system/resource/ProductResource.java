package erp_system.resource;

import java.util.List;

import erp_system.dto.master.ProductDTO;
import erp_system.entity.master.Product;
import erp_system.service.ProductService;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductResource {

    @Inject
    ProductService service;

    @GET
    public List<Product> list(){

        return service.list();

    }

    @POST
    public Product create(@Valid ProductDTO dto){

        Product p = new Product();
        p.code=dto.code;
        p.name=dto.name;
        p.price=dto.price;

        return service.create(p);

    }

}
