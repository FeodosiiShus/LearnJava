package stepik.sort.pupil;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Pupils {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        Pupil[] pupils = new Pupil[n];
        for (int i = 0; i < n; i++) {
            String[] str = in.nextLine().split(" ");
            String sname = str[0];
            String name = str[1];
            int schoolNum = Integer.parseInt(str[2]);
            double math = Double.parseDouble(str[3]);
            double russ = Double.parseDouble(str[4]);
            double inform = Double.parseDouble(str[5]);
            pupils[i] = new Pupil(sname, name, schoolNum, math, russ, inform);
        }
        //for (Pupil p : pupils)
        //    System.out.println(p.surName + " " + p.name + " " + p.numberOfSchool + " " + p.markOfMath + " " + p.markOfRussian + " " + p.markOfComputerScience);
        double sumMath = 0;
        double sumRussian = 0;
        double sumCS = 0;
        for (Pupil p : pupils) {
            sumMath += p.markOfMath;
            sumRussian += p.markOfRussian;
            sumCS += p.markOfComputerScience;
        }
        sumMath /= n;
        sumRussian /= n;
        sumCS /= n;
        double allSumm = (sumMath + sumRussian + sumCS)/3;
        System.out.printf("Отчет по городу: математика - %.1f, русский язык - %.1f, инфрматика - %.1f, общий средний балл - %.1f", sumMath, sumRussian, sumCS, allSumm);
        for (Pupil p: pupils){
            System.out.printf("Школа №%d: ", p.numberOfSchool);
        }
    }
}
