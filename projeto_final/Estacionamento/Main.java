
package application;

import model.Carro;
import model.Vaga;
import model.RegistroEstacionamento;

public class Main {

    public static void main(String[] args) {

        // Criando um veículo
        Carro carro = new Carro(
            "ABC1234", "Civic", "Honda"
        );

        // Criando uma vaga
        Vaga vaga = new Vaga(1);

        System.out.println("=== TESTE DE ESTACIONAMENTO ===");

        // Verificando disponibilidade
        System.out.println("Vaga disponivel: "
                + vaga.isDisponivel());

        // Ocupando a vaga
        vaga.ocupar(carro);

        System.out.println("Vaga ocupada: "
                + !vaga.isDisponivel());

        // Criando registro de entrada
        RegistroEstacionamento registro =
                new RegistroEstacionamento(carro, vaga);

        System.out.println("Placa: "
                + registro.getVeiculo().getPlaca());

        System.out.println("Horario de entrada: "
                + registro.getHorarioEntrada());

        // Registrando saída
        registro.registrarSaida();

        System.out.println("Horario de saida: "
                + registro.getHorarioSaida());

        System.out.println("Horas cobradas: "
                + registro.getHorasCobradas());

        System.out.println("Valor a pagar: R$ "
                + registro.getValorPago());

        // Liberando a vaga
        vaga.liberar();

        System.out.println("Vaga disponivel novamente: "
                + vaga.isDisponivel());

    }
}
