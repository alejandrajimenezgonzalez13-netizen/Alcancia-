import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* Desarrollar un algoritmo que permita simular el funcionamiento de una alcancia en
        dicha alcancia se pueden guardar
        monedas de las siguentes denominaciones
        20,50,100,200,500,1000.
        No se pueden guardar billetes ni monedas de otras demominaciones
        el dueño de la alcancia le parece util conocer cuanto dinero tiene
        ahorrado sin romper la alcancia.
        es mas el quiere saber cuantas monedas tiene de cada demoniacion y cual es
        el monto acumulado por cada una de ellas.
        El sistema debe de contar con un menu de interacion que permita agregar monedas de cada
        una de las denominaciones contar cuantas monedas tiene de cada denominacion
        indagar cual es el valor acumulado por cada una de la denominaciones
        calcular el total del dinero ahorrado
        establecer una meta de ahorro mostrando el progreso.
         */
        Scanner teclado = new Scanner(System.in);

        int opcion;
        int moneda;
        int moneda1 = 0;
        int moneda2 = 0;
        int moneda3 = 0;
        int moneda4 = 0;
        int moneda5 = 0;
        int moneda6 = 0;
        int valorAd;
        int monedat = 0;
        int respuesta;
        int metal= 0;


        System.out.println(" Bienvenidos a tu alcancia");

        System.out.println("Estas son las opciones para tu alcancia");

        while (true){
            System.out.println(""" 
                    1. ahorrar.
                    2. Contar monedas.
                    3. Valor acumulado.
                    4. Total dinero.
                    5. meta de ahorro.""");

            System.out.println("Elige una opcion");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese monedas solo de las siguientes denominaciones");
                    System.out.println(""" 
                            1.20.
                            2.50.
                            3.100.
                            4.200.
                            5.500.
                            6.1000.
                            """);

                    moneda = teclado.nextInt();
                    switch (moneda) {
                        case 1:
                            System.out.println(" su moneda es 20");
                            moneda1 = moneda1 + 1;
                            break;
                        case 2:
                            System.out.println("su moneda es 50");
                            moneda2 = moneda2 + 1;
                            break;
                        case 3:
                            System.out.println("su moneda es 100");
                            moneda3 = moneda3 + 1;
                            break;
                        case 4:
                            System.out.println("su moneda es 200");
                            moneda4 = moneda4 + 1;
                            break;
                        case 5:
                            System.out.println("su moneda es 500");
                            moneda5 = moneda5 + 1;
                            break;
                        case 6:
                            System.out.println("su moneda es de 1000");
                            moneda6 = moneda6 + 1;
                            break;
                    }
                    System.out.println("Desea agregar otra moneda 1.si 2.no");
                    respuesta = teclado.nextInt();
                    switch (respuesta) {
                        case 1:
                            System.out.println("Dijite la otra moneda");
                            moneda = teclado.nextInt();
                            switch (moneda) {
                                case 1:
                                    System.out.println(" su moneda es 20");
                                    moneda1 = moneda1 + 1;
                                    break;
                                case 2:
                                    System.out.println("su moneda es 50");
                                    moneda2 = moneda2 + 1;
                                    break;
                                case 3:
                                    System.out.println("su moneda es 100");
                                    moneda3 = moneda3 + 1;
                                    break;
                                case 4:
                                    System.out.println("su moneda es 200");
                                    moneda4 = moneda4 + 1;
                                    break;
                                case 5:
                                    System.out.println("su moneda es 500");
                                    moneda5 = moneda5 + 1;
                                    break;
                                case 6:
                                    System.out.println("su moneda es de 1000");
                                    moneda6 = moneda6 + 1;
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("No desea incluir otra moneda");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("contaremos sus monedas");

                    System.out.println("moneda de 20:" + moneda1);

                    System.out.println("moneda de 50:" + moneda2);

                    System.out.println("moneda de 100:" + moneda3);

                    System.out.println("moneda de 500:" + moneda4);

                    System.out.println("moneda de 1000:" + moneda5);
                    break;
                case 3:
                    System.out.println("valor acumulado");
                    valorAd = moneda1 * 20;

                    valorAd = valorAd + (moneda2 * 50);

                    valorAd = valorAd + (moneda3 * 100);

                    valorAd = valorAd + (moneda4 * 200);

                    valorAd = valorAd + (moneda5 * 5000);

                    valorAd = valorAd + (moneda6 * 1000);
                    System.out.println("su valor acumulado es: " + valorAd);
                    break;
                case 4:
                    System.out.println("Total del dinero");
                    monedat = (moneda1*20)+(moneda2 * 50) +(moneda3 * 100) +(moneda4 * 200) + (moneda5 * 500)+(moneda6*1000);
                    System.out.println("el total del dinero es:" + monedat);
                    break;
                case 5:
                    System.out.println("Meta de ahorro");
                    System.out.println("Dijite  su meta de ahorro");
                    metal = teclado.nextInt();

                    if(monedat>=metal){
                        System.out.println("se cumplio su meta");
                    }
                    else{
                        System.out.println("no se cumplio la meta");
                    }
                    break;


            }
        }
    }
}
