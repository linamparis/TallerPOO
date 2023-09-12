public class Vehiculo {

    enum Caja {
        AUTOMATICA,
        MECANICA;
    }

    enum Tipo {
        CARRO,
        MOTO;
    }

    private String marca;
    private String referencia;
    private String cilindraje;
    private Caja tipo_caja;
    private String color;

    private Tipo tipo;

    private double revoluciones;


    public Vehiculo(String marca, String referencia, String cilindraje, Caja tipo_caja, String color, Tipo tipo, double revoluciones) {
        this.marca = marca;
        this.referencia = referencia;
        this.cilindraje = cilindraje;
        this.tipo_caja = tipo_caja;
        this.color = color;
        this.tipo = tipo;
        this.revoluciones = revoluciones;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Caja getTipo_caja() {
        return tipo_caja;
    }

    public void setTipo_caja(Caja tipo_caja) {
        this.tipo_caja = tipo_caja;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double getRevoluciones() {
        return revoluciones;
    }

    public void setRevoluciones(double revoluciones) {
        this.revoluciones = revoluciones;
    }


}
