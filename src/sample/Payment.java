
/**************************************************************************************************
 * Create a class that will add the total of kid/adult/senior enter, and calculate the grand total 
 * Create Payment class
 * Give it Kid, Adult, Senior classes as attributes
 * Create kid, adult, senior object using the classes
 ***************************************************************************************************/
package sample;
public class Payment {
    private Kid kid;
    private Adult adult;
    private Senior senior;

    public Payment(Adult adult, Kid kid, Senior senior) {
        this.adult = adult;
        this.kid = kid;
        this.senior = senior;
    }

    /**************************************************************************************************
     * Create getter.
     * Get the total
     *
     * Then use the total, to find grandTotal
     ***************************************************************************************************/

    public int getTotal() {
        int total = adult.getAmount() + kid.getAmount() + senior.getAmount();
        return total;
    }


    public double grandTotal() {

        final double KID_TICKET_PRICE = 8.25;
        final double SENIOR_TICKET_PRICE = 8.25;
        final double ADULT_TICKET_PRICE = 12.25;
        final double TAX_CONSTANT = 0.05;

        double grandTotal = (((adult.getAmount() * ADULT_TICKET_PRICE) + (kid.getAmount() * KID_TICKET_PRICE) + (senior.getAmount() * SENIOR_TICKET_PRICE)));
        double tax = grandTotal * TAX_CONSTANT;
        return grandTotal + tax;
    }

    public String testMath() {
        final int x = 5;
        final int y = 6;

        int math = y + x;

        String result = Integer.toString(math);

        return result;


    }
}