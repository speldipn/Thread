package org.androidtown.thread;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    MyRunnable runA = new MyRunnable("A");
    new Thread(runA).start();

    MyRunnable runB = new MyRunnable("B");
    new Thread(runB).start();
  }
}

// 1차
class MyThread extends Thread {
  @Override
  public void run() {
    for(int i = 1; i <= 100; ++i) {
      sleep(1000);
      System.out.println(getName() + " " + i);
    }
  }

  private void sleep(int msec) {
    try {
      Thread.sleep(msec);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

class MyRunnable implements Runnable {
  private String name;

  public MyRunnable(String a) {
    this.name = a;
  }

  @Override
  public void run() {
    for (int i = 1; i <= 100; ++i) {
      sleep(1000);
      System.out.println(name + " " + i);
    }
  }

  private void sleep(int msec) {
    try {
      Thread.sleep(msec);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
