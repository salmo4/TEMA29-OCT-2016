/**
 * Created by user on 10/28/2016.
 */
public class P6 {
    public static void main(String[] args) {

        int fact=1;
        int n=SkeletonJava.readIntGUI("n=");
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println(fact);
    }
}
