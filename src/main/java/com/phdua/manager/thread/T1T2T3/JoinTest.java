package com.phdua.manager.thread.T1T2T3;



public class JoinTest {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        ThreadJoinTest t1 = new ThreadJoinTest("夏天");
        ThreadJoinTest t2 = new ThreadJoinTest("秋天");
        ThreadJoinTest t3 = new ThreadJoinTest("冬天");
        t1.start();
        /**join方法可以传递参数，join(10)表示main线程会等待t1线程10毫秒，10毫秒过去后，
         * main线程和t1线程之间执行顺序由串行执行变为普通的并行执行
         */
        t1.join();
        t2.start();
        t2.join();
        t3.start();






    }

}

class ThreadJoinTest extends Thread{
    public ThreadJoinTest(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(this.getName() + ":" + i);
        }
    }
}

