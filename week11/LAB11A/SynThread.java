class MT
{
synchronized void printMT(int n)
{
   for(int i=1;i<=5;i++)
{
    System.out.println(n*i);
    try
{
  Thread.sleep(4000);
}
catch(Exception e)
{
  System.out.println(e);
}
}
}
}

class FThread extends Thread
{
  MT t;
FThread(MT t)
{
  this.t=t;
}
public void run()
{
   t.printMT(10);
}
}

class SThread extends Thread
{
  MT t;
SThread(MT t)
{
  this.t=t;
}
public void run()
{
   t.printMT(25);
}
}
class SynThread
{
  public static void main(String args[])
{
   MT M=new MT();
FThread t1=new FThread(M);
SThread t2=new SThread(M);
t1.start();
t2.start();
}
}
