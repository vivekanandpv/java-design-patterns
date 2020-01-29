package Creational.BuilderExercise;

public class Apartment {
    private String category;
    private int builtArea;
    private String flooring;
    private String interiors;

    public Apartment(String category, int builtArea, String flooring, String interiors) {
        this.category = category;
        this.builtArea = builtArea;
        this.flooring = flooring;
        this.interiors = interiors;
    }

    public String getCategory() {
        return category;
    }

    public int getBuiltArea() {
        return builtArea;
    }

    public String getFlooring() {
        return flooring;
    }

    public String getInteriors() {
        return interiors;
    }
}
