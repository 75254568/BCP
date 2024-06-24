import java.util.Scanner;

public class bcp {
    public String fMenu() {
        Scanner BcP = new Scanner(System.in);
        String opcion;
        System.out.printf("Bienvenido a BCP \n");
        System.out.printf("En que te puedo ayudar hoy\n");
        System.out.printf("1: Solicitar un prestamo\n");
        System.out.printf("2: Adelantar sueldo\n");
        System.out.printf("3: Trajeta\n");
        System.out.printf("4: Chat bot\n");
        opcion = BcP.nextLine();
        switch (opcion) {
            case "1":
                this.fPrestamo();
                break;
            case "2":
                this.fAdelanto();
                break;
            case "3":
                this.fTarjetas();
                break;
            case "4":
                this.fChatbot();
                break;
            default:
                System.out.printf("Esa opcion no esta disponible escriba otra opcion\n");
        }

        return null;
    }

    public String fCuenta() {
        String nombres, ape_pat, ape_mat, email_in, email, contraseña, est_civ,
                celular, sexo, contraseña_in, fec_nac, dni;
        Scanner bcp = new Scanner(System.in);
        System.out.println("---BIENVENIDO A BCP---\n");
        System.out.println("---Crear cuenta----\n");
        System.out.println("Ingrese sus nombres\n");
        nombres = bcp.nextLine();
        System.out.println("Ingrese apellido paterno\n");
        ape_pat = bcp.nextLine();
        System.out.println("Ingrese apellido materno\n");
        ape_mat = bcp.nextLine();
        System.out.printf("Ingrese su DNI\n");
        dni = bcp.nextLine();
        System.out.println("Ingrese su email\n");
        email_in = bcp.nextLine();
        System.out.println("Ingrese su estado civil\n");
        est_civ = bcp.nextLine();
        System.out.println("Ingrese su número de celular\n");
        celular = bcp.nextLine();
        System.out.println("Ingrese su sexo\n");
        sexo = bcp.nextLine();
        System.out.println("Ingrese su fecha de nacimiento\n");
        fec_nac = bcp.nextLine();
        System.out.println("Ingrese una contraseña\n");
        contraseña_in = bcp.nextLine();
        System.out.println("---DATOS REGISTRADOS SATISFACTORIAMENTE---\n");
        System.out.println("Ud es: " + nombres + "" + ape_pat + "" + ape_mat);
        System.out.println("Sus datos guardados son: " + est_civ + "" + celular + "" + sexo + "" + fec_nac);
        System.out.println("---- INICIAR SESION---\n");
        System.out.println("Ingrese su email\n");
        email = bcp.nextLine();
        System.out.println("Ingrese su contraseña\n");
        contraseña = bcp.nextLine();
        if (email.equals(email_in) && contraseña.equals(contraseña_in)) {
            System.out.println("Bienvenido a BCP\n");
        } else {
            System.out.println("Contraseña o email no válidos\n");
        }
        return null;
    }

