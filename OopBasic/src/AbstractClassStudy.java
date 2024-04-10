import java.util.Arrays;

public class AbstractClassStudy {
    public static void main(String[] args){
        abstractMethod();
        /**
         * 面向抽象编程的本质就是：
         *     上层代码只定义规范（例如：abstract class Person）；
         *     不需要子类就可以实现业务逻辑（正常编译）；
         *     具体的业务逻辑由不同的子类实现，调用者并不关心。
         */
        practice();
    }
    static void abstractMethod(){
        AbstractPerson p1 = new AbstractStudent();
        p1.run();
    }
    static double totalTax(AbsIncome... incomes) {
        double total = 0;
        for (AbsIncome income: incomes) {
            total = total + income.getTax();
        }
        return total;
    }
    static void practice(){
        AbsIncome[] incomes = new AbsIncome[] {
                new AbsSalary(3000),
                new AbsRemuneration(7500),
        };
//        Income incomes=new Income(3000);
        System.out.println(totalTax(incomes));
    }
}

abstract class AbstractPerson{
//        如果父类的方法本身不需要实现任何功能，仅仅是为了定义方法签名，目的是让子类去覆写它，那么，可以把父类的方法声明为抽象方法
//        必须把Person类本身也声明为abstract，才能正确编译它：
    public abstract void run();
}
class AbstractStudent extends AbstractPerson {
    @Override
    public void run() {
        System.out.println("Student.run");
    }
}

abstract class AbsIncome {
    protected double income;
    public AbsIncome(double income) {
        this.income = income;
    }
    public abstract double getTax();
}
class AbsSalary extends AbsIncome {
    public AbsSalary(double income) {
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
class AbsRemuneration extends AbsIncome{
    public AbsRemuneration(double income){
        super(income);
    }
    @Override
    public double getTax(){
        return 0.05*income;
    }
}