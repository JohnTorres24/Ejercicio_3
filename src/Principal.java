import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n=======MENU=======");
            System.out.println("1. Dados 2 ");
            System.out.println("2. Dados 3 ");
            System.out.println("3. IMC ");
            System.out.println("4. Formula 1");
            System.out.println("5.");
            System.out.println("6. Salir");
            System.out.println("Elige una opcion ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Elegiste Dados 2 ");
                    dados2();
                    break;
                case 2:
                    System.out.println("Elegiste Dados 3 ");
                    dados3();
                    break;
                case 3:
                    System.out.println("Elegiste IMC ");
                    System.out.println(IMC());
                    break;
                case 4:
                    System.out.println("Elegiste Formula 1 ");
                    F1();
                    break;
                case 5:
                    System.out.println("Elegiste 5 ( vacia por ahora)");
                case 6:
                    System.out.println("Saliendo del programa.....:)");
                    break;
                default:
                    System.out.println("Opcion no valida. Intenta de nuevo:D ");
            }
        } while (opcion != 6);
        teclado.close();

    }

    public static void dados2() {
        Random aleatorio = new Random();
        int dado1, dado2;
        int sumaDado1 = 0;
        int sumaDado2 = 0;
        for (int i = 1; i <= 20; i++) {
            dado1 = aleatorio.nextInt((6 - 1) + 1) + 1;
            dado2 = aleatorio.nextInt((6 - 1) + 1) + 1;
            sumaDado1 = sumaDado1 + dado1;
            sumaDado2 = sumaDado2 + dado2;
            System.out.println("Ronda " + i + " Dado 1: " + dado1 + " Dado2: " + dado2);
        }
        System.out.println(" Resultado final:");
        System.out.println(" Dado 1:" + sumaDado1);
        System.out.println(" Dado 2:" + sumaDado2);
        if (sumaDado1 > sumaDado2) {
            System.out.println("Gano Dado 1");
        } else if (sumaDado2 > sumaDado1) {
            System.out.println("Gano Dado 2");
        } else {
            System.out.println("empate");
        }
    }

    public static void dados3() {
        Random aleatorio = new Random();
        int dado1, dado2, dado3;
        int sumaDado1 = 0;
        int sumaDado2 = 0;
        int sumaDado3 = 0;
        String primero = "";
        String segundo = "";
        String tercero = "";
        for (int i = 1; i <= 20; i++) {
            dado1 = aleatorio.nextInt((6 - 1) + 1) + 1;
            dado2 = aleatorio.nextInt((6 - 1) + 1) + 1;
            dado3 = aleatorio.nextInt((6 - 1) + 1) + 1;
            sumaDado1 = sumaDado1 + dado1;
            sumaDado2 = sumaDado2 + dado2;
            sumaDado3 = sumaDado3 + dado3;
            System.out.println("Ronda " + i + " Dado 1: " + dado1 + " Dado2: " + dado2 + " Dado3: ");
        }
        System.out.println(" Resultados finales:");
        System.out.println(" Dado 1:" + sumaDado1);
        System.out.println(" Dado 2:" + sumaDado2);
        System.out.println(" Dado 3:" + sumaDado3);
        if (sumaDado1 >= sumaDado2 && sumaDado1 >= sumaDado3) {
            primero = "Dado 1 (" + sumaDado1 + ")";
            if (sumaDado2 >= sumaDado3) {
                segundo = "Dado2 ( " + sumaDado2 + ")";
                tercero = "Dado3 ( " + sumaDado3 + ")";
            } else {
                segundo = "Dado3 ( " + sumaDado3 + ")";
                tercero = "Dado2 ( " + sumaDado2 + ")";
            }
        } else if (sumaDado2 >= sumaDado1 && sumaDado2 >= sumaDado3) {
            primero = "Dado2 (" + sumaDado2 + ")";
            if (sumaDado1 >= sumaDado3) {
                segundo = "Dado1( " + sumaDado1 + ")";
                tercero = "Dado3 ( " + sumaDado3 + ")";
            } else {
                segundo = "Dado3 ( " + sumaDado3 + ")";
                tercero = "Dado1( " + sumaDado1 + ")";
            }
        } else {
            primero = "Dado3 (" + sumaDado3 + ")";
            if (sumaDado1 >= sumaDado2) {
                segundo = "Dado1 ( " + sumaDado1 + ")";
                tercero = "Dado2 ( " + sumaDado2 + ")";
            } else {
                segundo = "Dado2 ( " + sumaDado2 + ")";
                tercero = "Dado1 ( " + sumaDado1 + ")";
            }
        }
        System.out.println(" Tabla de Posiciones: ");
        System.out.println(" 1° lugar: " + primero);
        System.out.println(" 2° lugar: " + segundo);
        System.out.println(" 3° lugar: " + tercero);
    }

    public static String IMC() {
        Scanner datos = new Scanner(System.in);
        System.out.println(" Ingrese su peso en Kg: ");
        double peso = datos.nextDouble();
        System.out.println(" Ingrese su estatura en metros: ");
        double estatura = datos.nextDouble();
        double imc = peso / (estatura * estatura);
        System.out.println("Su IMC es de :" + imc);
        String situacion;
        if (imc < 18.5) {
            situacion = "Bajo peso";
        } else if (imc < 25) {
            situacion = "Peso normal";
        } else if (imc < 27) {
            situacion = "Sobre peso grado 1°";
        } else if (imc < 30) {
            situacion = "Sobre peso grado 2°";
        } else if (imc < 35) {
            situacion = "Obesidad tipo 1";
        } else if (imc < 40) {
            situacion = "Obesidad tipo 2";
        } else if (imc < 50) {
            situacion = "Obesidad tipo 3(Morbida)";
        } else {
            situacion = "Obesidad extrema";
        }
        return "Situacion "+situacion;
    }
    public static void F1(){
        Scanner cantidad= new Scanner(System.in);
        Random vueltas= new Random();
        System.out.println("Ingrese el numero de pilotos: ");
        int n = cantidad.nextInt();
        String[]pilotos= new String[n];
        int[]tiempos =new int[n];
        for (int i=0; i<n;i++){
            System.out.println("Nombre del piloto: ");
            pilotos[i]=cantidad.next();
            tiempos[i]=vueltas.nextInt((100-50)+1)+50;
        }
        //orden tiempos
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1-i;j++){
                if (tiempos[j]>tiempos[j+1]){
                    int tempTiempo= tiempos[j];
                    tiempos[j]=tiempos[j+1];
                    tiempos[j+1]= tempTiempo;
                    String tempPiloto=pilotos[j];
                    pilotos[j]=pilotos[j+1];
                    pilotos[j+1]=tempPiloto;
                }
            }
        }
        System.out.println("\n===RESULTADOS DE LA CARRERA=== ");
        for (int i=0;i<n;i++){
            System.out.println((i+1)+"°Lugar: "+ pilotos[i]+ " - Tiempo: " + tiempos[i]+ "s");
        }
    }
}