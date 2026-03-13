package erp_system.dto.master;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProductDTO {

    public Long id;

    @NotBlank
    public String code;

    @NotBlank
    public String name;

    @NotNull
    public BigDecimal price;

}