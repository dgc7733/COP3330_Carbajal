public class Cube implements Shape,Shape3D {
    private String name;
    private double side;


    public Cube(double side) {
        super();
        this.side = side;
        this.name = "cube";
    }



    public String getName() {
        return name;
    }



    public double getArea() {
        return side * side * 6;
    }



    public double getVolume() {
        return side * side * side;
    }


}