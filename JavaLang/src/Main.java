public class Main extends Object {
    public static void main(String[] args) {
        Student Max = new Student("Max", 24);
        System.out.println(Max);

        PrimarySchoolStudent Ja = new PrimarySchoolStudent("Jimmy", 16, "Wong");
        System.out.println(Ja);

    }
}
class Student{
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return name + " is " + age;
    }
}

class PrimarySchoolStudent extends Student {
    private String ParentName;
    PrimarySchoolStudent(String name, int age, String ParentName) {
        super(name, age);
        this.ParentName = ParentName;
    }
    public String toString() {
        return ParentName + "'s kid " + super.toString();
    }
}