package javaaplication1;
import java.util.Scanner;
public class Javaaplication1{
    public static void main(String[] args){
        mayorymenor();
    }
    public static void mayorymenor(){
        Scanner teclado = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese el Primer Numero: ");
        num1=teclado.nextInt();
        System.out.println("Ingrese el Segundo Numero: ");
        num2=teclado.nextInt();
        if(num1==num2){
            System.out.println("Los Numeros Ingresados Son Identicos: ");
            mostrartabla(num1);
        }
        else
        {
            if(num1>num2){
                System.out.println("El primer Numero Igresado es el Mayor" +num1);
                mostrartabla(num1);
            }
            else{
            System.out.println("El Segundo Numero Ingresado es el Mayor" +num2);
            mostrartabla(num2);
            }
        }
        }
        public static void mostrartabla(int num){
        for(int i=1; i<11;i++){
            System.out.println(num*i);
        }
        }
    }
    
    
    

