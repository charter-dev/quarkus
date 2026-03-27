package erp_system.config;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;

@OpenAPIDefinition(
    info = @Info(
        title = "Learn Quarkus API",
        version = "1.0.0",
        description = "API documentation for Learn Quarkus project"
    )
)
public class OpenApiConfig {
}
