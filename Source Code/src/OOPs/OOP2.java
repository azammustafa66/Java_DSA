package OOPs;

public class OOP2 {
    static Integer a = 10;
    /*Static member can only access static because we know objects are non-static*/
    public static void main(String[] args) {
        Human Azam = new Human(20, "Azam Mustufa", 326578, false);
        Human Muz = new Human(19, "Muzammil", 250000, false);
        Human Bellary = new Human(19, "Abhishek", 0, true);
        System.out.println(Human.population);
        System.out.println(a);
    }

    //static does not depend on objects
    static void fun() {
        System.out.println("Fun");
        OOP2 obj = new OOP2();
        obj.greet();
    }

    //Depends on objects
    public void greet() {
        System.out.println("Hello!!");
        fun();
    }
}
