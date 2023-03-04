import java.util.Scanner;
public class Main{
    static public void main(String[] args) {
        float suma,x,y;
        Scanner numero1 = new Scanner(System.in);
        Scanner numero2 = new Scanner(System.in);
        suma=0;
        x= numero1.nextFloat();
        suma=suma+x;
        y= numero2.nextFloat();
        x = (float) (x + Math.pow(y,2));
        suma = suma + x/y;
        System.out.println("El valor de la suma es: "+suma);
    }
}