package ch4;

public class FlowEx1 {
  public static void main(String[] args) {
    int x=0;
    System.out.printf("when x=%d true is %n",x);
    if(x==0) System.out.println("x==0");
    if(x!=0) System.out.println("x!=0");
    if(!(x!=0)) System.out.println("!(x==0)");
    if(!(x!=0)) System.out.println("!(x!=0)");

    x=1;
    System.out.println("x==0");
    if(x==0) System.out.println("x==0");
    if(x!=0) System.out.println("x!=0");
    if(!(x!=0)) System.out.println("!(x==0)");
    if(!(x!=0)) System.out.println("!(x!=0)");

  }
}
