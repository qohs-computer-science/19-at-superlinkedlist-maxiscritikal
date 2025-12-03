import java.util.LinkedList;
import java.util.Iterator;

public class SuperLinkedList extends LinkedList<String> {
    public boolean removeVowels() {
        boolean remove = false;
        Iterator <String> iter = this.iterator();
        while (iter.hasNext())
        {
            String next = iter.next();
            if ("aeiouAEIOU".contains(next))
            {
                iter.remove();
                remove = true;
            }
        }
        return remove;
    }

    public boolean removeConsonants() {
        boolean remove = false;
        Iterator <String> iter = this.iterator();
        while (iter.hasNext())
        {
            String next = iter.next();
            if (!("aeiouAEIOU".contains(next)))
            {
                iter.remove();
                remove = true;
            }
        }
        return remove;
    }

    public LinkedList<String> removeDuplicates() {
        return null;
    }

    public LinkedList<String> concatenateStrings() {

        return null;
    }

    public LinkedList<String> mix(LinkedList<String> list2) {

        return null;
    }

    public String toString() {

        String finalString = "";
        Iterator<String> iter  = this.iterator();

        while (iter.hasNext())
        {
            finalString += (iter.next() + ", ");
        }
        return finalString;
    }
} // end SuperLinkedList