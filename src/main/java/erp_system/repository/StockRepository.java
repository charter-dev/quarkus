package erp_system.repository;

import erp_system.entity.inventory.Stock;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StockRepository implements PanacheRepository<Stock> {

}
