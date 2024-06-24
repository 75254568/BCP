import java.io.File;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class BCP_1 {
    private String T_auto, modelo;
    private int anioFabricacion;
    private int cantidad, opc;
    private String op;
    //LOVI
    String nombres, ape_pat, ape_mat, email_in, email, contraseña, est_civ,
            celular, sexo, contraseña_in, fec_nac;
    Scanner resident= new Scanner(System.in);
    String [] Tarjetas_Debito={"Visa Clasica","Visa Light", "Visa Latam Pass"};
    String [] Tarjetas_Credito={"Visa Clasica BCP", "Visa Clasica Latam Pass"};
    String[] despedida={"Ganamos todos o perdemos todos","Queremos ayudarte a encontrar lo que necesites."};
    String [] Anuncios={"Comprar entradas para la Copa America", "Gana premios pagando desde la app", "Boletos para el concierto de Libido "};
    String [] Num_Tarjeta ={"3242-1235-2131-3434","6456-8793-3467-6754","4366-3567-1230-7543","1243-4876-3521-1321"};
    Random random = new Random();
    int America= random.nextInt(Anuncios.length);
    int Number= random.nextInt(Num_Tarjeta.length);
    double precio=20;
    String [] carrito =new String[Tarjetas_Debito.length];
    String [] carrito_extra=new String[Tarjetas_Credito.length];
    String nombre,dni,lugar;
    int opcion;

    public String MenuGeneral(){
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
            case"5":
                this.fSoat();

                break;


            default:
                System.out.printf("Esa opcion no esta disponible escriba otra opcion\n");
        }




        return null;
    }
    //KEVIN
    public String fPrestamo(){



        return null;

    }
    //WILLIAN

    public String fAdelanto(){
        return null;
    }

    //Mathias
    public String fTarjetas(){
        System.out.println("---------Elige la tarjeta que va contigo----------");
        System.out.println("Marque alguna de las siguientes opciones");
        System.out.println(" 1.- Tarjeta de Debito");
        System.out.println(" 2.- Tarjeta de Credito");
        System.out.println("3.-Regresar al Menu");
        opcion=resident.nextInt();
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


        }        return null;
    }
    public void fDebito(){System.out.println("------ Tarjeta de Debito------------");
        System.out.println("Conoce ciertos beneficios:\n"+Anuncios[America]);
        System.out.println( "Seleccione la tarjeta de su preferencia");
        for (int i=0; i<Tarjetas_Debito.length;i++){
            System.out.println("Opcion "+(i+1)+ " : " +Tarjetas_Debito[i]);
        }
        opcion= resident.nextInt();
        resident.nextLine();
        switch (opcion){
            case 1:
                System.out.println("Ingrese su nombre ");
                nombre=resident.nextLine();
                System.out.println("Ingrese el numero de DNI:");
                dni =resident.nextLine();
                System.out.println("Ingrese el departamento que mas frecuenta");
                lugar=resident.nextLine();
                System.out.println("Ud quiere la Tarjeta de Debito "+Tarjetas_Debito[0]);
                System.out.println("¿Desea continuar con el proceso de adquirir la tarjeta?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=resident.nextInt();
                resident.nextLine();
                if(opcion==1)
                {
                    System.out.println("Listo, tu cuenta BCP fue creada");
                    System.out.println("Datos de su cuenta:");
                    this.fPago();fPago();
                }
                else if (opcion==2){
                    this.fDebito();
                }
                else if (opcion==3){
                    this.fTarjetas();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;

            case 2:
                System.out.println("Ingrese su nombre ");
                nombre=resident.nextLine();
                System.out.println("Ingrese el numero de DNI:");
                dni =resident.nextLine();
                System.out.println("Ingrese el departamento que mas frecuenta");
                lugar=resident.nextLine();
                System.out.println("Usted eligio la tarjeta: "+Tarjetas_Debito[1]);
                System.out.println("¿Desea continuar con el proceso de adquirir la tajeta?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=resident.nextInt();
                resident.nextLine();
                if(opcion==1)
                {
                    System.out.println("Listo, tu cuenta BCP fue creada");
                    System.out.println("Datos de su cuenta:");
                    this.fPago();
                }
                else if (opcion==2){
                    this.fDebito();
                }
                else if (opcion==3){
                    this.fTarjetas();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;

            case 3:
                System.out.println("Ingrese su nombre ");
                nombre=resident.nextLine();
                System.out.println("Ingrese el numero de DNI:");
                dni =resident.nextLine();
                System.out.println("Ingrese el departamento que mas frecuenta");
                lugar=resident.nextLine();
                System.out.println("Usted eligio la Tarjeta de Debito "+Tarjetas_Debito[2]);
                System.out.println("¿Desea continuar con el proceso de adquirir la tajeta?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=resident.nextInt();
                resident.nextLine();
                if(opcion==1)
                {
                    System.out.println("Listo, tu cuenta BCP fue creada");
                    System.out.println("Datos de su cuenta:");
                    this.fPago();
                }
                else if (opcion==2){
                    this.fCredito();
                }
                else if (opcion==3){
                    this.fTarjetas();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }


                break;

            default:
                System.out.println("Opcion no válida");
                this.fTarjetas();
                break;


        }


    }
    public void fCredito(){
        System.out.println("------ Tarjeta de Credito------------");
        System.out.println(" Conoce ciertos beneficios:\n"+Anuncios[America]);
        System.out.println( "Seleccione la tarjeta de su preferencia");
        for (int i=0; i<Tarjetas_Credito.length;i++){
            System.out.println("Opcion "+(i+1)+ " : " +Tarjetas_Credito[i]);
        }
        opcion= resident.nextInt();
        resident.nextLine();
        switch (opcion){
            case 1:
                System.out.println("Ingrese su nombre ");
                nombre=resident.nextLine();
                System.out.println("Ingrese el numero de DNI:");
                dni =resident.nextLine();
                System.out.println("Ingrese el departamento que mas frecuenta");
                lugar=resident.nextLine();
                System.out.println("Usted eligio la tarjeta: "+Tarjetas_Credito[0]);
                System.out.println("¿Desea continuar con el proceso de adquirir la tarjeta?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=resident.nextInt();
                resident.nextLine();
                if(opcion==1)
                {
                    System.out.println("Listo, tu cuenta BCP fue creada");
                    System.out.println("Datos de su cuenta:");
                    this.fPago();
                }
                else if (opcion==2){
                    this.fCredito();
                }
                else if (opcion==3){
                    this.fTarjetas();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;

            case 2:
                System.out.println("Ingrese su nombre ");
                nombre=resident.nextLine();
                System.out.println("Ingrese el numero de DNI:");
                dni =resident.nextLine();
                System.out.println("Ingrese el departamento que mas frecuenta");
                lugar=resident.nextLine();
                System.out.println("Usted ha elegido la tarjeta de Credito"+Tarjetas_Credito[1]);
                System.out.println("¿Desea adquirir esta tarjeta?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=resident.nextInt();
                resident.nextLine();
                if(opcion==1)
                {
                    System.out.println("Listo, tu cuenta BCP fue creada");
                    System.out.println("Datos de su cuenta:");
                    this.fPago();
                }
                else if (opcion==2){
                    this.fCredito();
                }
                else if (opcion==3){
                    this.fTarjetas();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;
            default:
                System.out.println("Opcion no válida");
                this.fTarjetas();
                break;


        }

    }


    public void fPago(){
        System.out.println("Listo su tarjeta fue creda ");
        System.out.println("---------Ya puede usarla--------");
        System.out.println(" Nombres :"+nombre);
        System.out.println("Dni:"+dni);
        System.out.println("Lugar de mayor uso:"+lugar);
        System.out.println(" Numero de Tarjeta :"+Num_Tarjeta[Number]);
        System.out.println("En su cuenta se le agregara el monto de:s/"+precio+"por adquirir la tarjeta");
        this.fExportarBoleta();

    }
    public void fExportarBoleta(){
        try{
            File archivo= new File("D:\\boleta.txt");
            FileWriter escritor=new FileWriter(archivo);
            escritor.write("Listo su tarjeta fue creda ");
            escritor.write("---------Ya puede usarla--------");
            escritor.write(" Nombres :"+nombre);
            escritor.write("Dni:"+dni);
            escritor.write("Lugar de mayor uso:"+lugar);
            escritor.write(" Numero de Tarjeta :"+Num_Tarjeta[Number]);
            escritor.write("En su cuenta se le agregara el monto de:s/"+precio+"por adquirir la tarjeta");
            escritor.close();


        }
        catch (IOException factos){
            System.out.println("Error al exportar la factura.");
            factos.printStackTrace();

        }

    }
    //Anthony
    public String fSoat(){
        return null;
    }




    //ABRAHAM
    public String fChatBot(){
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




    public static void main(String[]args){
        BCP_1 chiqui=new BCP_1();
        chiqui.MenuGeneral();
    }
}

