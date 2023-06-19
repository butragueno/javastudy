public class ArrayType {
    public static void main(String[] args){
//        var a = new Array1();
        var sa1 = new StringArray1();
    }
}

class Array1{
    Array1(){
        int[] ns={68, 79, 91, 85, 62};
        ns[0]=33;
//        System.out.println(ns[0]);
//        System.out.println(ns[4]);
        for(int i=0;i<5;i++){
            System.out.println(ns[i]);
        }

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
