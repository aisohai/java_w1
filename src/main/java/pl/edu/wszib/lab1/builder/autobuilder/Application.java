package pl.edu.wszib.lab1.builder.autobuilder;

public class Application {

    public static void main(String[] args) {
        Address address = Address.builder()
                .street("Duza")
                .city("Krakow")
                .number("4")
                .postalCode("44-444")
                .build();
        Person person = Person.builder()
                .firstName("Aleksander")
                .lastName("Pawlik")
                .age(28)
                .gender(Gender.MALE)
                .address(address)
                .build();
//        Person.create()
//        Person.male()
//        Person.female()
        System.out.println(person);
    }
}
