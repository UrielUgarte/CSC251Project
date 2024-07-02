public class PolicyHolder
{
   private String FirstName;
   private String LastName;
   private int Age;
   private String smoke;
   private double Height;
   private double Weight;
   
   public PolicyHolder(String first, String last, int age, String s, double hei, double wei)
   {
     FirstName = first;
     LastName = last;
     Age = age;
     smoke = s;
     Height = hei;
     Weight = wei;
   }
   
   //Copy costructor
   public PolicyHolder(PolicyHolder obj)
   {
      FirstName = obj.FirstName;
      LastName = obj.LastName;
      Age = obj.Age;
      smoke = obj.smoke;
      Height = obj.Height;
      Weight = obj.Weight;
   }
   
   public void setFirst(String first)
   {
      FirstName = first;
   }
   
   public void setLast(String last)
   {
      LastName = last;
   }
   
   public void setAge1(int age)
   {
      Age = age;
   }
   
   public void setSmoke(String s)
   {
      smoke = s;
   }
   
   public void setHeight1(double hei)
   {
      Height = hei;
   }
   
   public void setWeight1(double wei)
   {
      Weight = wei;
   }
   
   //Getters
   public String getFirst()
   {
      return FirstName;
   }
   
   public String getLast()
   {
      return LastName;
   }
   
   public int getAge1()
   {
      return Age;
   }
   
   public String getSmoke()
   {
      return smoke;
   }
   
   public double getHeight1()
   {
      return Height;
   }
   
   public double getWeight1()
   {
      return Weight;
   }
   
   public String toString()
   {
      return "Policyholder's First Name: " + FirstName +
         "\nPolicyholder's Last Name: " + LastName +
         "\nPolicyholder's Age: " + Age +
         "\nPolicyholder's Smoking Status: " + smoke +
         "\nPolicyholder's Height: " + Height + " inches" +
         "\nPolicyholder's Weight: " + Weight + " pounds\n";
   }
   
}