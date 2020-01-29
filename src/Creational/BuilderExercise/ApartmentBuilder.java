package Creational.BuilderExercise;

public class ApartmentBuilder {
    private String category = "Default Category";
    private int builtArea = 600;
    private String flooring = "Default Flooring";
    private String interiors = "Default Interiors";

    public ApartmentBuilder addCategory(String category) {
        //validate
        this.setCategory(category);
        return this;
    }

    public ApartmentBuilder addBuiltArea(int builtArea) {
        //validate
        this.setBuiltArea(builtArea);
        return this;
    }

    public ApartmentBuilder addFlooring(String flooring) {
        //validate
        this.setFlooring(flooring);
        return this;
    }

    public ApartmentBuilder addInteriors(String interiors) {
        //validate
        this.setInteriors(interiors);
        return this;
    }

    public Apartment build() {
        return new Apartment(this.category, this.builtArea, this.flooring, this.interiors);
    }


    private void setCategory(String category) {
        this.category = category;
    }

    private void setBuiltArea(int builtArea) {
        this.builtArea = builtArea;
    }

    private void setFlooring(String flooring) {
        this.flooring = flooring;
    }

    private void setInteriors(String interiors) {
        this.interiors = interiors;
    }
}
