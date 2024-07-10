package ec.edu.espol.taller07_patrones_c.e.Builder;
public class ReportBuilder {
    protected Report report;

    public Report getReport() {
        return report;
    }

    public void build() {
        //Creacion de un reporte de las maneras q haya
    }
    
    public void createCabecera(){
        //Forma en que se creara la cabecera
    }
    
    public void createCuerpo(){
        //Forma en que se creara el cuerpo
    }
    
    public void createPieDePagina(){
        //Forma en que se creara el pie de pagina
    }
    
}