/**
 * Status
 */
public class Status {

    public static void main(String[] args) {
        
        Stat[] ss = Stat.values();
        System.out.println(ss);     
        
        for(Stat s : ss){
            System.out.println(s +" : "+s.ordinal());
        }
    }
}

enum Stat{
    Running,Failed,Pending,Success;
}