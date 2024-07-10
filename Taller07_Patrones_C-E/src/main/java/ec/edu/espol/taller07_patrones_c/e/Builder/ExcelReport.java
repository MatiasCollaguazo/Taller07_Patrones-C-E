package ec.edu.espol.taller07_patrones_c.e.Builder;
// Implementación concreta de Report para un informe en formato Excel
// Implementación concreta de Report para un informe en formato Excel
public class ExcelReport implements Report {
    private String excelData;

    public ExcelReport(String excelData) {
        this.excelData = excelData;
    }

    @Override
    public void buildHeader() {
        // Construcción del encabezado del informe Excel
        excelData = "Encabezado del informe Excel";
    }

    @Override
    public void buildBody() {
        // Construcción del cuerpo del informe Excel
        excelData += "\nCuerpo del informe Excel";
    }

    @Override
    public void buildFooter() {
        // Construcción del pie del informe Excel
        excelData += "\nPie del informe Excel";
    }

    @Override
    public Report getResult() {
        return this;
    }

    public void setExcelData(String excelData) {
        this.excelData = excelData;
    }

    public String getExcelData() {
        return excelData;
    }

    public void render() {
        // Lógica para renderizar un informe en Excel
        //System.out.println("Renderizando informe Excel...");
    }
}
