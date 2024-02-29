/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Accounting;

/**
 *
 * @author SUGUS
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;
    
    public Account getAccount(int index){
        return acct[index];
    }
    
    public void addAccount(Account acct){
        this.acct[numOfAccount] = acct;
        numOfAccount += 1;
    }
    
    public int getNumOfAccount(){
        return numOfAccount;
    }
    
    public Customer(){
        this("","");
        acct = new Account[5];
        
    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    @Override
    public String toString(){
         String word;
        if (acct == null){
            return firstName + " " + lastName + " doesn’t have account.";
        }else{
            if (numOfAccount>1){
                return firstName +" "+ lastName + " has " + numOfAccount +" accounts.";
            }
            else{
                return firstName +" "+ lastName + " has " + numOfAccount +" account.";
            }
        }
        
    }
    public boolean equals(Customer c){
        return this.firstName.equals(c.firstName) && (this.lastName.equals(c.lastName));
    }
    
}
