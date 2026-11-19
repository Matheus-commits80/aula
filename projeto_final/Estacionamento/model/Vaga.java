
package model;

public class Vaga {

    private int numero;
    private Veiculo veiculo;

    // Construtor
    public Vaga(int numero) {
        this.numero = numero;
        this.veiculo = null;
    }

    // Retorna o número da vaga
    public int getNumero() {
        return numero;
    }

    // Verifica se a vaga está disponível
    public boolean isDisponivel() {
        return veiculo == null;
    }

    // Retorna o veículo estacionado
    public Veiculo getVeiculo() {
        return veiculo;
    }

    // Ocupa a vaga
    public void ocupar(Veiculo veiculo) {

        if (!isDisponivel()) {
            throw new IllegalStateException("Esta vaga já está ocupada.");
        }

        this.veiculo = veiculo;
    }

    // Libera a vaga
    public void liberar() {

        if (isDisponivel()) {
            throw new IllegalStateException("Esta vaga já está disponível.");
        }

        this.veiculo = null;
    }

}
