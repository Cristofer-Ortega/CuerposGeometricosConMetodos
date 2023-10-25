import java.util.Scanner;

public class App {
    static final double Dos = 2;
    static final double Pi = 3.141592654;
    static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int opc = mostrarMenu();
        desarrollarCalculos(opc);
    }
    public static int mostrarMenu(){
        System.out.println("Seleccione el cuerpo geometrico:");
        System.out.println("1. Prisma");
        System.out.println("2. Cilindro");
        System.out.println("3. Piramide");
        System.out.println("4. Cono");
        System.out.println("5. Esfera");
        int opc = lector.nextInt();
        return opc;
    }

    public static void desarrollarCalculos(int opc){
        switch (opc) {
            case 1:
                System.out.println("PRISMA");
                System.out.print("Cantidad de lados: ");
                int n = lector.nextInt();
                System.out.print("Longitud de los lados: ");
                double l = lector.nextDouble();
                System.out.print("Altura: ");
                double h = lector.nextDouble();
                System.out.println("El area lateral es " + calcularAreaLateral(n,l,h));
                System.out.println("El area total es " + calcularAreaTotal(n,l,h));
                System.out.println("El volumen es " + calcularVolumen(n,l,h));
                break;

            case 2:
                System.out.println("Ingrese el valor de radio del cilindro:");
                double radio = lector.nextDouble();
                System.out.println("Ingrese el valor de altura del cilindro");
                double Haltura = lector.nextDouble();
                System.out.println("El valor del area lateral del cilindro es de:  "+calcularAreaLateral(radio,Haltura) );
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El valor del area total del cilindro es de:   "+calcularAreaTotal(radio,Haltura) );
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El valor del volumen del cilindro es de:  " +calcularVolumen(radio,Haltura));
               
            case 3:
                System.out.println("Ingrese el valor de base de la pirámide");
                double base3 = lector.nextDouble();
        
                System.out.println("Ingrese el valor de altura de la pirámide");
                double Haltura3 = lector.nextDouble();
                System.out.println("El valor del area lateral de la pirámide es de: "+calcularAreaLateral3(base3,Haltura3));
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El valor del area total de la pirámide es de: "+calcularAreaTotal3(base3, Haltura3));
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El valor del volumen de la pirámide es de: "+calcularVolumen3(Haltura3, base3));
            
            case 4:
                System.out.println("Ingrese el valor de radio del cono: ");
                double radio4 = lector.nextDouble();
                System.out.println("Ingrese el valor de altura del cono: ");
                double Haltura4 = lector.nextDouble();
                System.out.println("Ingrese el valor de la generatriz del cono:");
                double generatriz4 = lector.nextDouble();

                System.out.println("El valor del area lateral del cono es de: "+calcularAreaLateral4(radio4,Haltura4,generatriz4));
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El valor del area total del cono es de: "+calcularAreaTotal4(radio4, Haltura4, generatriz4, l));
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El valor del volumen del cono es de: "+calcularVolumen4(radio4, Haltura4, radio4));

            case 5:
                System.out.println("Ingrese el valor del radio:");
                double radio5 = lector.nextDouble();

                System.out.println("El valor del area de la esfera es de:" +calcularArea5(radio5));
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El valor del volumen de la esfera es de: "+calcularVolumen5(radio5));



                                

                                


            default:
                break;
        }        
    }
    public static double calcularAreaLateral(int n,double l,double h){
            return (n*l*h);
    }
    public static double calcularAreaTotal(int n,double l, double h){
        double alfa = (360/n)*(Math.PI/180);
        double apotema = l/(2*Math.tan(alfa/2));
        double areaBase = ((n*l)*apotema)/2;
        return areaBase;
    }
    public static double calcularVolumen(int n, double l, double h){
        double alfa = (360/n)*(Math.PI/180);
        double apotema = l/(2*Math.tan(alfa/2));
        double areaBase = ((n*l)*apotema)/2;
        return (areaBase*h);
    }
    //CILINDRO
    public static double calcularAreaLateral(double radio, double Haltura) {
        double areaLateral = Dos * Pi * radio * Haltura;
        return areaLateral;

    }
    public static double calcularAreaTotal(double radio, double Haltura) {
        double areaTotal = Dos * Pi * radio * (Haltura + radio);
        return areaTotal;

    }
    public static double calcularVolumen(double radio, double Haltura){
        double Volumen = Pi * (radio * radio) + Haltura;
        return Volumen;
    }

    //PIRAMIDE
    public static double calcularAreaLateral3(double base3, double Haltura3) {
        double HalturaD3 = Haltura3 * Haltura3;
        double baseMedia3 = base3 /Dos;
        double baseMediaD3 = baseMedia3 * baseMedia3;
        double apotema3 = HalturaD3 + baseMediaD3;
        double apotemaD3 = apotema3 * apotema3;
        double areaLateral3 = 4 * ((base3 * apotemaD3) /Dos)/1000;
        return areaLateral3;
    }
    public static double calcularAreaTotal3(double base3, double Haltura3, double areaLateral3){
         double Areabase3 = base3 * base3;
         double areaTotal3 = Areabase3 + areaLateral3;
         return areaTotal3;
    }
    public static double calcularVolumen3( double Haltura3, double Areabase3 ){
        double Volumen3 = (Areabase3 * Haltura3)/3;
        return Volumen3;
    }
    //CONO
    public static double calcularAreaLateral4(double radio4, double Haltura4, double generatriz4 ) {
        double areaLateral4 = Pi * radio4 * generatriz4;
        return areaLateral4;
    }
    public static double calcularAreaTotal4(double radio4, double Haltura4, double generatriz4, double areaLateral4) {
         double radioD4 = radio4 * radio4;
         double areaTotal4 = areaLateral4 + Pi * radioD4;
         return areaTotal4;
    }
    public static double calcularVolumen4(double radio4, double Haltura4, double radioD4  ) {
        double Volumen4 = (0.3333333333 * Pi * radioD4 )* Haltura4;
        return Volumen4;
    }
    //ESFERA
    public static double calcularArea5(double radio5) {
        double radioD5 = radio5 * radio5;
         double Area5 = 4 * Pi * radioD5;
         return Area5;
    }
    public static double calcularVolumen5(dobule radio5) {
       double radioT5 = radio5 * radio5 * radio5;
        double Volumen5 = 1.333333333 * Pi * radioT5;
        return Volumen5;

        
    }
    



}
