public class GeneralPrinter<T> {//T present the scope of "T" inside the class
                                //T can be anything
                                //Generic design
                                //after java 1.5
                                //the purpose is to reduce number of class
    private T value;

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

}
