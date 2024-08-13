//Switch Statement

public class FabricaDeVehiculos {
    public Vehiculo crearVehiculo(String tipo, String numeroRegistro, double velocidad) {
        switch (tipo) {
            case "coche":
                return new Carro(numeroRegistro, velocidad);
            case "bicicleta":
                return new Bicicleta(numeroRegistro, (int) velocidad);
            case "barco":
                return new Barco(numeroRegistro, velocidad, 10.0);
            default:
                throw new IllegalArgumentException("Tipo de vehículo desconocido");
        }
    }
}
