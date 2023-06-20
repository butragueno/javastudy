import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        to_string();
        practice1();
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
