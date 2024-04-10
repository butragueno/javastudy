import java.util.Arrays;

public class PolyMorphismStudy {
    public static void main(String[] args){
//        testPersonRun();
//        testStudentOverride();

//        StudentOverride ming = new StudentOverride();
//        runTwice(ming);

//        testPolymorphic();
        practice();
    }
    static void testPersonRun(){
        PersonRun ming = new PersonRun();
        ming.setName("Xiao Ming"); // 设置name
        ming.setAge(12); // 设置age
        System.out.println(""+ming.getName()+": "+ming.getAge()+" years old");
        ming.run();
    }
    static void testStudentOverride(){
        /**
         *         一个实际类型为Student，引用类型为Person的变量，调用其run()方法，调用的是Person还是Student的run()方法？
         *         运行一下上面的代码就可以知道，实际上调用的方法是Student的run()方法。因此可得出结论：
         *         Java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型。
         */
        PersonOverride ming = new PersonOverride();
        StudentOverride ming1 = new StudentOverride();
        ming.setName("Xiao Ming"); // 设置name
        ming1.setName("Xiao Ming"); // 设置name
        ming.setAge(12); // 设置age
        System.out.println(""+ming.getName()+": "+ming.getAge()+" years old");
        ming.run();
        System.out.println(ming.hello());
        System.out.println(ming.equals(ming1));
    }
    static void runTwice(PersonRun p) {
        p.run();
        p.run();
    }
    static double totalTax(Income... incomes) {
        double total = 0;
        System.out.println(Arrays.toString(incomes));
        for (Income income: incomes) {
            total = total + income.getTax();
        }
        return total;
    }
    static void testPolymorphic(){
        /**
         *         观察totalTax()方法：利用多态，totalTax()方法只需要和Income打交道，
         *         它完全不需要知道Salary和StateCouncilSpecialAllowance的存在，
         *         就可以正确计算出总的税。如果我们要新增一种稿费收入，只需要从Income派生，
         *         然后正确覆写getTax()方法就可以。把新的类型传入totalTax()，不需要修改任何代码。
         */
        Income[] incomes = new Income[] {
                new Income(3000),
                new Salary(7500),
                new StateCouncilSpecialAllowance(15000)
        };
//        Income incomes=new Income(3000);
        System.out.println(totalTax(incomes));
    }
    static void overrideObjectMethod(){
        /**
         * 因为所有的class最终都继承自Object，而Object定义了几个重要的方法：
         *     toString()：把instance输出为String；
         *     equals()：判断两个instance是否逻辑相等；
         *     hashCode()：计算一个instance的哈希值。
         */

    }
    static void practice(){
        Income[] incomes = new Income[] {
                new Income(3000),
                new Remuneration(7500),
        };
//        Income incomes=new Income(3000);
        System.out.println(totalTax(incomes));

    }
}

class PersonRun extends Person2 {
    public void run() {
        System.out.println("Person.run");
    }
}
class StudentOverride extends PersonOverride {
    //但是@Override不是必需的。
    @Override
    public void run() {
        System.out.println("Student.run");
    }
    @Override
    public String hello() {
        // 调用父类的hello()方法:
        return super.hello() + "!";
    }
}
class Income {
    protected double income;
    public Income(double income) {
        this.income = income;
    }
    public double getTax() {
        return income * 0.1; // 税率10%
    }
}
class Salary extends Income {
    public Salary(double income) {
        super(income);
    }
    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}
class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }
    @Override
    public double getTax() {
        return 0;
    }
}
class Remuneration extends Income{
    public Remuneration(double income){
        super(income);
    }
    @Override
    public double getTax(){
        return 0.05*income;
    }
}
class PersonOverride extends PersonRun{
    // 显示更有意义的字符串:
    @Override
    public String toString() {
        return "Person:name=" + name;
    }

    // 比较是否相等:
    @Override
    public boolean equals(Object o) {
        // 当且仅当o为Person类型:
        if (o instanceof PersonOverride) {
            PersonOverride p = (PersonOverride) o;
            // 并且name字段相同时，返回true:
            return this.name.equals(p.name);
        }
        return false;
    }

    // 计算hash:
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
    public String hello() {
        return "Hello, " + name;
    }
}