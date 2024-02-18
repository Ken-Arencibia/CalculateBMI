import java.util.Scanner;
public class CalculateBMI {

    public static void main(String[] args) {
        Scanner P= new Scanner(System.in);
        System.out.println("Introduce your mass in kg");
        double mass=P.nextDouble();
        System.out.println("Introduce your height in m");
        double height=P.nextDouble();
        double BodyMassIndex = CalculateBMI.calculateBodyMassIndex(mass,height);
        System.out.println(BodyMassIndex);
    }
    public static double calculateBodyMassIndex(double mass, double height){ 
        double BodyMassIndex= (mass/(height*height));
        return BodyMassIndex;
        
    }
}


 