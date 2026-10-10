import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEv1 {
    public static void main(String[] args) {
        GestorViviendas gestor = new GestorViviendas();
        Departamento propD01 = new Departamento("PROP-D01", 65, 3, 8, false);
        Departamento propD02 = new Departamento("PROP-D02", 48, 2, 3, true);
        Casa propC01 = new Casa("PROP-C01", 120, 4, true);
        Casa propC02 = new Casa("PROP-C02", 90, 3, false);

        propD01.asignarEstacionamiento();

        if (gestor.agregarVivienda(propD01)) {
            System.out.println("PROP-D01 (Departamento) registrado correctamente.");
        }
        if (gestor.agregarVivienda(propD02)) {
            System.out.println("PROP-D02 (Departamento) registrado correctamente.");
        }
        if (gestor.agregarVivienda(propC01)) {
            System.out.println("PROP-C01 (Casa) registrada correctamente.");
        }
        if (gestor.agregarVivienda(propC02)) {
            System.out.println("PROP-C02 (Casa) registrada correctamente.");
        }
        System.out.println("\n=== Busqueda por Codigo \"PROP-D01\" ===");
        Vivienda buscada = gestor.buscarPorCodigo("PROP-D01");

        if (buscada != null) {
            System.out.print("Tipo: " + buscada.getClass().getSimpleName() + " | ");
            System.out.print("Codigo: " + buscada.getCodigoPropiedad() + " | ");
            System.out.print("Superficie: " + (int) buscada.getSuperficieM2() + " m2 | ");
            System.out.print("Habitaciones: " + buscada.getNumeroHabitaciones() + " | ");
            if (buscada instanceof Departamento) {
                Departamento dep = (Departamento) buscada;
                System.out.print("Piso: " + dep.getNumeroPiso() + " | ");
                System.out.print("Gasto comun al dia: " + (dep.isGastoComunAlDia() ? "Si" : "No") + " | ");
                System.out.print("Estacionamiento asignado: " + (dep.tieneEstacionamientoAsignado() ? "Si" : "No") + " | ");
            } else if (buscada instanceof Casa) {
                Casa ca = (Casa) buscada;
                System.out.print("Tiene patio: " + (ca.isTienePatio() ? "Si" : "No") + " | ");
            }
            System.out.println("Costo arriendo: $" + (int) buscada.calcularCostoArriendo());
        }
        System.out.println("\n=== LISTADO DE VIVIENDAS ===");
        List<Vivienda> todas = gestor.obtenerTodas();
        for (Vivienda v : todas) {
            System.out.println(v.toString());
        }

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n=================================");
            System.out.println("  MENU ADMINISTRADOR DE VIVIENDAS  ");
            System.out.println("=================================");
            System.out.println("1. Listar todos los objetos");
            System.out.println("2. Buscar por código de propiedad");
            System.out.println("3. Simular arriendo con descuento");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {

                    case 1:
                        System.out.println("\n=== LISTADO DE VIVIENDAS ===");
                        for (Vivienda v : gestor.obtenerTodas()) {
                            System.out.println(v.toString());
                        }
                        break;
                    case 2:
                        System.out.print("\nIngrese código de propiedad (ej: PROP-D01): ");
                        String cod = sc.nextLine();
                        Vivienda encontrada = gestor.buscarPorCodigo(cod);

                        if (encontrada == null) {
                            System.out.println("No se encontró ninguna propiedad con el código: " + cod);
                        } else {
                            System.out.println("Código: " + encontrada.getCodigoPropiedad() +
                                    " | Tipo: " + encontrada.getClass().getSimpleName() +
                                    " | Costo Arriendo: $" + Math.round(encontrada.calcularCostoArriendo()));
                        }
                        break;
                    case 3:
                        System.out.print("\nIngrese el código de la propiedad a simular: ");
                        String codSim = sc.nextLine();
                        Vivienda vSim = gestor.buscarPorCodigo(codSim);

                        if (vSim == null) {
                            System.out.println("Propiedad no encontrada.");
                        } else {
                            System.out.print("Ingrese el porcentaje de descuento (0 - 100): ");
                            double dcto = sc.nextDouble();

                            try {
                                double costoFinal = vSim.calcularCostoArriendo(dcto);
                                System.out.println("Costo normal: $" + Math.round(vSim.calcularCostoArriendo()));
                                System.out.println("Costo con " + dcto + "% de descuento: $" + Math.round(costoFinal));
                            } catch (IllegalArgumentException e) {
                                System.out.println("Error en descuento: " + e.getMessage());
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Cerrando el sistema... ¡Hasta luego!");
                        break;

                    default:
                        System.out.println("Opción no válida. Ingrese un número entre 1 y 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un valor numérico válido.");
                sc.nextLine();
            }
        } while (opcion != 4);
        sc.close();
    }
}
