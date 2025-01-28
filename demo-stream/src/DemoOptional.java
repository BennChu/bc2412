import java.util.Optional;

public class DemoOptional {


    //3. never use Optional type as arttribut type
    //firstName still can be null, but what is thie meaning
    //可能 box 係 null, firstName 都可以 null

    private Optional<String> firstName;

    //generic compile time 未知
    // runtime 已知

    
    public static void main(String[] args) {

        //String string = concat("abc", "def");//唔可以咁寫, 因為 return Optional
        //有優勢 handle null value
        //對 caller, able to avoid null pointer exception
        Optional<String> result = concat("abc", "def");
        //想 caller 主動 handle null case
        //result is Optional type
        //isPresent() is Optional method
        if (result.isPresent()) {
            System.out.println(result.get());
        }
        String result2 = concat(Optional.of("abc"), Optional.of("def"));
    }

    //1. Optional can only be used as a return type of a method, instance or method both ok
    //if you decided to have a return type of Optional
    //it implies the result may be null
    //if a or b is null, then result is null
    //我係作者, 所以寫呢D野
    //作者簽名is Optional, 但 return 都可以係 return null, 所以都要 check return
    public static Optional<String> concat(String a, String b) {
        if (a==null || b==null)
            return Optional.empty();//return null;
        
        return Optional.of(a.concat(b));//如果落度黎, 就係有野
    }


    //2. input is Optional type
    //never use optional as input parameter 
    //Optional 本質唔係傳訊
    //保護用家, x and y still can be null
    public static String concat(Optional<String> x, Optional<String> y) {
        if (x==null || y==null)
            return null;
        if(!x.isPresent() || !y.isPresent())
            return null;
        return x.get().concat(y.get());
    }
}
