import java.util.*;  
public class Reversenum {
	
	public static void performReverse(int number){    
        int rev = 0;  
        int temp = number;  
        while(number != 0)     
        {    
           
            int rem = number % 10;   
           
            rev = rev * 10 + rem;    
            
            number = number/10;    
        }    
        System.out.println(rev+" is the reverse of the number "+temp);    
    }     
  
    
    public static void main(String[] args) {   
      
   
        Scanner sc = new Scanner(System.in);   
        int number = sc.nextInt();  
      
        performReverse(number);  
    }  
}  

