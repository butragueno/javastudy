public class InterfaceStudy {
    /**
     如果一个抽象类没有字段，所有方法全部都是抽象方法
     就可以把该抽象类改写为接口：interface。
     */
    public static void main(String... args){

    }
}
interface InterfacePerson {
    void run();
    String getName();
}
class StudentImplements implements InterfacePerson {
    private String name;

    public StudentImplements(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " run");
    }

    @Override
    public String getName() {
        return this.name;
    }
}