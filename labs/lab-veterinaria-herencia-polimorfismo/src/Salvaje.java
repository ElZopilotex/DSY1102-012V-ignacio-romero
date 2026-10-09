public class Salvaje extends Animal {
    protected String habitat;

    public Salvaje(String nombre, int edad, double peso, String habitat){
        super(nombre, edad, peso);
        this.habitat = habitat;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
