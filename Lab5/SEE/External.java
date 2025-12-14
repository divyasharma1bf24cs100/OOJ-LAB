package SEE;
import CIE.Personal;
public class External extends Personal{
    public int seemarks[]=new int[5];
    public External(String usn,String name,int sem,int marks[]){
        super(usn, name, sem);
        for(int i=0;i<5;i++) {
            seemarks[i]=marks[i];
        }
    }
}
