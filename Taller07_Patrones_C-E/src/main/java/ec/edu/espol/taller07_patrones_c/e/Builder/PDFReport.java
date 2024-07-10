package ec.edu.espol.taller07_patrones_c.e.Builder;

// Implementación concreta de Report para un informe en formato PDF
public class PDFReport implements Report {
    private String pdfContent;

    public PDFReport(String pdfContent) {
        this.pdfContent = pdfContent;
    }

    @Override
    public void buildHeader() {
        // Construcción del encabezado del informe PDF
    }

    @Override
    public void buildBody() {
        // Construcción del cuerpo del informe PDF
    }

    @Override
    public void buildFooter() {
        // Construcción del pie del informe PDF
    }

    @Override
    public Report getResult() {
        return this;
    }

    public void setPdfContent(String pdfContent) {
        this.pdfContent = pdfContent;
    }

    public String getPdfContent() {
        return pdfContent;
    }
}
