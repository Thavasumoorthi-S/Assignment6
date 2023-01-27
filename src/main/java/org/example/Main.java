package org.example;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Creditcard implements Cloneable
{
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    String holdername;
    Long cardnumber;
    String expiredate;
    Creditcard(String holdername,Long cardnumber,String expiredate)
    {
        this.holdername=holdername;
        this.cardnumber=cardnumber;
        this.expiredate=expiredate;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public String equalis(Creditcard cc1)
    {
        String result;
        if(cardnumber.equals(cc1.cardnumber))
        {
            return "true";
        }
        return "false";
    }
    public static void main(String[] args) throws CloneNotSupportedException
    {
        String holdername;
        long cardnumber;
        String expiredate;
        String holdername1;
        long cardnumber1;
        String expiredate1;
        Scanner sc=new Scanner(System.in);
        LOGGER.log(Level.INFO,"Enter the Name: ");
        holdername=sc.nextLine();
        LOGGER.log(Level.INFO,"Enter the cardnumber:  ");
        cardnumber=sc.nextLong();
        sc.nextLine();
        LOGGER. log(Level.INFO,"Enter the expiredate:");
        expiredate=sc.nextLine();
        Creditcard cc=new Creditcard(holdername, cardnumber, expiredate);
        Creditcard cc1=(Creditcard) cc.clone();
        LOGGER.log(Level.INFO,"current object creditcardnumber and clonable object creditcard numbers are same? :"+cc.equalis(cc1));
        LOGGER.log(Level.INFO,"Enter the Name: ");
        holdername1=sc.nextLine();
        LOGGER.log(Level.INFO,"Enter the cardnumber:  ");
        cardnumber1=sc.nextLong();
        sc.nextLine();
        LOGGER.log(Level.INFO,"Enter the expiredate:");
        expiredate1=sc.nextLine();
        Creditcard cc2=new Creditcard((holdername1), cardnumber1, expiredate1);
        LOGGER.log(Level.INFO,"current object creditcardnumber and new object creditcard numbers are same? :"+cc.equalis(cc2));
    }
}
