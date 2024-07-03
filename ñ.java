import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ñ {
    //Lovi General
private String T_auto, modelo;
private int anioFabricacion;
        private int cantidad, opc;
private String op;
private static final String FILE_NAME = "usuarios.txt";
private static final Map<String, String> usuarios = new HashMap<>();
private static final Scanner scanner = new Scanner(System.in);
//LOVI
Scanner resident = new Scanner(System.in);
String[] Usuarios = {"kevin", "mathias", "abraham", "willian", "antoni"};
String[] Contraseñas = {"1234", "4321", "2341", "9876", "5432"};
int[] dnis = {60061661, 75254568, 60836936, 75073575, 73889258};
String[] Tarjetas_Debito = {"Visa Clasica", "Visa Light", "Visa Latam Pass", "Menu"};
String[] Tarjetas_Credito = {"Visa Clasica BCP", "Visa Clasica Latam Pass", "Menu"};
String[] despedida = {"Ganamos todos o perdemos todos", "Queremos ayudarte a encontrar lo que necesites."};
String[] Anuncios = {"Comprar entradas para la Copa America", "Gana premios pagando desde la app", "Boletos para el concierto de Libido "};
double[] saldos = {500.0, 1000.0, 750.0, 1200.0};
String[] Num_Tarjeta = {"3242-1235-2131-3434", "6456-8793-3467-6754", "4366-3567-1230-7543", "1243-4876-3521-1321"};
Random random = new Random();
int America = random.nextInt(Anuncios.length);
int Number = random.nextInt(Num_Tarjeta.length);
double precio = 20;
String[] carrito = new String[Tarjetas_Debito.length];
String[] carrito_extra = new String[Tarjetas_Credito.length];
        String nombre, Password, dni, lugar;
int opcion;
        String names, contra;
String[] lineas = new String[1000];
int contadorlineas = 0;
int currentUserIndex;

public static void main(String[] args) {
    Scanner resident = new Scanner(System.in);
    System.out.println("\nSeleccione una opción:");
    System.out.println("1. Iniciar sesión");
    System.out.println("2. Crear nueva cuenta");
    int numeritos = resident.nextInt();
    switch (numeritos) {
        case 1:
            Inicio_Sesion();
            break;
        case 2:
            crearNuevaCuenta();
            break;
        default:
            System.out.println("Opción inválida. Inténtelo nuevamente.");
    }
}


//menu William
private static void  Inicio_Sesion() {
    Scanner resident = new Scanner(System.in);
    String[] Usuarios = {"kevin", "mathias", "abraham", "willian", "antoni"};
    String[] Contraseñas = {"1234", "4321", "2341", "9876", "5432"};
    int[] dnis = {60061661, 75254568, 60836936, 75073575, 73889258};
    String[] Tarjetas_Debito = {"Visa Clasica", "Visa Light", "Visa Latam Pass", "Menu"};
    String[] Tarjetas_Credito = {"Visa Clasica BCP", "Visa Clasica Latam Pass", "Menu"};
    String[] despedida = {"Ganamos todos o perdemos todos", "Queremos ayudarte a encontrar lo que necesites."};
    String[] Anuncios = {"Comprar entradas para la Copa America", "Gana premios pagando desde la app", "Boletos para el concierto de Libido "};
    double[] saldos = {500.0, 1000.0, 750.0, 1200.0};
    String[] Num_Tarjeta = {"3242-1235-2131-3434", "6456-8793-3467-6754", "4366-3567-1230-7543", "1243-4876-3521-1321"};
    Random random = new Random();
    int America = random.nextInt(Anuncios.length);
    int Number = random.nextInt(Num_Tarjeta.length);
    double precio = 20;
    String[] carrito = new String[Tarjetas_Debito.length];
    String[] carrito_extra = new String[Tarjetas_Credito.length];
    String nombre, Password, dni, lugar;
    int opcion;
    String names, contra;
    String[] lineas = new String[1000];
    int contadorlineas = 0;
    int currentUserIndex;
    boolean usur = false;
    {
        do
        {
            System.out.println("Bienvenido a: \n");
            System.out.println("BBBBBBB     CCCCCC     PPPPPPP");
            System.out.println("BB    BB   CC    CC   PP     PP");
            System.out.println("BB    BB   CC         PP     PP");
            System.out.println("BBBBBBB    CC         PPPPPPP");
            System.out.println("BB    BB   CC         PP");
            System.out.println("BB    BB   CC    CC   PP");
            System.out.println("BBBBBBB     CCCCCC    PP\n");
            System.out.println("1.- Cuentas creadas");
            System.out.println("2.-Cuentas existentes");
            int frodo = resident.nextInt();
            if (frodo==1) {
                System.out.println("\nInicio de sesión");

                System.out.print("Ingrese su nombre de usuario: ");
                String nombreUsuario = scanner.nextLine().trim();

                if (!usuarios.containsKey(nombreUsuario)) {
                    System.out.println("Nombre de usuario incorrecto. Inténtelo nuevamente.");
                    return;
                }

                System.out.print("Ingrese su contraseña de 4 dígitos: ");
                String contraseña = scanner.nextLine().trim();

                if (usuarios.get(nombreUsuario).equals(contraseña)) {
                    System.out.println("Inicio de sesión exitoso. Bienvenido, " + nombreUsuario + "!");
                    MenuGeneral();
                    // Aquí podrías llamar a tu método MenuGeneral() si lo tienes implementado.
                } else {
                    System.out.println("Contraseña incorrecta. Inténtelo nuevamente.");
                }
            }
            else   {
                System.out.println("Escriba el nombre del usuario existente");
                String user = resident.nextLine();
                names = resident.nextLine();
                switch (names) {
                    case "kevin":
                        System.out.println("Escriba su contraseña de 4 digitos");
                        contra = resident.nextLine();
                        if (contra.matches("\\d{4}")) {
                            if (Arrays.asList(Contraseñas[0]).contains(contra)) {
                                System.out.println("Contraseña correcta");
                                System.out.println("Bienvenido " + Usuarios[0]);
                                usur = true;
                                MenuGeneral();
                            }
                        } else {
                            System.out.println("Nuestro sistema lo detecto como falsificador");
                            System.out.println("escriba bien la contraseña o llamaremos a la policia");
                        }
                        break;
                    case "abraham":
                        System.out.println("Escriba su contraseña de 4 digitos");
                        contra = resident.nextLine();
                        if (contra.matches("\\d{4}")) {
                            if (Arrays.asList(Contraseñas[1]).contains(contra)) {
                                System.out.println("Contraseña correcta");
                                System.out.println("Bienvenido " + Usuarios[1]);
                                usur = true;
                                MenuGeneral();

                            }
                        } else {
                            System.out.println("Nuestro sistema lo detecto como falsificador");
                            System.out.println("escriba bien la contraseña o llamaremos a la policia");
                        }
                        break;
                    case "mathias":
                        System.out.println("Escriba su contraseña de 4 digitos");
                        contra = resident.nextLine();
                        if (contra.matches("\\d{4}")) {
                            if (Arrays.asList(Contraseñas[2]).contains(contra)) {
                                System.out.println("Contraseña correcta");
                                System.out.println("Bienvenido " + Usuarios[2]);
                                usur = true;
                                MenuGeneral();

                            }
                        } else {
                            System.out.println("Nuestro sistema lo detecto como falsificador");
                            System.out.println("escriba bien la contraseña o llamaremos a la policia");
                        }
                        break;
                    case "willian":
                        System.out.println("Escriba su contraseña de 4 digitos");
                        contra = resident.nextLine();
                        if (contra.matches("\\d{4}")) {
                            if (Arrays.asList(Contraseñas[3]).contains(contra)) {
                                System.out.println("Contraseña correcta");
                                System.out.println("Bienvenido " + Usuarios[3]);
                                usur = true;
                                MenuGeneral();
                            }
                        } else {
                            System.out.println("Nuestro sistema lo detecto como falsificador");
                            System.out.println("escriba bien la contraseña o llamaremos a la policia");
                        }
                        break;
                    case "antoni":
                        System.out.println("Escriba su contraseña de 4 digitos");
                        contra = resident.nextLine();
                        if (contra.matches("\\d{4}")) {
                            if (Arrays.asList(Contraseñas[4]).contains(contra)) {
                                System.out.println("Contraseña correcta");
                                System.out.println("Bienvenido " + Usuarios[4]);
                                usur = true;
                                MenuGeneral();
                            }
                        } else {
                            System.out.println("Nuestro sistema lo detecto como falsificador");
                            System.out.println("escriba bien la contraseña o llamaremos a la policia");
                        }
                        break;
                    default:
                        System.out.println("incorrecto");
                        System.out.println("vuelva a intentarlo");
                }
            }

        } while(!usur);
    }


}

    private static void crearNuevaCuenta() {
        System.out.println("\nCreación de nueva cuenta");

        System.out.print("Ingrese un nombre de usuario único: ");
        String nuevoUsuario = scanner.nextLine().trim();

        if (usuarios.containsKey(nuevoUsuario)) {
            System.out.println("El nombre de usuario ya existe. Intente con otro.");
            return;
        }

        System.out.print("Ingrese una contraseña de 4 dígitos: ");
        String nuevaContraseña = scanner.nextLine().trim();

        if (!nuevaContraseña.matches("\\d{4}")) {
            System.out.println("La contraseña debe ser de exactamente 4 dígitos numéricos.");
            return;
        }

        usuarios.put(nuevoUsuario, nuevaContraseña);
        System.out.println("Nueva cuenta creada exitosamente para el usuario: " + nuevoUsuario);

        // Guardar la nueva cuenta en el archivo
        guardarCuentaEnArchivo(nuevoUsuario, nuevaContraseña);

        // Opción de volver al inicio o crear otra cuenta
        System.out.println("\n¿Qué desea hacer ahora?");
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Crear otra cuenta");
        int opcion = obtenerEntero("Ingrese el número de la opción: ");

        switch (opcion) {
            case 1:
                Inicio_Sesion();
                break;
            case 2:
                crearNuevaCuenta();
                break;
            default:
                System.out.println("Opción inválida. Saliendo del programa.");
                break;
        }
    }

    private static void guardarCuentaEnArchivo(String usuario, String contraseña) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(usuario + ":" + contraseña);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar la cuenta en el archivo: " + e.getMessage());
        }
    }

    private static void cargarUsuariosDesdeArchivo() {
        // Aquí puedes implementar la carga de usuarios desde el archivo usuarios.txt
        // Esto se puede hacer al inicio del programa para asegurar que los usuarios existentes estén cargados.
        // Por simplicidad, en este ejemplo no se implementa la carga desde archivo.
    }

    private static int obtenerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
    }

