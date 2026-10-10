import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ATENCIÓN DE VETERINARIA ===");

        Perro perro = new Perro("Cassie", 5, 12.3, true, "Kiltro");
        Gato gato = new Gato("Kara", 2, 4.5, true, true);
        Tigre tigre = new Tigre("Tarzan", 5, 180.0, "Selva", "Marcadas");
        Leon leon = new Leon("Simba", 4, 190.0, "Sabana", true);

        List<Animal> listaAnimales = new ArrayList<>();
        listaAnimales.add(perro);
        listaAnimales.add(gato);
        listaAnimales.add(tigre);
        listaAnimales.add(leon);

        System.out.println("\n--- Realizando chequeo y sonidos de animales ---");
        for (Animal animal : listaAnimales) {
            System.out.println("Animal: " + animal.getNombre() + " | Edad: " + animal.getEdad() + " años | Peso: " + animal.getPeso() + " kg");
            animal.comer();
            animal.hacerSonido();
            System.out.println("----------------------------------------------");
        }
    }
}
