package ec.edu.espol.taller07_patrones_c.e.Builder;

// Implementación concreta de Report para un informe en formato Word
public class WordReport implements Report {
    private String wordText;

    public WordReport(String wordText) {
        this.wordText = wordText;
    }

    @Override
    public void buildHeader() {
        // Construcción del encabezado del informe Word
    }

    @Override
    public void buildBody() {
        // Construcción del cuerpo del informe Word
    }

    @Override
    public void buildFooter() {
        // Construcción del pie del informe Word
    }

    @Override
    public Report getResult() {
        return this;
    }

    public void setWordText(String wordText) {
        this.wordText = wordText;
    }

    public String getWordText() {
        return wordText;
    }

    public void render() {
        // Lógica para renderizar un informe en Word
        //System.out.println("Renderizando informe Word...");
    }
}
