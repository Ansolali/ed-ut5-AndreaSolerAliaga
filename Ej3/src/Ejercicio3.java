import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String[] args){
        String usuario_correcto = "Usuario";
        String contrasena_correcta = "contrasena123";
        String usuario, contrasena;
        boolean salir=false;//Alberto: Declaración variable booleana.
        Scanner leer=new Scanner(System.in);

        do
        {//Alberto: Bucle doWhile para repetir en caso de ser datos incorrectos
            System.out.print("\nIntroduzca su nombre de usuario: ");
            usuario=leer.nextLine();
            System.out.print("Introduzca su contrase\u00f1a: ");
            contrasena=leer.nextLine();

        //comprobar si el usuario y la contraseña son correctos
        //son la funcion equals comprobamos que dos cadenas son iguales,

        if (usuario_correcto.equals(usuario) && contrasena_correcta.equals(contrasena)){
            System.out.print ("¡Bienvenido, " + usuario +"!");
            salir=true;
        }else if (!usuario_correcto.equals(usuario) && contrasena_correcta.equals(contrasena)){
            System.out.print ("Nombre de usuario incorrecto.");
        }else if (usuario_correcto.equals(usuario) && !contrasena_correcta.equals(contrasena)){
            System.out.println ("Contrase\u00f1a incorrecta");
        }else {
            System.out.println ("Acceso denegado");
        }
        }while(!salir);
    }
}
