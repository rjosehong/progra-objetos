import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Saldo saldo = new Saldo();

        double diez = 0.10;
        double quince = 0.15;
        double veinte = 0.20;
        double veinticinco = 0.25;
        double saldito = saldo.getSaldos();
        
        while(true){
            System.out.println("Menú\n1. Jugar una vez (cuesta Q4.00)\n2. Ver saldo\n3. Salir del Bingo\n");
            System.out.print("Que opción quiere?: ");
            int opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                Numeros numeros = new Numeros();
                int suma1y2 = numeros.getNumero1() + numeros.getNumero2();
                int suma1y3 = numeros.getNumero1() + numeros.getNumero3();
                int suma2y3 = numeros.getNumero2() + numeros.getNumero3();
                saldito -= 4;

                if (numeros.getNumero1() % 2 == 0 && numeros.getNumero2() % 2 == 0){
                    if (suma1y2 > 700){
                        saldito = saldo.getSaldos() + ((numeros.getNumero1()+numeros.getNumero2())*diez);
                        System.out.println("Usted ganó: " + saldo.getSaldos() + ((numeros.getNumero1()+numeros.getNumero2())*diez)); 
                    }
                    else if (500 < suma1y2 && suma1y2 < 700) {
                        saldito = saldo.getSaldos() + ((numeros.getNumero1()+numeros.getNumero2())*veinte);
                        System.out.println("Usted ganó: " + saldo.getSaldos() + ((numeros.getNumero1()+numeros.getNumero2())*veinte));
                    }
                    else if (500 < numeros.getNumero1() || 500 < numeros.getNumero2()){
                        saldito = saldo.getSaldos() + ((numeros.getNumero1()+numeros.getNumero2())*quince);
                        System.out.println("Usted ganó: " + saldo.getSaldos() + ((numeros.getNumero1()+numeros.getNumero2())*quince));
                    }
                    else if (suma1y2 < 500){
                        saldito = saldo.getSaldos() + ((numeros.getNumero1()+numeros.getNumero2())*veinticinco);
                        System.out.println("Usted ganó: " + saldo.getSaldos() + ((numeros.getNumero1()+numeros.getNumero2())*veinticinco));
                    }
                }
                else if (numeros.getNumero1() % 2 == 0 && numeros.getNumero3() % 2 == 0){
                    if (suma1y3 > 700){
                        saldito = saldo.getSaldos() + ((numeros.getNumero1()+numeros.getNumero3())*diez);
                        System.out.println("Usted ganó: " + saldo.getSaldos() + ((numeros.getNumero1()+numeros.getNumero3())*diez));
                    }
                    else if (500 < suma1y3 && suma1y3 < 700) {
                        saldito = saldo.getSaldos() + ((numeros.getNumero1()+numeros.getNumero3())*veinte);
                        System.out.println("Usted ganó: " + saldo.getSaldos() + ((numeros.getNumero1()+numeros.getNumero3())*veinte));
                    }
                    else if (500 < numeros.getNumero1() || 500 < numeros.getNumero3()){
                        saldito = saldo.getSaldos() + ((numeros.getNumero1()+numeros.getNumero3())*quince);
                        System.out.println("Usted ganó: " + saldo.getSaldos() + ((numeros.getNumero1()+numeros.getNumero3())*quince));
                    }
                    else if (suma1y3 < 500){
                        saldito = saldo.getSaldos() + ((numeros.getNumero1()+numeros.getNumero3())*veinticinco);
                        System.out.println("Usted ganó: " + saldo.getSaldos() + ((numeros.getNumero1()+numeros.getNumero3())*veinticinco));
                    }
                }
                else if (numeros.getNumero2() % 2 == 0 && numeros.getNumero3() % 2 == 0){
                    if (suma2y3 > 700){
                        saldito = saldo.getSaldos() + ((numeros.getNumero2()+numeros.getNumero3())*diez);
                        System.out.println("Usted ganó: " + saldo.getSaldos() + ((numeros.getNumero2()+numeros.getNumero3())*diez));
                    }
                    else if (500 < suma2y3 && suma2y3 < 700) {
                        saldito = saldo.getSaldos() + ((numeros.getNumero2()+numeros.getNumero3())*veinte);
                        System.out.println("Usted ganó: " + saldo.getSaldos() + ((numeros.getNumero2()+numeros.getNumero3())*veinte));
                    }
                    else if (500 < numeros.getNumero2() || 500 < numeros.getNumero3()){
                        saldito = saldo.getSaldos() + ((numeros.getNumero2()+numeros.getNumero3())*quince);
                        System.out.println("Usted ganó: " + saldo.getSaldos() + ((numeros.getNumero2()+numeros.getNumero3())*quince));
                    }
                    else if (suma2y3 < 500){
                        saldito = saldo.getSaldos() + ((numeros.getNumero2()+numeros.getNumero3())*veinticinco);
                        System.out.println("Usted ganó: " + saldo.getSaldos() + ((numeros.getNumero2()+numeros.getNumero3())*veinticinco));
                    }
                }
                else {
                    System.out.println("Necesitas al menos dos números pares");
                }
                break;

                case 2:
                System.out.print(saldito);
                break;
                
                case 3:
                System.out.print("bye");
                break;
            }
        }
    }
}
