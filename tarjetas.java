import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class tarjetas {
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
    public String MenuPrincipal(){
        System.out.println("---------Elige la tarjeta que va contigo----------");
        System.out.println("Marque alguna de las siguientes opciones");
        System.out.println(" 1.- Tarjeta de Debito");
        System.out.println(" 2.- Tarjeta de Credito");
        opcion=resident.nextInt();
        resident.nextLine();
        switch (opcion){
            case 1:
                this.Debito();
                break;

            case 2:
                this.Credito();
                break;

            case 3:

                break;

            default:
                System.out.println("Opcion no válida");
                this.MenuPrincipal();
                break;

        }

        return null;
    }

    public String Debito(){
        System.out.println("------ Tarjeta de Debito------------");
        System.out.println(" Conoce ciertos beneficios:\n"+Anuncios[America]);
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
                     this.Pago();
                }
                else if (opcion==2){
                    this.Debito();
                }
                else if (opcion==3){
                    this.MenuPrincipal();
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
                    this.Pago();
                }
                else if (opcion==2){
                    this.Debito();
                }
                else if (opcion==3){
                    this.MenuPrincipal();
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
                    this.Pago();
                }
                else if (opcion==2){
                    this.Credito();
                }
                else if (opcion==3){
                    this.MenuPrincipal();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }


                break;

            default:
                System.out.println("Opcion no válida");
                this.MenuPrincipal();
                break;


        }

        return null;
    }
    public double Pago(){

        System.out.println("Listo su tarjeta fue creda ");
        System.out.println("---------Ya puede usarla--------");
        System.out.println(" Nombres :"+nombre);
        System.out.println("Dni:"+dni);
        System.out.println("Lugar de mayor uso:"+lugar);
        System.out.println(" Numero de Tarjeta :"+Num_Tarjeta[Number]);
        System.out.println("En su cuenta se le agregara el monto de:s/"+precio+"por adquirir la tarjeta");
        this.ExportarBoleta();
        return precio;
    }
    public String Credito(){
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
                     this.Pago();
                }
                else if (opcion==2){
                    this.Credito();
                }
                else if (opcion==3){
                    this.MenuPrincipal();
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
                    this.Pago();
                }
                else if (opcion==2){
                     this.Credito();
                }
                else if (opcion==3){
                    this.MenuPrincipal();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;
            default:
                System.out.println("Opcion no válida");
                this.MenuPrincipal();
                break;


        }
        return null;
    }
    public String Adios(){

        System.out.println("Nos vemos en un proxima");


        return null;
    }

    public String ExportarBoleta(){
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
        return null;
    }

    public static void main(String [] args){
        tarjetas papanoel= new tarjetas();
        papanoel.MenuPrincipal();




    }
}
