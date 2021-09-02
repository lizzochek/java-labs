
public class LogicOperators {

    public static void main(String[] args) {
	String liza = "Liza";
	String mom = "Nata";

	if (liza == mom) {
	    System.out.println("These people have the same name");
	} else {
	    System.out.println("These people have different names");
	}

	findSeason(2);
	findSeason(4);
	findSeason(6);
	findSeason(10);
	findSeason(121);
    }

    public static void findSeason(int monthNum) {
	String season;

	switch (monthNum) {
	case 12:
	case 1:
	case 2:
	    season = "Winter";
	    break;

	case 3:
	case 4:
	case 5:
	    season = "Spring";
	    break;

	case 6:
	case 7:
	case 8:
	    season = "Summer";
	    break;

	case 9:
	case 10:
	case 11:
	    season = "Autumn";
	    break;

	default:
	    season = "Please choose a number between 1 and 12";
	}
	System.out.println(season);
    }

}
