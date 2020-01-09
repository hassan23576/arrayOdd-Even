package weekdaypratice;

public class ClothingMain {

    public static void main(String[] args) {

        clothing polo = new clothing("polo" ,"green",'L', false);

//        System.out.println(polo.getBranName());
//        System.out.println(polo.getColor());
//        System.out.println(polo.getSize());
//        System.out.println(polo.isItLongSleeve());

       polo.setColor("blue");
        System.out.println(polo.getColor());
         polo.setSize('S');
        System.out.println(polo.getSize());



    }



}
