package erp_system.entity.inventory;

import erp_system.entity.master.Product;
import erp_system.entity.master.Warehouse;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Stock extends PanacheEntity {

    @ManyToOne
    public Product product;

    @ManyToOne
    public Warehouse warehouse;

    public Integer qty;

}