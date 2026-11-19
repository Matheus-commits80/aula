
package model;

import interfaces.Tarifavel;

public class Caminhonete extends Veiculo implements Tarifavel {

    public Caminhonete(String placa, String modelo, String marca) {
        super(placa, modelo, marca);
    }

    @Override
    public String getTipo() {
        return "Caminhonete";
    }

    public double calcularTarifa(int horas) {
        return Math.max(1, horas) * 18.00;
    }

}
