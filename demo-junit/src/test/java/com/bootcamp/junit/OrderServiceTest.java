package com.bootcamp.junit;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

//Mockito
@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {

    //by default by method
    @Mock
    private PaymentService paymentService;//mock object (without real implementation)
    @Mock
    private InventoryService inventoryService;//mock object (without real implementation)
    
    @Test
    void testOrder() {

        //For this scenario, how do we prefrom Unit Test?
        //OrderService -> Inventory Service
        //-> Payment Service
        Mockito.when(this.inventoryService.checkAvailableStock()).thenReturn(10);
        Mockito.when(this.inventoryService.deductStock()).thenReturn(true);
        Mockito.when(this.paymentService.pay()).thenReturn(true);
        
        OrderService os = new OrderService(this.paymentService, this.inventoryService);
        boolean orderResult = os.order();

        //Assert + verify is a pair
        Assertions.assertEquals(true, orderResult);

        verify(this.inventoryService).checkAvailableStock();//唔寫 times(), default times(1)
        verify(this.inventoryService, times(1)).deductStock();
        verify(this.paymentService, times(1)).pay();//有 atLeast(1)

        Assertions.assertDoesNotThrow(() -> os.order());

    }

    //assertThrow
    // 1. stock <= 0 -> throw
    @Test
    void testOrder_whenStockCountIsZero() {

        Mockito.when(this.inventoryService.checkAvailableStock()).thenReturn(0);
        // Mockito.when(this.inventoryService.deductStock()).thenReturn(true);
        // Mockito.when(this.paymentService.pay()).thenReturn(true);
        
        OrderService os = new OrderService(this.paymentService, this.inventoryService);

        Assertions.assertThrows(IllegalStateException.class, () -> os.order());

        verify(this.inventoryService, times(1)).checkAvailableStock();
        verify(this.inventoryService, times(0)).deductStock();
        verify(this.paymentService, times(0)).pay();
        //times(0) 可以確定冇行呢條路

    }


    @Test
    //3. pay() -> false,  deductStock() -> true
    void testOrderPayIsFalse() {

        Mockito.when(this.inventoryService.checkAvailableStock()).thenReturn(10);
        //Mockito.when(this.inventoryService.deductStock()).thenReturn(true);
        //unnecessaryStubbingException, no need do testing
        Mockito.when(this.paymentService.pay()).thenReturn(false);
        //pay() 行先, if false 就冇行後面

        OrderService os = new OrderService(this.paymentService, this.inventoryService);
        boolean orderResult = os.order();

        verify(this.inventoryService, times(1)).checkAvailableStock();
        verify(this.inventoryService, times(0)).deductStock();
        verify(this.paymentService, times(1)).pay();

        Assertions.assertEquals(false, orderResult);
    }

    @Test
    //4. pay() -> true,  deductStock() -> false
    void testOrder4() {

        Mockito.when(this.inventoryService.checkAvailableStock()).thenReturn(10);
        Mockito.when(this.paymentService.pay()).thenReturn(true);
        Mockito.when(this.inventoryService.deductStock()).thenReturn(false);

        OrderService os = new OrderService(this.paymentService, this.inventoryService);
        boolean orderResult = os.order();

        verify(this.inventoryService, times(1)).checkAvailableStock();
        verify(this.paymentService, times(1)).pay();
        verify(this.inventoryService, times(1)).deductStock();
        
        Assertions.assertEquals(false, orderResult);
    }


    @Test
    // 5. pay() -> false,  deductStock() -> false
    void testOrder5() {

        Mockito.when(this.inventoryService.checkAvailableStock()).thenReturn(10);
        Mockito.when(this.paymentService.pay()).thenReturn(false);
        //Mockito.when(this.inventoryService.deductStock()).thenReturn(false);
        //unnecessaryStubbingException, no need do testing

        OrderService os = new OrderService(this.paymentService, this.inventoryService);
        boolean orderResult = os.order();

        verify(this.inventoryService, times(1)).checkAvailableStock();
        verify(this.paymentService, times(1)).pay();//pay() is false, then no need to run deductStock()
        verify(this.inventoryService, times(0)).deductStock();

        Assertions.assertEquals(false, orderResult);
    }



}
