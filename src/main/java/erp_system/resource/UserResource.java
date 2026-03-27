package erp_system.resource;

import org.eclipse.microprofile.openapi.annotations.security.SecurityRequirement;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@SecurityRequirement(name = "bearerAuth")
public class UserResource {

    @GET
    @RolesAllowed("admin")
    public String users(){
        return "List of users";
    }

}
