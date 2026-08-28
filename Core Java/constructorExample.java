public class constructorExample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Carl", 19);
        s1.display();
    }
}

class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
