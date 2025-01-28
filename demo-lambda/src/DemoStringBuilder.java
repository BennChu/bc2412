public class DemoStringBuilder {
    
    public static void main(String[] args) {
        String s = "hello";
        s += "!!!";
        s += "???";

        long before = System.currentTimeMillis();//1737012411727

        s = "";
        for (int i = 0 ; i < 100_000 ; i++) {
            s += "!";
        }
        long after = System.currentTimeMillis();

        System.out.println(after - before);


        //public fina class
        StringBuilder sb = new StringBuilder("");
        before = System.currentTimeMillis();

        for (int i = 0 ; i < 100_000 ; i++) {
            sb.append("!");//why not sb = sb.append, 唔似 BigDecimal, 佢 return new object 出黎, 所以要接住佢
                            //append 唔係 return new object 接住自己, 佢直接改自己, 所以唔使接住
                            //similar to setter
        }
        System.out.println(s.length());
        after = System.currentTimeMillis();
        System.out.println(after - before);

        //base is chararray[]

        sb = new StringBuilder("abc");
        System.out.println(sb.reverse());//cba, String does not have this, 返工用呢個, 但 interview 用 for loop

        //Arrays.sort, Collections.sort

        System.out.println(sb.charAt(2));//c
        
        //sb is "cba"
        //sb.replace(0, 2, "yy") -> return StringIndexOutOfBoundsException: index 2, length 2
        //sb.replace(0, 1, "yy") -> return yyba
        //sb.replace(0, 0, "yy") -> return yycba
        System.out.println(sb.replace(0, 1, "yy"));//yyba, index end-1
        
        sb.deleteCharAt(2);//for loop
        System.out.println(sb);//yya

        sb.setCharAt(2, 'o');
        System.out.println(sb);//yyo

        sb.insert(1, "!!!");
        System.out.println(sb);//y!!!yo



    }
}
