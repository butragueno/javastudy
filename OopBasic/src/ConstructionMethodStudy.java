public class ConstructionMethodStudy {
    public static void main(String... args){
        Person4 p4 = new Person4("Xiao Ming", 15);
        System.out.println(p4.getName());
        System.out.println(p4.getAge());
    }
}

class Person4 {
    private String name;
    private int age;

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
