public class Perro extends Mascota {
    protected String raza;

    public Perro(String nombre, int edad, double peso, boolean esDomestico, String raza) {
        super(nombre, edad, peso, esDomestico);
        this.raza = raza;
    }

    @Override
    public void hacerSonido(){
        System.out.println(this.nombre + " Dice: Guau Guau");
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }
}
