package erp_system.entity.master;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Customer extends PanacheEntity {

    public String code;
    public String name;
    public String email;
    public String phone;

}