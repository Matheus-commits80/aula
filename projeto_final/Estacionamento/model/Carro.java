
package model;

import interfaces.Tarifavel;

public class Carro extends Veiculo implements Tarifavel {

    public Carro(String placa, String modelo, String marca) {
        super(placa, modelo, marca);
    }

    @Override
    public String getTipo() {
        return "Carro";
    }

    
    public double calcularTarifa(int horas) {
        return Math.max(1, horas) * 12.00;
    }

}
