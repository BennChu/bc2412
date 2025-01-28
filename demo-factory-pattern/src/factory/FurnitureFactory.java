package factory;

import furniture.Chair;
import furniture.Furniture;
import furniture.Sofa;

public interface FurnitureFactory {

    //when classes implements this interface must have below 2 methods 行為 or 性能
    //make chair and sofa
    Chair createChair();
    Sofa createSofa();

    public static FurnitureFactory createFactory(Furniture.Style style) {
        return switch (style) {
            case MODERN -> {
                yield new ModernFurnitureFactory();// 1 layer down
            }
            case VICTORIAN -> {
                yield new VictorianFurnitureFactory();
            }
        };
    }
    
}
