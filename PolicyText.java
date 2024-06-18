import java.io.*;

public class PolicyText
{
   public static void main(String[] args) throws IOException
   {
      
      PrintWriter outputFile = new PrintWriter("PolicyInformation.txt");
      
      outputFile.println(3450);
      outputFile.println("State Farm");
      outputFile.println("Alice");
      outputFile.println("Jones");
      outputFile.println(20);
      outputFile.println("smoker");
      outputFile.println(65.0);
      outputFile.println(110.0);
      
      outputFile.println("");
      
      outputFile.println(3455);
      outputFile.println("Aetna");
      outputFile.println("Bob");
      outputFile.println("Lee");
      outputFile.println(54);
      outputFile.println("non-smoker");
      outputFile.println(72.0);
      outputFile.println(200.0);
      
      outputFile.println("");
      
      outputFile.println(2450);
      outputFile.println("Met Life");
      outputFile.println("Chester");
      outputFile.println("Williams");
      outputFile.println(40);
      outputFile.println("smoker");
      outputFile.println(71.0);
      outputFile.println(300.0);
      
      outputFile.println("");
      
      outputFile.println(3670);
      outputFile.println("Global");
      outputFile.println("Cindy");
      outputFile.println("Smith");
      outputFile.println(55);
      outputFile.println("non-smoker");
      outputFile.println(62.0);
      outputFile.println(140.0);

      outputFile.println("");

      outputFile.println(1490);
      outputFile.println("Reliable");
      outputFile.println("Jenna");
      outputFile.println("Lewis");
      outputFile.println(30);
      outputFile.println("smoker");
      outputFile.println(60.0);
      outputFile.println(105.0);

      outputFile.println("");
      
      outputFile.println(3477);
      outputFile.println("State Farm");
      outputFile.println("Craig");
      outputFile.println("Duncan");
      outputFile.println(23);
      outputFile.println("smoker");
      outputFile.println(66.0);
      outputFile.println(215.0);



      
      outputFile.close();
      
      
   }
}