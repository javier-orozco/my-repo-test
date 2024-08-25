
import java.util.Scanner;



public class principal {

    static Scanner scanner=new Scanner (System.in);

    public static void main(String[] args){

        //menu
        System.out.println("--elija el ejercicio--");
        System.out.println("1. Diseñe un algoritmo que calcule el área de un cuadrado");
        System.out.println("2. Diseñe un algoritmo que calcule el área de un círculo");
        System.out.println("3. Diseñe un algoritmo que convierta de grados centígrados a grados fahrenheit y viceversa");
        System.out.println("4. Diseñe un algoritmo para calcular el salario de un empleado");
        System.out.println("5. Diseñe un algoritmo para convertir pesos a dolares y pesos a euros");
        System.out.println("6. Diseñe un algoritmo para calcular el pago de un parqueadero por horas");

        int opcion=scanner.nextInt();

        switch (opcion) {
            case 1:
                cuadrado();
                break;
        
            case 2:
                circulo();
                break;
            case 3:
                grados();
                break;
            case 4:
                salario();
                break;
            case 5:
                pesos();
                break;
            case 6:
                parqueadero();
                break;
        }

    }
    //ejercicio 1
    static void cuadrado(){
        System.out.println("Calcular el area de y un cuadrado");
        System.out.println("Digite el tamaño un lado");
        int numero1=scanner.nextInt();
        int resultado=numero1*numero1;
        System.out.println("El area del cuadrado es de "+resultado);

    }
    //ejercicio 2
    static void circulo(){
        System.out.println("Calcular el area de un circulo");
        System.out.println("Digite el radio del circulo");
        double r =scanner.nextInt();
        final double PI = 3.1416;
        double areaCirculo = 0.0;
        areaCirculo = Math.PI * Math.pow(r,2);
        System.out.println("El area del circulo es de "+areaCirculo);


    }
    //ejercicio 3
    static void grados(){


        System.out.println("Elija la opcion que desea");
        System.out.println("1. Convertir grados centrigrados a grados fahrenheit");
        System.out.println("2. Convertir grados fahrenheit a grados centrigrados");
        int opcion=scanner.nextInt();

        switch (opcion) {
            case 1:
                centrigados();

                break;
        
            case 2:
                fahrenheit();
                break;
        }
        

    }

    static void centrigados(){
        System.out.println("Digite los grados centrigados para convertirlos a Fahrenheit");
        double c = scanner.nextInt();
        double gradosFahrenheit = c *(9.0/5.0)+32.0;
        System.out.println("°C a °F = "+gradosFahrenheit);

    }
    static void fahrenheit(){
        System.out.println("Digite los grados Fahrenheit para convertirlos a centrigados");
        double f = scanner.nextInt();
        double gradosCentrigados = ((f-32)/(9.0/5.0));
        System.out.println("°F a °C = "+gradosCentrigados);

    }

    //ejecicio 4

    static void salario(){
        System.out.println("Ingrese su salario bruto");
        int salarioBruto = scanner.nextInt();
        System.out.println("Ingresa el % de la deduccion");
        int porcentaje = scanner.nextInt();
        int deduccion = salarioBruto*porcentaje/100;
        int salarioNeto = salarioBruto - deduccion;
        System.out.println("tu salario neto es de "+salarioNeto);

    }
    //ejercicio 5
    static void pesos(){
        System.out.println("Ingrese la cantidad de pesos");
        int pesos = scanner.nextInt();
        double dolar = pesos * 1 /4035.33;
        double euro = pesos * 1 / 4515.91;
        System.out.println("tienes en dolares "+dolar);
        System.out.println("tienes en euros "+euro);

    }
    //ejercicio 6
    static void parqueadero(){

        System.out.println("cuantas horas uso el parqueadero");
        int horas = scanner.nextInt();
        int paga = horas * 2000;
        int iva = paga * 20/100;
        int pagafinal = paga + iva;
        System.out.println("debe pagar de parqueadero "+pagafinal);
    }
}