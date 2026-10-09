public class Mascota extends Animal {
    protected boolean esDomestico;

    public Mascota(String nombre, int edad, double peso, boolean esDomestico) {
        super(nombre, edad, peso);
        this.esDomestico = esDomestico;
    }

    public boolean isDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }
}
