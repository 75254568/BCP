import java.util.Random;
import java.util.Scanner;

public class kevin {
    public String fPrestamo(Scanner cat) {
        String[] fecha_pago = {" 02 de cada mes", "15 de cada mes", "28 de cada mes"};
        String[] cuotas = {"5 cuotas", "10 cuotas", "15 cuotas"};
        Random random = new Random();
        int s = random.nextInt(cuotas.length);
        String nombre, correo, nombre1, correo1;
        int monto, dni, dni1, clave, clave1, interes, monto_5, monto_total;
        long N_tarjeta, N_tarjeta1;
        System.out.println("-------BIENVENIDO A LA CUENTA DE PRESTAMO------");
        System.out.println("ingrese sus datos");
        System.out.println("ingrese su nombre");
        nombre = cat.nextLine();
        System.out.println("ingrese su DNI");
        dni = cat.nextInt();
        System.out.println("ingrese su correo");
        correo = cat.nextLine();
        correo = cat.nextLine();
        System.out.println("ingrese su numero de tarjeta");
        N_tarjeta = cat.nextLong();
        System.out.println("ingrese su clave de 6 digitos");
        clave = cat.nextInt();


        System.out.println("DATOS GUARDADOS EXITOSAMENTE");
        System.out.println("su nombre:" + nombre + "con DNI:" + dni);
        System.out.println("con correo:" + correo);
        System.out.println("Nro de tarjeta:" + N_tarjeta + "con clave:" + clave);
        System.out.println("ingrese el monto del prestamo");
        monto = cat.nextInt();
        for (int i = 0; i < fecha_pago.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + fecha_pago[i]);
        }
        System.out.println("---VERIFIQUE SU IDENTIDAD----");
        System.out.println("ingrese su nombre");
        nombre1 = cat.nextLine();
        System.out.println("ingrese su dni");
        dni1 = cat.nextInt();
        System.out.println("ingrese su correo");
        correo1 = cat.nextLine();
        correo1 = cat.nextLine();
        if (correo.equals(correo1) ) {// aca no se como compararlo, me olvide ;(
            System.out.println("ingrese su numero de tarjeta");
            N_tarjeta1 = cat.nextInt();
            System.out.println("ingrese su clave de 6 digitos");
            clave1 = cat.nextInt();
            if (N_tarjeta == N_tarjeta1 && clave == clave1) {
                System.out.println("su pago sera en  " + cuotas[s]);
                switch (cuotas[s]) {
                    case "1. 5 cuotas":
                        monto_5 = monto / 5;
                        interes = monto / 10;
                        monto_total = monto_5 + interes;
                        System.out.println("usted va a pagar" + monto_total + "todos los " + fecha_pago);
                        System.out.println("su prestamo a sido exitoso");
                        System.out.println("-----Gracias por confiar en BCP para tus prestamos");
                        break;
                    case "2. 10 cuotas":
                        monto_5 = monto / 10;
                        interes = monto / 10;
                        monto_total = monto_5 + interes;
                        System.out.println("usted va a pagar" + monto_total + "todos los " + fecha_pago);
                        System.out.println("su prestamo a sido exitoso");
                        System.out.println("-----Gracias por confiar en BCP para tus prestamos");
                        break;
                    case "3. 15 cuotas":
                        monto_5 = monto / 15;
                        interes = monto / 10;
                        monto_total = monto_5 + interes;
                        System.out.println("usted va a pagar" + monto_total + "todos los " + fecha_pago);
                        System.out.println("su prestamo a sido exitoso");
                        System.out.println("-----Gracias por confiar en BCP para tus prestamos");
                        break;
                }


            }

        } else {
            System.out.println("contraseña o correo incorrectos");

        } return null;
    }
}