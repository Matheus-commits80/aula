
package model;

import interfaces.Tarifavel;

public class Moto extends Veiculo implements Tarifavel {

    public Moto(String placa, String modelo, String marca) {
        super(placa, modelo, marca);
    }

    
    public String getTipo() {
        return "Moto";
    }

    @Override
    public double calcularTarifa(int horas) {
        return Math.max(1, horas) * 7.00;
    }

}
