class Student{
    String name;
    int score;

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name+name;
    }

    public void setScore(String name,int score) {
        this.name=name;
        this.score = score;
    }
}
public class Main {
    public static void main(String[] args) {
        Student a=new Student();
        a.setScore("wxw",99);
        Student b=new Student("wx",100);

    }
}
