package cliente;

public class Cliente {
    private String nome;

    public Cliente (String nome){
        this.nome = nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void getNome(String nome){
        return this.nome;
    }
}
