public class Professor extends Pessoa {
    public Professor(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    
    }
    public void profissao(){
        System.out.println("Ola grandioso Professor!" + this.nome);
    }
    
}
