package erp_system.entity.master;

import java.math.BigDecimal;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Product extends PanacheEntity {

    public String code;
    public String name;
    public BigDecimal price;

}
