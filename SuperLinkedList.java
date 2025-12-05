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

            for (int i = 0; i < this.size(); i++)
            {
                String current = this.get(i);
                Iterator <String> iter = this.iterator();
                for (int y = 0; iter.hasNext() && y < i + 1; y++)
                {
                    iter.next();
                }
                while (iter.hasNext())
                {
                    String compare = iter.next();
                    if (current.equals(compare))
                    {
                        duplicateList.add(compare);
                        iter.remove();
                    }
                }
            }
            return duplicateList;
    }

    public LinkedList<String> concatenateStrings() {

        LinkedList<String> concatenatedList = new LinkedList<String>();
        Iterator <String> iter = this.iterator();
        String concatenatedString = "";

        while (iter.hasNext())
        {
            concatenatedString += iter.next();
        }

        concatenatedList.add(concatenatedString);

        return concatenatedList;
    }

    public LinkedList<String> mix(LinkedList<String> list2) {

        LinkedList<String> finalList = new LinkedList<String>();
        Iterator <String> iterList1 = this.iterator();
        Iterator <String> iterList2 = list2.iterator();
        
        while (iterList1.hasNext())
        {
            finalList.add(iterList1.next());
            finalList.add(iterList2.next());
        }

        return finalList;
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