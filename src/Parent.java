public class Parent {
    String name;
    void display() {
        System.out.println("Super Class Is Running!");
    }
}
class Child extends Parent {
    int age;

    @Override
    void display() {
        System.out.println("Sub Class Is Running!");
    }
}
class Downcasting {
    public static void main(String[] args) {
        Parent p = new Child();  //Upcasting object
        p.name = "Nalaka";
        Child c = (Child) p;   //Downcasting object
        c.age = 26;
        System.out.println(c.name);
        System.out.println(c.age);
        c.display();
    }
}
