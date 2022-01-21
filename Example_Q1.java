class Example_Q1
{
   public static void main (String[]args)
     {
      //declare and initialize variables
      long hoursWorked;
	hoursWorked  = 44L;
      double payRate, taxRate;
	taxRate = 0.15;
	payRate = 15.0;
      //output employee pay amount
      System.out.println("Hours worked: " + hoursWorked);
      System.out.println("Pay amount: " + (hoursWorked * payRate));
     }
}
