/**
 * Java程序基本结构
 * 学习示例文件
 *
 * 特殊的多行注释
 * 可以用来自动创建文档的注释
 *
 * @auther XieRuifeng
 * @date 20240325
 */
/*
这是注释
blablabla...
这也是注释
*/
public class Hello {
//    class是关键字，这里定义的class名字就是Hello
//    类名必须以英文字母开头，后接字母，数字和下划线的组合
//    习惯以大写字母开头

// 每个文件有一个主类，名字与文件名一致 带有public修饰符
// 不写public，也能正确编译，但是这个类将无法从命令行执行。
    public static void main(String[] args) {
//        public除了可以修饰class外，也可以修饰方法
//        关键字static是另一个修饰符，它表示静态方法
//        Java入口程序规定的方法必须是静态方法，方法名必须为main，括号内的参数必须是String数组
//        方法名也有命名规则，命名和class一样，但是首字母小写
        System.out.println("Hello this fucking world!");
//        在方法内部，语句才是真正的执行代码。Java的每一行语句必须以分号结束
        RefTest1 test1= new RefTest1();
    }

}

class RefTest1{
    RefTest1(){
        IntergerType i1 = new IntergerType();
        System.out.println("As a result, the class without modifier public ");
        System.out.println("in same Module can be called.");
        FloatType data2 = new FloatType();

    }
}
