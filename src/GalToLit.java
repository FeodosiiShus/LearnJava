import java.util.Scanner;

public class GalToLit {
    public static void main(String[] args){
        double gal, litr;
        Scanner in = new Scanner(System.in);
        System.out.print("Hello, type your galons:");
        gal = in.nextDouble();
        litr = gal * 3.7854;
        System.out.println("Litr: "+litr);
    }
}
