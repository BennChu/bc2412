package Account;
public enum Currency {
    
    //enum 唔可以比人 new object
    //String 都可以 "HKD " 又可以
    //1. Values Finite, 有限變化, status (ordered, delivered), gender only M of F, Month, 
    //2. values not likely to have a new value, 要成日改 eg. stock code 可能 listed , delisted
    // HKD,
    // USD,
    // JPY,
    // EUR,
    // ;

    HKD("Hong Kong Dollor",1),
    USD("United State Dollor",2),
    JPY("Japenese Dollor",3),
    EUR("European Dollor",4),
    ;
    //Example: mapping

    //object, constructor 都做到
    //final, 比人知係唔可以改
    //都可以唔 final, 但唔精確
    //can carry more than 1 value
    private final String desc;
    private final int value;

    //constructor, 因為唔係比人 new 野, private 左
    //only 比人 get
    private Currency (String desc, int value) {
        this.desc = desc;
        this.value = value;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getValue() {
        return this.value;
    }

    //static method 都做到
    //Currency 都可以放 static, static method 放邊都可以
    //唔可以放 static variable
    public static String getDescription(Currency currency) {
       
        //before java 14
        //fixed after java 14
        //enum object 全部唯一, 所以用 == or equals or 地址都一樣
        // switch (currency) {
        //     case HKD:
        //         return "Hong Kong Dollor";
        //     case USD:
        //         return "USD";
        //     case JPY:
        //         return "Japenese";
        //     case EUR:
        //         return "EUR";
        //     default:
        //         return "";
        // }

        //都可以用 if else
        if (currency == Currency.HKD )
            return "Hong Kong Dollor";
        else if (currency == Currency.USD) 
            return "USD";
        else if (currency == Currency.JPY) 
            return "JPY";
        else if (currency == Currency.EUR)
            return "EUR";
        return "";
        
        
            
    }

    public static void main(String[] args) {

        //call static method in Currency class
        System.out.println(Currency.getDescription(Currency.USD));//USD
    
        //用 object 方法
        System.out.println(Currency.USD.getDesc());//United State Dollor
        System.out.println(Currency.USD.getValue());//2
    
        //hkd is a reference
        Currency hkd = Currency.HKD;
        System.out.println(hkd.getValue());//1

    }

}
