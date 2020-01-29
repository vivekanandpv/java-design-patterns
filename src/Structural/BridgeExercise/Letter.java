package Structural.BridgeExercise;

public class Letter extends Document {
    private PdfWriter pdfWriter;

    public Letter(PdfWriter pdfWriter) {
        this.pdfWriter = pdfWriter;
    }

    public void createPdf() {
        this.pdfWriter.create(this);
    }
}
