package Creational.BuilderExercise;

public class BuilderDemo {
    public static void main(String[] args) {
        Apartment directApartment = new Apartment("CAT", 1000, "FLOOR", "INTERIORS");

        ApartmentBuilder builder = new ApartmentBuilder();

        Apartment fromBuilder = builder
                                    .addBuiltArea(1200)
                                    .addCategory("Luxury")
                                    .addInteriors("Plush Interiors")
                                    .build();

        System.out.println(directApartment.getFlooring());
        System.out.println(fromBuilder.getFlooring());
    }
}
