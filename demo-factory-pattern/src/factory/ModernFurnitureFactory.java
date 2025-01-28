package factory;

import furniture.Chair;
import furniture.ModernChair;
import furniture.ModernSofa;
import furniture.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {

    //c
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

}
