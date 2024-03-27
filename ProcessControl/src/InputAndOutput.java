import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args){
        Output1 o1= new Output1();
//        Input1 i1= new Input1();
//        practice p1= new practice();
    }
}

class Output1{
    Output1(){
        f1();
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
        double d1 = 12900000;
        System.out.println(d1); // 1.29E7
        //如果要把数据显示成我们期望的格式，就需要使用格式化输出的功能
        d1 = 3.1415926;
        System.out.printf("%.2f\n",d1);
        System.out.printf("%f\n",d1);
        System.out.printf("%08f\n",d1);

        int i1 = 12345;
        float f1 = 3.1415f;
        String s1=""+"Fuck you all the day";
        System.out.printf("n=%08d, hex=%x", i1, i1); // 注意，两个%占位符必须传入两个数
        System.out.println();
        System.out.printf(s1+" and night\ndouble: %f\n",f1);
        System.out.printf("格式化输出科学计数法表示的浮点数: %e\n",d1);

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