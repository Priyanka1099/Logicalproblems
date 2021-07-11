
public class fibonacci {
	
        static int number1=0, number2=1,number3=0;      
	    static void Fibo(int count){      
	        if(count>0){      
	            number3 = number1 + number2;      
	            number1 = number2;      
	            number2 = number3;      
	            System.out.print(" "+number3);     
	            Fibo(count-1);      
	        }      
	    }      
	    public static void main(String args[]){      
	        int count=5;  
	        
	        System.out.print(number1+" "+number2);      
	        
	        Fibo(count-2);     
	    }       
	}   
