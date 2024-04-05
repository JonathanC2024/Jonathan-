import java.util.Random;
public class Main{
  public static int rollDice(){
    Random rand=new Random();
    return rand.nextInt(8)+1;
  }
  public static void main(String[]args){
    System.out.println("Let's roll the dice!");
    int roll1=rollDice();
    int roll2=rollDice();
    System.out.println("The first dice rolled:"+roll1);
    System.out.println("The second dice rolled."+roll2);
    int total=roll1+roll2;
    System.out.println("The total of the two dice is:"+total);
  }
}