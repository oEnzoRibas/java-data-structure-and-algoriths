package Course.Classes.OOP;

public class Animal {
    protected String name;
    int age;
    private int id;

    protected void printName(){
        System.out.println(this.name);
    }

    void printAge(){
        System.out.println(this.age);
    }

    private void printId() {
        System.out.println(this.id);
    }
}
