import java.util.*;
public class Program05 
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        ArrayList<String> L = new ArrayList<String>();
        
        System.out.println("Enter the Sentence : ");
        String n = s.nextLine();
       
       StringTokenizer t =  new StringTokenizer(n);
       while(t.hasMoreTokens())
       {
          L.add(t.nextToken()); 
       } 
        Collections.sort(L);
       
       for(int k=0; k<L.size();k++) 
       {
          System.out.print(L.get(k));
          System.out.print(" ");
       }
    }
}
