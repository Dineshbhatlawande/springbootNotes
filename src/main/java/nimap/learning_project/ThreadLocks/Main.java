package nimap.learning_project.ThreadLocks;

public class Main {
    //Locks 2 types-> intrinsic (default,using synchronized)
    //                Explicit (manual,using Lock interface)
    public static void main(String[] args) {
        // intrinsic
//        Easy to implement and readable
//        No timeout->not release till it execution completes(other thread must wait)
//        BankAccount sbiAcc=new BankAccount();
//        Runnable runnable=new Runnable() {
//            @Override
//            public void run() {
//                sbiAcc.withdraw(50);
//            }
//        };
//        Thread t1=new Thread(runnable,"Thread 1 ");
//        Thread t2=new Thread(runnable,"Thread 2 ");
//        t1.start();
//        t2.start();

        // Explicit
        BankAccount sbiAcc=new BankAccount();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                sbiAcc.withdraw(50);
            }
        };
        Thread t1=new Thread(runnable,"Thread 1 ");
        Thread t2=new Thread(runnable,"Thread 2 ");
        t1.start();
        t2.start();



    }
}
