public class IfOperation {
    public static void main(String[] args){
        ifcondition();
        DetermineRef d1 = new DetermineRef();
        PracticeIfOp p1 = new PracticeIfOp();
    }
    static void ifcondition(){
        int n=70;
        if (n>90){
            System.out.println("优秀");
        }
        else if (n >= 60) {
            System.out.println("及格了");
        }
        else {
            System.out.println("挂科了");
        }
        System.out.println("END");
    }
}

class DetermineRef{
    DetermineRef(){
        String s1 = "hello";
//        String s2 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
        if (s1 != null && s1.equals(s2)) {
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 not equals s2");
        }
        s1 = null;
        if (s1 != null && s1.equals("hello")) {
            System.out.println("hello");
        }
    }
}

class PracticeIfOp{
    PracticeIfOp(){
        double weight=95;
        double height=1.80;
        double BMI= weight/(height*height);
        if (BMI>=32){
            System.out.println("非常肥胖");
        }
        else if (BMI>=28){
            System.out.println("肥胖");
        }else if (BMI >=25){
            System.out.println("过重");
        }else if (BMI>=18.5){
            System.out.println("正常");
        }else{
            System.out.println("过轻");
        }
    }
}