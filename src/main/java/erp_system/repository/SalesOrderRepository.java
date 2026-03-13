package erp_system.repository;

import erp_system.entity.transaction.SalesOrder;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SalesOrderRepository implements PanacheRepository<SalesOrder> {

}
