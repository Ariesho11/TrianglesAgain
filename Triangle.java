public class Triangle{
  private  Point v1, v2, v3;
  //constructor
  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }

  //accessors
  public double getPerimeter(){
    return (v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1));
  }

  public double getArea(){
    return 0.00;
  }

  public String classify(){
    return "string";
  }

  public String toString(){
    return "string";
  }
  //mutator
  public void setVertex(int index, Point newP){
  }
}
