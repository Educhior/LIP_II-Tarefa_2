public class Cylinder {
   private final Circle base;
   private double height;

   public Cylinder() {
      base = new Circle();
      height = 1.0;
   }

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
      return base.getArea() * height;
   }

   public double getArea() {
      return 2 * Math.PI * base.getRadius() * height + 2 * base.getArea(); 
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
      return "Cylinder: " + base.toString() + ", height=" + height;
   }
}
