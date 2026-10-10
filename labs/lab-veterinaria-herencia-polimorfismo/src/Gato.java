public class Gato extends Mascota {
    protected boolean esIndor;

    public Gato(String nombre, int edad, double peso, boolean esDomestico, boolean esIndor) {
        super(nombre, edad, peso, esDomestico);
        this.esIndor = esIndor;
    }

    @Override
    public void hacerSonido(){
        System.out.println(this.nombre + " dice: Miau");
    }

    public boolean isEsIndor() {
        return esIndor;
    }

    public void setEsIndor(boolean esIndor) {
        this.esIndor = esIndor;
    }
}
