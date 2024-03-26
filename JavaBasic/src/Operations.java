public class Operations {
    public static void main(String[] args){
//        IntOps intops=new IntOps();
//        FloatOps f1 = new FloatOps();
//        BooleanOps b1 = new BooleanOps();

    }
}

class IntOps{
    public IntOps(){
        int x1 = 12344/7;
        int x2 = 12344%7;
        double x3 = 12344.0/7;
        System.out.println(x1 +" "+ x2 +" "+ x3);
        stack_over_flow();
        self_ops();
        shift_ops();
        bit_ops();
        forced_transformation();
        practice1();
    }

    void stack_over_flow(){
        int x = 2147483640;
        int y = 15;
        int sum = x + y;
        System.out.println(sum); // -2147483641

    }
    void self_ops(){
        int n=1;
        n++;
        System.out.println(n);
        ++n;
        System.out.println(n);
    }
    void shift_ops(){
        int n = 7;       // 00000000 00000000 00000000 00000111 = 7
        int a = n << 1;  // 00000000 00000000 00000000 00001110 = 14
        int b = n >> 2;  // 00000000 00000000 00000000 00000011 = 3
//        左移实际上就是不断地×2，右移实际上就是不断地÷2
    }
    void bit_ops(){
//        与运算的规则是，必须两个数同时为1，结果才为1
        int n = 0&1;
        System.out.println("与： n = 0 & 0 ="+n);
        n=1 & 1;
        System.out.println("与： n = 1 & 1 ="+n);
        boolean b=true & true;
        System.out.println("与： b = true & true ="+b);
        b=true | false;
        System.out.println("与： b = true | false ="+b);
        n=~ 1;
        System.out.println("与： n = ~ 1 = "+n);
        n=0^0;
        System.out.println("与： n = 0 ^ 0 = "+n);
        n=144^144;
        System.out.println("与： n = 144 ^ 144 = "+n);
        b=true ^ false;
        System.out.println("与： b = true ^ false ="+b);

    }
    void forced_transformation(){
        int i1 = 1234567;
        short s1 = (short) i1; // -10617
        System.out.println(s1);
    }
    void practice1(){
        int n =100;
        int sum = (1+n)*n/2;
        System.out.println(sum);
        System.out.println(sum == 5050 ? "测试通过" : "测试失败");
    }
}

class FloatOps{
    FloatOps(){
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        // 观察x和y是否相等:
        System.out.println(x);
        System.out.println(y);
//        浮点数常常无法精确表示，因此，浮点数运算会产生误差
//        所以比较两个浮点数是否相等常常会出现错误的结果。
//        正确的比较方法是判断两个浮点数之差的绝对值是否小于一个很小的数
        double r = Math.abs(x - y);
//          再判断绝对值是否足够小:
        if (r < 0.00001) {
            System.out.println("x与y相等");
            // 可以认为相等
        } else {
            System.out.println("x与y不相等");
            // 不相等
        }
//        如果参与运算的两个数其中一个是整型，那么整型可以自动提升到浮点型
        int n = 5;
        double d = 1.2 + 24.0 / n; // 6.0
        System.out.println(d);
//        需要特别注意，在一个复杂的四则运算中，两个整数的运算不会出现自动提升的情况
        double d1 = 1.2 + 24 / 5;
        System.out.println(d1);
        stack_over_flow();
        forced_transformation();
        practice2();
    }

    void stack_over_flow(){
        /**
         * 整数运算在除数为0时会报错，而浮点数运算在除数为0时，不会报错，但会返回几个特殊值：
         *
         *     NaN表示Not a Number
         *     Infinity表示无穷大
         *     -Infinity表示负无穷大
         */
        System.out.println();
        double d1 = 0.0 / 0; // NaN
        System.out.println(d1);
        double d2 = 1.0 / 0; // Infinity
        System.out.println(d2);
        double d3 = -1.0 / 0; // -Infinity
        System.out.println(d3);
    }

    void forced_transformation(){
        /**
         * 可以将浮点数强制转型为整数。在转型时，浮点数的小数部分会被丢掉。
         * 如果转型后超过了整型能表示的最大范围，将返回整型的最大值
         */
        System.out.println();
        int n1 = (int) 12.3; // 12
        System.out.println(n1);
        int n2 = (int) 12.7; // 12
        System.out.println(n2);
        int n22 = (int) -12.7; // -12
        System.out.println(n22);
        int n3 = (int) (12.7 + 0.5); // 13
        System.out.println(n3);
        int n4 = (int) 1.2e20; // 2147483647
        System.out.println(n4);
    }
    void practice2(){
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        // 求平方根可用 Math.sqrt():
        // System.out.println(Math.sqrt(2)); ==> 1.414
        double sqrt = Math.sqrt(b * b - 4 * a * c);
        double r1 = (-b+ sqrt)/(2*a);
        double r2 = (-b- sqrt)/(2*a);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");
    }

}

class BooleanOps{
    /**
     *
     比较运算符：>，>=，<，<=，==，!=
     与运算 &&
     或运算 ||
     非运算 !

     */
    BooleanOps(){
        int age =12;
        int b = 32;
        boolean b1 =  age >6 && age <18;
        b1 = !b1;
        System.out.println(b1);
        short_ops();
        three_ops();
        practice();
    }
    void short_ops(){
        /**
         * 如果没有短路运算，&&后面的表达式会由于除数为0而报错，
         * 但实际上该语句并未报错，原因在于与运算是短路运算符，提前计算出了结果false
         */
        boolean b = 5 < 3;
        boolean result = b && (5 / 0 > 0);
        System.out.println(result);

//        对于||运算，只要能确定第一个值为true，后续计算也不再进行
        System.out.println((true || (5 / 0 > 0)));
    }
    void three_ops(){
        /**
         * Java还提供一个三元运算符b ? x : y，
         * 它根据第一个布尔表达式的结果，
         * 分别返回后续两个表达式之一的计算结果
         * x和y的类型必须相同，因为返回值不是boolean，而是x和y之一
         */
        System.out.println();
        int n = -100;
        int x = n >= 0 ? n : -n;
        System.out.println(x);
    }
    void practice(){
        System.out.println();
        int age = 7;
        // primary student的定义: 6~12岁
        boolean isPrimaryStudent = age>=6&&age<=12?true:false;
        System.out.println(isPrimaryStudent ? "Yes" : "No");
    }
}

