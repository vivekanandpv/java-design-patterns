package Structural.BridgeExercise;

public class BridgeDemo {
    public static void main(String[] args) {
        PdfWriter writer = new PdfWriter();

        Letter letter = new Letter(writer);
        letter.createPdf();
    }
}
