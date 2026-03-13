package erp_system.audit;

import java.time.LocalDateTime;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class AuditLog extends PanacheEntity {

    public String username;
    public String action;
    public String entityName;

    public LocalDateTime createdDate;

}
