public class ResourceResolver {
    String basePackage;

    public ResourceResolver(String basePackage) {
        this.basePackage = basePackage;
    }

}
//class run{
//    public run(){
//        ResourceResolver rr = new ResourceResolver("org.example");
//        List<String> classList = rr.scan(res -> {
//            String name = res.name(); // 资源名称"org/example/Hello.class"
//            if (name.endsWith(".class")) { // 如果以.class结尾
//                // 把"org/example/Hello.class"变为"org.example.Hello":
//                return name.substring(0, name.length() - 6).replace("/", ".").replace("\\", ".");
//            }
//            // 否则返回null表示不是有效的Class Name:
//            return null;
//        });
//    }
//}