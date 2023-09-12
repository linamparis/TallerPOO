public class Main {
    public static void main(String[] args) {


        CarroNormal carroNormal= new CarroNormal ("Renault","PNG123","1000CC", Vehiculo.Caja.AUTOMATICA, "Blanco", Vehiculo.Tipo.CARRO,1000);
        System.out.println("Potencia: " + carroNormal.getPotencia());
        CarroTurbo carroTurbo= new CarroTurbo ("Chevrolet", "INC123","1000CC", Vehiculo.Caja.AUTOMATICA, "Negro", Vehiculo.Tipo.CARRO,1000);
        Motocicleta motocicleta=new Motocicleta("Yamaha", "KM123","1000CC", Vehiculo.Caja.AUTOMATICA,"Azul",Vehiculo.Tipo.MOTO,1000);

    }
}