public class Square implements Shape {
    private double side;
    private String name;


    public Square(double side) {
        super();
        this.side = side;
        this.name = "square"; //"sqare"
    }



    public double getArea() {
        return side * side;
    }



    public String getName() {
        return name;
    }



}
