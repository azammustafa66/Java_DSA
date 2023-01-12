package OOPs;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; /*The things which are not related to object but to class in whole are
                            declared as static*/
    // Static simply means not specific to particular object but whole class

    static void message() {
        System.out.println("Hello");
        // System.out.println(this.age);  this keyword cannot be used in static functions
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;             //this keyword only used for assigning properties of a class by default instead of
        this.name = name;           //initialising each object by .
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
