public class Tigre extends Salvaje {
    protected String tipoRayas;

    public Tigre(String nombre, int edad, double peso, String habitat, String tipoRayas) {
        super(nombre, edad, peso, habitat);
        this.tipoRayas = tipoRayas;
    }

    @Override
    public void hacerSonido() {
        System.out.println(this.nombre + " hace: Grrr");
    }

    public String getTipoRayas() {
        return tipoRayas;
    }

    public void setTipoRayas(String tipoRayas) {
        this.tipoRayas = tipoRayas;
    }
}