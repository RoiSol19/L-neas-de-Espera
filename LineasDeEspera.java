import java.util.Scanner;

public class LineasDeEspera {
    public static void main(String[] args) {
        Scanner sol = new Scanner (System.in);
        int opcion;
        do{
            System.out.println("\n \n \tMenu");
            System.out.println("1. M/M/1");
            System.out.println("2. M/M/C");
            System.out.println("3. M/M/k");
            System.out.println("4. Salir");
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
                    double Po=math.pow(a,c-1)/(factorial(0))+math.pow(a,c-1)/(factorial(c-1)*(1-p));
                    double Pespera=math.pow(a, c)/(factorial(c)*(1-p))*Po;
                    double Lq=Pespera*p/(1-p);
                    double Wq=Lq/llegada;
                    double W=Wq+(1/servicio);
                    double L=llegada/servicio;
                    System.out.println("Carga total del sistema (a): " + a);
                    System.out.println("Utilizacion del sistema (P): " + p + "%");
                    System.out.println("Probabilidad de que no haya clientes en el sistema (Po): " + Po);
                    System.out.println("Probabilidad de que un cliente tenga que esperar: " + Pespera + "Horas");
                    System.out.println("Longitud promedio en la cola: " + Lq);
                    System.out.println("Tiempo promedio de espera en la cola (Wq): " + Wq);
                    System.out.println("Tiempo total en el sistema (W): " + W);
                    System.out.println("Numero promedio en el sistema (L): " + L);
                }
                case 3->{
                    System.out.println("Ingresa el numero de llegadas (λ): ");
                    double llegada=sol.nextDouble();
                    System.out.println("Ingresa el numero de servicios (μ): ");
                    double servicio=sol.nextDouble();
                    System.out.println("Probabilidad efectiiva de arribo landa (c): ");
                    double c=sol.nextDouble();
                    System.out.println("Probabilidad de rechazo (k): ");
                    double k=sol.nextDouble();
                    double a=llegada/servicio;
                    double p=a/c;
                    double Po=1-p/1-p*Math.pow(p, k+1);
                    double pk=Math.pow(p, k)*Po;
                    ddouble Lq=llegada(1-pk);
                    double L=p(1-(k+1)*math.pow(p, k) + k*math.pow(p, k+1))/(1-p)(1-math.pow(p, k+1));
                    double W=L/Lq;

                }
            }
        } while(opcion!=4);
    }
    public static double factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}