package erp_system.resource;

import java.util.List;

import erp_system.entity.master.Customer;
import erp_system.service.CustomerService;
import io.quarkus.panache.common.Page;
import jakarta.inject.Inject;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/customers")
public class CustomerResource {
	
	@Inject
    CustomerService service;

    @GET
    public List<Customer> list(
            @QueryParam("page") @DefaultValue("0") int page,
            @QueryParam("size") @DefaultValue("10") int size,
            @QueryParam("search") String search
    ){

        return service.search(search)
                .page(Page.of(page,size))
                .list();

    }

}