    public String fSaldo() {
        Scanner bobi = new Scanner(System.in);
        double saldo = 0;
        String opcion;
        do {
            System.out.println("\nBienvenido ¿que desea consultar?");
            System.out.println("1. Consultar saldo\n");
            System.out.println("2. Depositar dinero\n");
            System.out.println("3. Retirar dinero\n");
            System.out.println("4. Salir\n");
            System.out.print("Ingrese la opción deseada: \n");
            opcion = bobi.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("\nSu saldo actual es: $" + saldo);
                    break;
                case "2":
                    System.out.print("Ingrese la cantidad a depositar: $\n");
                    double deposito = bobi.nextDouble();
                    saldo += deposito;
                    System.out.println("Se han depositado $" + deposito + " en su cuenta.\n");
                    break;
                case "3":
                    System.out.print("Ingrese la cantidad a retirar: $\n");
                    double retiro = bobi.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("Fondos insuficientes. No se puede realizar el retiro.\n");
                    } else {
                        saldo -= retiro;
                        System.out.println("Se han retirado $" + retiro + " de su cuenta.\n");
                    }
                    break;
                case "4":
                    System.out.println("Gracias por utilizar nuestro servicio. ¡Hasta luego!\n");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.\n");
            }
            bobi.nextLine();
        } while (!opcion.equals("4"));
        return null;
    }

    public String fTarjetas() {

        return null;
    }

    public String fPrestamo() {

        return null;
    }

    public String fAdelanto() {

        return null;
    }

    public String fChatbot() {
        Scanner pepa = new Scanner(System.in);
        String opcion;
        System.out.printf("\nBienvenido a chat bot de BCP");
        System.out.printf("\nEsoja una de las opciones");
        System.out.printf("1: Cuentas\n");
        System.out.printf("2: Credito personal\n");
        System.out.printf("3: Seguro BCP\n");
        System.out.printf("4: Pregunatas frecuentes\n");
        opcion = pepa.nextLine();
        switch (opcion) {
            case "1":
                System.out.printf("1: Saldo de mi cuenta\n");
                System.out.printf("2: Abrir una cuenta\n");
                System.out.printf("3: Conocer los tipos de cuentas\n");
                opcion = pepa.nextLine();
                switch (opcion) {
                    case "1":
                        this.fSaldo();
                        break;
                    case "2":
                        this.fCuenta();
                        break;
                    case "3":
                        System.out.printf("1. Cuenta Digital\n");
                        System.out.printf("2. Cuenta Sueldo\n");
                        System.out.printf("3. Cuenta CTS\n");
                        System.out.printf("4. Cuenta Premio\n");
                        System.out.printf("5. Cuenta Ilimitada\n");
                        opcion = pepa.nextLine();
                        switch (opcion) {
                            case "1":
                                System.out.printf("Si haces múltiples operaciones digitales, la Cuenta Digital es para ti. " +
                                        " Estos son sus beneficios:\n");
                                System.out.printf("▪ No cobra mantenimiento.\n");
                                System.out.printf("▪ Operaciones sin costo a través de Banca por Internet, Banca Móvil y Yape.\n");
                                System.out.printf("▪ Depósitos y retiros sin costo a nivel nacional en Cajeros y Agentes BCP.\n");
                                System.out.printf("▪ Descarga gratuita de tu Estado de Cuenta por Banca por Internet, " +
                                        "Banca Móvil o Plataforma Digital.\n");
                                System.out.printf("▪ 1 depósito sin costo al mes por Ventanillas.\n");
                                break;
                            case "2":
                                System.out.printf("¿Qué te gustaría saber sobre la Cuenta Sueldo BCP?\n");
                                System.out.printf("1. Beneficios Cuenta Sueldo\n");
                                System.out.printf("2. Adelanto de sueldo\n");
                                opcion = pepa.nextLine();
                                switch (opcion) {
                                    case "1":
                                        System.out.printf("¡Disfruta de descuentos exclusivos de hasta el 70%! \n" +
                                                "Conoce los centros afiliados a la Cuenta Sueldo BCP ingresando a: \n" +
                                                "https://www.viabcp.com/beneficios/cuenta-sueldo\n");
                                        System.out.printf("Para abrir tu Cuenta Sueldo BCP forma sencilla y segura, \n" +
                                                "ingresa a nuestra web: \n" +
                                                "https://www.abretucuenta.viabcp.com/#/preferencias?codProd=CTASLD\n");
                                        break;
                                    case "2":
                                        this.fAdelanto();
                                        break;
                                    default:
                                        System.out.printf("Esa opcion es invalida\n");
                                }
                            case "3":
                                System.out.printf("Traslada tu CTS al BCP y recibe una súper tasa. \n");
                                System.out.printf("Entérate de todos los detalles en nuestra web:\n" +
                                        "https://www.viabcp.com/campana-traslado-cts-sorteo\n");
                                break;
                            case "4":
                                System.out.printf("¡Participa por 1 MILLÓN de soles abriendo tu Cuenta Premio!\n");
                                System.out.printf("Solo realiza un depósito de S/ 1,000 o $ 300 y obtén estos beneficios:\n");
                                System.out.printf("▪ Operaciones ilimitadas por Ventanillas.\n");
                                System.out.printf("▪ Operaciones sin costo a través de Banca por Internet, Banca Móvil y Yape.\n");
                                System.out.printf("▪ Depósitos y retiros sin costo a nivel nacional en Cajeros y Agentes BCP.\n");
                                System.out.printf("▪ Descarga gratuita de tu Estado de Cuenta por Banca por Internet, \n" +
                                        "Banca Móvil o Plataforma Digital.\n");
                                System.out.printf("▪ Retiros ilimitados en cajeros de otras instituciones sin costo a nivel nacional.\n");
                                break;
                            case "5":
                                System.out.printf("Haz tus operaciones sin límites por solo S/ 12.00 o $ 4.80 al mes. \n" +
                                        "La Cuenta Ilimitada tiene estos beneficios:\n");
                                System.out.printf("▪ Operaciones ilimitadas por Ventanillas.\n");
                                System.out.printf("▪ Operaciones sin costo a través de Banca por Internet, Banca Móvil y Yape.\n");
                                System.out.printf("▪ Depósitos y retiros sin costo a nivel nacional en Cajeros y Agentes BCP.\n");
                                System.out.printf("▪ Descarga gratuita de tu Estado de Cuenta por Banca por Internet, \n" +
                                        "Banca Móvil o Plataforma Digital.\n");
                                System.out.printf("▪ Retiros ilimitados en cajeros de otras instituciones sin costo a nivel nacional.\n");
                                break;
                        }
                        break;

                    default:
                        System.out.printf("Esa opcion no esta disponible\n");
                }
            case "2":
                System.out.printf("Esta es la información sobre Crédito Efectivo.\n");
                System.out.printf("1. Quiero información general sobre Crédito Efectivo\n");
                System.out.printf("2. Quiero ver mis Créditos Personales\n");
                opcion = pepa.nextLine();
                switch (opcion) {
                    case "1":
                        System.out.printf("Para conocer más sobre Crédito Efectivo, ingresa a nuestra web:\n" +
                                "https://www.viabcp.com/creditos/credito-efectivo\n");
                        break;
                    case "2":
                        System.out.printf("Ingresa a nuestra web y conoce los requisitos para adquirir un Préstamo Personal:\n" +
                                "https://www.viabcp.com/creditos/credito-efectivo/prestamo-personal-bcp\n");
                        break;
                    default:
                        System.out.printf("Esa opicion es invalida\n");
                }
                break;
            case "3":
                System.out.printf("Aquí puedes revisar información sobre Seguros.\n");
                System.out.printf("1. ¿Cuál es la cobertura de los Seguros BCP?\n");
                System.out.printf("3. ¿Qué pasa si no pago mi Seguro BCP?\n");
                opcion = pepa.nextLine();
                switch (opcion) {
                    case "1":
                        System.out.printf("Elige un seguro para ver su cobertura:\n");
                        System.out.printf("1. Seguro Protección de Tarjetas \n");
                        System.out.printf("2. Seguro Protección de Tarjetas Plus \n");
                        System.out.printf("3. Seguro Múltiple \n");
                        opcion = pepa.nextLine();
                        switch (opcion) {
                            case "1":
                                System.out.printf("Toma en cuenta que tienes el Seguro de Protección de Tarjetas \n" +
                                        "solo si lo has adquirido antes de enero 2020. Si quieres ver el detalle \n" +
                                        "de tus seguros, escribe mis seguros.\n");
                                break;
                            case "2":
                                System.out.printf("El Seguro de Protección de Tarjetas protege hasta por S/ 25,000 \n" +
                                        "todas tus tarjetas del BCP y tarjetas de crédito de otros bancos en los siguientes casos: \n" +
                                        "robo, pérdida, engaños en internet o cambiazo.\n");
                                break;
                            case "3":
                                System.out.printf("El Seguro Múltiple te brinda respaldo económico en caso de accidentes, \n" +
                                        "hospitalización por enfermedades o fallecimiento. El beneficio lo recibirás tú y tu familia, \n" +
                                        "dependiendo del saldo promedio de tu cuenta afiliada.\n");
                                break;
                            default:
                                System.out.printf("Esa opcion no esta disponible\n");
                        }
                        break;
                    case "2":
                        System.out.printf("Si no pagas tu seguro por más de tres meses consecutivos, \n" +
                                "será anulado y perderás la cobertura.\n");
                        break;
                    default:
                        System.out.printf("Esa opion es invalida\n");
                }
                break;
            case "4":
                System.out.printf("Para ofrecerte opciones según tus necesidades, escribe el número de tu elección:\n");
                System.out.printf("1. Soy cliente BCP\n");
                System.out.printf("2. No soy cliente BCP\n");
                opcion = pepa.nextLine();
                switch (opcion) {
                    case "1":
                        System.out.printf("1. Bloqueos\n");
                        System.out.printf("2. Problemas con productos y canales\n");
                        System.out.printf("3. Conoce nuestros canales de atención\n");
                        opcion = pepa.nextLine();
                        switch (opcion) {
                            case "1":
                                System.out.printf("Para bloquear tu tarjeta te vamos a comunicar con un asesor \n" +
                                        "especializado por este chat.\n");
                                break;
                            case "2":
                                System.out.printf("1. Problemas con un producto\n");
                                System.out.printf("2. Problemas con mis saldos\n");
                                opcion = pepa.nextLine();
                                switch (opcion) {
                                    case "1":
                                        System.out.printf("Cual fue el problema\n");
                                        System.out.printf("1. Mi tarjeta está bloqueada\n");
                                        System.out.printf("2. Rechazaron mi compra por internet\n");
                                        opcion = pepa.nextLine();
                                        switch (opcion) {
                                            case "1":
                                                System.out.printf("Recuerda que el banco puede bloquear tu tarjeta por \n" +
                                                        "vencimiento del plástico o porque detectó algún movimiento sospechoso. \n" +
                                                        "Seguridad primero\n");
                                                break;
                                            case "2":
                                                System.out.printf("Para poder realizar compras por Internet es necesario \n" +
                                                        "que actives esta opción por Banca Móvil. Para ello, sigue estos pasos:\n");
                                                System.out.printf("1) Inicia sesión en Banca Móvil y selecciona Configuración.\n");
                                                System.out.printf("2) Elige Configuración de Tarjeta.\n");
                                                System.out.printf("3) Activa la opción de Compras por internet.\n");
                                                System.out.printf("4) Confirma la operación con tu Token Digital y ¡listo!\n");
                                                System.out.printf("Por tu seguridad, activa esta opción solo para realizar \n" +
                                                        "la compra y luego desactívala. Así evitarás ser víctima de fraudes.\n");
                                                break;
                                            default:
                                                System.out.printf("Opcion invalida\n");
                                        }
                                        break;
                                    case "2":
                                        System.out.printf("¿Qué ocurrió con tus saldos?\n");
                                        System.out.printf("1. Hay una compra que no hice\n");
                                        System.out.printf("2. Me descontaron dinero\n");
                                        opcion = pepa.nextLine();
                                        switch (opcion) {
                                            case "1":
                                                System.out.printf("Si crees que has sido víctima de un fraude, \n" +
                                                        "un asesor humano debe bloquear tu tarjeta. Recuerda que \n" +
                                                        "esta acción es irreversible.\n");
                                                break;
                                            case "2":
                                                System.out.printf("Los descuentos de dinero que ves en tu cuenta pueden ocurrir por estos motivos:\n");
                                                System.out.printf("▪ Una deuda de algún crédito que fue afiliado a tu tarjeta de débito.\n");
                                                System.out.printf("▪ Algún cobro afiliado a débito automático.\n");
                                                System.out.printf("▪ Cobros de comisiones.\n");
                                                System.out.printf("▪ Cobro recurrente afiliado a la tarjeta de débito.\n");
                                                break;
                                            default:
                                                System.out.printf("Opcion invalida\n");
                                        }
                                        break;
                                    default:
                                        System.out.printf("Opcion no disponible\n");
                                }
                                break;
                            case "3":
                                System.out.printf("¿Qué tipo de atención necesitas?\n");
                                System.out.printf("1. Atención presencial\n");
                                System.out.printf("2. Atención digital\n");
                                opcion = pepa.nextLine();
                                switch (opcion) {
                                    case "1":
                                        System.out.printf("Esta es la información sobre nuestros Canales Físicos. \n");
                                        System.out.printf("1. Agencias BCP\n");
                                        System.out.printf("2. Cajeros automáticos\n");
                                        System.out.printf("3. Agendar una cita en Agencia BCP\n");
                                        break;
                                    case "2":
                                        System.out.printf("Esta es la información sobre Canales Digitales.\n");
                                        System.out.printf("1. Banca Móvil\n");
                                        System.out.printf("2. Yape\n");
                                        System.out.printf("3. Aprende a usar el WhatsApp BCP\n");
                                        System.out.printf("4. Banca por Internet\n");
                                        break;
                                    default:
                                        System.out.printf("Opcion invalida\n");
                                }
                                break;
                            default:
                                System.out.printf("Opcion invalida\n");
                        }
                        break;
                    case "2":
                        System.out.printf("1. Conoce nuestro canales de atención");
                        System.out.printf("2. Tipo de cambio");
                        opcion = pepa.nextLine();
                        switch (opcion) {
                            case "1":
                                System.out.printf("¿Qué tipo de atención necesitas?\n");
                                System.out.printf("1. Atención presencial\n");
                                System.out.printf("2. Atención digital\n");
                                opcion = pepa.nextLine();
                                switch (opcion) {
                                    case "1":
                                        System.out.printf("Esta es la información sobre nuestros Canales Físicos. \n");
                                        System.out.printf("1. Agencias BCP\n");
                                        System.out.printf("2. Cajeros automáticos\n");
                                        System.out.printf("3. Agendar una cita en Agencia BCP\n");
                                        break;
                                    case "2":
                                        System.out.printf("Esta es la información sobre Canales Digitales.\n");
                                        System.out.printf("1. Banca Móvil\n");
                                        System.out.printf("2. Yape\n");
                                        System.out.printf("3. Aprende a usar el WhatsApp BCP\n");
                                        System.out.printf("4. Banca por Internet\n");
                                        break;
                                    default:
                                        System.out.printf("Opcion invalida\n");
                                        break;
                                }
                            case "2":
                                System.out.printf("Ingresa a nuestra web y aprende cómo ver el tipo de cambio por Banca Móvil:\n" +
                                        "https://www.viabcp.com/tipodecambio/dolares\n");
                                break;
                            default:
                                System.out.printf("Esa opcion no esta disponible\n");
                        }
                        break;
                    default:
                        System.out.printf("Esa opcion no esta disponible\n");
                }
        }
        return null;
    }
    public static void main(String[]args){
        bcp mani = new bcp();
        mani.fMenu();
        mani.fCuenta();
        mani.fSaldo();
        mani.fTarjetas();
        mani.fPrestamo();
        mani.fAdelanto();
        mani.fChatbot();
    }
}