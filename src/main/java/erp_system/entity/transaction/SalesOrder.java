package erp_system.entity.transaction;

import erp_system.entity.master.Product;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class SalesOrder extends PanacheEntity {

	public String orderNumber;

    public Integer qty;

    @ManyToOne
    public Product product;

}