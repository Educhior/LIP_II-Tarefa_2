public class Cylinder {
   private final Circle base;   // Base circle, an instance of Circle class
   private double height;
   
   // Constructor with default color, radius and height
   public Cylinder() {
      base = new Circle(); // Call the constructor to construct the Circle
      height = 1.0; 
   }
   
   // Constructor with specified radius, default color and height
   public Cylinder(double radius) {
      base = new Circle(radius);
      height = 1.0;
   }
   public Cylinder(double radius, double height) {
      base = new Circle(radius);
      this.height = height;
   }
   public Cylinder(double radius, double height, String color) {
      base = new Circle(radius, color);
      this.height = height;
   }

   public double getHeight() {
      return height;
   }

    public double getVolume() {
        return base.getArea()*height; 
    }

    public double getArea() {
        return 2*Math.PI*base.getRadius()*height + 2*base.getArea();
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return base.getRadius();
    }

    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    @Override
    public String toString() {
        return "Cylinder: base=" + base.toString() + " height=" + height;
    }

}