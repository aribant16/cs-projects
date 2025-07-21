import java.util.Random;
public class DiceRollExceptionDriver{
public static void main(String[]args){
//random genertor 
Random rand = new Random();
//create a random number between 1 and 6 
int d1 = rand.nextInt(6)+1;
int d2 = rand.nextInt(6)+1;
int num = d1 +d2;
//no args constructor
//try------------------
try{
if (num > 7) {
throw new DiceRollException("Number is too high");
}
else if (num < 7)
{
throw new DiceRollException("Number is too low");
}
System.out.println("You rolled = " + num +"!");
//catch----------------------
}
catch(DiceRollException d){
System.out.println(d.getMessage() + ", you lose.");
}

}
}