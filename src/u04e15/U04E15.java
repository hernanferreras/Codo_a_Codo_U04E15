
package u04e15;

import java.util.Scanner;
public class U04E15 {

    public static void main(String[] args) {
       double num1, num2;
       char operacion;
       String mensaje = "El resultado de la ";
       String mensajeSuma = "suma es igual a: ";
       String mensajeResta = "resta es igual a: ";
       String mensajeMulti = "multiplicacion es igual a: ";
       String mensajeDiv = "division es igual a: ";
       Scanner entrada= new Scanner(System.in);
       System.out.print("Ingrese el primer numero: ");
       num1 = entrada.nextDouble();
       System.out.print("Ingrese el segundo numero: ");
       num2 = entrada.nextDouble();
       System.out.print("Ingrese la operacion que desea realizar: \n\"+\" - Suma\n\"-\" - Resta\n\"*\" - Producto\n\"/\"- Division\nSu eleccion: ");
       operacion = entrada.next().charAt(0);
       if (num2==0){
           operacion='0';
       }
       switch (operacion){
            case '+':
                System.out.print(mensaje+mensajeSuma+(num1+num2)); break;
            case '-':
                System.out.print(mensaje+mensajeResta+(num1-num2)); break;
            case '*':
                System.out.print(mensaje+mensajeMulti+(num1*num2)); break;
            case '/':
                System.out.print(mensaje+mensajeDiv+(num1/num2)); break;
            case '0':
                System.out.print("La division por 0 no se puede realizar"); break;
            
       }
        
    }
}