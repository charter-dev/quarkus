package erp_system.entity.transaction;

import java.math.BigDecimal;

import erp_system.entity.master.Product;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class SalesOrderItem extends PanacheEntity {

    @ManyToOne
    public SalesOrder salesOrder;

    @ManyToOne
    public Product product;

    public Integer qty;

    public BigDecimal price;

}
