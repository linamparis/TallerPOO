public class CarroNormal extends Vehiculo {
    final double torque = 160;

    public double getPotencia() {
        return potencia;
    }

    private double potencia;

    public CarroNormal(String marca, String referencia, String cilindraje, Caja tipo_caja, String color, Tipo tipo, double revoluciones) {
        super(marca, referencia, cilindraje, tipo_caja, color, tipo, revoluciones);
        potencia = (((torque * super.getRevoluciones()) / 9.6) / 745.7);
    }


}



