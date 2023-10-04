public class Student {
    private String name;
    private int age;
    private char grade;

    Student() {
        name = "Joe";
        age = 23;
        grade = 'A';
    }

    Student(String n, int a, char g) {
        name = n;
        age = a;
        grade = g;
    }

    Student(String n, int a) {
        name = n;
        age = a;
        grade = 'N';
    }

    void displayInfo() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Grade:" + grade);
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.displayInfo();
        System.out.println();

        Student st2 = new Student("Joe",23,'A');
        st2.displayInfo();
        System.out.println();

        Student st3 = new Student("Jane",4);
        st3.displayInfo();
        System.out.println();
    }
}
