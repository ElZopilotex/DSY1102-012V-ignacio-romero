public class Leon extends Salvaje{
    protected boolean tieneMelena;

    public Leon(String nombre, int edad, double peso, String habitat, boolean tieneMelena) {
        super(nombre, edad, peso, habitat);
        this.tieneMelena = tieneMelena;
    }

    @Override
    public void hacerSonido(){
        System.out.println(this.nombre + " hace: Roooar");
    }

    public boolean isTieneMelena() {
        return tieneMelena;
    }

    public void setTieneMelena(boolean tieneMelena) {
        this.tieneMelena = tieneMelena;
    }
}
