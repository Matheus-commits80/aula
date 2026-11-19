package model;

public abstract class Veiculo {

    // Atributos do veículo
    private String placa;
    private String modelo;
    private String marca;

    // Construtor
    public Veiculo(String placa, String modelo, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }

    // Métodos getters
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    // Métodos setters
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método abstrato
    public abstract String getTipo();

}