package datastructure.sets;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {



        //create a hashset of student's last name from this batch

        Set<String> lastNameSet = new HashSet<>();


        //add all the different unique name into  the last name set
        lastNameSet.add("Hamid");
        lastNameSet.add("Sheikh");
        lastNameSet.add("Islam");
        lastNameSet.add("Rahman");
        lastNameSet.add("Ahmed");
        lastNameSet.add("Islam");

        System.out.println(lastNameSet);




    }


}
