public class Main {
    static void aluno(String nome, int n){
        if (n >= 7){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!!");
        }
    }
    public static void main(String[] args){
        aluno("Marcinho", 6);
    }
}
