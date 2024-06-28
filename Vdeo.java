import java.io.File;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Vdeo {
    //Lovi General
    private String T_auto, modelo;
    private int anioFabricacion;
    private int cantidad, opc;
    private String op;
    //LOVI
    Scanner resident = new Scanner(System.in);
    String[] Usuarios = {"kevin", "mathias", "abraham", "william"};
    String[] Contraseñas = {"1234", "4321", "2341", "9876"};
    String[] Tarjetas_Debito = {"Visa Clasica", "Visa Light", "Visa Latam Pass"};
    String[] Tarjetas_Credito = {"Visa Clasica BCP", "Visa Clasica Latam Pass"};
    String[] despedida = {"Ganamos todos o perdemos todos", "Queremos ayudarte a encontrar lo que necesites."};
    String[] Anuncios = {"Comprar entradas para la Copa America", "Gana premios pagando desde la app", "Boletos para el concierto de Libido "};
    String[] Num_Tarjeta = {"3242-1235-2131-3434", "6456-8793-3467-6754", "4366-3567-1230-7543", "1243-4876-3521-1321"};
    Random random = new Random();
    int America = random.nextInt(Anuncios.length);
    int Number = random.nextInt(Num_Tarjeta.length);
    double precio = 20;
    String[] carrito = new String[Tarjetas_Debito.length];
    String[] carrito_extra = new String[Tarjetas_Credito.length];
    String nombre, dni, lugar;
    int opcion;
    String names, contra;
    String[] lineas = new String[1000];
    int contadorlineas = 0;

    //menu
    public String Inicio_Sesion() {
        System.out.println("-----Bienvenido  al BCP-------");
        for (int i = 0; i < Usuarios.length; i++) {
            System.out.println("Usuario " + (i + 1) + " : " + Usuarios[i]);
        }
        System.out.println("Elija una de los usuarios:");
        names = resident.nextLine();
        switch (names) {
            case "kevin":
                this.Contraseña1();
                return null;
            case "mathias":
                this.Contraseña2();
                return null;
            case "abraham":
                this.Contraseña3();
                return null;
            case "willian":
                this.Contraseña4();
                return null;
            default:
                System.out.println("Incorrecto");
                this.Inicio_Sesion();
        }


        return null;
    }

    public void Contraseña1() {
        System.out.println("------Escriba su contraseña:------");
        contra = resident.nextLine();
        if (contra.matches("\\d{4}")) {
            if (contra.equals(Contraseñas[0]))
                System.out.println("BIenvenido" + "\n" + Usuarios[0]);
            this.MenuGeneral();


        } else {
            System.out.println("Contraeña incorrecta:");
            this.Inicio_Sesion();
        }


    }

    public void Contraseña2() {
        System.out.println("------Escriba su contraseña:------");
        contra = resident.nextLine();
        if (contra.matches("\\d{4}")) {
            if (contra.equals(Contraseñas[1]))
                System.out.println("BIenvenido" + "\n" + Usuarios[1]);
            this.MenuGeneral();



        } else {
            System.out.println("Contraeña incorrecta:");

            this.Inicio_Sesion();
        }


    }

    public void Contraseña3() {
        System.out.println("------Escriba su contraseña:------");
        contra = resident.nextLine();
        if (contra.matches("\\d{4}")) {
            if (contra.equals(Contraseñas[2]))
                System.out.println("BIenvenido" + "\n" + Usuarios[2]);
            this.MenuGeneral();



        } else {
            System.out.println("Contraeña incorrecta:");
            this.Inicio_Sesion();
        }


    }

    public void Contraseña4() {
        System.out.println("------Escriba su contraseña:------");
        contra = resident.nextLine();
        if (contra.matches("\\d{4}")) {
            if (contra.equals(Contraseñas[3]))
                System.out.println("BIenvenido" + "\n" + Usuarios[3]);
            this.MenuGeneral();



        } else {
            System.out.println("Contraseña incorrecta:");
            this.Inicio_Sesion();
        }


    }

    public String MenuGeneral() {
        Scanner BcP = new Scanner(System.in);
        String opcion;
        System.out.printf("Bienvenido a BCP \n");
        System.out.printf("En que te puedo ayudar hoy\n");
        System.out.printf("1: Solicitar un prestamo\n");
        System.out.printf("2: Adelantar sueldo\n");
        System.out.printf("3: Trajeta\n");
        System.out.printf("4: Chat bot\n");
        System.out.println("5:Obten tu SOAT Digital\n");
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
                this.fChatBot();
                break;
            case "5":
                this.fSoat();

                break;


            default:
                System.out.printf("Esa opcion no esta disponible escriba otra opcion\n");
        }


        return null;
    }

    //KEVIN
    public String fPrestamo() {


        return null;

    }
    //WILLIAN

    public String fAdelanto() {
        return null;
    }

    //Mathias
    public String fTarjetas() {
        System.out.println("---------Elige la tarjeta que va contigo----------");
        System.out.println("Marque alguna de las siguientes opciones");
        System.out.println(" 1.- Tarjeta de Debito");
        System.out.println(" 2.- Tarjeta de Credito");
        System.out.println("3.-Regresar al Menu");
        opcion = resident.nextInt();
        resident.nextLine();
        switch (opcion) {
            case 1:
                this.fDebito();
                break;

            case 2:
                this.fCredito();
                break;
            case 3:
                this.MenuGeneral();
                break;


        }
        return null;
    }

    public void fDebito() {
        System.out.println("------ Tarjeta de Debito------------");
        System.out.println("Conoce ciertos beneficios:\n" + Anuncios[America]);
        System.out.println("Seleccione la tarjeta de su preferencia");
        for (int i = 0; i < Tarjetas_Debito.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + Tarjetas_Debito[i]);
        }
        opcion = resident.nextInt();
        resident.nextLine();
        switch (opcion) {
            case 1:

                System.out.println("Ud quiere la Tarjeta de Debito " + Tarjetas_Debito[0]);
                System.out.println("¿Desea continuar con el proceso de adquirir la tarjeta?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = resident.nextInt();
                resident.nextLine();
                if (opcion == 1) {
                    System.out.println("Listo, tu cuenta BCP fue creada");
                    System.out.println("Datos de su cuenta:");
                    this.fPago();
                    fPago();
                } else if (opcion == 2) {
                    this.fDebito();
                } else if (opcion == 3) {
                    this.fTarjetas();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 2:


                System.out.println("Usted eligio la tarjeta: " + Tarjetas_Debito[1]);
                System.out.println("¿Desea continuar con el proceso de adquirir la tajeta?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = resident.nextInt();
                resident.nextLine();
                if (opcion == 1) {
                    System.out.println("Listo, tu cuenta BCP fue creada");
                    System.out.println("Datos de su cuenta:");
                    this.fPago();
                } else if (opcion == 2) {
                    this.fDebito();
                } else if (opcion == 3) {
                    this.fTarjetas();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 3:

                System.out.println("Usted eligio la Tarjeta de Debito " + Tarjetas_Debito[2]);
                System.out.println("¿Desea continuar con el proceso de adquirir la tajeta?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = resident.nextInt();
                resident.nextLine();
                if (opcion == 1) {
                    System.out.println("Listo, tu cuenta BCP fue creada");
                    System.out.println("Datos de su cuenta:");
                    this.fPago();
                } else if (opcion == 2) {
                    this.fCredito();
                } else if (opcion == 3) {
                    this.fTarjetas();
                } else {
                    System.out.println("Opcion no válida");
                }


                break;

            default:
                System.out.println("Opcion no válida");
                this.fTarjetas();
                break;


        }


    }

    public void fCredito() {
        System.out.println("------ Tarjeta de Credito------------");
        System.out.println(" Conoce ciertos beneficios:\n" + Anuncios[America]);
        System.out.println("Seleccione la tarjeta de su preferencia");
        for (int i = 0; i < Tarjetas_Credito.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + Tarjetas_Credito[i]);
        }
        opcion = resident.nextInt();
        resident.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("Usted eligio la tarjeta: " + Tarjetas_Credito[0]);
                System.out.println("¿Desea continuar con el proceso de adquirir la tarjeta?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = resident.nextInt();
                resident.nextLine();
                if (opcion == 1) {
                    System.out.println("Listo, tu cuenta BCP fue creada");
                    System.out.println("Datos de su cuenta:");
                    this.fPago();
                } else if (opcion == 2) {
                    this.fCredito();
                } else if (opcion == 3) {
                    this.fTarjetas();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;

            case 2:

                System.out.println("Usted ha elegido la tarjeta de Credito" + Tarjetas_Credito[1]);
                System.out.println("¿Desea adquirir esta tarjeta?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = resident.nextInt();
                resident.nextLine();
                if (opcion == 1) {
                    System.out.println("Listo, tu cuenta BCP fue creada");
                    System.out.println("Datos de su cuenta:");
                    this.fPago();
                } else if (opcion == 2) {
                    this.fCredito();
                } else if (opcion == 3) {
                    this.fTarjetas();
                } else {
                    System.out.println("Opcion no válida");
                }

                break;
            default:
                System.out.println("Opcion no válida");
                this.fTarjetas();
                break;


        }

    }


    public void fPago() {
        System.out.println("Listo su tarjeta fue creda ");
        System.out.println("---------Ya puede usarla--------");
        System.out.println(" Nombres :" + nombre);
        System.out.println("Dni:" + dni);
        System.out.println("Lugar de mayor uso:" + lugar);
        System.out.println(" Numero de Tarjeta :" + Num_Tarjeta[Number]);
        System.out.println("En su cuenta se le agregara el monto de:s/" + precio + "por adquirir la tarjeta");
        System.out.println("Puedes recoger tu tarjeta en cualquiera de nuestras agencias de Lunes a Viernes de 9:00 a.m. a 06:00 p.m. y Sábados de 09:00 a.m. a 01:00 p.m.");
        this.fExportarBoleta();

    }

    public void fExportarBoleta() {
        try {
            File archivo = new File("D:\\boleta.txt");
            FileWriter escritor = new FileWriter(archivo);
            escritor.write("Listo su tarjeta fue creda ");
            escritor.write("---------Ya puede usarla--------");
            escritor.write(" Nombres :" + nombre);
            escritor.write("Dni:" + dni);
            escritor.write("Lugar de mayor uso:" + lugar);
            escritor.write(" Numero de Tarjeta :" + Num_Tarjeta[Number]);
            escritor.write("En su cuenta se le agregara el monto de:s/" + precio + "por adquirir la tarjeta");
            escritor.close();


        } catch (IOException factos) {
            System.out.println("Error al exportar la factura.");
            factos.printStackTrace();

        }

    }

    //Anthony
    public String fSoat() {
        return null;
    }


    //ABRAHAM
    public String fChatBot() {
        this.Menuchatbot();
        return null;
    }

    public String Menuchatbot() {
        System.out.printf("Bienvenido a CHATBOT de BCP\n");
        System.out.printf("Esoja una de las opciones\n");
        System.out.printf("1: Cuentas\n");
        System.out.printf("2: Credito personal\n");
        System.out.printf("3: Seguro BCP\n");
        System.out.printf("4: Libro de reclamaciones\n");
        System.out.printf("5: Ir al menu principal\n");
        opcion = resident.nextInt();
        resident.nextLine();
        switch (opcion) {

            case 1:
                this.fcuentas();
                break;

            case 2:
                this.fcreditopersonal();
                break;

            case 3:
                this.fseguro();
                break;

            case 4:
                this.freclamaciones();
                break;

            case 5:
                this.MenuGeneral();
                break;

            default:
                System.out.println("Opcion no válida\n");
                this.Menuchatbot();
                break;

        }
        return null;
    }

    public String fcuentas() {

        String[] inducaciones = {"▪ No cobra mantenimiento, ▪ Operaciones sin costo a través de Banca por Internet, Banca Móvil y Yape, ▪ Depósitos y retiros sin costo a nivel nacional en Cajeros y Agentes BCP, Descarga gratuita de tu Estado de Cuenta por Banca por Internet, Banca Móvil o Plataforma Digital."};
        String[] instrucciones = {"¡Disfruta de descuentos exclusivos de hasta el 70%!, Conoce los centros afiliados a la Cuenta Sueldo BCP ingresando a, https://www.viabcp.com/beneficios/cuenta-sueldo, Para abrir tu Cuenta Sueldo BCP forma sencilla y segura, ingresa a nuestra web:, https://www.abretucuenta.viabcp.com/#/preferencias?codProd=CTASL"};
        String[] opciones = {"Traslada tu CTS al BCP y recibe una súper tasa, Entérate de todos los detalles en nuestra web: https://www.viabcp.com/campana-traslado-cts-sorteo"};
        String[] pasos = {"▪ Operaciones ilimitadas por Ventanillas, ▪ Operaciones sin costo a través de Banca por Internet, Banca Móvil y Yape, Depósitos y retiros sin costo a nivel nacional en Cajeros y Agentes BCP, ▪ Descarga gratuita de tu Estado de Cuenta por Banca por Internet, Banca Móvil o Plataforma Digital, ▪ Retiros ilimitados en cajeros de otras instituciones sin costo a nivel nacional"};
        String[] beneficios = {"▪ Operaciones ilimitadas por Ventanillas, ▪ Operaciones sin costo a través de Banca por Internet, Banca Móvil y Yape, ▪ Depósitos y retiros sin costo a nivel nacional en Cajeros y Agentes BCP, ▪ Descarga gratuita de tu Estado de Cuenta por Banca por Internet, Banca Móvil o Plataforma Digital, ▪ Retiros ilimitados en cajeros de otras instituciones sin costo a nivel nacional"};

        System.out.println("Escoja una opcion");
        System.out.printf("1: Iniciar sesion\n");
        System.out.printf("2: Conocer los tipos de cuentas\n");
        System.out.println("3: Ir al menu principal\n");
        System.out.printf("4: Ir al menu de chatbot\n");
        opcion = resident.nextInt();
        switch (opcion) {

            case 1:
                this.Inicio_Sesion();
                break;

            case 2:
                System.out.printf("1. Cuenta Digital\n");
                System.out.printf("2. Cuenta Sueldo\n");
                System.out.printf("3. Cuenta CTS\n");
                System.out.printf("4. Cuenta Premio\n");
                System.out.printf("5. Cuenta Ilimitada\n");
                System.out.println("6. Ir al menu pruncipal\n");
                System.out.printf("7. Ir al menu de chatbot\n");
                System.out.printf("8. Ir al menu de cuentas\n");
                opcion = resident.nextInt();
                switch (opcion) {

                    case 1:
                        System.out.printf("Si haces múltiples operaciones digitales, la Cuenta Digital es para ti. " +
                                " Estos son sus beneficios:\n");
                        Arrays.sort(inducaciones);
                        this.Menuchatbot();
                        break;

                    case 2:
                        System.out.printf("¿Qué te gustaría saber sobre la Cuenta Sueldo BCP?\n");
                        System.out.printf("1. Beneficios Cuenta Sueldo\n");
                        System.out.printf("2. Adelanto de sueldo\n");
                        opcion = resident.nextInt();
                        switch (opcion) {
                            case 1:
                                Arrays.sort(instrucciones);
                                break;
                            case 2:
                                break;
                            default:
                                System.out.printf("Esa opcion es invalida\n");
                                this.Menuchatbot();
                        }

                    case 3:
                        Arrays.sort(opciones);
                        this.Menuchatbot();
                        break;

                    case 4:
                        System.out.printf("¡Participa por 1 MILLÓN de soles abriendo tu Cuenta Premio!\n");
                        System.out.printf("Solo realiza un depósito de S/ 1,000 o $ 300 y obtén estos beneficios:\n");
                        Arrays.sort(pasos);
                        this.Menuchatbot();
                        break;

                    case 5:
                        System.out.printf("Haz tus operaciones sin límites por solo S/ 12.00 o $ 4.80 al mes. \n" +
                                "La Cuenta Ilimitada tiene estos beneficios:\n");
                        Arrays.sort(beneficios);
                        this.Menuchatbot();
                        break;

                    case 6:
                        this.Menuchatbot();
                        break;

                    case 7:
                        this.Menuchatbot();
                        break;

                    case 8:
                        this.fcuentas();
                        break;

                    default:
                        System.out.println("Opcion invalida\n");
                }
                break;

            case 3:
                this.MenuGeneral();
                break;

            case 4:
                this.Menuchatbot();

            default:
                System.out.printf("Esa opcion no esta disponible\n");
        }
        return null;
    }

    public String fcreditopersonal() {
        System.out.printf("Esta es la información sobre Crédito Efectivo.\n");
        System.out.printf("1. Quiero información general sobre Crédito Efectivo\n");
        System.out.printf("2. Quiero ver mis Créditos Personales\n");
        System.out.printf("3. Ir al menu principal\n");
        System.out.printf("4. Ir al menu de chatbot\n");
        opcion = resident.nextInt();
        switch (opcion) {
            case 1:
                System.out.printf("Para conocer más sobre Crédito Efectivo, ingresa a nuestra web:\n" +
                        "https://www.viabcp.com/creditos/credito-efectivo\n");
                this.Menuchatbot();
                break;

            case 2:
                System.out.printf("Ingresa a nuestra web y conoce los requisitos para adquirir un Préstamo Personal:\n" +
                        "https://www.viabcp.com/creditos/credito-efectivo/prestamo-personal-bcp\n");
                this.Menuchatbot();
                break;

            case 3:
                this.MenuGeneral();
                break;

            case 4:
                this.Menuchatbot();

            default:
                System.out.printf("Esa opicion es invalida\n");
        }
        return null;
    }

    public String fseguro() {
        System.out.printf("Aquí puedes revisar información sobre Seguros.\n");
        System.out.printf("1. ¿Cuál es la cobertura de los Seguros BCP?\n");
        System.out.printf("2. ¿Qué pasa si no pago mi Seguro BCP?\n");
        System.out.printf("3. Ir la menu principal\n");
        System.out.printf("4. Ir al menu de chatbot\n");
        opcion = resident.nextInt();
        switch (opcion) {

            case 1:
                System.out.printf("Elige un seguro para ver su cobertura:\n");
                System.out.printf("1. Seguro Protección de Tarjetas \n");
                System.out.printf("2. seguro soat");
                System.out.printf("3. Ir al menu\n");
                System.out.printf("4. Ir al menu de chatbot\n");
                System.out.printf("5. Ir al menu de seguro\n");
                opcion = resident.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.printf("El Seguro de Protección de Tarjetas protege hasta por S/ 25,000 \n" +
                                "todas tus tarjetas del BCP y tarjetas de crédito de otros bancos en los siguientes casos: \n" +
                                "robo, pérdida, engaños en internet o cambiazo.\n");
                        this.Menuchatbot();
                        break;
                    case 2:
                        this.fSoat();
                        break;

                    case 3:
                        this.MenuGeneral();
                        break;

                    case 4:
                        this.Menuchatbot();

                    case 5:
                        this.fseguro();

                    default:
                        System.out.printf("Esa opcion no esta disponible\n");
                }
                break;

            case 2:
                System.out.printf("Si no pagas tu seguro por más de tres meses consecutivos, \n" +
                        "será anulado y perderás la cobertura.\n");
                this.Menuchatbot();
                break;

            case 3:
                this.MenuGeneral();
                break;

            case 4:
                this.Menuchatbot();

            default:
                System.out.printf("Esa opion es invalida\n");
        }
        return null;
    }


    public String freclamaciones() {
        MenuOpciones();
        return null;
    }

    public void MenuOpciones() {
        System.out.println("Libro de reclamaciones\n");
        while (true) {
            System.out.println("Opciones:\n");
            System.out.println("1: escribir reclamo\n");
            System.out.println("2: Mostrar reclamo\n");
            System.out.println("3: Guardar\n");
            System.out.println("4: Ir al menu principal\n");
            System.out.printf("5: Ir al menu de chatbot\n");
            System.out.print("Eliga una opción: \n");

            int opcion = resident.nextInt();
            resident.nextLine();

            if (opcion == 1) {
                System.out.print("Ingrese una línea de texto: \n");
                String line = resident.nextLine();
                if (contadorlineas < lineas.length) {
                    lineas[contadorlineas] = line;
                    contadorlineas++;
                } else {
                    System.out.println("Se ha alcanzado el límite.\n");
                }
            } else if (opcion == 2) {
                System.out.println("Contenido:\n");
                for (int i = 0; i < contadorlineas; i++) {
                    System.out.println(lineas[i]);
                }
            } else if (opcion == 3) {
                this.freclamaciones();
            } else if (opcion == 4) {
                this.MenuGeneral();
            } else if (opcion == 5) {
                this.Menuchatbot();
                break;
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.\n");
            }
        }
        ExportarBloc();
    }

    public String ExportarBloc() {
        try (FileWriter writer = new FileWriter("bloc_de_notas.txt\n")) {
            for (int i = 0; i < contadorlineas; i++) {
                writer.write(lineas[i] + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("El contenido se ha guardado en 'bloc_de_notas.txt'.\n");
        this.Menuchatbot();
        return null;
    }

    public static void main(String[] args) {
        Vdeo chiqui = new Vdeo();
        chiqui.Inicio_Sesion();
    }
}