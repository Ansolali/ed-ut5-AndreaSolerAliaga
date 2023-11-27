import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
        int mes, dia;
        Scanner leer=new Scanner(System.in);
        System.out.print("Introduce el dia: ");
        dia=leer.nextInt();
        System.out.print("Introduce el mes: ");
        mes=leer.nextInt();

        if (mes==2){
            if(dia>0 && dia<29){
                System.out.print(dia + "/" + mes +" Fecha correcta!");
            }else{
                System.out.print("Fecha incorrecta!");
            }
        }else if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            if(dia>0 && dia<32){
                System.out.print(dia + "/" + mes +" Fecha correcta!");
            }else{
                System.out.print("Fecha incorrecta!");
            }
        }else if (mes==4 || mes==6 || mes==9 || mes==11){
            if(dia>0 && dia<31){
                System.out.print(dia + "/" + mes +" Fecha correcta!");
            }else{
                System.out.print("Fecha incorrecta!");
            }
        }else{
            System.out.print("Fecha incorrecta");
        }
    }
}
