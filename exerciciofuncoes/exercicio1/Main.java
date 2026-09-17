public class Main {
    static void numero(int n){
        if (n > 0){
            System.out.println("Esse numero e maior que zero!");
        }
        if (n == 0){
            System.out.println("Esse numero e igual a zero!");
    } 
        if(n < 0){
            System.out.println("Esse numero e menor que zero!");
        }
    }
    public static void main(String[] args){
        numero(0);
    }
}
