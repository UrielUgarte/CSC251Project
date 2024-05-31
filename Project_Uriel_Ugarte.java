import java.util.Scanner;

public class Project_Uriel_Ugarte
{
   public static void main(String[] args)
   {
      String policyNumber; //stores policy number
      String providerName; //stores provider name
      String holderFirstName; //stores first name
      String holderLastName; //stores last name
      int holderAge; //stores the policy holder's age
      String smokingStatus; //stores the policy holder's smoking status
      double holderHeight; //stores the policy holder's height
      double holderWeight; //stores the policy holder's weight
      
      Scanner keyboard = new Scanner(System.in);
      
      //Gets the number of the policy
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextLine();
      //Gets the provider name that insures policy holder
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      //Gets policy holder's First Name
      System.out.print("Please enter the Policyholder's First Name: ");
      holderFirstName = keyboard.nextLine();
      //Gets policy holder's Last Name
      System.out.print("Please enter the Policyholder's Last Name: ");
      holderLastName = keyboard.nextLine();
      //Gets policy holder's age
      System.out.print("Please enter the Policyholder's Age: ");
      holderAge = keyboard.nextInt();
      
      keyboard.nextLine();
      //Gets policy holder's smoking status
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      //while loop ensures the user inputs one of the 2 options ignoring capitalization
      while( !(smokingStatus.equalsIgnoreCase("smoker")) && !(smokingStatus.equalsIgnoreCase("non-smoker")))
      {
         System.out.print("Sorry. please enter a valid response.\n");
         System.out.print("Please re-enter the Policyholder's Smoking Status (smoker/non-smoker): ");
         smokingStatus = keyboard.nextLine();
      }
      //gets height of policy holder
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      holderHeight = keyboard.nextDouble();
      //Gets weight of policy holder
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      holderWeight = keyboard.nextDouble();
      
      //Policy.class is initialized and declared
      Policy info = new Policy(policyNumber, providerName, holderFirstName, holderLastName, 
                                    holderAge, smokingStatus, holderHeight, holderWeight);
      
      
      //this line is used to separate the output from the rest of the input                              
      System.out.println("----------------------------------------------------------"); 
                                   
      //Output information
      System.out.println("Policy Number: " + info.getPolicyNumber());
      System.out.println("Provider Name: " + info.getProviderName());
      System.out.println("Policyholder's First Name: " + info.getFirstName());
      System.out.println("Policy Holder's Last Name: " + info.getLastName());
      System.out.printf("Policyholder's Age: %d\n", info.getAge());
      System.out.println("Policyholder's Smoking Status: "+ info.getStatus());
      System.out.printf("Policyholder's Height: %.1f\n", info.getHeight());
      System.out.printf("Policyholder's Weight: %.1f\n", info.getWeight());
      System.out.printf("Policyholder's BMI: %.2f\n", info.getBMI());
      System.out.printf("Policy Price: $%.2f\n", info.getPolicyPrice(info.getBMI()));
      
   }


////
}