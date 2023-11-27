import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        int a,b,c;
        double sol1, sol2;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduce el valor de a: ");
        a=leer.nextInt();

        System.out.print("Introduce el valor de b: ");
        b=leer.nextInt();

        System.out.print("Introduce el valor de c: ");
        c=leer.nextInt();

        sol1=(-b + Math.sqrt(Math.pow(b,2)-4*a*c)) / (2*a);
        sol2=(-b - Math.sqrt(Math.pow(b,2)-4*a*c)) / (2*a);

        if (a == 0){
            System.out.print("El denominador no puede ser igual a 0.");
        } else if (Double.isNaN(sol1) || Double.isNaN(sol2)){ //funcion que comprueba si el resultado es un numero valido o no lo es
            System.out.println("No existen soluciones reales");}
        else{
            System.out.println("solución 1: " + sol1);
            System.out.print("solucion 2: " + sol2);
        }
    }
}
