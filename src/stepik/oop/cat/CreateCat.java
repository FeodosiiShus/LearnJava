package stepik.oop.cat;

public class CreateCat {
    public static void main(String[] args) {

    }
}
class Cat{
    private String name;
    private int energy = 1000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStamina() {
        return energy;
    }

    public void run(){
        energy -= 100;
    }

    public void eat(){
        energy += 200;
    }

    public void sleep(){
        energy += 100;
    }
}
