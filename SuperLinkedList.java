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
        LinkedList<String> duplicateList = new LinkedList<String>();
        Iterator <String> outerIterator = this.iterator();
        outerPosition = 0


        While outer iterator has next
        Current = outer iterator next


        Create inner iterator for original list
        For (int i = 0; i < outerPosition; i++)
            Inner iterator.next


        While inner iterator has next
        Compare = inner iterator next
        If current equals compare
            Add compare to duplicate list
            Inner iterator.remove()


        Outerposition++
        Reset outer iterator 
        For (int i = 0; i < outerPosition; i++)
            Outer iterator.next


        Return duplicate list
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