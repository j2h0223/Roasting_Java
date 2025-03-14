import java.util.TreeSet;

class ThreadEx10 {
    public static void main(String[] args) throws Exception {
        ThreadGroup main = Thread.currentThread().getThreadGroup();
        ThreadGroup grp1 = new ThreadGroup("Group1");
        ThreadGroup grp2 = new ThreadGroup("Group2");

        // ThreadGroup(ThreadGroup parent, String name);
        ThreadGroup subgrp1 = new ThreadGroup(grp1, "SubGroup1");

        grp1.setMaxPriority(3);     // Thread 그룹 grp1의 최대 우선 순위를 3으로 변경.

        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);     // Thread를 1초간 멈추게 한다
                } catch (InterruptedException e) {

                }
            }
        };

        // Thread (ThreadGroup tg, Runnable r, String name)
        new Thread(grp1,    r, "th1").start();
        new Thread(subgrp1, r, "th2").start();
        new Thread(grp2,    r, "th3").start();
        // Thread를 참조변수 없이 생성해 바로 실행시켰는데, 해당 Thread가 가비지 컬렉터의 제거 대상이 되지않음
            // 그 이유는 Thread의 참조가 ThreadGroup에 저장되어 있음
            // Thread 그룹을 지정하지 않은 Thread는 자동적으로 main Thread 그룹에 속함


        System.out.println(">> List of ThreadGroup : "+ main.getName()
                + ", Active ThreadGroup : " + main.activeGroupCount()
                + ", Active Thread : " + main.activeCount());
        main.list();
    }
}
