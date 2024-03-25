
import javax.xml.crypto.Data;


public class Parameters {
    /**
     * 变量和数据类型
     *
     *
     *  @auther XieRuifeng
     *  @date 20240325
     */
    public static void main(String[] args){
        int x = 100;// 定义int类型变量x，并赋予初始值100
        System.out.println(x);// 打印该变量的值
        x=200;// 重新赋值为200
        System.out.println(x);// 打印该变量的值，观察是否为200
//        第二次重新赋值的时候，变量x已经存在了，不能再重复定义，因此不能指定变量类型int

        System.out.println();
        Para2 para= new Para2();

        System.out.println();
        //运行以证明赋值语句无误
        IntergerType data1 = new IntergerType();
        FloatType data2 = new FloatType();
        BooleanType data3 = new BooleanType();
        ConstantParameter p1 = new ConstantParameter();

        System.out.println();
        CharType data4 = new CharType();
    }
}
class Para2{
    public Para2(){
        int n = 100; // 定义变量n，同时赋值为100
        System.out.println("n = " + n); // 打印n的值

        n = 200; // 变量n赋值为200
        System.out.println("n = " + n); // 打印n的值

        int x = n; // 变量x赋值为n（n的值为200，因此赋值后x的值也是200）
        System.out.println("x = " + x); // 打印x的值

        x = x + 100; // 变量x赋值为x+100（x的值为200，因此赋值后x的值是200+100=300）
        System.out.println("x = " + x); // 打印x的值
        System.out.println("n = " + n); // 再次打印n的值，n应该是200还是300？
    }
}
class IntergerType{
    /**
     * 基本数据类型：
     * 整数类型：byte，short，int，long
     * 浮点数类型：float，double
     * 字符类型：char
     * 布尔类型：boolean
     *
     byte：-128 ~ 127
     short: -32768 ~ 32767
     int: -2147483648 ~ 2147483647
     long: -9223372036854775808 ~ 9223372036854775807
     */
    public IntergerType(){
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制表示的16711680
        int i5 = 0b1000000000; // 二进制表示的512

        long n1 = 9000000000000000000L; // long型的结尾需要加L
        long n2 = 900; // 没有加L，此处900为int，但int类型可以赋值给long
//        int i6 = 900L; // 错误：不能把long型赋值给int
        System.out.println("IntergerType Study Finished!");
    }
}

class FloatType{
    //float类型结尾必须带f，否则为double类型小数
     FloatType(){
        float f1 = 3.14f;
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
//        float f3 = 1.0; // 错误：不带f结尾的是double类型，不能赋值给float

        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
        System.out.println("FloatType Study Finished!");
    }
}

class BooleanType{
    BooleanType(){
        boolean b1 = true;
        boolean b2 = false;
        boolean isGreater = 5 > 3; // 计算结果为true
        int age = 12;
        boolean isAdult = age >= 18; // 计算结果为false
        System.out.println("BooleanType Study Finished!");
    }
}

class CharType{
    CharType(){
//        Java的char类型除了可表示标准的ASCII外，还可以表示一个Unicode字符
        char a = 'A';
        char zh = '中';
        System.out.println(a);
        System.out.println(zh);
        System.out.println("CharType Study Finished!");
//        char类型使用单引号'，且仅有一个字符，要和双引号"的字符串类型区分开
    }
}

class ConstantParameter{
    ConstantParameter(){
        final double PI = 3.14; // PI是一个常量
        double r = 5.0;
        double area = PI * r * r;
//        PI = 300; // compile error!
        System.out.println("ConstantParameter Study Finished!");
//        根据习惯，常量名通常全部大写
    }
}

