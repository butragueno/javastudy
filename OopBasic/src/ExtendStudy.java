public class ExtendStudy {
    public static void main(String... args){
        Student2 s2 = new Student2("Xiao Ming", 12, 89);
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
