public class demo {
    static class HelloA {
        public HelloA() {

            System.out.println("HelloA");
        }

        {
            System.out.println("I'm A class");
        }

        static {
            System.out.println("static A");
        }
    }

    public static class HelloB extends HelloA {

        static {
            System.out.println("static B");
        }


        {
            System.out.println("I'B class");
        }

        public HelloB() {
            System.out.println("HelloB");
        }

        public static void main(String[] args) {
            new HelloB();
        }
    }
}

