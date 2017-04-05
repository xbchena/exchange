package com.iss.finanframe.job;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/*
简单范例
@Component
public class TestJob2 extends ScheduledJob {

    @Autowired
    AcctWorkOrderService acctWorkOrderService;

    @Autowired
    WoAcctStatusChangeFileService woAcctStatusChangeFileService;

    @Scheduled(fixedRate = 1000)
    public void startScheduled() {
        super.start();
    }

   // 真正的任务执行
@Override
protected void work() {
        System.out.println("threadId=" + Thread.currentThread().getId() + ",  job 开始执行2222222：" + (new Date()).toLocaleString());
        try {
        Thread.currentThread().sleep(2 * 1000);
        } catch (Exception ex) {
        }
        }

        }
 */

/**
 * 解决　 org.springframework.scheduling.annotation.Scheduled 原生态中；同一进程启动多个job,是在同一个线程 排队执行问题；
 * 中间启动一个线程；
 * <p>
 * 简单调用方式: 见javaSource 文档上方
 */
public abstract class ScheduledJob implements Runnable {

    public ScheduledJob() {
        this.poolSize = 1;
        executorService = Executors.newFixedThreadPool(this.poolSize);
        ;
    }

    private int poolSize = 0;

    protected Logger logger = LogManager.getLogger(getClass().getName());

    private static boolean isWorking = false;

    ExecutorService executorService = null;

    @Override
    public void run() {
        try {
            work();
            finish();
        } catch (Throwable ex) {
            // 跑出异常，标志结束
            finish();
        }
    }

    public abstract void startScheduled();

    protected void start() {
        if (isWorking == false) {
            isWorking = true;
            executorService.submit(this);
        }
    }


    protected abstract void work();

    private void finish() {
        isWorking = false;
    }
}
