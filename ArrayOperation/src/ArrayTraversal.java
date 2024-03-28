import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        String[] ss = new String[10];
        ss[0]="a";
        ss[1]="c";
        System.out.println(Arrays.toString(ss));
        for (int i = 0;i<ss.length;i++){
            if (null==ss[i]){
                ss[i]="b";
                break;
            }
        }
        System.out.println(Arrays.toString(ss));
//        to_string();
//        practice1();
    }
    static void to_string(){

        int[] ns = { 1, 1, 2, 3, 5, 8 };
        System.out.println(Arrays.toString(ns));
    }
    static void practice1(){
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i=ns.length-1;i>=0;i--){
            System.out.println(ns[i]);
        }
    }
}
