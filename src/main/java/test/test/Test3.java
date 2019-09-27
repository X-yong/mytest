package test.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description:
 * @Author: panda
 * @Date: 2019/7/29 15:07
 */
public class Test3 {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("a");
        new Test4().test4(list);
        System.out.println(list);
    }

}
class Test4{
    public void test4(List list) {

        list.clear();
        list.add("b");
        System.out.println("���list��ֵ");



        new Thread(() -> {
            synchronized (this) {
                System.out.println("���߳�1��ʼ");
                try {
                    this.wait();
                    System.out.println("wait1 �ȴ���5��");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }


        }).start();

        new Thread(() -> {
            synchronized (this) {
                System.out.println("���߳�3��ʼ");
                try {
                    this.wait();
                    System.out.println("wait3 �ȴ���5��");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }


        }).start();

        new Thread(() -> {
            synchronized (this) {
                System.out.println("���߳�2��ʼ");
                System.out.println("2---------------------->");
                // this.wait(5000);
                try {
                    Thread.currentThread().sleep(2000);
                    System.out.println("���ѣ�");
                    notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }).start();
    }

}