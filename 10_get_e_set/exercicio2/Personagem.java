import javax.swing.UIDefaults.LazyInputMap;

public class Personagem {
    String nome;
    int vida = 0;
    List<Tipo> tipo;
    List<Poder> poder;

    public Personagem(String nome, int vida, String tipo, String poder){
        this.nome = nome;
        this.vida = vida;
        Tipo tipo1 = new Tipo(tipo);
        this.tipo.add(tipo1);
        Poder poder1 = new Poder(poder);
        this.poder.add(poder1);
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setVida(int vida){
        this.vida = vida;
    }
    public String getVida(){
        return this.vida;
    }
    
    public static void main(String[] args) {
        Personagem person_1 = new Personagem("Ben 10", 100, "Mutante", "Transformar");
        Personagem person_2 = new Personagem("batman", 2, "Cavaleiro", "Dinheiro");
        System.out.println(person_1.getNome());
        
        List<Personagem> personagens;
        personagens.add(person_1);
        personagens.add(person_2);
    }

}
