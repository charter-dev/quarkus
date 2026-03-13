package erp_system.mapper;

import erp_system.dto.master.ProductDTO;
import erp_system.entity.master.Product;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductMapper {

    public Product toEntity(ProductDTO dto){

        Product p = new Product();
        p.code = dto.code;
        p.name = dto.name;
        p.price = dto.price;

        return p;
    }

    public ProductDTO toDTO(Product p){

        ProductDTO dto = new ProductDTO();
        dto.id = p.id;
        dto.code = p.code;
        dto.name = p.name;
        dto.price = p.price;

        return dto;
    }

}
