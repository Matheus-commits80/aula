public class Main{
    private static Professor professor;
    
    public static void main(String[] args) {
        professor = new Professor("Abaduba");

        System.out.println("Nome " + professor.getNome());
    }
}