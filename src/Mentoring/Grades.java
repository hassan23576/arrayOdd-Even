package Mentoring;

public class Grades {


    public static void main(String[] args) {
        int liquorNumber = 7;
        String liquorFlavour;

        switch (liquorNumber) {

            case 1:
                liquorFlavour = "Rum";
                break;

            case 2:
                liquorFlavour = "Vodka";
                break;

            case 3:
                liquorFlavour = "Gin";
                break;

            case 4:
                liquorFlavour = "Tequila";
                break;

            case 5:
                liquorFlavour = "Brandy";
                break;

            case 6:
                liquorFlavour = "Armagnac";
                break;

            case 7:
                liquorFlavour = "Irish whiskey";
                break;

            case 8:
                liquorFlavour = "Rye Whiskey";
                break;

            case 9:
                liquorFlavour = "Scotch whiskey";
                break;

            default:
                liquorFlavour = "beer";
                break;

        }
        System.out.println("my type of liquor is " + liquorFlavour);

    }
}
