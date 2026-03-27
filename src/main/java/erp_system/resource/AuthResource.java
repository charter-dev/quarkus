package erp_system.resource;

import java.util.Map;

import erp_system.dto.LoginRequest;
import erp_system.security.JwtService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/auth")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AuthResource {

    @Inject
    JwtService jwtService;

    @POST
    @Path("/login")
    public Map<String,String> login(LoginRequest request){

        if(!"admin".equals(request.username) || !"admin".equals(request.password)){
            throw new RuntimeException("Invalid login");
        }

        String token = jwtService.generateToken(request.username);

        return Map.of("token", token);
    }

}