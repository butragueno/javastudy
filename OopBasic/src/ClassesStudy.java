public class ClassesStudy {
    public static void main(String[] args){
        Person1 ming = new Person1();
        ming.name = "Xiao Ming"; // 对字段name赋值
        ming.age = 12; // 对字段age赋值
        System.out.println(ming.name); // 访问字段name
        /**
         * 一个Java源文件可以包含多个类的定义
         * 但只能定义一个public类
         * 且public类名必须与文件名一致
         * 如果要定义多个public类
         * 必须拆到多个Java源文件中
         */
        practice();
    }
    static void practice(){
        /**
         * java中声明为static的方法称为静态方法或类方法。
         * 静态方法可以直接调用静态方法，访问静态变量，
         * 但是不能直接访问实例变量和实例方法。静态方法中不能使用this关键字，
         * 因为静态方法不属于任何一个实例。静态方法不能被子类的静态方法覆盖。
         */
        City bj = new City();
        bj.name = "Beijing";
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        System.out.println(bj.name);
        System.out.println("location: " + bj.latitude + ", " + bj.longitude);
    }
}
class Person1{
    String name;
    public int age;
}

class Book1 {
    public String name;
    public String author;
    public String isbn;
    public double price;
}

class City{
    public String name;
    public double latitude;
    public double longitude;

}