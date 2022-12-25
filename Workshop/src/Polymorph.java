public class Polymorph {
    class Vehicle {
        protected String brand = "Ford";

        public void honk() {
            System.out.println("Honk");
        }
    }

        class Car extends Vehicle {
            private String model = "Mustang";

            public static void main(String[] args) {
                Car myCar = new Car();
            }
        }
    }
