public class VariablesBudgetCalculator
{
    /**
     * this is the main method  of my program 
     * @pram - array of String args from th console
     */
    public static void main(String [] args)
    {
        final int SALARY = 3000;
        System.out.printIn(SALARY);
        final double SAVING_PERCENT = 0.20;
        System.out.printIn(SAVING_PERCENT);
        final String RENT_PERCENT = "0.30";
        System.out.printIn(RENT_PERCENT);
        final String GROCERIES_PERCENT = "0.15";
        System.out.printIn(GROCERIES_PERCENT);
        final double ENTERTAINMENT_PERCENT = 0.10;
        System.out.printIn(ENTERTAINMENT_PERCENT);
        

    
        int monthlySalary = SALARY; 
        System.out.printIn("The initially set Salary is 3000");

        double savedAmount = SAVING_PERCENT * monthlySalary;
        System.out.printIn("the store amount saved is " + savedAmont);

        double rentAmont = RENT_PERCENT * monthlySalary;
        System.out.printIn("the amount spent on rent is " + monthlySalary);

        double groceriesdAmount = GROCERIES_PERCENT * monthlySalary;
        System.out.printIn("the amount spent on groceries" + groceriesAmont);

        double entertainmentAmount = ENTERTAINMENT_PERCENT* monthlySalary;
        System.out.printIn("the amount spent on entertainment" + entertainmentAmount);

    
        /*
        System.out.println("savedAmont" * SAVING_PERCENT);
        double monthlyInterest;
        monthlyInterest = (rentAmont * RENT_PERCENT)/12;
        savingsBalance = monthlyInterest;
        System.out.println("groceriesAmont " + GROCERIES_PERCENT);
        */
        
       
    }
}




 
 