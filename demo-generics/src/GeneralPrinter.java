public class GeneralPrinter<T> {//T present the scope of "T" inside the class
                                //T can be anything
                                //Generic design
                                //after java 1.5
                                //the purpose is in compile time to reduce number of class
                                //week chapter 25
    
    private T value; //type 唔想寫死個 type 係乜, 所以寫 T
                     //compile time 完成確定

    public GeneralPrinter(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public String print() {
        return "this is " + this.value; //(String) this.value
                                        //this.value.toString()
    }

    public static void main(String[] args) {


        GeneralPrinter<Integer> printer = new GeneralPrinter<>(Integer.valueOf(3));

        GeneralPrinter<Object> printer2 = new GeneralPrinter<>(Integer.valueOf(3));

        GeneralPrinter<Object> printer3 = new GeneralPrinter<>(new Book("IUY"));//new Book 都可以

        //object is a type, 係一件衫, 罩住任何野, object final parent
        Object obj = 3;
        if (obj instanceof Integer) {
            Integer integer = (Integer) obj;
            System.out.println(integer.compareTo(2));
        }
    }




}
