public class ExtendStudy {
    public static void main(String... args){

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
//    注意：子类自动获得了父类的所有字段，严禁定义与父类重名的字段！
}