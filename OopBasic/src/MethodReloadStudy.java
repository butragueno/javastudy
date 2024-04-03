public class MethodReloadStudy {
    /**
     * 在一个类中，我们可以定义多个方法。
     * 如果有一系列方法，它们的功能都是类似的，
     * 只有参数有所不同，那么，可以把这一组方法名做成同名方法。
     */
    public static void main(String... args){
        Hello1 h1 = new Hello1();
        h1.hello();
        h1.hello("xiaoming");
        h1.hello("xiaoming",6);
        //功能类似的方法使用同一名字，更容易记住，因此，调用起来更简单
        testIndexOf();
    }
    static void testIndexOf(){
        String s = "Test string";
        int n1 = s.indexOf('t');
        int n2 = s.indexOf("st");
        int n3 = s.indexOf("st", 4);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}

class Hello1 {
    public void hello() {
        System.out.println("Hello, world!");
    }

    public void hello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void hello(String name, int age) {
        if (age < 18) {
            System.out.println("Hi, " + name + "!");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
}
