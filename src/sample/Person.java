
/**************************************************************************************************
 * Create a Person class with a amount attribute 
 * Amount will be the number of person there is
 *
 * Get the amount and set the amount
 ***************************************************************************************************/
package sample;
public class Person {
    public int amount;

    public Person() {
        this.amount = 0;
    }
    public Person(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }


    public void setAmount(int amount) {
        this.amount = amount;
    }

}