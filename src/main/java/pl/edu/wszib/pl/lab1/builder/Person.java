package pl.edu.wszib.pl.lab1.builder;

public class Person {


    private Person() {

    }

    public static class Builder {

        public Person build() {
            return new Person();
        }
    }
}
