package OOPs;

public class StaticExample {
        static int a = 4;
        static int b = 16;
    // will only run once when the obj is loaded for the first time
        static  {
            System.out.println("I'm in static block");
        }

    public static void main(String[] args) {
        StaticExample obj = new StaticExample();
        System.out.println(StaticExample.a * StaticExample.b);
        StaticExample.b += 5;
        System.out.println(b);

        StaticExample obj1 = new StaticExample();
        System.out.println(StaticExample.b);
    }
}
