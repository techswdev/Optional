import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Person han = new Person("han", "han@naver.com");

        if(han.getEmail().isPresent()){
            String email = han.getEmail().get();
            System.out.println(email.toLowerCase());
        } else{
            System.out.println("email is not provided");
        }
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

        public Optional<String> getEmail() {
            return Optional.ofNullable(email);
        }
    }

