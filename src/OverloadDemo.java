public class OverloadDemo {
    public static void main(String[] args) {
        Overload ov = new Overload();
        int n = 10;
        ov.ovl();
        System.out.println();
        ov.ovl(n);
    }
}
class Overload{
    public void ovl(){
        System.out.println("First func");
    }
    public void ovl(int n){
        System.out.printf("Second func - %d", n);
    }
}
