import employee.*;
import java.util.*;
public class emppay {

    public static void main (String[] args) {
        Emp[] e=new Emp[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            String name=sc.nextLine();
            int id=sc.nextInt();
            sc.nextLine();//to catch /r
            String cat=sc.nextLine();
            e[i]=new Emp();
            e[i].getEmp(name,id,cat);
        }
        e[0].getSal();
        e[1].getSal();
        e[2].getSal();
        e[0].detectIT();
        e[1].detectIT();
        e[2].detectIT();


    }
}

