import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args){
//        var o1= new Output1();
//        var i1= new Input1();
        var p1= new practice();
    }
}

class Output1{
    Output1(){
//        f1();
        f2();

    }
    void f1(){
        System.out.print("A,");
        System.out.print("B,");
        System.out.print("C.");
        System.out.println();
        System.out.println("END");
    }
    void f2(){
        double d = 12900000;
        System.out.println(d); // 1.29E7
        d = 3.1415926;
        System.out.printf("%.2f\n",d);
        System.out.printf("%f\n",d);
        System.out.printf("%08f\n",d);

        int n = 12345000;
        System.out.printf("n=%d, hex=%08x", n, n); // 注意，两个%占位符必须传入两个数
    }
}

class Input1{
    Input1(){
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
    }
}
class practice{
    practice(){
//        int a = 20;
//        float b = a;
//        System.out.print(b);
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Grade Last Exam:");
        float grade1 = scanner.nextInt();
        System.out.print("Grade This Exam:");
        float grade2 = scanner.nextInt();
        System.out.printf("Improvement: %.2f%%",(grade2-grade1)/grade1*100);
    }
}