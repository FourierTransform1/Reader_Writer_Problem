package Solution;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RWLock {
    ReentrantReadWriteLock reentrantLock = new ReentrantReadWriteLock(true);


    public RWLock(){

    }

    public  void acquireRead(){
        reentrantLock.readLock().lock();
    }

    public  void acquireWrite(){
        reentrantLock.writeLock().lock();
    }


    public  void releaseRead(){
        reentrantLock.readLock().unlock();
    }

    public  void releaseWrite(){
        reentrantLock.writeLock().unlock();
    }

}
