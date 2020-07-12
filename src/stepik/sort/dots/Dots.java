package stepik.sort.dots;

import java.util.Arrays;
import java.util.Scanner;

public class Dots {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        Dot[] dots = new Dot[n];
        for (int i = 0; i < n; i++){
                String[] str = in.nextLine().split(" ");
                int x = Integer.parseInt(str[0]);
                int y = Integer.parseInt(str[1]);
                dots[i] = new Dot(x, y);
        }
        Arrays.sort(dots, (o1, o2) -> (o1.x*o1.x + o1.y*o1.y - o2.x*o2.x - o2.y*o2.y));
        for(Dot d: dots){
            System.out.println("("+d.x+"; "+d.y+")");
        }
    }
}
