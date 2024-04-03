public class ConstructionMethodStudy {
    public static void main(String... args){
        Person4 p4 = new Person4("Xiao Ming", 15);
        Person5 p5 = new Person5("Xiao Ming",65);
        System.out.println(p4.getName());
        System.out.println(p4.getAge());
        System.out.println(p5.getName());
        System.out.println();
        //多构造方法
        PersonMultiConstruct ppp1= new PersonMultiConstruct();
        System.out.println(ppp1.getName());
    }
}

class Person4 {
    private String name;
    private int age;

    public Person4() {
    }
    public Person4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

class Person5 {
    private String name = "Unamed";
    private int age = 10;

    public Person5(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
}

class PersonMultiConstruct{
    private String name;
    private int age;

    public PersonMultiConstruct(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonMultiConstruct(String name) {
        this.name = name;
        this.age = 12;
    }
//    一个构造方法可以调用其他构造方法，这样做的目的是便于代码复用。调用其他构造方法的语法是this(…)
    public PersonMultiConstruct() {
        this("Unnamed");
    }
    public String getName() {
        return this.name;
    }

}