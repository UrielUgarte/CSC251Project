public class Policy
{
   //all variables are set to private
   private String policyNumber;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String smokingStatus;
   private double holderHeight;
   private double holderWeight;
   
   
   //no-arguments constructor
   public Policy()
   {
      policyNumber = " ";
      providerName = " ";
      holderFirstName = " ";
      holderLastName = " ";
      holderAge = 0;
      smokingStatus = " ";
      holderHeight = 0.0;
      holderWeight = 0.0;
   }
   
   //arguments constructor
   public Policy(String num, String provider, String fName, String lName, 
                  int age, String status, double height, double weight)
   {
      policyNumber = num;
      providerName = provider;
      holderFirstName = fName;
      holderLastName = lName;
      holderAge = age;
      smokingStatus = status;
      holderHeight = height;
      holderWeight = weight;
   }
   
   // Start of setter methods
   
   //@param num Stores the policy number
   public void setPolicyNumber(String num)
   {
      policyNumber = num;
   }
   
   //@param provider Stores the provider name
   public void setProviderName(String provider)
   {
      providerName = provider;
   }
   
   //@param fName Stores the First Name of customer
   public void setFirstName(String fName)
   {
      holderFirstName = fName;
   }
   
   //@param lName Stores the Last Name of Customer
   public void setLastName(String lName)
   {
      holderLastName = lName;
   }
   
   //@param age Stores the age of customer
   public void setAge(int age)
   {
      holderAge = age;
   }
   
   //@param status Stores the smoking status of the customer
   public void setStatus(String status)
   {
      smokingStatus = status;
   }
   
   //@param height Stores the height in inches 
   public void setHeight(double height)
   {
      holderHeight = height;
   }
   
   //@param weight Stores the weight in pounds
   public void setWeight(double weight)
   {
      holderWeight = weight;
   }
   
   //Start of getter methods
   
   //@return The policy number
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   //@return The provider name
   public String getProviderName()
   {
      return providerName;
   }
   
   //@return the first name
   public String getFirstName()
   {
      return holderFirstName;
   }
   
   //@return The last name
   public String getLastName()
   {
      return holderLastName;
   }
   
   //@return The Age
   public int getAge()
   {
      return holderAge;
   }
   
   //@return the Smoking Status
   public String getStatus()
   {
      return smokingStatus;
   }
   
   //@return The height
   public double getHeight()
   {
      return holderHeight;
   }
   
   //@return The weight
   public double getWeight()
   {
      return holderWeight;
   }
   
   //Start of calculation methods
   
   //@return The calculated BMI 
   public double getBMI()
   {
      double BMI;
      BMI = (holderWeight * 703)/(holderHeight * holderHeight);
     return BMI;
   }
   
   //@return baseFee plus additional fees
   public double getPolicyPrice(double bmI)
   {
      double baseFee = 600.0;
      double addFee = 0.0;
      double BMI = bmI;
      
      if(holderAge > 50)
      {
         baseFee = baseFee + 75;
      }
      else{}
      
      if(smokingStatus.equalsIgnoreCase("smoker"))
      {
         baseFee = baseFee + 100;
      }
      else{}
      
      if(BMI > 35)
      {
         addFee = (BMI - 35) * 20;
      }
      else{}
      
     return baseFee + addFee;
   }
}