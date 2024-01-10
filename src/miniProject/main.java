package miniProject;
import java.util.*;
import java.awt.Desktop;
import java.io.*;

public class main{
   public static void main(String[] args) throws IOException 
   {
	   File file1 = new File("Password.txt");
	   Scanner sc = new Scanner(System.in);
	   PrintStream stream = new PrintStream(file1);
	   PrintStream stdout = System.out;
	   String title;
	   int c;
       do 
       {
    	   System.out.print("1. Generate new password \n2. View generated passwords\n3. Exit\nEnter your choice: ");
    	   c=sc.nextInt();
    	   String s=sc.nextLine();
    	   switch(c)
    	   {
    		   case 1:
    			   System.out.print("Enter Title: ");
    			   title=sc.nextLine();
    			   System.out.print("Enter username: ");
    			   String un=sc.nextLine();
    			   System.out.print("Enter password length: ");
    			   int l=sc.nextInt();
    			   char[] pass=new char[l];
    			   pass=generatePassword(l);
    			   System.out.println(pass);
    		   	   System.setOut(stream);
    		   	   System.out.print("\n\nTilte: "+title+"\nUsername: "+un+"\nPassword: ");
    		   	   for(int i=0;i<l;i++)
    		   		   System.out.print(pass[i]);
    		   	   System.setOut(stdout);
    		   	   break;
    		   case 2:
    			   Desktop d=Desktop.getDesktop();
    			   d.open(file1);
    		   
    			   
    	   }
       }while(c!=3&&c<3);
  }

   public static char[] generatePassword(int length) 
   {
      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
      String specialCharacters = "!@#$ &%^*";
      String numbers = "1234567890";
      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
      Random random = new Random();
      char[] password = new char[length];

      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
      password[3] = numbers.charAt(random.nextInt(numbers.length()));
   
      for(int i = 4; i< length ; i++) 
      {
         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
      }
      return password;
   }
}