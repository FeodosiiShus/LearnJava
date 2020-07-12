package stepik.sort.students;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String[] str = in.nextLine().split(" ");
            String studentName = str[0];
            int studentMark = Integer.parseInt(str[1]);
            students[i] = new Student(studentName, studentMark);
        }
        Comparator<Student> comparator = Comparator.comparing(Student::getMark, ((o1, o2) -> { return o2.compareTo(o1); })).thenComparing(Student::getName);
        Arrays.sort(students, comparator);
        for (Student s: students) System.out.println(s.name+" "+ s.mark);
    }
}
