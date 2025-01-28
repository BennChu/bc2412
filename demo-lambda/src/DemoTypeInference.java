import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoTypeInference {


    private T x; //cannot be defined as attribute type, 寫 T




    public static void main(String[] args) {
        
        //java 10
        //once you assign the value to var variable, 
        //the variable type will be defined as usual
        //local variable
        var x = 3;//complicate 的 data structure, eg list of list
                    //x is an int variable
                    //compile time 變番做 int

                    //x = 3.3
        
        //var z;//cannot Null has to be initialized at declaration

        //z = 10;

        var arr = new int[] {1, 2, 3};
        var arr10 = new double[] {1, 2, 3};
        //var arr10 = {1, 2, 3};//not ok




        var y = 3.3;//y is a double type
        y = 3;//upcast

        System.out.println(y);//3.0

        List<List<String>> stringLists = new ArrayList<>();
        stringLists.add(Arrays.asList("abc", "def"));
        stringLists.add(Arrays.asList("xyz", "ijk"));

        System.out.println(stringLists);//[[abc, def], [xyz, ijk]]

        for (List<String> list : stringLists) {
            for (String str : list) {
                System.out.println(str);
            }
        }


        //var can be defined as reference type for a certain DS
        for (var list : stringLists) {//var list, List<String>
            for (var str : list) {//var str, String
                System.out.println(str);
            }
        }


        //stream flatmap
        //List<List<String>> -> List<String> list of strings
        //now is a single List
        List<String> result = stringLists.stream()
                                        .flatMap(e -> e.stream())
                                        .collect(Collectors.toList());
        System.out.println(result);//[abc, def, xyz, ijk]


        //find all nicknames of customers
        List<Customer> customer = Arrays.asList(
                                    new Customer("Vincent", "vlau", Arrays.asList("abc", "ijk")),
                                    new Customer("Oscar","oChan"),
                                    new Customer("Sam","SLam",Arrays.asList("yui", "zxc")),
                                    new Customer("Eric","ELee"));

        // List<String> nicknames = customer.stream()
        //                           .flatMap(e -> e.getNicknames().stream()
        //                           .collect(Collectors.toList());//map 攞到好多條 list of string
        
    //    List<String> nicknames = customer.stream()
    //                             .filter(e -> e.getName().length()>5)//customer
    //                             .flatMap(e -> e.getNickNames().stream())//customer flatmap 之後係 string
    //                             .filter(e -> e.length())//string
    //                             .collect(Collectors.toList());


        //java 1.5 generic arraylist
        //java 1.8 lambda
       // System.out.println(nicknames);





        





    }


    //public static int sum(var x, var y)//唔知你 var 係乜, 點加
    //java doesnt allow defining var as variable type
    //because java is strong type (type has to be determined during compile time)
    //


    //return type cannot be defined as var type
    //because caller doesnt know the return of sum() method during compile time
    // public static var sum(int x, int y) {
    //     return x + y;
    //        return (long) x + (long) y;
    // }




    public static class Customer {
        private String name;
        private String username;
        private List<String> nicknames;

        public Customer(String name, String username) {
            this.name = name;
            this.username = username;
        }

        public Customer(String name, String username, List<String> nicknames) {
            this.name = name;
            this.username = username;
            this.nicknames = nicknames;
        }

        public List<String> getNicknames() {
            return this.nicknames;
        }



        public String getUsername() {
            return this.username;
        }

        public String getName() {
            return this.name;
        }




    }//Customer





    
}
