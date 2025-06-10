import java.util.Scanner; 
public class PalindromePyramid 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in); 
	System.out.println("Enter the number of rows to print");
        int n = sc.nextInt(); 
        int a = n; 
	System.out.println("The palindrome traingle pattern is: ");
        for (int i = 1; i <= n; i++) 
        { 
            for(int j=a;j>1;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            a--;
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}