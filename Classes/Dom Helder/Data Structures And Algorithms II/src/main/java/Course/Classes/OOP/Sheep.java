package Course.Classes.OOP;

public class Sheep extends Animal{
    void print(){
        super.name = "Calanguinha";
        super.age = 10; // this.age or just age = 10 would work

        super.printName();
        super.printAge();

        age = 20;
        this.name = "Ovelhinha";

    }

    public static void main(String[] args) {

        Sheep s = new Sheep();

        System.out.println("Before setting attributes with super");
        System.out.println("PrintAge from Animal class:");
        s.printAge();

        System.out.println("PrintName from Animal class:");
        s.printName();

        System.out.println("Print from Sheep class:");
        s.print();

        System.out.println("After setting attributes with super");
        System.out.println("PrintAge from Animal class:");
        s.printAge();

        System.out.println("PrintName from Animal class:");
        s.printName();
    }
}

