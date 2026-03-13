package erp_system.entity.transaction;

import java.time.LocalDate;

import erp_system.entity.master.Supplier;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class PurchaseOrder extends PanacheEntity {

    public String poNumber;

    @ManyToOne
    public Supplier supplier;

    public LocalDate orderDate;

}
