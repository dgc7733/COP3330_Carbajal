public class Circle implements Shape {
    private String name;
    private double side;


    public Circle(double side) {
        super();
        this.side = side;
        this.name = "circle";
    }



    public String getName() {
        return name;
    }



    public double getArea() {
        return side * side;
    }






}