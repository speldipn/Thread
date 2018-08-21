# Thread

#### 안드로이드 쓰레드 생성

* Thread를 상속받아 생성하는 방법
````java
**class MyThread extends Thread** {
 @Override
  public void run() {
    for(int i = 1; i <= 100; ++i) {
      sleep(1000);
      System.out.println(getName() + " " + i);
    }
  }
}
````

* Runnable 인터페이스를 상속받아서 생성하는 방법
````java
**class MyRunnable implements Runnable** {
@Override
  public void run() {
    for (int i = 1; i <= 100; ++i) {
      sleep(1000);
      System.out.println(name + " " + i);
    }
  }
}

````
