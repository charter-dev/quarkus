package erp_system.entity.transaction;

import java.time.LocalDate;

import erp_system.entity.master.Customer;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class SalesOrder extends PanacheEntity {

    public String soNumber;

    @ManyToOne
    public Customer customer;

    public LocalDate orderDate;

}