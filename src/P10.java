import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import com.sun.org.apache.xpath.internal.SourceTree;



/**
 * Created by user on 10/28/2016.
 */
//Intrebari
public class P10 {
    public static void main(String[] args) {
        int n = SkeletonJava.readIntGUI("n=");
        for (int i = 1; i <= n; i++) {

            int[] sir = {SkeletonJava.readIntGUI("Dati nr "+i)};
            for (int j = 0; j < sir.length; j++) {
                System.out.println(sir[j]);
            }
            for(int d=0;d<sir.length;d++)
            {
                System.out.println(2*sir[d]);
            }
            }






        }

    }
