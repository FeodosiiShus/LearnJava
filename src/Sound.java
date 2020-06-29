import java.util.Scanner;

public class Sound {
    public static void main(String[] args) throws java.io.IOException{
        double dist, time;
        Scanner in = new Scanner(System.in);
        dist = (double) System.in.read();
        time = in.nextDouble();
        double distance = dist * time;
        System.out.printf("Distance: %f| Time: %f", distance, time);

    }
}
