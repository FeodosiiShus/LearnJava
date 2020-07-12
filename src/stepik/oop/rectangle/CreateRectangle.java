package stepik.oop.rectangle;

public class CreateRectangle {
    public static void main(String[] args) {

    }
}

class Rectangle {
    private int height, width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSquare(){
        this.width = this.width * this.height;
        return width;
    }
}
