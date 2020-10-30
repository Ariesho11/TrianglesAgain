public class Triangle{
  private Point v1, v2, v3;
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
    double sp = ((v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1))/2);
    double d1 = v1.distanceTo(v2);
    double d2 = v2.distanceTo(v3);
    double d3 = v3.distanceTo(v1);
    return Math.sqrt(sp*(sp-d1)*(sp-d2)*(sp-d3));
  }

  public String classify(){
    double s1 = Math.round(v1.distanceTo(v2) * 10000.0)/10000.0;
    double s2 = Math.round(v2.distanceTo(v3) * 10000.0)/10000.0;
    double s3 = Math.round(v1.distanceTo(v3) * 10000.0)/10000.0;
    String id = "";

    if ((s1 == s2) && (s2 == s3)) id = "equilateral";
    else if (((s2 == s3) || (s1 == s2)) || (s1 == s3)) id = "isosceles";
    else id = "scalene";
    return id;
  }

  public String toString(){
    return "v1(" + v1.getX() + ", " + v1.getY() + ") v2(" + v2.getX() + ", " + v2.getY() + ") v3(" + v3.getX() + ", " + v3.getY() + ")";
  }
  //mutator
  public void setVertex(int index, Point newP){
    if (index == 0) v1 = newP;
    if (index == 1) v2 = newP;
    if (index == 2) v3 = newP;
  }
}
