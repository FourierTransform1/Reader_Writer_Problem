package Solution;

public class ReaderWriter {

    public static void main(String[] args) {
        Data data=new Data();
        //create writers
        Thread rt;
        rt=new Thread(new Writer_(0,data));
        rt.start();
        rt=new Thread(new Writer_(1,data));
        rt.start();
        //create readers
        Thread th;
        for(int r=0;r<5;r++){
            th=new Thread(new Reader_(r,data));
            th.start();
        }
    }
}
