/**
 * Created by user on 10/28/2016.
 */
public class P8 {
    public static void main(String[] args) {

double s;

        int x=SkeletonJava.readIntGUI("x=");
        int n=SkeletonJava.readIntGUI("n=");

        s=(1-Math.pow(x,n+1))/(1-x);

        System.out.println(s);






    }
}
