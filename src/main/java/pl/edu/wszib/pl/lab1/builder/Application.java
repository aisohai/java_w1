package pl.edu.wszib.pl.lab1.builder;

public class Application {

    private final String firstName;
    private final String lastName;
    private final Gender gender;
    private final Integer age;
    public static class Address{

    };




    public static void main(String[] args) {
        Person.Builder()
                .firstname()
                .lastName()
                .sex()
                .Address()
                .age()


                .build();
    }


}
