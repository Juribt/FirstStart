package FirstStart;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
      //Задание №2: Потренироваться использовать функции, классы, объекты и методы ; 2 и 3- й пункт
       Point p1 = new Point();
        Point p2 = new Point();
        p1.x1 = 1.0 ;
        p1.y1 = 1.0;
        p2.x2 = 2.0;
        p2.y2 = 2.0;
        distance (p1,p2);
       //Задание №2: Потренироваться использовать функции, классы, объекты и методы ; 4-й пункт
        Point_1 p3 = new Point_1( -2,4, 3, 4);
        distance (p3);

        Point_2 p4 = new Point_2( 4,3, 4, -3);

        System.out.println("Distance (with method) between two points is :" + p4.distance());

         //4-й пункт переделанный вариант, для решения задачи был создан класс Point_3
         Point_3 a= new Point_3(4,3);
         Point_3 b= new Point_3(4,-3);
         double dist2 = a.distance(b);

        System.out.println("Distance (with method corrected ) between two points is :" + dist2);

    }
       public static void distance(Point p1,Point p2)
    {
        double k1 = p2.x2 - p1.x1 ;
        double k2 = p2.y2 - p1.y1 ;
        double  dist = Math.sqrt(k1*k1 + k2*k2);
        System.out.println("Distance between two points is :" + dist);

    }

    public static void distance(Point_1 p3)
    {
        double k1 = p3.x2 - p3.x1 ;
        double k2 = p3.y2 - p3.y1 ;
        double  dist = Math.sqrt(k1*k1 + k2*k2);
        System.out.println("Distance (with constructor) between two points is :" + dist);

    }
}

