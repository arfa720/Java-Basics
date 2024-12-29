// 07_ClassesAndObjects.java
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25); // Create an object
        person.greet(); // Call the method
    }
}
