package erp_system.security;

import java.time.Duration;
import java.util.Set;

import io.smallrye.jwt.build.Jwt;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class JwtService {

    public String generateToken(String username) {

        return Jwt.issuer("erp-system")
                .subject(username)
                .groups(Set.of("admin"))
                .expiresIn(Duration.ofHours(2))
                .sign();
    }

}
