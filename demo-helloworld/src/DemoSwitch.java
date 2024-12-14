public class DemoSwitch {

  public static void main(String[] args){

    int x = 1;
    if ( x==1 ){
      System.out.println("x=1");
    }else if ( x==2 ){
      System.out.println("x=2");
    }else if ( x==3 ){
      System.out.println("x=3");
    }else {
      System.out.println("somthing else");
    }
  

    //switch, cannot do comparision cannot put ">1" 唔可以放比較, 用途比較少
    switch(x){
      case 1:
        System.out.println("x=1");
        break;
      case 2:
        System.out.println("x=2");
        break;
      case 3:
        System.out.println("x=3");
        break;
      default:
      System.out.println("somthing else");
    }


    char gender = 'M'; // F , M (well defined value range) 唔係男就係女, 有限數量 case
    switch(gender){
      case 'M':
        System.out.println("male");
        break;
      case 'F':
        System.out.println("female");
        break;
    }














  }
  
}
