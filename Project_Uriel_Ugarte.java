import java.io.*;
import java.util.*;

public class Project_Uriel_Ugarte
{
   public static void main(String[] args) throws IOException
   {
      String policyNumber = " "; //stores policy number
      String providerName = " "; //stores provider name
      String holderFirstName = " "; //stores first name
      String holderLastName = " "; //stores last name
      int holderAge = 0; //stores the policy holder's age
      String smokingStatus = " "; //stores the policy holder's smoking status
      double holderHeight = 0.0; //stores the policy holder's height
      double holderWeight = 0.0; //stores the policy holder's weight
      
      //Initiate variables to count smokers and nonsmokers apart
      int smoker = 0;
      int nonsmoker = 0;
      
      Scanner keyboard = new Scanner(System.in);
            
      //Create Array list 
      ArrayList<Policy> policies = new ArrayList<Policy>();
      
      //Create A file object
      File paper = new File("PolicyInformation.txt");
      
      Scanner inputFile = new Scanner(paper);
      
      //Policy.class is initialized and declared
      Policy info = new Policy(policyNumber, providerName, holderFirstName, holderLastName, 
                                    holderAge, smokingStatus, holderHeight, holderWeight);
                                    
      if(!paper.exists())
      {
         System.out.println("Unable to locate file");
         System.exit(0);
      }

      
       while(inputFile.hasNext());
       {
         policyNumber = inputFile.nextLine();
         providerName = inputFile.nextLine();
         holderFirstName = inputFile.nextLine();
         holderLastName = inputFile.nextLine();
         holderAge = inputFile.nextInt();
         smokingStatus = inputFile.nextLine();
         holderHeight = inputFile.nextDouble();
         holderWeight = inputFile.nextDouble();
         
         if(inputFile.hasNext())
            { 
               inputFile.nextLine();
               inputFile.nextLine();
            }
            
           /** 
           if(smokingStatus.equalsIgnoreCase("smoker"))
               smoker += 1;
            else
               nonsmoker += 1;
            */
                                          
      //Add objects to ArrayList
      policies.add(new Policy(policyNumber, providerName, holderFirstName, holderLastName, 
                                    holderAge, smokingStatus, holderHeight, holderWeight));

      ////
      }
      inputFile.close();
      
      double BMI = info.getBMI();
      
      for(int i = 0; i < policies.size(); i++)
      {
         System.out.printf("Policy Number: %s\n"+
                       "Provider Name: %s\n"+
                       "Policyholder's First Name: %s\n"+
                       "Policyholder's Last Name: %s\n"+
                       "Policyholder's Age: %d\n"+
                       "Policyholder's Smoking Status (smoker/non-smoker): %s\n"+
                       "Policyholder's Height: %f inches\n"+
                       "Policyholder's Weight: %f pounds\n"+
                       "Policyholder's BMI: %f\n"+
                       "Policy Price: $%,.2f\n\n",
                       policies.get(i).getPolicyNumber(), policies.get(i).getProviderName(),
                       policies.get(i).getFirstName(), policies.get(i).getLastName(),
                       policies.get(i).getAge(), policies.get(i).getStatus(),
                       policies.get(i).getHeight(), policies.get(i).getWeight(),
                       policies.get(i).getBMI(), policies.get(i).getPolicyPrice(BMI));
      
      }
      
     // System.out.println("The number of policies with a smoker is: "+ smoker);
      //System.out.println("The number of policies with a non-smoker is: "+ nonsmoker);
      
      
      /**
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
      */
      
      //Policy.class is initialized and declared
     // Policy info = new Policy(policyNumber, providerName, holderFirstName, holderLastName, 
      //                              holderAge, smokingStatus, holderHeight, holderWeight);
      
      /**
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
      */
   }


////
}