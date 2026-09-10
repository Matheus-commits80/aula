public class Main {
    public static void main(String[] arg){
        int numero1 = 1, numero2 = 2, numero3 = 5;
     
    if(numero1 > numero2 && numero1 > numero3){
        System.out.println(numero1);
    }
    else if(numero2 > numero1 && numero2 > numero3){
        System.out.println(numero2);
    }
    else{
        System.out.println(numero3);
    }
}
}