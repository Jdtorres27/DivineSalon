package beans;

import java.sql.Timestamp;
public class cita {
    
    private int idServicio;
    private int idCliente;
    private Timestamp horaFecha;

    public cita(int idServicio, int idCliente, Timestamp horaFecha) {
        this.idServicio = idServicio;
        this.idCliente = idCliente;
        this.horaFecha = horaFecha;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Timestamp getHoraFecha() {
        return horaFecha;
    }

    public void setHoraFecha(Timestamp horaFecha) {
        this.horaFecha = horaFecha;
    }

    @Override
    public String toString() {
        return "cita{" + "idServicio=" + idServicio + ", idCliente=" + idCliente + ", horaFecha=" + horaFecha + '}';
    }

    
    
}
