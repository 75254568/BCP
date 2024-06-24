import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
public class antoni {


    public class SeguroSoat {
        private String T_auto, modelo;
        private int anioFabricacion;
        private int cantidad, opc;
        private String op;







        public void fAutos() {
            Scanner anthony = new Scanner(System.in);
            String [] Seguros={"Soat Seguros","Bbva Seguros", "AhorraSeguros", "Geico", "Infinity Auto"};
            T_auto = anthony.nextLine();
            int [] precio={300000,450100,650000,570600,522500};
            double[] subtotal_extra={0,0,0,0.0};
            int [] carrito =new int[Seguros.length];
            int [] carrito2 =new int[asd.length];
            double igv, subtotal,totalpagar;
            anthony.nextLine();
        }

        public String fMenuP(){
            Scanner lass = new Scanner(System.in);
            System.out.println("¡Bienvenido a la sección de seguros de autos!");
            System.out.println("---Elija una opción---");
            System.out.println(" 1.- Comprar seguro (convencionales");
            System.out.println(" 2.- Comprar seguro SOAT desde 38 soles");
            System.out.println(" 3.- Comprar otros seguros");
            op = lass.nextLine();
            lass.nextLine();
            switch (op){
                case "1":
                    this.fComprarS();        //reemplazar por comprar seguro
                    break;
                case "2":
                    this.fEdad();              //comprar soat desde 38 soles
                    break;
                case "3":
                    this.fFinal();             //comprar otros seguros
                default:
                    System.out.println("Opción no válida");
                    this.fMenuP();
                    break;
            }
            return null;
        }

        public String fComprarS(){
            Scanner las = new Scanner(System.in);
            System.out.println("------ Seguros disponibles------------");
            System.out.println("1.Soat seguros");
            System.out.println("2.Bvba seguros");
            System.out.println("3.Ahorra seguros");
            System.out.println("4.Geico");
            System.out.println("5.Infinity autos");


            for(
                    int i = 0;
                    i<Seguros.length;i++)
            {
                System.out.println("Opcion " + (i + 1) + " : " + Seguros[i]);
            }
            opc = las.nextInt();
            las.nextLine();
            switch (opc){
                case 1:
                    System.out.println("Usted eligió Soat seguros");







            }




        }









    }




















    public void fEdad() {
        Scanner ant = new Scanner(System.in);
        System.out.println("Para la compra del seguro, coloque su fecha de nacimiento");
        System.out.println("Ingrese el día de su nacimiento (DD): ");
        int dia = ant.nextInt();
        System.out.println("Ingrese el mes de su nacimiento (MM): ");
        int mes = ant.nextInt();
        System.out.println("Ingrese el año de su nacimiento (YYYY): ");
        int anio = ant.nextInt();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        int edadConductor = Period.between(fechaNacimiento, fechaActual).getYears();
        ant.nextLine();
        if (edadConductor >= 18) {
            fEstadoAuto();
            fModeloAuto();
            fFinal();
        } else {
            System.out.println("Tiene que ser mayor de edad para adquirir un SOAT...");


        }

    }
    public void fEstadoAuto(){
        Scanner antonio = new Scanner(System.in);
        System.out.println("¡Excelente!: ");
        System.out.println("Ingrese el año de fabricación de su auto, por favor: ");
        anioFabricacion = antonio.nextInt();
        antonio.nextLine();
        if (anioFabricacion>2000){
            System.out.println("Su auto está dentro de los modelos admitidos");
            System.out.println("Puede continuar con el trámite: ");
        }
        else {
            System.out.println("Su auto está obsoleto, lo sentimos...");
        }

    }
    public void fModeloAuto(){
        Scanner anto= new Scanner(System.in);

        System.out.println("Ahora, elija el modelo de su auto: ");
        System.out.println("1. Chevrolet");
        System.out.println("2. BWM");
        System.out.println("3. Nissan");
        System.out.println("4. Toyota");
        System.out.println("5. Audi");
        System.out.println("6. Ferrari");
        System.out.println("7. volkswagen");
        int opcion = anto.nextInt();
        anto.nextLine();
        switch (opcion) {
            case 1:
                modelo = "Chevrolet";
                break;
            case 2:
                modelo = "BMW";
                break;
            case 3:
                modelo = "Nissan";
                break;
            case 4:
                modelo = "Toyota";
                break;
            case 5:
                modelo = "Audi";
                break;
            case 6:
                modelo = "Ferrari";
                break;
            case 7:
                modelo = "Volkswagen";
                break;
            default:
                modelo = "Modelo no especificado";
        }


    }

    public void fFinal(){
        Scanner a= new Scanner(System.in);
        System.out.println("*¡En hora buena!*");
        System.out.println("Su auto es un: "+ modelo);
        System.out.println("De año de fabricación: "+ anioFabricacion);
        System.out.println("De un valor de: "+ T_auto);
        System.out.println("¡Usted está dentro de los clientes aptos para adquirir un SOAT desde solo 38 soles!");
        System.out.println("*¡Gracias por confiar en nosotros!*");
        a.nextLine();
        a.close();
    }
    public static void main(String[] args) {

        SeguroSoat s = new SeguroSoat();
        s.fAutos();
        s.fEdad();
        s.fEstadoAuto();
        s.fModeloAuto();
        s.fFinal();

    }
}
}
