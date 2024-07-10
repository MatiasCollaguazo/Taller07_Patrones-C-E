/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller07_patrones_c.eAdapter;

/**
 *
 * @author rlaur
 */
public class NotificacionTelegramAdapter implements ServicioNotificacion {
    private ServicioTelegram servicioTelegram;

    public NotificacionTelegramAdapter(ServicioTelegram servicioTelegram) {
        this.servicioTelegram = servicioTelegram;
    }

    @Override
    public void enviarNotificacion(String mensaje, String destinatario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
