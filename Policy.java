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
   
   public void setPolicyNumber(String num)
   {
      policyNumber = num;
   }
   
   public void setProviderName(String provider)
   {
      providerName = provider;
   }
   
   public void setFirstName(String fName)
   {
      holderFirstName = fName;
   }
   
   public void setLastName(String lName)
   {
      holderLastName = lName;
   }
   
   public void setAge(int age)
   {
      holderAge = age;
   }
   
   public void setStatus(String status)
   {
      smokingStatus = status;
   }
   
   public void setHeight(double height)
   {
      holderHeight = height;
   }
   
   public void setWeight(double weight)
   {
      holderWeight = weight;
   }
   
   //Start of getter methods
   
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public String getFirstName()
   {
      return holderFirstName;
   }
   
   public String getLastName()
   {
      return holderLastName;
   }
   
   public int getAge()
   {
      return holderAge;
   }
   
   public String getStatus()
   {
      return smokingStatus;
   }
   
   public double getHeight()
   {
      return holderHeight;
   }
   
   public double getWeight()
   {
      return holderWeight;
   }
   
   //Start of calculation methods
   
   public double getBMI()
   {
      double BMI;
      BMI = (holderWeight * 703)/(holderHeight * holderHeight);
     return BMI;
   }
   
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