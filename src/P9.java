/**
 * Created by user on 10/28/2016.
 */

//Nu am stiut
public class P9 {
    public static void main(String[] args) {


        int n = SkeletonJava.readIntGUI("n=");
        for (int i = 1; i <= n; i++) {

            int[] sir = {SkeletonJava.readIntGUI("Dati nr " + i)};
            for (int j = 1; j < sir.length; j++) {

                System.out.println(sir[j]);
                if(sir[j]>sir[j+1])
                {
                    System.out.println("Sirul e crescator");
                }


            }
                         }


        }
    }