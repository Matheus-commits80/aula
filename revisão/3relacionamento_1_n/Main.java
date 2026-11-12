import java.util.List;
import java.util.ArrayList;

public class Main{
    private static List<Professor> professor = new ArrayList<>();
    
    public static void main(String[] args) {
        professor.add(new Professor("Rosicamarillo"));
        professor.add(new Professor("Rosicascadebala"));
        professor.add(new Professor("Rosixseven"));
        
        for(Professor prof : professor){
        System.out.println("Nome " + prof.getNome());
    }
    }
}