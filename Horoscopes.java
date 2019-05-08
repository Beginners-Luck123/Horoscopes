/*Dynie Mesoneuvre
P-2
Purpose = output horoscopes*/
import java.util.Scanner;
public class Horoscopes
{
public static void main(String[] args)
{
	String month = "";
	int day;
	Scanner scan = new Scanner(System.in);
	//System.out.print("What's your birth month?");
	
	/*String input = scan.nextLine();
	 month = input.substring(0, input.indexOf(" "));
	String Bday = input.substring(input.indexOf(" "));
	day = (int)(Integer.parseInt(Bday.trim()));
	System.out.print(month + " I got the day " + day); */
	
	System.out.println("What's your birth month?");
	month = scan.nextLine();
	System.out.println("Day?");
	day = scan.nextInt();
	System.out.println(birthday(month, day));
    horoscope(month, day);
}
public static String birthday (String month, int day)
{
	String zodiac = "";
	if (month.equals("January"))
	 if (day <= 20)
		zodiac = "Capricorn";
	 else
		 zodiac = "Aquarius";
	else if(month.equals("February"))
	  if(day <= 19)
		 zodiac = "Aquarius";
	   else
         zodiac = "Pisces";
	else if(month.equals("March"))
		if(day <= 21)
	     zodiac = "Pisces";
		else
        zodiac = "Aries";
	else if(month.equals("April"))
	   if(day <= 21)
		 zodiac = "Aries";
	   else
		 zodiac = "Taurus";
	else if(month.equals("May"))
	   if(day <= 21)
	zodiac = "Taurus";
	   else
    zodiac = "Gemini";
	else if(month.equals("June"))
	   if(day <= 21)
		   zodiac = "Gemini";
	    else
	    	zodiac = "Cancer";
	else if(month.equals("July"))
	   if(day <= 23)
		   zodiac = "Cancer";
	   else
		   zodiac = "Leo";
	else if(month.equals("August"))
	   if(day <= 23)
		   zodiac = "Leo";
	   else
		   zodiac = "Virgo";
	else if(month.equals("September"))
	   if(day <= 23)
		   zodiac = "Virgo";
	   else
		   zodiac = "Libra";
	else if(month.equals("October"))
	   if(day <= 23)
		   zodiac = "Libra";
	   else
		   zodiac = "Scorpio";
	else if(month.equals("November"))
	   if(day <= 22)
		   zodiac = "Scorpio";
	   else
		   zodiac = "Sagittarius";
   else if(month.equals ("December"))
      if (day <= 20)
	    zodiac = "Sagittarius";
	    else
	    	zodiac = "Capricorn";
   else 	  
      return "try again bro";
 return zodiac;
}
 public static void horoscope(String month, int day)
 {
 String zodiac = (birthday(month, day));
	if (zodiac.equals("Capricorn"))
		System.out.println("Today's gonna be rough, look out for any bad omens, good luck.");
	else if (zodiac.equals("Pisces"))
		System.out.println("You're gonna have a great day! Just relax and keep up that positive attitude!");
	else if (zodiac.equals("Sagittarius"))
		System.out.println("Watch out for your diet, gained a lil weight last week.");
		else if (zodiac.equals("Cancer"))
		System.out.println("Things might be a bit wishy - washy today, especially your emotions. Watch out for your ex.");
		else if (zodiac.equals("Libra"))
			System.out.println("You need to get your act together, things are gonna get rocky from here on out.");
		else if (zodiac.equals("Virgo"))
			System.out.println("Why must you nitpick everything? Just let the day go by, stop being a worrywart.");
		else if (zodiac.equals("Leo"))
			System.out.println("Today is going to be an adventure, just like yesterday, and the day before...");
		else if (zodiac.equals("Taurus"))
			System.out.println("There's not much to say, that's it.");
		else if (zodiac.equals("Scorpio"))
			System.out.println("I would say things will go your way, but I'm sure you already know that.");
		else if (zodiac.equals("Aries"))
			System.out.println("Life is going great! Today is just your day, be confident in your choices you're doing just fine!");
		else if (zodiac.equals("Gemini"))
			System.out.println("You're walking through rocky waters buddy, watch out for some of your friends. Might just get stabbed in the back.");
		else if (zodiac.equals("Aquarius"))
			System.out.println("I believe in you, we believe in you, but do you believe in yourself? Don't be afraid to stand out today.");
}


 
}