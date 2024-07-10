package ec.edu.espol.taller07_patrones_c.e.Builder;
// Interfaz Report que define los métodos para construir partes del informe
public interface Report {
    void buildHeader();
    void buildBody();
    void buildFooter();
    Report getResult();
}
