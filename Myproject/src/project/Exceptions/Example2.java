package project.Exceptions;

public class Example2 {
	 
    private void m1()
    {
    m2();
     System.out.printf("1");
    }
      private void m2()
      {
     m3();
     System.out.printf("2");
      }
    private void m3()
        {
    System.out.printf("3");
   try
          {
         int sum = 4/0;
         System.out.printf("4");
          }
   catch(ArithmeticException e)
         {
        System.out.printf("5");
         }
     
        System.out.printf("7");
        }
     public static void main(String[] args)
      {
    	 Example2 obj = new Example2();
        obj.m1();
        }
}



