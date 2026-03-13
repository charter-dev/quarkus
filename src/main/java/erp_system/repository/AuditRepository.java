package erp_system.repository;

import erp_system.audit.AuditLog;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AuditRepository implements PanacheRepository<AuditLog> {

}
