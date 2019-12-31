package fdp;


public class Machine
{
    private final String color;
    private final Double price;
    
   public Machine(String color, Double price)
   {
       this.color = color;
       this.price = price;
   }

   public void showInfo(String type)
   {
       System.out.println(type + "\n" + "Color: " + color + "\n" + "Price: " + price);
   }
      
    
}
