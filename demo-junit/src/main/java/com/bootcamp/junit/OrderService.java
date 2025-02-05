package com.bootcamp.junit;

public class OrderService {

    private PaymentService paymentService;
    private InventoryService inventoryService;

    //Dependency Injection (Spring boot)
    public OrderService(PaymentService paymentService, InventoryService inventoryService) {
        this.paymentService = paymentService;
        this.inventoryService = inventoryService;
    }

    // ! Unit Test
    // 1. stock <= 0 -> throw
    // 2. pay() -> true, deductStock() -> true
    // 3. pay() -> false,  deductStock() -> true
    // 4. pay() -> true,  deductStock() -> false
    // 5. pay() -> false,  deductStock() -> false
    public boolean order() {
        if (this.inventoryService.checkAvailableStock() <= 0) {//if (new InventoryService.checkAvailableStock() <= 0)
            throw new IllegalStateException();
        }
        
        return this.paymentService.pay() && this.inventoryService.deductStock();
            
    }
    
}
