package erp_system.service;

import java.util.UUID;

import erp_system.dto.transaction.SalesOrderDTO;
import erp_system.entity.inventory.Stock;
import erp_system.entity.master.Product;
import erp_system.entity.transaction.SalesOrder;
import erp_system.repository.SalesOrderRepository;
import erp_system.repository.StockRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class SalesOrderCommandService {

    @Inject
    StockRepository stockRepo;

    @Inject
    SalesOrderRepository soRepo;

    @Transactional
    public void createOrder(SalesOrderDTO dto){

        Product product = Product.findById(dto.productId);

        Stock stock = stockRepo.find("product",product).firstResult();

        if(stock.qty < dto.qty){

            throw new RuntimeException("Stock not enough");

        }

        stock.qty -= dto.qty;

        SalesOrder so = new SalesOrder();
        so.product = product;
        so.qty = dto.qty;
        so.orderNumber = UUID.randomUUID().toString();

        so.persist();

    }

}