package pl.edu.wszib.pl.lab1.builder.autobuilder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Address {
    abstract String city();

    abstract String street();

    abstract String number();

    abstract String postalCode();

    public static Builder builder() {
        AutoValue.Builder builder = new AutoValue.Builder();
        return builder;
    }

    @AutoValue.Builder
    public abstract static class Builder {

        abstract Builder city(String city);

        abstract Builder street(String street);

        abstract Builder number(String number);

        abstract Builder postalCode(String postalCode);

        abstract Address build();
    }
}