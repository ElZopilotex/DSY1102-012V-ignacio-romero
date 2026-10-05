public abstract class Vivienda {
    private String codigoPropiedad;
    private double superficieM2;
    private int numeroHabitaciones;

    public Vivienda(String codigoPropiedad, double superficieM2, int numeroHabitaciones) {
        setCodigoPropiedad(codigoPropiedad);
        setSuperficieM2(superficieM2);
        setNumeroHabitaciones(numeroHabitaciones);
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public String getCodigoPropiedad() {
        return codigoPropiedad;
    }

    public double getSuperficieM2() {
        return superficieM2;
    }

    public void setCodigoPropiedad(String codigoPropiedad) {
        if (codigoPropiedad == null || codigoPropiedad.trim().isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacio.");
        }
        this.codigoPropiedad = codigoPropiedad;
    }

    public void setSuperficieM2(double superficieM2) {
        if (superficieM2 < 20 || superficieM2 > 500) {
            throw new IllegalArgumentException("La superficie debe estar entre 20 y 500 M2.");
        }
        this.superficieM2 = superficieM2;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        if (numeroHabitaciones <= 0) {
            throw new IllegalArgumentException("El numero de habitaciones debe ser mayor a 0.");
        }
        this.numeroHabitaciones = numeroHabitaciones;

    }

    @Override
    public String toString() {
        return "Vivienda [Código: " + codigoPropiedad + ", Superficie: " + superficieM2 + " m²]";
    }

//Comentario:
//Me percato que en algunos tipos de programación los datos y funciones van separados y se editan sin control, pero en java es totalmente distinto ya que se usan clases para poder cruzar los datos
//Con estas reglas y tipos de datos evitamos que alguien cree alguna vivienda con datos incorrectos y asi hacer que el sistema funcione sin problemas


//Ingreso de la parte 2 (respaldo)

    public abstract double calcularCostoArriendo();

    public double calcularCostoArriendo(double porcentajeDescuento) {
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new IllegalArgumentException("El porcentaje de descuento debe estar entre 0 y 100.");
        }
        double costoBase = calcularCostoArriendo();
        return costoBase * (1.0 - (porcentajeDescuento / 100.0));
    }
}