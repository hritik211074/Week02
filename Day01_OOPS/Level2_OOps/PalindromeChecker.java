import java.util.*;

public class PalindromeChecker   {
    private String text;
	
    public PalindromeChecker(){
		
       // Create a scanner object to read user input
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a string: ");
	   this.text=sc.next();
    }
	
	// Method to check palindromic
	public boolean checkPalindrome(){
		int i=0;
		int j=this.text.length()-1;
		while(i<j){
			if(this.text.charAt(i)!=this.text.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
    public static void main(String[] args) {
	   
	   PalindromeChecker obj=new PalindromeChecker();
	   
	   boolean check=obj.checkPalindrome();
	   
	   if(check){
		   System.out.println("Entered string is palindromic");
	   }else{
		   System.out.println("Entered string is not palindromic");
	   }
	   
    }
}