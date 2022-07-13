import java.util.Random;
import java.util.Scanner;

class Tosscoin{
    public static void main(String[] args){
	Random rand = new Random();
	Scanner sc=new Scanner(System.in);
	String name;
	System.out.println("Who are you?");
	System.out.print(">");
	name = sc.next();
	System.out.println("Hello, "+name+"!");
	
	int x,ch=0,ct=0;
	
	System.out.println("Tossing a coin...");	
	for(int i=1;i<=3;i++){
	    x=rand.nextInt(2);
	    System.out.print("Round "+i+":" );
	    if(x==0){
		ch++;
		System.out.println("Heads");

	    }else {
		ct++;
		System.out.println("Tails");
	    }		
	}
	System.out.println("Head: "+ch+", "+"Tails:"+ct);
	if(ch>ct)System.out.println(name+" won!");
	else System.out.println(name+" lost!");
    }
}
