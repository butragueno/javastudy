public class ArrayType {
    public static void main(String[] args){
        Array1 a = new Array1();
        StringArray1 sa1 = new StringArray1();
    }
}

class Array1{
    Array1(){
        int[] ns={68, 79, 91, 85, 62};
        ns[0]=33;
//        System.out.println(ns[4]);
        for(int i=0;i<5;i++){
            System.out.println(ns[i]);
        }
        int[] ns0= new int[5];
        ns0[0] = 68;
        ns0[1] = 79;
        ns0[2] = 91;
        ns0[3] = 85;
        ns0[4] = 62;
        System.out.println();
        System.out.println(ns0.length);

    }
}

class StringArray1{
    StringArray1(){
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?
    }
}
