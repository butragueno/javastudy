public class IfOperation {
    public static void main(String[] args){
//        ifcondition();
        var d1 = new DetermineRef();

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
    }
}
