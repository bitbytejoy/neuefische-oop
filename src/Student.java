public class Student {
    String name;
    int age;

    public Student() {
        this.age = 18;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print () {
        System.out.println(this.name + " " + this.age);
    }
}
