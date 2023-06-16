public class Operations {
    public static void main(String[] args){
        var intops=new IntOps();
    }
}

class IntOps{
    public IntOps(){
//        int x1 = 12344/7;
//        int x2 = 12344%7;
//        double x3 = (float)12344.0/7.0;
//        System.out.println(x1 +" "+ x2 +" "+ x3);
//        stack_over_flow();

    }
    void stack_over_flow(){
        long x = 2147483640;
        long y = 15;
        long sum = x + y;
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

    }
}
