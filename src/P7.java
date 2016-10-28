import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * Created by user on 10/28/2016.
 */
//NU AM STIUT SA O REZOLV PANA LA CAPAT!
public class P7 {
    public static void main(String[] args) {
int value;
        int k;
        int n = SkeletonJava.readIntGUI("n=");
        for (int i = 1; i <= n; i++) {

            int[] sir = {SkeletonJava.readIntGUI("Dati nr " + i)};
            for(int j=0;j<sir.length;j++)
            {
                 value=sir.length;
                System.out.println(sir[j]);
                if(sir[j]>value)
                {
                value=sir[j];
                    System.out.println("Perechile mai mari sunt"+value);




            }



            }


        }
    } }
