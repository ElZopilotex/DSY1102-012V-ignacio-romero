public class Departamento extends Vivienda implements ConEstacionamiento {

    private int numeroPiso ;
    private boolean gastoComunAlDia;
    private boolean estacionamientoAsignado;

    public Departamento(String codigoPropiedad, double superficieM2, int numeroHabitaciones, int numeroPiso, boolean gastoComunAlDia){
      super(codigoPropiedad, superficieM2, numeroHabitaciones);
      setNumeroPiso(numeroPiso);
      setGastoComunAlDia(gastoComunAlDia);
      this.estacionamientoAsignado = false;
    }
    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso){
        if(numeroPiso < 1){
            throw new IllegalArgumentException("el numero de piso debe ser al menos 1");
        }
        this.numeroPiso = numeroPiso;
    }

    public boolean isGastoComunAlDia() {
        return gastoComunAlDia;
    }

    public void setGastoComunAlDia(boolean gastoComunAlDia) {
        this.gastoComunAlDia = gastoComunAlDia;
    }

    @Override
    public double calcularCostoArriendo(){
        return gastoComunAlDia ? 180000.0 : 180000.0 * 1.15;
    }

    @Override
    public boolean tieneEstacionamientoAsignado(){
        return estacionamientoAsignado;
    }

    @Override
    public void asignarEstacionamiento(){
        estacionamientoAsignado = true;
    }
}
