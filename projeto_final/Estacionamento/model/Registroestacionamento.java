
package model;

import java.time.Duration;
import java.time.LocalDateTime;
import interfaces.Tarifavel;

public class RegistroEstacionamento {

    private Veiculo veiculo;
    private Vaga vaga;

    private LocalDateTime horarioEntrada;
    private LocalDateTime horarioSaida;

    private double valorPago;

    // Construtor
    public RegistroEstacionamento(Veiculo veiculo, Vaga vaga) {

        this.veiculo = veiculo;
        this.vaga = vaga;

        this.horarioEntrada = LocalDateTime.now();
        this.horarioSaida = null;

        this.valorPago = 0.0;
    }

    // Retorna o veículo
    public Veiculo getVeiculo() {
        return veiculo;
    }

    // Retorna a vaga
    public Vaga getVaga() {
        return vaga;
    }

    // Retorna o horário de entrada
    public LocalDateTime getHorarioEntrada() {
        return horarioEntrada;
    }

    // Retorna o horário de saída
    public LocalDateTime getHorarioSaida() {
        return horarioSaida;
    }

    // Retorna o valor pago
    public double getValorPago() {
        return valorPago;
    }

    // Verifica se o veículo ainda está estacionado
    public boolean isAtivo() {
        return horarioSaida == null;
    }

    // Calcula o tempo de permanência
    public Duration getTempoPermanencia() {

        LocalDateTime fim = horarioSaida;

        if (fim == null) {
            fim = LocalDateTime.now();
        }

        return Duration.between(horarioEntrada, fim);
    }

    // Calcula quantas horas serão cobradas
    public int getHorasCobradas() {

        long milissegundos = getTempoPermanencia().toMillis();

        long horas = (milissegundos + 3599999) / 3600000;

        return (int) Math.max(1, horas);
    }

    // Registra a saída e calcula o valor
    public void registrarSaida() {

        if (!isAtivo()) {
            throw new IllegalStateException(
                "A saída deste veículo já foi registrada."
            );
        }

        this.horarioSaida = LocalDateTime.now();

        int horas = getHorasCobradas();

        Tarifavel tarifavel = (Tarifavel) veiculo;

        this.valorPago = tarifavel.calcularTarifa(horas);
    }

}
