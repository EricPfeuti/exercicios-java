package entities;

public class Rectangle {

    public double width;
    public double height;

    public double Area(){
        return width * height;
    }

    public double Perimeter(){
        return 2 * (width + height);
    }

    public double Diagonal(){
        return Math.sqrt(width * width + height * height);
    }

    public String toString() {
        return String.format("AREA = %.2f%n", Area()) + String.format("PERIMETER = %.2f%n", Perimeter()) + String.format("DIAGONAL = %.2f", Diagonal());
    }

}