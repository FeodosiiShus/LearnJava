public class GalToLitTable {
    public static void main(String[] args){
        double litr;
        for(int gallons = 1; gallons <= 100; gallons++){
            litr = gallons * 3.7854;
            System.out.printf("Gallons: %d|Litr: %f \n", gallons, litr);
            if(gallons % 10 == 0){
                System.out.println("");
            }
        }
    }
}
