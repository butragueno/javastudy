import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
//        int[][] nss = {
//                { 1, 2, 3, 4 },
//                { 5, 6, 7, 8 },
//                { 9, 10, 11, 12 }
//        };
        int[] new_ns={ 1, 2, 3, 4 };
        int[][] nss = new int[3][5];
        nss[1]=new_ns;
        nss[2]=new int[]{1,2,3};
        int[][][] nsss= new int[2][3][5];
        nsss[0]=nss;
        nsss[1]=new int[][]{{200,300},{45,65}};
        System.out.println(Arrays.deepToString(nss));
        System.out.println(Arrays.deepToString(nsss));
//        for (int[] ns:nss){
//            System.out.println(Arrays.toString(ns));
//        }
        practice();
    }
    static void practice(){
        int[][] scores = {
                { 82, 90, 91 },
                { 68, 72, 64 },
                { 95, 91, 89 },
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        // TODO:
        double average = 0;
        int len=0;
        for(int[] score:scores){
            for(int s:score){
                average+=s;
            }
            len+=score.length;
        }
        average/=len;

        System.out.println(average);
        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
