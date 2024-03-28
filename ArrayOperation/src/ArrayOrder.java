import java.util.Arrays;

public class ArrayOrder {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        System.out.println(Arrays.toString(ns));
        int[] nns =bubble_sort(ns);
        System.out.println(Arrays.toString(nns));
        System.out.println(Arrays.toString(ns));
        int[] as=new int[ns.length];
        System.arraycopy(ns,0,as,0,ns.length);
        Arrays.sort(as);
        System.out.println(Arrays.toString(as));
        System.out.println(Arrays.toString(ns));
        practice(ns);
//        for (int n:ns){
//            System.out.println(n);
//        }
    }
    static int[] bubble_sort(int[] as){
//        int[] ns = {5,8,96,3,4,7,63,4,9 };
        int[] ns=new int[as.length];
        System.arraycopy(as,0,ns,0,as.length);
        for (int j=0;j<ns.length-1;j++){
            for (int i=0;i<ns.length-1-j;i++){

                if(ns[i]>ns[i+1]){
                    int temp=ns[i];
                    ns[i]=ns[i+1];
                    ns[i+1]=temp;
                }
            }
        }
        return ns;
//        System.out.println(Arrays.toString(ns));
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