private static void MenuGeneral() {
    Scanner BcP = new Scanner(System.in);
    String opcion;
    System.out.printf("Bienvenido a BCP \n");
    System.out.printf("En que te puedo ayudar hoy\n");
    System.out.printf("1: Solicitar un Tranferir Dinero\n");
    System.out.printf("2: Cambiar Usuario\n");
    System.out.printf("3: Tarjeta\n");
    System.out.printf("4: Chat bot\n");
    System.out.println("5:Obten tu SOAT Digital\n");
    opcion = BcP.nextLine();
    switch (opcion) {
        case "1":
            fTransferirDinero();
            break;
        case "2":
            Inicio_Sesion();
            break;
        case "3":
            fTarjetas();
            break;
        case "4":
            fChatBot();
            break;
        case "5":
            fSoat();

            break;


        default:
            System.out.printf("Esa opcion no esta disponible escriba otra opcion\n");
    }
}

//KEVIN
private static void fTransferirDinero() {
    Scanner resident = new Scanner(System.in);
    String[] Usuarios = {"kevin", "mathias", "abraham", "willian", "antoni"};
    String[] Contraseñas = {"1234", "4321", "2341", "9876", "5432"};
    int[] dnis = {60061661, 75254568, 60836936, 75073575, 73889258};
    String[] Tarjetas_Debito = {"Visa Clasica", "Visa Light", "Visa Latam Pass", "Menu"};
    String[] Tarjetas_Credito = {"Visa Clasica BCP", "Visa Clasica Latam Pass", "Menu"};
    String[] despedida = {"Ganamos todos o perdemos todos", "Queremos ayudarte a encontrar lo que necesites."};
    String[] Anuncios = {"Comprar entradas para la Copa America", "Gana premios pagando desde la app", "Boletos para el concierto de Libido "};
    double[] saldos = {500.0, 1000.0, 750.0, 1200.0};
    String[] Num_Tarjeta = {"3242-1235-2131-3434", "6456-8793-3467-6754", "4366-3567-1230-7543", "1243-4876-3521-1321"};
    Random random = new Random();
    int America = random.nextInt(Anuncios.length);
    int Number = random.nextInt(Num_Tarjeta.length);
    double precio = 20;
    String[] carrito = new String[Tarjetas_Debito.length];
    String[] carrito_extra = new String[Tarjetas_Credito.length];
    String nombre, Password, dni, lugar;
    int opcion;
    String names, contra;
    String[] lineas = new String[1000];
    int contadorlineas = 0;
    int currentUserIndex=0;
    double saldo = saldos[currentUserIndex];
    saldos[currentUserIndex] = saldo;
    System.out.println("------ Transferir Dinero ------");
    System.out.println("Ingrese el nombre del usuario al que desea transferir:");
    String destinatario = resident.nextLine();
    if (Arrays.asList(Usuarios).contains(destinatario)) {
        int destIndex = Arrays.asList(Usuarios).indexOf(destinatario);
        System.out.println("Ingrese la cantidad a transferir:");
        double cantidad = resident.nextDouble();
        resident.nextLine();
        if (cantidad > 0 && cantidad <= saldos[currentUserIndex]) {
            saldos[currentUserIndex] -= cantidad;
            saldos[destIndex] += cantidad;
            System.out.println("Se han transferido $" + cantidad + " a " + destinatario);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    } else {
        System.out.println("Usuario no encontrado.");
    }
    MenuGeneral();
}
//Mathias
private static void fTarjetas() {
    Scanner resident = new Scanner(System.in);
    String[] Usuarios = {"kevin", "mathias", "abraham", "willian", "antoni"};
    String[] Contraseñas = {"1234", "4321", "2341", "9876", "5432"};
    int[] dnis = {60061661, 75254568, 60836936, 75073575, 73889258};
    String[] Tarjetas_Debito = {"Visa Clasica", "Visa Light", "Visa Latam Pass", "Menu"};
    String[] Tarjetas_Credito = {"Visa Clasica BCP", "Visa Clasica Latam Pass", "Menu"};
    String[] despedida = {"Ganamos todos o perdemos todos", "Queremos ayudarte a encontrar lo que necesites."};
    String[] Anuncios = {"Comprar entradas para la Copa America", "Gana premios pagando desde la app", "Boletos para el concierto de Libido "};
    double[] saldos = {500.0, 1000.0, 750.0, 1200.0};
    String[] Num_Tarjeta = {"3242-1235-2131-3434", "6456-8793-3467-6754", "4366-3567-1230-7543", "1243-4876-3521-1321"};
    Random random = new Random();
    int America = random.nextInt(Anuncios.length);
    int Number = random.nextInt(Num_Tarjeta.length);
    double precio = 20;
    String[] carrito = new String[Tarjetas_Debito.length];
    String[] carrito_extra = new String[Tarjetas_Credito.length];
    String nombre, Password, dni, lugar;
    int opcion;
    String names, contra;
    String[] lineas = new String[1000];
    int contadorlineas = 0;
    int currentUserIndex;
    System.out.println("---------Elige la tarjeta que va contigo----------");
    System.out.println("Marque alguna de las siguientes opciones");
    System.out.println(" 1.- Tarjeta de Debito");
    System.out.println(" 2.- Tarjeta de Credito");
    System.out.println("3.-Regresar al Menu");
    opcion = resident.nextInt();
    resident.nextLine();
    switch (opcion) {
        case 1:
            fDebito();
            break;

        case 2:
            fCredito();
            break;
        case 3:
            MenuGeneral();
            break;
        default:
            fTarjetas();


    }
}

    private static void fDebito() {

        Scanner resident = new Scanner(System.in);
        String[] Usuarios = {"kevin", "mathias", "abraham", "willian", "antoni"};
        String[] Contraseñas = {"1234", "4321", "2341", "9876", "5432"};
        String[] names = {"kevin", "mathias", "abraham", "willian", "antoni"};
        String[] contra = {"1234", "4321", "2341", "9876", "5432"};
        int[] dnis = {60061661, 75254568, 60836936, 75073575, 73889258};
        String[] Tarjetas_Debito = {"Visa Clasica", "Visa Light", "Visa Latam Pass", "Menu"};
        String[] Tarjetas_Credito = {"Visa Clasica BCP", "Visa Clasica Latam Pass", "Menu"};
        String[] despedida = {"Ganamos todos o perdemos todos", "Queremos ayudarte a encontrar lo que necesites."};
        String[] Anuncios = {"Comprar entradas para la Copa America", "Gana premios pagando desde la app", "Boletos para el concierto de Libido "};
        double[] saldos = {500.0, 1000.0, 750.0, 1200.0};
        String[] Num_Tarjeta = {"3242-1235-2131-3434", "6456-8793-3467-6754", "4366-3567-1230-7543", "1243-4876-3521-1321"};
        Random random = new Random();
        int America = random.nextInt(Anuncios.length);
        int Number = random.nextInt(Num_Tarjeta.length);
        double precio = 20;
        String[] carrito = new String[Tarjetas_Debito.length];
        String[] carrito_extra = new String[Tarjetas_Credito.length];
        String nombre, Password, dni, lugar;
        int opcion;

        String[] lineas = new String[1000];
        int contadorlineas = 0;
        int currentUserIndex;System.out.println("------ Tarjeta de Debito------------");
    System.out.println("Conoce ciertos beneficios:\n" + Anuncios[America]);
    System.out.println("Seleccione la tarjeta de su preferencia");
    for (int i = 0; i < Tarjetas_Debito.length; i++) {
        System.out.println("Opcion " + (i + 1) + " : " + Tarjetas_Debito[i]);
    }
    opcion = resident.nextInt();
    resident.nextLine();
    switch (opcion) {
        case 1:
            System.out.println("Confirme su Usuario: ");
            nombre=resident.nextLine();
            if (Arrays.asList(names).contains(nombre)){
                System.out.println("Ingrese su Contraseña:");
                Password =resident.nextLine();
                if (Password.matches("\\d{4}")) {
                    if (Arrays.asList(contra).contains(Password)){
                        System.out.println("Usted eligio la tarjeta: "+Tarjetas_Debito[0]);
                        System.out.println("¿Desea continuar con el proceso de adquirir la tajeta?  1 SI/ 2 NO / 3 Menu Principal");
                        opcion=resident.nextInt();
                        resident.nextLine();
                        if(opcion==1)
                        {
                            System.out.println("Listo, tu cuenta BCP fue creada");
                            System.out.println("Datos de su cuenta:");
                            fPago();
                        }
                        else if (opcion==2){
                            fDebito();
                        }
                        else if (opcion==3){
                            fTarjetas();
                        }
                        else
                        {
                            System.out.println("Opcion no válida");
                        }
                    }else{
                        System.out.println("Incorrecto, vuelva a intertarlo");
                        fDebito();
                    }

                } else {
                    System.out.println("Contraseña incorrecta");
                    fDebito();
                }

            }
            else{
                System.out.println("Incorrecto");
                fDebito();
            }
            break;

        case 2:


            System.out.println("Confirme su Usuario: ");
            nombre=resident.nextLine();
            if (Arrays.asList(names).contains(nombre)){
                System.out.println("Ingrese su Contraseña:");
                Password =resident.nextLine();
                if (Password.matches("\\d{4}")) {
                    if (Arrays.asList(contra).contains(Password)){
                        System.out.println("Usted eligio la tarjeta: "+Tarjetas_Debito[1]);
                        System.out.println("¿Desea continuar con el proceso de adquirir la tajeta?  1 SI/ 2 NO / 3 Menu Principal");
                        opcion=resident.nextInt();
                        resident.nextLine();
                        if(opcion==1)
                        {
                            System.out.println("Listo, tu cuenta BCP fue creada");
                            System.out.println("Datos de su cuenta:");
                            fPago();
                        }
                        else if (opcion==2){
                            fDebito();
                        }
                        else if (opcion==3){
                            fTarjetas();
                        }
                        else
                        {
                            System.out.println("Opcion no válida");
                        }
                    }else{
                        System.out.println("Incorrecto, vuelva a intertarlo");
                        fDebito();
                    }

                } else {
                    System.out.println("Contraseña incorrecta");
                    fDebito();
                }

            }
            else{
                System.out.println("Incorrecto");
                fDebito();
            }

            break;

        case 3:
            System.out.println("Confirme su Usuario: ");
            nombre=resident.nextLine();
            if (Arrays.asList(names).contains(nombre)){
                System.out.println("Ingrese su Contraseña:");
                Password =resident.nextLine();
                if (Password.matches("\\d{4}")) {
                    if (Arrays.asList(contra).contains(Password)){
                        System.out.println("Usted eligio la tarjeta: "+Tarjetas_Debito[2]);
                        System.out.println("¿Desea continuar con el proceso de adquirir la tajeta?  1 SI/ 2 NO / 3 Menu Principal");
                        opcion=resident.nextInt();
                        resident.nextLine();
                        if(opcion==1)
                        {
                            System.out.println("Listo, tu cuenta BCP fue creada");
                            System.out.println("Datos de su cuenta:");
                            fPago();
                        }
                        else if (opcion==2){
                            fDebito();
                        }
                        else if (opcion==3){
                            fTarjetas();
                        }
                        else
                        {
                            System.out.println("Opcion no válida");
                        }
                    }else{
                        System.out.println("Incorrecto, vuelva a intertarlo");
                        fDebito();
                    }

                } else {
                    System.out.println("Contraseña incorrecta");
                    fDebito();
                }

            }
            else{
                System.out.println("Incorrecto");
                fDebito();
            }
            break;
        case 4:
            MenuGeneral();
            break;

        default:
            System.out.println("Opcion no válida");
            fDebito();
            break;


    }


}

    private static void fCredito() {
        Scanner resident = new Scanner(System.in);
        String[] Usuarios = {"kevin", "mathias", "abraham", "willian", "antoni"};
        String[] Contraseñas = {"1234", "4321", "2341", "9876", "5432"};
        String[] names = {"kevin", "mathias", "abraham", "willian", "antoni"};
        String[] contra = {"1234", "4321", "2341", "9876", "5432"};
        int[] dnis = {60061661, 75254568, 60836936, 75073575, 73889258};
        String[] Tarjetas_Debito = {"Visa Clasica", "Visa Light", "Visa Latam Pass", "Menu"};
        String[] Tarjetas_Credito = {"Visa Clasica BCP", "Visa Clasica Latam Pass", "Menu"};
        String[] despedida = {"Ganamos todos o perdemos todos", "Queremos ayudarte a encontrar lo que necesites."};
        String[] Anuncios = {"Comprar entradas para la Copa America", "Gana premios pagando desde la app", "Boletos para el concierto de Libido "};
        double[] saldos = {500.0, 1000.0, 750.0, 1200.0};
        String[] Num_Tarjeta = {"3242-1235-2131-3434", "6456-8793-3467-6754", "4366-3567-1230-7543", "1243-4876-3521-1321"};
        Random random = new Random();
        int America = random.nextInt(Anuncios.length);
        int Number = random.nextInt(Num_Tarjeta.length);
        double precio = 20;
        String[] carrito = new String[Tarjetas_Debito.length];
        String[] carrito_extra = new String[Tarjetas_Credito.length];
        String nombre, Password, dni, lugar;
        int opcion;
        String[] lineas = new String[1000];
        int contadorlineas = 0;
        int currentUserIndex;
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
            System.out.println("Confirme su Usuario: ");
            nombre=resident.nextLine();
            if (Arrays.asList(names).contains(nombre)){
                System.out.println("Ingrese su Contraseña:");
                Password =resident.nextLine();
                if (Password.matches("\\d{4}")) {
                    if (Arrays.asList(contra).contains(Password)){
                        System.out.println("Usted eligio la tarjeta: "+Tarjetas_Credito[0]);
                        System.out.println("¿Desea continuar con el proceso de adquirir la tajeta?  1 SI/ 2 NO / 3 Menu Principal");
                        opcion=resident.nextInt();
                        resident.nextLine();
                        if(opcion==1)
                        {
                            System.out.println("Listo, tu cuenta BCP fue creada");
                            System.out.println("Datos de su cuenta:");
                            fPago();
                        }
                        else if (opcion==2){
                            fDebito();
                        }
                        else if (opcion==3){
                            fTarjetas();
                        }
                        else
                        {
                            System.out.println("Opcion no válida");
                        }
                    }else{
                        System.out.println("Incorrecto, vuelva a intertarlo");
                        fCredito();
                    }

                } else {
                    System.out.println("Contraseña incorrecta");
                    fCredito();
                }

            }
            else{
                System.out.println("Incorrecto");
                fCredito();
            }
            break;

        case 2:

            System.out.println("Confirme su Usuario: ");
            nombre=resident.nextLine();
            if (Arrays.asList(names).contains(nombre)){
                System.out.println("Ingrese su Contraseña:");
                Password =resident.nextLine();
                if (Password.matches("\\d{4}")) {
                    if (Arrays.asList(contra).contains(Password)){
                        System.out.println("Usted eligio la tarjeta: "+Tarjetas_Debito[1]);
                        System.out.println("¿Desea continuar con el proceso de adquirir la tajeta?  1 SI/ 2 NO / 3 Menu Principal");
                        opcion=resident.nextInt();
                        resident.nextLine();
                        if(opcion==1)
                        {
                            System.out.println("Listo, tu cuenta BCP fue creada");
                            System.out.println("Datos de su cuenta:");
                            fPago();
                        }
                        else if (opcion==2){
                            fDebito();
                        }
                        else if (opcion==3){
                            fTarjetas();
                        }
                        else
                        {
                            System.out.println("Opcion no válida");
                        }
                    }else{
                        System.out.println("Incorrecto, vuelva a intertarlo");
                        fCredito();
                    }

                } else {
                    System.out.println("Contraseña incorrecta");
                    fCredito();
                }

            }
            else{
                System.out.println("Incorrecto");
                fCredito();
            }

            break;
        case 3:
            fCredito();
            break;
        default:
            System.out.println("Opcion no válida");
            fTarjetas();
            break;


    }

}


    private static void fPago() {

        Scanner resident = new Scanner(System.in);
        String[] Usuarios = {"kevin", "mathias", "abraham", "willian", "antoni"};
        String[] Contraseñas = {"1234", "4321", "2341", "9876", "5432"};
        int[] dnis = {60061661, 75254568, 60836936, 75073575, 73889258};
        String[] Tarjetas_Debito = {"Visa Clasica", "Visa Light", "Visa Latam Pass", "Menu"};
        String[] Tarjetas_Credito = {"Visa Clasica BCP", "Visa Clasica Latam Pass", "Menu"};
        String[] despedida = {"Ganamos todos o perdemos todos", "Queremos ayudarte a encontrar lo que necesites."};
        String[] Anuncios = {"Comprar entradas para la Copa America", "Gana premios pagando desde la app", "Boletos para el concierto de Libido "};
        double[] saldos = {500.0, 1000.0, 750.0, 1200.0};
        String[] Num_Tarjeta = {"3242-1235-2131-3434", "6456-8793-3467-6754", "4366-3567-1230-7543", "1243-4876-3521-1321"};
        Random random = new Random();
        int America = random.nextInt(Anuncios.length);
        int Number = random.nextInt(Num_Tarjeta.length);
        double precio = 20;
        String[] carrito = new String[Tarjetas_Debito.length];
        String[] carrito_extra = new String[Tarjetas_Credito.length];
        String nombre, Password, dni, lugar;
        int opcion;
        String names, contra;
        String[] lineas = new String[1000];
        int contadorlineas = 0;
        int currentUserIndex;
        System.out.println("Listo la reciba su tarjeta en cajero cercano ");
    System.out.println("---------Ya puede usarla--------");
    System.out.println(" Nombres :" +Usuarios);
    System.out.println("Contraseña:---****---");
    System.out.println("Lugar de mayor uso:" );
    System.out.println(" Numero de Tarjeta :" + Num_Tarjeta[Number]);
    System.out.println("En su cuenta se le agregara el monto de:s/" + precio + "por adquirir la tarjeta");
    System.out.println("Puedes recoger tu tarjeta en cualquiera de nuestras agencias de Lunes a Viernes de 9:00 a.m. a 06:00 p.m. y Sábados de 09:00 a.m. a 01:00 p.m.");
    fExportarBoleta();

}

    private static void fExportarBoleta() {
        Scanner resident = new Scanner(System.in);
        String[] Usuarios = {"kevin", "mathias", "abraham", "willian", "antoni"};
        String[] Contraseñas = {"1234", "4321", "2341", "9876", "5432"};
        int[] dnis = {60061661, 75254568, 60836936, 75073575, 73889258};
        String[] Tarjetas_Debito = {"Visa Clasica", "Visa Light", "Visa Latam Pass", "Menu"};
        String[] Tarjetas_Credito = {"Visa Clasica BCP", "Visa Clasica Latam Pass", "Menu"};
        String[] despedida = {"Ganamos todos o perdemos todos", "Queremos ayudarte a encontrar lo que necesites."};
        String[] Anuncios = {"Comprar entradas para la Copa America", "Gana premios pagando desde la app", "Boletos para el concierto de Libido "};
        double[] saldos = {500.0, 1000.0, 750.0, 1200.0};
        String[] Num_Tarjeta = {"3242-1235-2131-3434", "6456-8793-3467-6754", "4366-3567-1230-7543", "1243-4876-3521-1321"};
        Random random = new Random();
        int America = random.nextInt(Anuncios.length);
        int Number = random.nextInt(Num_Tarjeta.length);
        double precio = 20;
        String[] carrito = new String[Tarjetas_Debito.length];
        String[] carrito_extra = new String[Tarjetas_Credito.length];
        String nombre, Password, dni, lugar;
        int opcion;
        String names, contra;
        String[] lineas = new String[1000];
        int contadorlineas = 0;
        int currentUserIndex;
    try {
        File archivo = new File("D:\\boleta.txt");
        FileWriter escritor = new FileWriter(archivo);
        escritor.write("Listo su tarjeta fue creda ");
        escritor.write("---------Ya puede usarla--------");
        escritor.write(" Nombres :" );
        escritor.write("Dni:" );
        escritor.write("Lugar de mayor uso:" );
        escritor.write(" Numero de Tarjeta :" + Num_Tarjeta[Number]);
        escritor.write("En su cuenta se le agregara el monto de:s/" + precio + "por adquirir la tarjeta");
        escritor.close();



    } catch (IOException factos) {
        System.out.println("Error al exportar la factura.");
        factos.printStackTrace();

    }

}

