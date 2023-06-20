public class SwitchOperation {
    public static void main(String[] args){
        var s1 = new Switch1();
    }
}

class Switch1{
    Switch1(){
//        switch1_test();
//        switch_string();
        switch_new();
    }

    void switch1_test(){
        int op=1;
        switch (op){
            case 1:
                System.out.println("This is "+op);
                break;
            default:
                System.out.print("Fuck you!\n"+"Say sth!");
                break;
            case 2:
                System.out.print("There is "+op+"");
                break;
        }
    }
    void switch_string(){
        String fr="xiaomi";
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
    void switch_new(){
        String fr="asdad";
        int aa;
        aa=switch (fr){
            case "xiaomi" -> 5;
            case "apple"->6;
            default -> {
                int code = fr.hashCode();
                yield code; // switch语句返回值
            }
        };
        System.out.print(aa);
    }
}