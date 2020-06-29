public class Inheritance extends Iner {
    public static void main(String[] args) {
        Iner in = new Iner();
        in.color = "black";
        System.out.println(in.color);
    }
}
class Iner extends Inerr{
    String engine;
    String name;
}
class Inerr{
    String color;
}