//Anthony
private static void fSoat() {
    ;
}


//ABRAHAM
private static void fChatBot() {
    Menuchatbot();
    ;
}

    private static void Menuchatbot() {
        Scanner resident = new Scanner(System.in);
    System.out.printf("Bienvenido a CHATBOT de BCP\n");
    System.out.printf("Esoja una de las opciones\n");
    System.out.printf("1: Cuentas\n");
    System.out.printf("2: Credito personal\n");
    System.out.printf("3: Seguro BCP\n");
    System.out.printf("4: Libro de reclamaciones\n");
    System.out.printf("5: Ir al menu principal\n");
    int opcion = resident.nextInt();
    resident.nextLine();
    switch (opcion) {

        case 1:
            fcuentas();
            break;

        case 2:
            fcreditopersonal();
            break;

        case 3:
            fseguro();
            break;

        case 4:
            freclamaciones();
            break;

        case 5:
            MenuGeneral();
            break;

        default:
            System.out.println("Opcion no válida\n");
            Menuchatbot();
            break;

    }
}

    private static void fcuentas() {

    String[] inducaciones = {"▪ No cobra mantenimiento, ▪ Operaciones sin costo a través de Banca por Internet, Banca Móvil y Yape, ▪ Depósitos y retiros sin costo a nivel nacional en Cajeros y Agentes BCP, Descarga gratuita de tu Estado de Cuenta por Banca por Internet, Banca Móvil o Plataforma Digital."};
    String[] instrucciones = {"¡Disfruta de descuentos exclusivos de hasta el 70%!, Conoce los centros afiliados a la Cuenta Sueldo BCP ingresando a, https://www.viabcp.com/beneficios/cuenta-sueldo, Para abrir tu Cuenta Sueldo BCP forma sencilla y segura, ingresa a nuestra web:, https://www.abretucuenta.viabcp.com/#/preferencias?codProd=CTASL"};
    String[] opciones = {"Traslada tu CTS al BCP y recibe una súper tasa, Entérate de todos los detalles en nuestra web: https://www.viabcp.com/campana-traslado-cts-sorteo"};
    String[] pasos = {"▪ Operaciones ilimitadas por Ventanillas, ▪ Operaciones sin costo a través de Banca por Internet, Banca Móvil y Yape, Depósitos y retiros sin costo a nivel nacional en Cajeros y Agentes BCP, ▪ Descarga gratuita de tu Estado de Cuenta por Banca por Internet, Banca Móvil o Plataforma Digital, ▪ Retiros ilimitados en cajeros de otras instituciones sin costo a nivel nacional"};
    String[] beneficios = {"▪ Operaciones ilimitadas por Ventanillas, ▪ Operaciones sin costo a través de Banca por Internet, Banca Móvil y Yape, ▪ Depósitos y retiros sin costo a nivel nacional en Cajeros y Agentes BCP, ▪ Descarga gratuita de tu Estado de Cuenta por Banca por Internet, Banca Móvil o Plataforma Digital, ▪ Retiros ilimitados en cajeros de otras instituciones sin costo a nivel nacional"};
        Scanner resident = new Scanner(System.in);
    System.out.println("Escoja una opcion");
    System.out.printf("1: Iniciar sesion\n");
    System.out.printf("2: Conocer los tipos de cuentas\n");
    System.out.println("3: Ir al menu principal\n");
    System.out.printf("4: Ir al menu de chatbot\n");
    int opcion = resident.nextInt();
    switch (opcion) {

        case 1:
            Inicio_Sesion();
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
                    Menuchatbot();
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
                            Menuchatbot();
                    }

                case 3:
                    Arrays.sort(opciones);
                    Menuchatbot();
                    break;

                case 4:
                    System.out.printf("¡Participa por 1 MILLÓN de soles abriendo tu Cuenta Premio!\n");
                    System.out.printf("Solo realiza un depósito de S/ 1,000 o $ 300 y obtén estos beneficios:\n");
                    Arrays.sort(pasos);
                    Menuchatbot();
                    break;

                case 5:
                    System.out.printf("Haz tus operaciones sin límites por solo S/ 12.00 o $ 4.80 al mes. \n" +
                            "La Cuenta Ilimitada tiene estos beneficios:\n");
                    Arrays.sort(beneficios);
                    Menuchatbot();
                    break;

                case 6:
                    MenuGeneral();
                    break;

                case 7:
                    Menuchatbot();
                    break;

                case 8:
                    fcuentas();
                    break;

                default:
                    System.out.println("Opcion invalida\n");
            }
            break;

        case 3:
            MenuGeneral();
            break;

        case 4:
            Menuchatbot();

        default:
            System.out.printf("Esa opcion no esta disponible\n");
    }
}

    private static void fcreditopersonal() {
        Scanner resident = new Scanner(System.in);
    System.out.printf("Esta es la información sobre Crédito Efectivo.\n");
    System.out.printf("1. Quiero información general sobre Crédito Efectivo\n");
    System.out.printf("2. Quiero ver mis Créditos Personales\n");
    System.out.printf("3. Ir al menu principal\n");
    System.out.printf("4. Ir al menu de chatbot\n");
    int opcion = resident.nextInt();
    switch (opcion) {
        case 1:
            System.out.printf("Para conocer más sobre Crédito Efectivo, ingresa a nuestra web:\n" +
                    "https://www.viabcp.com/creditos/credito-efectivo\n");
            Menuchatbot();
            break;

        case 2:
            System.out.printf("Ingresa a nuestra web y conoce los requisitos para adquirir un Préstamo Personal:\n" +
                    "https://www.viabcp.com/creditos/credito-efectivo/prestamo-personal-bcp\n");
            Menuchatbot();
            break;

        case 3:
            MenuGeneral();
            break;

        case 4:
            Menuchatbot();

        default:
            System.out.printf("Esa opicion es invalida\n");
    }
}

    private static void fseguro() {
        Scanner resident = new Scanner(System.in);
    System.out.printf("Aquí puedes revisar información sobre Seguros.\n");
    System.out.printf("1. ¿Cuál es la cobertura de los Seguros BCP?\n");
    System.out.printf("2. ¿Qué pasa si no pago mi Seguro BCP?\n");
    System.out.printf("3. Ir la menu principal\n");
    System.out.printf("4. Ir al menu de chatbot\n");
    int opcion = resident.nextInt();
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
                    Menuchatbot();
                    break;
                case 2:
                    fSoat();
                    break;

                case 3:
                    MenuGeneral();
                    break;

                case 4:
                    Menuchatbot();

                case 5:
                    fseguro();

                default:
                    System.out.printf("Esa opcion no esta disponible\n");
            }
            break;

        case 2:
            System.out.printf("Si no pagas tu seguro por más de tres meses consecutivos, \n" +
                    "será anulado y perderás la cobertura.\n");
            Menuchatbot();
            break;

        case 3:
            MenuGeneral();
            break;

        case 4:
            Menuchatbot();

        default:
            System.out.printf("Esa opion es invalida\n");
    }
}


    private static void freclamaciones() {
    MenuOpciones();
}

    private static void MenuOpciones() {
        Scanner resident = new Scanner(System.in);
        String[] Usuarios = {"kevin", "mathias", "abraham", "willian", "antoni"};
        String[] Contraseñas = {"1234", "4321", "2341", "9876", "5432"};
        int[] dnis = {60061661, 75254568, 60836936, 75073575, 73889258};
        String[] Tarjetas_Debito = {"Visa Clasica", "Visa Light", "Visa Latam Pass", "Menu"};
        String[] Tarjetas_Credito = {"Visa Clasica BCP", "Visa Clasica Latam Pass", "Menu"};
        String[] despedida = {"Ganamos todos o perdemos todos", "Queremos ayudarte a encontrar lo que necesites."};
        String[] Anuncios = {"Comprar entradas para la Copa America", "Gana premios pagando desde la app", "Boletos para el concierto de Libido "};
        double[] saldos = {500.0, 1000.0, 750.0, 1200.0};
        String[] Num_Tarjeta = {"3242-1235-2131-3434", "6456-8793-3467-6754", "4366-3567-1230-7543", "1243-4876-3521-1321"};
        Random random = new Random();
        int America = random.nextInt(Anuncios.length);
        int Number = random.nextInt(Num_Tarjeta.length);
        double precio = 20;
        String[] carrito = new String[Tarjetas_Debito.length];
        String[] carrito_extra = new String[Tarjetas_Credito.length];
        String nombre, Password, dni, lugar;
        String names, contra;
        String[] lineas = new String[1000];
        int contadorlineas = 0;
        int currentUserIndex;
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
            System.out.print("Ingrese su reclamo: \n");
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
            freclamaciones();
        } else if (opcion == 4) {
            MenuGeneral();
        } else if (opcion == 5) {
            Menuchatbot();
            break;
        } else {
            System.out.println("Opción no válida. Inténtalo de nuevo.\n");
        }
    }
    ExportarBloc();
}

    private static void ExportarBloc() {
        String[] Usuarios = {"kevin", "mathias", "abraham", "willian", "antoni"};
        String[] Contraseñas = {"1234", "4321", "2341", "9876", "5432"};
        int[] dnis = {60061661, 75254568, 60836936, 75073575, 73889258};
        String[] Tarjetas_Debito = {"Visa Clasica", "Visa Light", "Visa Latam Pass", "Menu"};
        String[] Tarjetas_Credito = {"Visa Clasica BCP", "Visa Clasica Latam Pass", "Menu"};
        String[] despedida = {"Ganamos todos o perdemos todos", "Queremos ayudarte a encontrar lo que necesites."};
        String[] Anuncios = {"Comprar entradas para la Copa America", "Gana premios pagando desde la app", "Boletos para el concierto de Libido "};
        double[] saldos = {500.0, 1000.0, 750.0, 1200.0};
        String[] Num_Tarjeta = {"3242-1235-2131-3434", "6456-8793-3467-6754", "4366-3567-1230-7543", "1243-4876-3521-1321"};
        Random random = new Random();
        int America = random.nextInt(Anuncios.length);
        int Number = random.nextInt(Num_Tarjeta.length);
        double precio = 20;
        String[] carrito = new String[Tarjetas_Debito.length];
        String[] carrito_extra = new String[Tarjetas_Credito.length];
        String nombre, Password, dni, lugar;
        int opcion;
        String names, contra;
        String[] lineas = new String[1000];
        int contadorlineas = 0;
        int currentUserIndex;
    try (FileWriter writer = new FileWriter("bloc_de_notas.txt\n")) {
        for (int i = 0; i < contadorlineas; i++) {
            writer.write(lineas[i] + "\n");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    System.out.println("El contenido se ha guardado en 'bloc_de_notas.txt'.\n");
    Menuchatbot();

}

}