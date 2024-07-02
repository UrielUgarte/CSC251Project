import java.util.*;
import java.io.File;
import java.io.IOException;

public class Project_Uriel_Ugarte
{
   public static void main(String[] args) throws IOException
   {
      String policyNumber1 = " "; //stores policy number
      String providerName1 = " "; //stores provider name
      String holderFirstName = " "; //stores first name
      String holderLastName = " "; //stores last name
      int holderAge = 0; //stores the policy holder's age
      String smokingStatus = " "; //stores the policy holder's smoking status
      double holderHeight = 0.0; //stores the policy holder's height
      double holderWeight = 0.0; //stores the policy holder's weight
      
      //Initiate variables to count smokers and nonsmokers apart
      int smoker = 0;
      int nonsmoker = 0;
                  
      //Create Array list 
      ArrayList<Policy> policies = new ArrayList<Policy>();
      
      //Create A file object
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      //PolicyHolder class created
      PolicyHolder person = new PolicyHolder(holderFirstName, holderLastName, holderAge,
                              smokingStatus, holderHeight, holderWeight);
      
      //Policy.class is initialized and declared
      //Policy info = new Policy(policyNumber, providerName, holderFirstName, holderLastName, 
                                   // holderAge, smokingStatus, holderHeight, holderWeight);
                                   
      /**if(!file.exists())
      {
         System.out.println("Unable to locate file");
         System.exit(0);
      }*/

      
      while(inputFile.hasNext())
       {
         policyNumber1 = inputFile.nextLine();
         providerName1 = inputFile.nextLine();
         holderFirstName = inputFile.nextLine();
         holderLastName = inputFile.nextLine();
         holderAge = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         holderHeight = inputFile.nextDouble();
         holderWeight = inputFile.nextDouble();
         
         if(inputFile.hasNext())
               inputFile.nextLine();
         if(inputFile.hasNext())
               inputFile.nextLine();
            
           if(smokingStatus.equalsIgnoreCase("smoker"))
               smoker += 1;
            else
               nonsmoker += 1;
            
                                          
      //Add objects to ArrayList
      policies.add(new Policy(policyNumber1, providerName1, person));

      ////
      }
      //inputFile.close();
      
      //double BMI = policies.getBMI();
      
      for(Policy policy : policies)
      { 
         //display information about the Policy
         //System.out.println("Policy Number: " + policy.getPolicyNumber());
         //System.out.println("Provider Name: " + policy.getProviderName());
         //System.out.println("Policyholder's First Name: " + policy.getFirstName());
         //System.out.println("Policyholder's Last Name: " + policy.getLastName());
         //System.out.println("Policyholder's Age: " + policy.getAge());
         //System.out.println("Policyholder's Smoking Status: " + policy.getStatus());
         //System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
         //System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
         //System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
         //System.out.printf("Policy Price: $%.2f\n", policy.getPolicyPrice(policy.getBMI()));
         
         System.out.print(policies.toString());
         System.out.println();
         
         }

      
                                  
        System.out.println("The number of policies with a smoker is: "+ smoker);
        System.out.println("The number of policies with a non-smoker is: "+ nonsmoker);
            
      
   }


////
}