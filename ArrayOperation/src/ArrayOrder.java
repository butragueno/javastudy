import java.util.Arrays;

public class ArrayOrder {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        bubble_sort(ns);
        practice(ns);
//        Arrays.sort(ns);
//        for (int n:ns){
//            System.out.println(n);
//        }
    }
    static void bubble_sort(int[] ns){
//        int[] ns = {5,8,96,3,4,7,63,4,9 };
        for (int j=0;j<ns.length-1;j++){
            for (int i=0;i<ns.length-1-j;i++){

                if(ns[i]>ns[i+1]){
                    int temp=ns[i];
                    ns[i]=ns[i+1];
                    ns[i+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ns));
//        for (int n:ns){
//            System.out.println(n);
//        }
    }
    static void practice(int[] ns){
        for (int j=0;j<ns.length-1;j++){
            for (int i=0;i<ns.length-1-j;i++){

                if(ns[i]<ns[i+1]){
                    int temp=ns[i];
                    ns[i]=ns[i+1];
                    ns[i+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ns));

    }
}
