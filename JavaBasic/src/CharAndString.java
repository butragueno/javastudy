public class CharAndString {
    public static void  main(String[] args){
        Chars c = new Chars();
        Strings s = new Strings();
        Practice p = new Practice();
    }
}

class Chars{
    public Chars(){
        char c1 = 'A';
        int c2 = '中';
        System.out.println((char)c2);
    }
}

class Strings{
    public Strings(){
        String s1="Fuck you!";
        String s2 = "ABC and \u4e2d\u6587";
        int i1=5;
        float f1=4.44f;
//        System.out.println(s1+s2+i1+f1);
//        System.out.println(i1+f1+s1+f1);
        String s3=
                "SELECT * FROM" +
                "users" +
                "WHERE id > 100" +
                "ORDER BY name DESC";
        System.out.println(s3);
        System.out.println("finished");

    }
    static void test(){
        String s = "hello";
        String t = s;
        s = "world";
        System.out.println(t); // t是"hello"还是"world"?
    }
}


class Practice{
    Practice(){
        int a = 72;
        int b = 105;
        int c = 65281;

        // FIXME:
        String s = ""+(char)a+(char)b+(char)c;
        System.out.println(s);
    }
}