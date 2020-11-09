package Solution;

import java.util.logging.Level;
import java.util.logging.Logger;

//A writer updates the content of a message
//In the run method 10 writings are performed before exit
//Each writer gets an id which can be used to track the running of individual threads
public class Writer_ implements Runnable{
    private int id;
    private Data myData;

    public Writer_(int nID, Data inData){
        id=nID;
        myData=inData;
    }

    @Override
    public void run(){
        for(int i=1;i<5;i++){
            try {
                Thread.sleep((int)(Math.random()*100));
                myData.write(id,i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Writer_.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
