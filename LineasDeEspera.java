import java.util.Scanner;

public class LineasDeEspera {
    public static void main(String[] args) {
        Scanner sol = new Scanner (System.in);
        int opcion;
        do{
            System.out.println("\n \n \tMenu");
            System.out.println("1. M/M/1");
            System.out.println("2. M/M/C");
            System.out.println("Opcion: ");
            opcion = sol.nextInt();
            switch(opcion){
                case 1->{
                    System.out.println("Ingresa el promedio de llegadas (λ): ");
                    int llegada = sol.nextInt();
                    System.out.println("Ingresa el promedio de servicios (μ): ");
                    int servicio = sol.nextInt();
                    double P=llegada/servicio;
                    double Lq=(Math.pow(llegada,2))/(servicio*(servicio-llegada));
                    double wq=Lq/llegada;
                    double w=wq+(1/servicio);
                    System.out.println("Utilización del sistema (P): "+P);
                    System.out.println("Número promedio de clientes en la cola (Lq): "+ Lq);
                    System.out.println("Tiempo promedio de espera en la cola (Wq): "+ wq);
                    System.out.println("Tiempo total en el sistema (W): "+ w);
                }
                case 2->{
                    System.out.println("Ingresa el promedio de llegadas (λ): ");
                    double llegada = sol.nextDouble();
                    System.out.println("Ingresa el promedio de servicios (μ): ");
                    double servicio = sol.nextDouble();
                    System.out.println("Ingresa el tamaño del servidor (c): ");
                    int c= sol.nextInt();
                    double a=llegada/servicio;
                    double p=a/c;
                    
                }
            }
        }
        while(opcion!=3);
    }
}