public class Main {

    public static void main(String[] args) {
        Person han = new Person("han", null);
        System.out.println("han.getEmail() = " + han.getEmail().toLowerCase());
    }
}
     class Person{
        private final String name;
        private final String email;

        Person(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }
    }

