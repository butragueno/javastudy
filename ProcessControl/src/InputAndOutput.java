public class InputAndOutput {
    public static void main(String[] args){
        var o1= new Output1();
    }
}

class Output1{
    Output1(){
        System.out.print("A,");
        System.out.print("B,");
        System.out.print("C.");
        System.out.println();
        System.out.println("END");
        double d = 12900000;
        System.out.println(d); // 1.29E7
    }
}