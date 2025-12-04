import java.util.Scanner;

public class LineasDeEspera {
    public static void main(String[] args) {
        Scanner sol = new Scanner (System.in);
        int opcion;
        do{
            System.out.println("\n \n \tMenu");
            System.out.println("1. M/M/1");
            System.out.println("2. M/M/1/K");
            System.out.println("Opcion: ");
            opcion = sol.nextInt();
            switch(opcion){
                case 1->{
                    System.out.println("Ingresa el promedio de llegadas (λ): ");
                    int llegada = sol.nextInt();
                    System.out.println("Ingresa el promedio de servicios (μ): ");
                    int servicio = sol.nextInt();
                    int P=llegada/servicio;

                }
            }
        }
        while(opcion!=3);
    }
}