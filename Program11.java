import java.util.*;
import java.text.DecimalFormat;

public class Program11{
	
	public static void main (String[] args) {
	
        String country_code[]={"CAD", "HKD", "SGD", "USD"};
        String country_name[]={"Canada", "Hong Kong", "Singapore", "USA"};
        double exg_rate[]={60.78, 9.74, 56.18, 76.21};
		
        int flag=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the currency code");
        String cur=sc.nextLine().toUpperCase();
            
        for(int i=0;i<=3;i++) {
                if(cur.equals(country_code[i])) { 
				
                    System.out.println("Enter the amount");
                    int amt=sc.nextInt();
                    double ans=amt*exg_rate[i];
                    DecimalFormat f= new DecimalFormat("########0.00");
                    System.out.println(country_name[i]+" dollar "+amt+" equals to "+f.format(ans)+" Indian Rupee");
                    flag++;
                    break;
                }
            }
            
            if(flag==0)
				System.out.println("Currency code not found");
            
    }
}
