public class Aluno {
    String nome;
    String email;
    boolean inteligente = false;
    int nivel_sono = 0;
    boolean piscando_lento = false;
    

    //nome----------------------------------
    public void setNome(String nome){
        this.nome= nome;
    }
    public String getNome(String nome){
        return this.nome;
    }

    //Email-----------------------------------------
    public Aluno(String email){
        this.email = email;
    }
    public void setEmail(String email){
        this.email= email;
    }
    public String getEmail(String email){
        return this.email;
    }

    //Inteligencia-----------------------------------
    public Aluno(Boolean inteligente){
        this.inteligente = inteligente;
    }
    public void setInteligente(boolean inteligente){
        this.inteligente = inteligente;
    }
    public boolean getInteligente(boolean inteligente){
        return this.inteligente;
    }

    //nivel sono -------------------------------------------------------
    public Aluno(int nivel_sono){
        this.nivel_sono = nivel_sono;
    }
    public void setNivel_sono(int nivel_sono){
        this.nivel_sono = nivel_sono;
    }
    public int getNivel_sono(int nivel_sono){
        return this.nivel_sono;
    }

    //piscando lento -------------------------------------
    public Aluno(boolean piscando_lento){
        this.piscando_lento = piscando_lento;
    }
    public void setPiscando_lento(boolean piscando_lento){
        this.piscando_lento = piscando_lento;
    }
    public Boolean getPiscando_lento(boolean piscando_lento){
        return this.piscando_lento;
    }

    //dormir Na Aula ---------------------------------------------------
    static void dormirNaAula(){
        System.out.println("O aluno esta dormindo, fique em silencio!");
    }

    //fingindo estudar --------------------------------------------------
    static void fingindoEstudar(){
        System.out.println("O aluno esta Fingindo estudar!");
    }



}

