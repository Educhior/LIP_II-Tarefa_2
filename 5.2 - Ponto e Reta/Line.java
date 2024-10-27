public class Line {
   // A line composes of two points (as instance variables)
   private final Point begin;    // beginning point
   private final Point end;      // ending point
   
   // Constructors
   public Line (Point begin, Point end) {  // caller to construct the Points
      this.begin = begin;
      this.end = end;
   }
   public Line (int beginX, int beginY, int endX, int endY) {
      begin = new Point(beginX, beginY);   // construct the Points here
      end = new Point(endX, endY);
   }
   
   // Public methods
   @Override
   public String toString() {
     return "Line from " + begin + " to " + end;
   }
   
   public Point getBegin() {
     return begin;
   }
   public Point getEnd() {
    return end;
   }
   public void setBegin(int x, int y) {
        begin.setXY(x, y);
    }
   public void setEnd(int x, int y) {
        end.setXY(x, y);
   }
   
   public int getBeginX() {
    return begin.getX();
   }
   public int getBeginY() { 
    return begin.getY();
    }
   public int getEndX() {
    return end.getX();
   }
   public int getEndY() { 
    return end.getY();
    }
   
   public void setBeginX(int x) {
    begin.setX(x);
    }

   public void setBeginY(int y) {
    begin.setY(y);
   }
   public void setBeginXY(int x, int y) {
    begin.setXY(x, y);
   }
   public void setEndX(int x) {
    end.setX(x);
   }
   public void setEndY(int y) {
    end.setY(y);
   }
   public void setEndXY(int x, int y) {
    end.setXY(x, y);
   }
   
   public int getLength() { 
    return (int) Math.sqrt((end.getX() - begin.getX()) * (end.getX() - begin.getX()) + (end.getY() - begin.getY()) * (end.getY() - begin.getY()));
   } 
      public double getGradient() {
       return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
      } 
   }eturn Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
   } 