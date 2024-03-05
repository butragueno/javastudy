import java.util.Arrays;
public class Methods {
    public static void main(String[] args){
        Person ming = new Person();
        ming.test();
//        var g1 = new Group();
        Group p1=new Group();
        p1.test();
    }
}

class Person{
    private String name;
    private int age;
    private int birth;

    public void test(){
        String bob = "Bob";
        System.out.println(bob);
        setName(bob); // 设置name
        System.out.println(getName());
        bob = "Alice";
        System.out.println(bob);

        System.out.println(getName());
    }


    public void setBirth(int birth) {
        this.birth = birth;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return calcAge(2019); // 调用private方法
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
    // private方法:
    private int calcAge(int currentYear) {
        return currentYear - this.birth;
    }

}

class Group{
    private String[] names;
//    public Group(){
////        setNames("Xiao Ming", "Xiao Hong", "Xiao Jun");
////        setNames("Xiao Ming", "Xiao Hong"); // 传入2个String
////        setNames("Xiao Ming"); // 传入1个String
//        setNames(); // 传入1个String
////        setNames();
//    }
    public void setName(String[] names){
    //        String[] new_name=name;
        this.names=names;
    }
    public String getName(){
        return this.names[0]+" "+this.names[1];
    }

    public void test(){
        String[] fullname = new String[] { "Homer", "Simpson" };
        System.out.println(fullname);

        setName(fullname);
        System.out.println(getName());
        fullname[0] = "Bart";
        System.out.println(fullname);

        System.out.println(getName());
    }
}
