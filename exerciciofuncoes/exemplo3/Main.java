public class Main {
    public static boolean ligarInterruptor(){
        if (passarEletrecidade() == true){
            if (acenderLampada() == true){
            System.out.println("Lâmpada acesa!");
            return true;
        }else {
            System.out.println("Lampada queimou!");
            return false;
        }   
        
    } else {
        System.out.println("Problema no circuito!");
        return false;
    }

    static boolean passarEletrecidade(){
        return true;
    }

    static boolean acenderLampada(){
        return true;
    }
    public static void main(String[] args){
        if (ligarInterruptor() == true){
        System.out.println("Processo funcionou!");
    }else {
        System.out.println("Processo falhou!");
    }
}
}
