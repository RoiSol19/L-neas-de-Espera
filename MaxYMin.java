import java.util.Scanner;
public class MaxYMin {
    public static void main (String[] args){
        int opcion;
        Scanner sol=new Scanner(System.in);
        do{
            System.out.println("\n \n \tMenu");
            System.out.println("1. Maximizar");
            System.out.println("2. Minimizar");
            System.out.println("3. Salir");
            System.out.println("Opcion: ");
            switch (opcion) {
                case 1->{
                    simplex(sol, true);
                }
            }
        }while (opcion!=3);
    }
    
}
public static void simplex (Scanner sol, boolean maximizar){
    System.out.println("Ingresa el coeficiente de x1 en  una funcion objetivo: ");
    double x1=sol.nextDouble();
    System.out.println("Ingresa el coeficiente de x2 en  una funcion objetivo: ");
    double x2=sol.nextDouble();
    if (!maximizar) {
        x1=-x1;
        x2=-x2;
    }
    System.out.println("Ingresa el coeficiente de x1 en restricciones 1 (a11): ");
    double a11=sol.nextDouble();
    System.out.println("Ingresa el coeficiente de x2 en restricciones 1 (a12): ");
    double a12=sol.nextDouble();
    System.out.println("Ingresa la constaante de restricciones 1 (b1): ");
    double b1=sol.nextDouble();
    System.out.println("Ingresa el coeficiente de x1 en restricciones 2 (a21): ");
    double a21=sol.nextDouble();
    System.out.println("Ingresa el coeficiente de x2 en restricciones 2 (a22): ");
    double a22=sol.nextDouble();
    System.out.println("Ingresa la constante de restricciones 2 (b2): ");
    double b2=sol.nextDouble();
    double[][] tabla= {
        {-x1, -x2, 0, 0, b1},
        {a11, a12, 1, 0, b2},
        {a21, a22, 0, 1, 0}
    };
}
