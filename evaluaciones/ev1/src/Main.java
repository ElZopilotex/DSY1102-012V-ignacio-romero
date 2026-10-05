import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorViviendas gestor = new GestorViviendas();
        Departamento propD01 = new Departamento("PROP-D01", 65, 3, 8, false);
        Departamento propD02 = new Departamento("PROP-D02", 48, 2, 3, true);
        Casa propC01 = new Casa("PROP-C01", 120, 4, true);
        Casa propC02 = new Casa("PROP-C02", 90, 3, false);

        propD01.asignarEstacionamiento();

        if (gestor.agregarVivienda(propD01)){
            System.out.println("PROP-D01 (Departamento) registrado correctamente.");
        }
        if (gestor.agregarVivienda(propD02)){
            System.out.println("PROP-D02 (Departamento) registrado correctamente.");
        }
        if  (gestor.agregarVivienda(propC01)){
            System.out.println("PROP-C01 (Casa) registrada correctamente.");
        }
        if (gestor.agregarVivienda(propC02)){
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
        List<Vivienda>todas = gestor.obtenerTodas();
        for (Vivienda v : todas) {
            System.out.println(v.toString());
        }
    }
}
