public class Hltfive {
    public static void main(String args[]) {
    
    /////////////////////////////////////////////////////////////////////////////////Question 1//////////////////////////////////////////////////////////////////////
    
    int n = 11; //user input
    boolean isPrime = true; //a flag to check is we have a prime or not
    
    if(n <= 1){
        
        System.out.println("is not a prime number");
    }
    else{
        
        //for loop to check number between 2 and user input n-1
        
            for(int i = 2; i < n; i++){
                
                //Checks if user input is divisible by numbers between 2 ... n-1
                //if its divisible by any of the numbers i, then n is not a prime number 
            
            if(n % i == 0){
                
                System.out.println(n + " is not a prime number" + "\n");
                
                //Set our flag to false and end the program
                
                isPrime = false; 
                
                break;
                
                
            }
           
        }
        
         
            if(isPrime == true)
            {
                System.out.println(n + " is a prime number" + "\n");
                
            }
    
    }
  

   
   ////////////////////////////////////////////////////////////////Question 3 //////////////////////////////////////////////////////////////////////
   
     int sum = 0;
   
   for(int i = 1; i <= 10; i++){
       
      sum = sum + i;
       
   }
 
  System.out.println("The sum of numbers 1 to 10 is: " + sum +"\n");
  
  
  //////////////////////////////////////////////////////////Question 4 //////////////////////////////////////////////////////////
  
  for(int i = 10; i >= 1; i--){
      
      System.out.println(i + "\n");
      
      
  }
   
   
     //////////////////////////////////////////////////////////////////// Question 2 ////////////////////////////////////////////////////////////////
  
  
  for(int i = 100; i <= 500; i++){
       
      System.out.println(i);
                
  }
        
      
    }
    
    
}