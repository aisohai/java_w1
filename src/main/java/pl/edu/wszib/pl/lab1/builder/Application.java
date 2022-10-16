package pl.edu.wszib.pl.lab1.builder;

public class Application {

    public static void main(String[] args) {
        Person.Builder personBuilder = Person.builder()
                .firstName("Alo")
                .lastName("Dwalo")
                .age(27)
                .gender(Gender.MALE);
        Address address = personBuilder.addressBuilder()
                .city("Krakow")
                .number("44")
                .postalCode("44-666")
                .build();
        personBuilder.address(address);
    }
}
