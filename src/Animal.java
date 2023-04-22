public class Animal {
    String name;
    void setName() {
        System.out.println("Elephant!");
    }
}
class Fish extends Animal {
    String colour;

    @Override
    void setName() {
        System.out.println("Blue Fish!");
    }
}
class Run {
    public static void main(String[] args) {
        Animal a = new Fish();
        a.name = "Dolfin";
        Fish f = new Fish();
        f.name = "Shark";
        f.colour = "Dark";
        System.out.println("Name :- " + a.name);
        a.setName();
        System.out.println("Name :- " + f.name);
        System.out.println("Colour :- " + f.colour);
    }
}
