public class SwitchOperation {
    public static void main(String[] args){
        Switch1 s1 = new Switch1();
        PracticeSwitch sp1=new PracticeSwitch();
    }
}

class Switch1{
    Switch1(){
        switch1_test();
        switch_string();
//        switch_new();
    }

    void switch1_test() {
        int op = 3;
        switch (op) {
            case 1:
                System.out.println("This is " + op);
                break;
            default:
                System.out.println("Fuck you!\n" + "Say sth!");
                break;
            case 2:
                System.out.println("There is " + op + "");
                break;
        }
    }
    void switch_string(){
        String fr="xiaomi".toLowerCase();
        switch (fr){
            case "apple":
                System.out.print("Haha, apple!");
                break;
            case "xiaomi":
                System.out.print("Hahaha,xiaomi!");
                break;
            default:
                System.out.print("Fuck you!\n"+"Say sth!");
                break;
        }
    }
    void switch_new(){//java8用不了
        String fr="asdad";
        int aa;
//        aa=switch (fr){
//            case "xiaomi" -> 5;
//            case "apple"->6;
//            default -> {
//                int code = fr.hashCode();
//                yield code; // switch语句返回值
//            }
//        };
//        System.out.print(aa);
    }
}

class PracticeSwitch{
    PracticeSwitch(){
        String select1="石头";
        switch (select1){
            case "石头":
                System.out.println("Draw!");
                break;
            case "剪刀":
                System.out.println("Win!");
                break;
            case "布":
                System.out.println("Lose!");
                break;
            default:
                System.out.println("Fuckyou! Say Something!");
                break;
        }
    }
}