package pl.edu.wszib.lab1.builder;

public class Application {


    public static void main(String[] args) {
        Person.Builder personBuilder = Person.builder()
                .firstName("Aleksander")
                .lastName("Pawlik")
                .age(28)
                .gender(Gender.MALE);
        Address address = personBuilder.addressBuilder()
                .city("Krakow")
                .number("4")
                .postalCode("44-444")
                .build();
        personBuilder.addressBuilder();
                
    }
}
