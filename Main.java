import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        //ejercicio de IMC
        double peso, altura, IMC;

        Scanner entrada = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Ingrese su peso: ");
                peso = entrada.nextDouble();
            }catch(Exception Error){
                System.out.println("Ingrese solo numeros positivos");
                peso=0;
                entrada.nextLine();
            }
            if (peso > 0) {
                break;
            }
        }

        while(true){
            try{
                System.out.println("Ingrese su altura: ");
                altura = entrada.nextDouble();
            }catch(Exception Error){
                System.out.println("Ingrese solo numeros positivos");
                altura=0;
                entrada.nextLine();
            }
            if (altura > 0) {
                break;
            }
        }
        IMC = peso/(altura*altura);
        System.out.println("Su indice de masa corporal es: " + IMC);
    }
}
