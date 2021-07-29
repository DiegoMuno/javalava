package model;

public class Servicio {
    private int duracion;   
    private String horaInicio;

    private Usuario user;
    private Lavadora lava;

    public Servicio(int duracion, String horaInicio, Usuario user, Lavadora lava) {
        super();
        this.duracion = duracion;
        this.horaInicio = horaInicio;
        this.user = user;
        this.lava = lava;        
    }

    public int getDuracion() {
        return duracion;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public Lavadora getLava() {
        return lava;
    }

    public Usuario getUser() {
        return user;
    }

    

    
}
