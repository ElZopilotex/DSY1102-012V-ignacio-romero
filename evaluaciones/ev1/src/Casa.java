public class Casa  extends Vivienda{

    private boolean tienePatio;

    public Casa(String codigoPropiedad, double superficieM2, int numeroHabitaciones, boolean tienePatio) {
        super(codigoPropiedad, superficieM2, numeroHabitaciones);
        setTienePatio(tienePatio);
    }

    public boolean isTienePatio(){
        return tienePatio;
    }

    public void setTienePatio(boolean tienePatio){
        this.tienePatio = tienePatio;
    }

    @Override
    public double calcularCostoArriendo(){
        return tienePatio ? 250000.0 *1.10 : 250000.0;
    }
}
