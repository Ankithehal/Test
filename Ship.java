import java.util.*;
import java.lang.*;
import java.io.*;

class Ship
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int i=1;i<=t;i++){
	        char id = sc.next().charAt(0);
	        if(id=='B'|| id == 'b'){
	            System.out.println("BattleShip");
	        }
	        else if(id=='C'|| id == 'c'){
	            System.out.println("Cruiser");
	        }
	        else if(id=='D'|| id == 'd'){
	            System.out.println("Destroyer");
	        }
	        else if(id=='F' || id == 'f'){
	            System.out.println("Frigate");
	        }
	    }
	}
}
