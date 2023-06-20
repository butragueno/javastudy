public class Loops {
    public static void main(String[] args){
//        var w1 = new While1();
//        w1.while_practice();
//        var dw=new DoWhile1();
        var f1=new For1();
    }
}

class While1{
    While1(){
        while_test1();
    }
    void while_test1(){
        int sum=0;
        int n=1;
        while (n<=100){
            sum+=n;
            n++;
        }
        System.out.println(sum);
    }
    void while_practice(){
        int sum = 0;
        int m = 20;
        int n = 100;
        // 使用while计算M+...+N:
        while (m<=n) {
            sum+=m;
            m++;
        }
        System.out.println(sum);
    }
}

class DoWhile1{
    DoWhile1(){
        int sum = 0;
        int n = 1;
        do{
            sum+=n;
            n++;
        }while (n<=100);
        System.out.println(sum);
    }
}

class For1{
    For1(){
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=i;
        }
//        System.out.println(sum);
//        for_test1();
//        for_each1();
//        practice1();
//        practice2();
        practice3();
    }
    void for_test1(){
        int sum=0;
        int[] ns={ 1, 4, 9, 16, 25 };
        for (int i =0;i<ns.length;i++){
            sum+=ns[i];
            System.out.println(ns[i]);
        }
        System.out.println(sum);
    }
    void for_each1(){
        int[] ns={ 1, 4, 9, 16, 25 };
        for (int n:ns){
            System.out.println(n);
        }
    }
    void practice1(){
        int[] ns={ 1, 4, 9, 16, 25 };
        for (int i=ns.length-1;i>=0;i--){
            System.out.println(ns[i]);
        }
    }
    void practice2(){
        int[] ns = { 1, 4, 9, 16, 25 };
        int sum = 0;
        for (int n:ns){
            sum+=n;

        }
        System.out.println(sum);
    }
    void practice3(){
        double pi = 0;
        for (int i=1;i<=100000;i++) {
            double p=-1;
            double q=-1;
            for (int n=1;n<=i;n++){
                p=p*-1;
                q=q+2;
            }
            pi = pi + (1 / q*p);
        }
        System.out.println(pi*4);
    }
}