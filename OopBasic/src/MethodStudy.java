import java.util.Arrays;

public class MethodStudy {
    public static void main(String[] args){
        Person2 ming = new Person2();
        ming.setName("Xiao Ming"); // 设置name
        ming.setAge(12); // 设置age
        System.out.println(ming.getName() + ", " + ming.getAge());
//        private方法
        Person3 ming1 = new Person3();
        ming1.setBirth(2008);
        System.out.println(ming1.getAge());

        //可变参数
        Group1 group1 = new Group1();
        group1.setNames("Xiao Ming", "Xiao Hong", "Xiao Jun"); // 传入3个String
        group1.setNames(new String[]{"Xiao Ming", "Xiao Hong"});
        group1.setNames(null);
        String[] names1 = group1.getName();
        System.out.println(Arrays.toString(names1));

        //参数绑定
        Group1 g2 = new Group1();
        String[] fullname = new String[] { "Homer", "Simpson" };
        g2.setNames(fullname); // 传入fullname数组
        System.out.println(Arrays.toString(g2.getName()));
        fullname[0] = "Bart"; // fullname数组的第一个元素修改为"Bart"
        System.out.println(Arrays.toString(g2.getName()));
        /**
         * 引用类型参数的传递，调用方的变量，和接收方的参数变量，
         * 指向的是同一个对象。双方任意一方对这个对象的修改，
         * 都会影响对方（因为指向同一个对象嘛）
         */
        Person2 p = new Person2();
        String bob = "Bob";
        p.setName(bob); // 传入bob变量
        System.out.println(p.getName()); // "Bob"
        bob = "Alice"; // bob改名为Alice
        System.out.println(p.getName()); // "Bob"还是"Alice"?
        /**
         * 数组和字符串是不一样的，
         * 字符串变量指向的是特定字符串的地址，传入的也是特定字符串的地址，特定字符串不可变
         * 数组变量向的是特定数组的地址，传入的也是特定数组的地址，特定数组存储的内容可变
         */
    }
}

class Person2 {
    protected String name;
    protected int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
}

class Person3{
    private String name;
    private int birth;

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getAge() {
        return calcAge(2019); // 调用private方法
    }

    // private方法:
    private int calcAge(int currentYear) {
        return currentYear - this.birth;
    }
}

class Group1 {
    private String[] names;

    public void setNames(String... names) {
//    public void setNames(String[] names) {
        this.names = names;
    }
    public String[] getName() {
        return this.names;
    }

}