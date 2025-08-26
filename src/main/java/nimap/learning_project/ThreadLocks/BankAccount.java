package nimap.learning_project.ThreadLocks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private Long balance = 100L;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int money) {
        boolean acquired = false;
        try {
            acquired = lock.tryLock(1, TimeUnit.SECONDS);

            if (acquired) {
                if (money > balance) {
                    System.out.println("Insufficient balance");
                } else {
                    System.out.println(Thread.currentThread().getName() + " withdrawing " + money + " rupees");
                    balance = balance - money;
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + " withdraw completed successfully");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire lock, try again later!");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (acquired) {
                lock.unlock();
            }
        }
    }
//    public synchronized void withdraw(int money){
//        if(money>balance){
//            System.out.println("insufficient balance");
//        }else{
//            System.out.println(Thread.currentThread().getName()+"withdrawing "+money+" rupees");
//            balance=balance-money;
//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(Thread.currentThread().getName()+"withdraws completed successfully");
//        }
//    }

}