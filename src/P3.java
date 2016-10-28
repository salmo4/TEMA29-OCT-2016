/**
 * Created by user on 10/27/2016.
 */
public class P3 {
    public static void main(String[] args) {



        int sum = 0;
        int i = 0;
        while (true) {
            int nr = SkeletonJava.readIntGUI("Dati nr:");
            if(nr==0)
            {
                break;
            }
            if (nr > 4 && nr < 11) {

                sum = sum + nr;





            }


        }
        System.out.println("Suma nr mai > 4 este:" + sum);

    }
}