import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private int vida;

    private Arma arma;

    private Armadura armadura;

    private List<Habilidad> habilidades;

    public void realizarGolpe(Personaje personaje) {
        if (personaje.sigueVivo()) {
            int daño = arma.getDaño(personaje.getArmadura());
            personaje.recibirDaño(daño);
            if (!personaje.sigueVivo()) {
                System.out.println("El personaje golpeado se cago muriendo");
            }
        }
    }

    public void recibirDaño(int daño) {
        this.vida -= daño;
    }

    public boolean sigueVivo() {
        return vida > 0;
    }

    public Personaje() {
        this.vida = 100;
        this.habilidades = new ArrayList<>();
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public void agregarHabilidad(Habilidad habilidad) {
        this.habilidades.add(habilidad);
    }
}
