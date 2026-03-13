package erp_system.entity.master;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Supplier extends PanacheEntity {

    public String code;
    public String name;
    public String address;

}