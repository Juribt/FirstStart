package FirstStart;

/**
 * Created by bilovyur on 08.01.2017.
 */
public class Point_2 {

    public double x1; //координата 1-й точки по x
    public double y1; //координата 1-й точки по y
    public double x2; //координата 2-й точки по x
    public double y2; //координата 2-й точки по y

    public Point_2(double x1, double y1, double x2, double y2)
    {
        this.x1 = x1;
        this.y1= y1;
        this.x2= x2;
        this.y2 = y2;
    }

    public double distance()
    {
        double k1 = this.x2 - this.x1 ;
        double k2 = this.y2 - this.y1 ;
        double  dist = Math.sqrt(k1*k1 + k2*k2);

       return dist;
    }
}
