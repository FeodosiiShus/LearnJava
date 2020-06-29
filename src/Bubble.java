import java.util.Random;

public class Bubble {
    public static void main(String[] args) {
        int mass[] = new int[10];
        int t;
        Random random = new Random();
        for(int i =0; i < mass.length; i++){
            mass[i] = random.nextInt(0 + 100);
            System.out.print(mass[i]+" ");
        }
        System.out.println("\n");
        for (int i=1; i < mass.length; i++){
            for(int j = mass.length-1; j>=i; j--){
                if(mass[j-1] > mass[j]){
                    t = mass[j-1];
                    mass[j-1] = mass[j];
                    mass[j] = t;
                }
            }
        }
        for(int i = 0; i < mass.length; i++){
            System.out.print(mass[i]+" ");
        }

    }
}
