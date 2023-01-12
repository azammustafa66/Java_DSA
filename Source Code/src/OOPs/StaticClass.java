package OOPs;

public class StaticClass {
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        StaticClass.Test obj = new Test("aaa");
        Test a = new Test("Azam");
        Test b = new Test("Mohammed");
        System.out.println(obj.name);
        System.out.println(a.name);
        System.out.println(b.name);
    }
}

