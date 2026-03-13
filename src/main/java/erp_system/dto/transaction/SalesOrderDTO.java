package erp_system.dto.transaction;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class SalesOrderDTO {

    @NotNull
    public Long productId;

    @Min(1)
    public Integer qty;

}
