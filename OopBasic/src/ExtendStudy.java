public class ExtendStudy {
    public static void main(String... args){
        Student2 s2 = new Student2("Xiao Ming", 12, 89);

        //阻止继承
//        正常情况下，只要某个class没有final修饰符，那么任何类都可以从该class继承。
//        从Java 15开始，允许使用sealed修饰class，并通过permits明确写出能够从该class继承的子类名称。

        //向上转型
        //这种把一个子类类型安全地变为父类类型的赋值，被称为向上转型（upcasting）
        Person5 p = new Student2("Xiao Ming", 12, 89);

        Person2 p1 = new Student(); // upcasting, ok
        Person2 p2 = new Person2();
        Student s1 = (Student) p1; // ok
//        Student s2 = (Student) p2; // runtime error! ClassCastException!
        //向下转型很可能会失败。失败的时候，Java虚拟机会报ClassCastException
        //为了避免向下转型出错，Java提供了instanceof操作符，可以先判断一个实例究竟是不是某种类型：
        Person2 p3 = new Person2();
        System.out.println(p3 instanceof Person2); // true
        System.out.println(p3 instanceof Student); // false

        Student s = new Student();
        System.out.println(s instanceof Person2); // true
        System.out.println(s instanceof Student); // true

        Student n = null;
        System.out.println(n instanceof Student); // false
        System.out.println(null == n);
        practice();
    }
    static void practice(){
        Person6 p = new Person6("小明", 12);
        Student3 s = new Student3("小红", 20, 99);
        Student3 ps = new PrimaryStudent("小军", 9, 100, 5);
        System.out.println(ps.getScore());
    }
}

class Student extends Person2{
    private int score;
    public int getScore() {return this.score;}
    public void setScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("invalid score value");
        }
        this.score = score;
    }
    public String hello() {
        return "Hello, " + super.name; // OK!
    }
//    注意：子类自动获得了父类的所有字段，严禁定义与父类重名的字段！
//    为了让子类可以访问父类的字段，我们需要把private改为protected。用protected修饰的字段可以被子类访问
}
class Student2 extends Person5 {
    protected int score;

    public Student2(String name, int age, int score) {
        super(name,age);
        this.score = score;
    }
//    如果父类没有默认的构造方法，子类就必须显式调用super()并给出参数以便让编译器定位到父类的一个合适的构造方法
//    即子类不会继承任何父类的构造方法。子类默认的构造方法是编译器自动生成的，不是继承的
}


class Person6 {
    protected String name;
    protected int age;

    public Person6(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

class Student3 extends Person6 {
    protected int score;

    public Student3(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() { return score; }
}

class PrimaryStudent extends Student3 {
    protected int grade;
    PrimaryStudent(String name, int age, int score,int grade){
        super(name,age,score);
        this.grade=grade;
    }

}