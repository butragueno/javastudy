public class CharAndString {
    public static void  main(String[] args){
        Chars c = new Chars();
        Strings s = new Strings();
        Practice p = new Practice();
    }
}

class Chars{
    public Chars(){
//        一个char保存一个Unicode字符
        char c1 = 'A';
        int c2 = '中';
        System.out.println(c2);
        System.out.println((char)c2);
    }
}

class Strings{
    public Strings(){
        /**
         * 常见的转义字符包括：
         *     \" 表示字符"
         *     \' 表示字符'
         *     \\ 表示字符\
         *     \n 表示换行符
         *     \r 表示回车符
         *     \t 表示Tab
         */
        //一个字符串可以存储0个到任意个字符
        String s1="Fuck you!";
        String s2 = "ABC and \u4e2d\u6587";
        int i1=5;
        float f1=4.44f;
        System.out.println(s1+s2+i1+f1);
        //要完整拼接，第一个必须是字符串（使用“”+）
        System.out.println(""+i1+f1+s1+f1);
        System.out.println(i1+f1+s1+f1);
        String s3=
                "SELECT * FROM\n" +
                "users\n" +
                "WHERE id > 100\n" +
                "ORDER BY name DESC";
        System.out.println(s3);
        System.out.println("finished");
        test();
    }
    static void test(){
        String s = "hello";
        String t = s;
        s = "world";
        System.out.println(t); // t是"hello"还是"world"?
        //Java的字符串除了是一个引用类型外，还有个重要特点，就是字符串不可变
    }
}


class Practice{
    Practice(){
        int a = 72;
        int b = 105;
        int c = 65281;

        String s = ""+(char)a+(char)b+(char)c;
        System.out.println(s);
    }
}