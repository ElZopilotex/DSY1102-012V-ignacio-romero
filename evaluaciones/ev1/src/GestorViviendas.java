import java.util.ArrayList;
import java.util.List;

public class GestorViviendas {

    private final List <Vivienda> listaViviendas;

    public GestorViviendas() {
        this.listaViviendas = new ArrayList <>();
    }

    public boolean agregarVivienda(Vivienda vivienda) {
        if (vivienda == null) {
            return false;
        }

        if (buscarPorCodigo(vivienda.getCodigoPropiedad()) != null) {
            return false;
        }

        return listaViviendas.add(vivienda);
    }

    public Vivienda buscarPorCodigo(String codigoPropiedad) {
        if (codigoPropiedad == null || codigoPropiedad.trim().isEmpty()) {
            return null;
        }
        for (Vivienda v : listaViviendas) {
            if (v.getCodigoPropiedad().equalsIgnoreCase(codigoPropiedad.trim())) {
                return v;
            }
        }
        return null;
    }

    public List <Vivienda> obtenerTodas() {
        return listaViviendas;
    }

    public List <Vivienda> obtenerCasas() {
        List <Vivienda> casas = new ArrayList <> ();
        for (Object obj : listaViviendas) {
            if (obj instanceof Casa) {
                casas.add((Casa) obj);
            }
        }
        return casas;
    }

    public List <Vivienda> obtenerDepartamentos() {
        List <Vivienda> departamentos = new ArrayList <>();
        for (Object obj : listaViviendas) {
            if (obj instanceof Departamento) {
                departamentos.add((Departamento) obj);
            }
        }
        return departamentos;
    }

    public double calcularTotalArriendos() {
        double total = 0.0;
        for (Vivienda v : listaViviendas) {
            total += v.calcularCostoArriendo();
        }
        return total;
    }
}