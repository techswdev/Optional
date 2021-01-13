import java.util.Optional;

public class Main {

    public static void main(String[] args) {
     Optional<String> opt1 = Optional.ofNullable("nullable");

     if(opt1.isPresent()){
         System.out.println("opt1.get() :"+opt1.get());
     }else{
         System.out.println("opt1.get() : null");
     }

        Optional<String> opt2 = Optional.ofNullable(null);

        if(opt2.isPresent()){
            System.out.println("opt2.get() :"+opt2.get());
        }else {
            System.out.println("opt2.get() : null");
        }
    }
}

