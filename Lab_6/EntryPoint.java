import java.util.Scanner;

public class EntryPoint {
public static void main (String[] args) {
      	
Scanner scan = new Scanner (System.in);
int val;
	
System.out.println("Which service would you like to use? \n" + 
"[1]:" + "Basic week visualizer \n" + "[2]:"+" Advanced week visualizer \n" + "[3]:" + " Basic calculator \n" + "[4]:" +  "Employee repertoire \n");
val = scan.nextInt();

switch(val) {

case 1:
BasicWeek first = new BasicWeek();
first.printDays();
break;

case 2:
AdvancedWeek second = new AdvancedWeek();
second.printDays2();
break;

case 3:
Calculator third = new Calculator();
break;

case 4:
Employee fourth = new Employee();
fourth.toString();
System.out.println(fourth);
break;

default:
System.out.println("Please enter a number between 1 and 4: ");
	}
				
		
    }
}