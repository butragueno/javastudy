public class Operations {
    public static void main(String[] args){
        IntOps intops=new IntOps();
        Practice1 p1 = new Practice1();
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
}

class Practice1{
    Practice1(){
        int n =100;
        int sum = (1+n)*n/2;
        System.out.println(sum);
        System.out.println(sum == 5050 ? "测试通过" : "测试失败");
    }
}
