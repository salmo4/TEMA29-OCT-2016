import org.omg.PortableServer.ServantRetentionPolicyValue;

/**
 * Created by user on 10/28/2016.
 */
public class P4 {

    public static void main(String[] args) {
        int nr=SkeletonJava.readIntGUI("Dari nr:");
        if(nr>=9 && nr<=24)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }



    }
    }

