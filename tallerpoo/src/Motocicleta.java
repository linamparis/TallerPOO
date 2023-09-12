public class Motocicleta extends Vehiculo{
    final double torque = 50;

    double potencia;



    public Motocicleta(String marca , String referencia, String cilindraje, Caja tipo_caja, String color, Tipo tipo, double revoluciones) {
        super(marca, referencia, cilindraje, tipo_caja, color, tipo, revoluciones);
        potencia = ((torque * getRevoluciones() / 9.8) / 745.7);
    }

}
