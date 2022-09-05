package beans;

public class Servicios {
    
    private int idServicio;
    private String tipoServicio;
    private String nombreServicio;

    public Servicios(int idServicio, String tipoServicio, String nombreServicio) {
        this.idServicio = idServicio;
        this.tipoServicio = tipoServicio;
        this.nombreServicio = nombreServicio;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    @Override
    public String toString() {
        return "Servicios{" + "idServicio=" + idServicio + ", tipoServicio=" + tipoServicio + ", nombreServicio=" + nombreServicio + '}';
    }
    
    
}
