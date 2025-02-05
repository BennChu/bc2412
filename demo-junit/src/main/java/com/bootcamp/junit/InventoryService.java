package com.bootcamp.junit;

//Singleton Pattern (coding pattern)
public class InventoryService {

    //包裝
    //singleton instance
    //A static variable (uniqueInstance) holds the single instance of the class. 
    //This instance is created when the class is loaded
    private static InventoryService uniqueInstance = new InventoryService();

    private int checkAvailableStock;
    private int stockCount;

    //private constructor
    private InventoryService() {

    }

    public static InventoryService getInstance() {
        return uniqueInstance;//always return same instance
    }

    public static int getInstanceStockCount() {
        return uniqueInstance.checkAvailableStock;
    }


    public int checkAvailableStock() {
        return -1;
    }

    public boolean deductStock() {
        this.stockCount--;
        return false;
    }
    
}
