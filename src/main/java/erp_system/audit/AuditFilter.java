package erp_system.audit;

import java.io.IOException;

import erp_system.service.AuditService;
import jakarta.inject.Inject;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.ext.Provider;

@Provider
public class AuditFilter implements ContainerRequestFilter, ContainerResponseFilter {

    @Inject
    AuditService auditService;

    private static final String START_TIME = "startTime";

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {

        requestContext.setProperty(START_TIME,System.currentTimeMillis());

    }

    @Override
    public void filter(ContainerRequestContext requestContext,
                       ContainerResponseContext responseContext) throws IOException {

        String method = requestContext.getMethod();

        String path = requestContext.getUriInfo().getPath();

        String ip = requestContext.getHeaderString("X-Forwarded-For");

        if(ip == null){
            ip = "unknown";
        }

        String user = "anonymous";

        auditService.log(
                user,
                method,
                path,
                "",
                responseContext.getStatus(),
                ip
        );

    }

}
