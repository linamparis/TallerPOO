public class CarroTurbo extends Vehiculo{
    final double torque = 200;
    double potencia;

    double potenciaFinal;

    public CarroTurbo(String marca, String referencia, String cilindraje, Caja tipo_caja, String color, Tipo tipo, double revoluciones) {
        super(marca, referencia, cilindraje, tipo_caja, color, tipo, revoluciones);
        potencia = ((torque * getRevoluciones() / 9.6) / 745.7);
        potenciaFinal = (potencia * 0.12) + potencia;
    }



}
