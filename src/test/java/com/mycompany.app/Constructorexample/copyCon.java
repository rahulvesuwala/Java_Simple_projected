

public class copyCon {

    int len;
    int wid;
    copyCon(int l,int w){
        len=l;
        wid=w;
    }
    copyCon(copyCon s){
        len=s.len;
        wid=s.wid;
    }
    void area(){
        System.out.println(len*wid);
    }

    public static void main(String arg[]){
        copyCon t1=new copyCon(2,3);
        copyCon t2=new copyCon(t1);
        copyCon t3=new copyCon(4,5);
        t1.area();
        t2.area();
        t3.area();

    }
}
