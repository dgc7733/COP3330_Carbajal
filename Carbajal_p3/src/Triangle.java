public class Triangle implements Shape {
    private String name;
    private double base;
    private double height;



    public Triangle(double base,double height) {
        super();
        this.base = base;
        this.height=height;
        this.name = "triangle";
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return ( base * height ) / 2;
    }






}