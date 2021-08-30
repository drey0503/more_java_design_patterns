package strategy;

/**
* Can add and remove people off list and checks to see if on list or not
* @author Dreyson Clark
*/

import java.util.ArrayList;

public class GuestList {
    private String title;
    private ArrayList<String> people;
    private SearchBehavior searchBehavior;

    public GuestList(String title) {
this.title=title;
    }

    public boolean add(String person){

        if (searchBehavior.contains(people,person))

        return false;

        else{ people.add(person);

            return true;
}


}
public boolean remove(String person){

    if (searchBehavior.contains(people,person)){
    people.remove(person);
    return true;}

    return false;



}

}