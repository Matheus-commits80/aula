

public class Main {
    public static void main(String[] args){
        String saudacao = "Hello World";
        System.out.println(saudacao.length());
        System.out.println(saudacao.toUpperCase());
        System.out.println(saudacao.toLowerCase());
        System.out.println(saudacao.indexOf("W"));
        System.out.println(saudacao.charAt(6));
        
        String aluno_1 = "Miranata";
        String aluno_2 = "Aeronation";
        System.out.println(aluno_1.equals(aluno_2));//false

        String nome = "Savalo";
        String sobrenome = "Horse";
        System.out.println(nome + " " + sobrenome);

        String aluno_3 = "Pombinha da Paz de Jesus";
        System.out.println(aluno_3.contains("Jesus"));

        String aluno_4 = "";
        System.out.println(aluno_4.isEmpty());

        String frutas = String.join("-", "Laranja", "Banana");
        System.out.println(frutas);

        String nome_completo = "Del Lokon Piradon";
        System.out.println(nome_completo.replace("m", "n"));

        String frase = "Repetição com \"correção\" leva a perfeição";
        System.out.println(frase);

    }
}
