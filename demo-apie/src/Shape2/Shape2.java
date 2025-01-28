package Shape2;
public interface Shape2 {

    /* 
     * 抽象野唔好寫 interface
     * problem: interface no attribute
     * interface 唔係物件, 係行為
     * example, eatable, drinkable
     * 做行為, contract 形容行為
     * 行為冇 attribute 先用 interface
     * 設計思路
     * before java 8, no static & no default method, 冇行為
     * 有左 default method 好強大
     */

     double area();

     default double calculate() {
        return area() + 3;
     }
    
     
}
