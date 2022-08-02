// print the day of the week
public class DayOfWeek {
    public static void main(String[] args) {
	char day = 'f';

        switch(day) {
		case 'M':
		case 'm':
		  System.out.println("Monday");
		  break;
		case 'T':
  		case 't':
		  System.out.println("Tuesday");
		  break;
		case 'W':
		case 'w':
		  System.out.println("Wednesday");
 		  break;
		case 'R':
		case 'r':
		  System.out.println("Thursday");
 		  break;
                case 'F':
		case 'f':
                  System.out.println("Friday");
		  break;  // break out of case and switch statement
                default:
		  System.out.println("Invalid value");
        }

/*
	if (day == 'M')
	    System.out.println("Monday");
	else if (day == 'T')
	    System.out.println("Tuesday");
	else if (day == 'W')
	    System.out.println("Wednesday");
	else if (day == 'R')
	    System.out.println("Thursday");
	else if (day == 'F')
	    System.out.println("Friday");
	else 
	    System.out.println("Invalid value");
*/
    }  // end main
}  // end class