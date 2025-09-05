import java.util.Random;

public class Main {
    public static void main(String[] args) {
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
                segundo = "Dado2 ( " + sumaDado2+ ")";
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
}