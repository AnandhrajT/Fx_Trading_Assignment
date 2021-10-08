import java.util.Scanner;
import java.util.ArrayList;

class Trading{
    public String Name;
    public int Amount;
    public String Rate;
    public String CurrencyPair;
}

public class FXTRADE {

	 static ArrayList<Trading> Array=new ArrayList<Trading>();
	 static Double USD_Value=66.00d;

	    public static void main(String[] args) 
	    {
	        while(true){
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Select any One Choice");
	        System.out.println("1.Book Trade\n2.Print Trades\n3.Exit\n");
	        int Option=scan.nextInt();
	        if(Option==1)
	        {
	            Trade temp=new Trade();
	            System.out.println("Enter Customer Name");
	            temp.Name=scan.next();
	            scan.nextLine();
	            System.out.println("Enter Currency Pair");
	            temp.CurrencyPair=scan.next();
	            if(temp.CurrencyPair.equals("USDINR"))
	            {
		            System.out.println("Enter amount to transfer");
		            temp.Amount=scan.nextInt();
		            System.out.println("Do you want to get Rate");
		            temp.Rate=scan.next();
		            scan.nextLine();
		            double TransferAmount=temp.Amount*USD_Value;
		            System.out.println("You are transferring INR"+ TransferAmount +"to "+temp.Name);
		            System.out.println("1.Book/2.Cancel this trade?");
		            int book_cancel=scan.nextInt();
		            if(book_cancel==1)
		            {
		            	Array.add(temp);
		            	double Total=temp.Amount*USD_Value;
		                System.out.println("Trade for "+temp.CurrencyPair+" has been booked with rate"+USD_Value+",The amount of Rs"+ Total +"will be transferred in 2 working days to "+temp.Name);
		            }
		            else
		            {
		                System.out.println("Trade is Canceled.");
		            }
	            }
	            else
	            {
	            	System.out.println("Enter Valid Input");
	            }
	        }
	        else if(option==2)
	        {
	        	printValues();
	        }
	        else
	        {
	            System.out.println("Do you really want to exit (Y/N)");
	            char opt=scan.next().charAt(0);
	            if(opt=='Y'){
	                System.out.println("Bye - have a good day");
	                break;
	            }
	        }
	    }
	}
	    
	    public static void printValues()
	    {
	    	 System.out.println("TradeNo\tCurrencyPair\tCustomerName\tAmount\tRate");
	            for(int i=0;i<Array.size();i++)
	            {
	                Trade temp=Array.get(i);
	                System.out.println((i+1)+"\t"+temp.CurrencyPair+"\t\t"+temp.Name+"\t\t"+(temp.Amount*USD_Value)+"\t"+USD_Value);
	            }
	    }
	}
