import java.util.LinkedList;

class SLLTester {
  public static void main(String[] args) {
    SuperLinkedList myList = new SuperLinkedList();
    myList.add("A");
    myList.add("B");
    myList.add("C");
    myList.add("D");
    myList.add("E");
    myList.add("I");
    myList.add("O");
    myList.add("U");
    System.out.println(myList.toString());
    myList.removeVowels();
    System.out.println(myList.toString());

    SuperLinkedList myList2 = new SuperLinkedList();
    myList2.add("A");
    myList2.add("B");
    myList2.add("C");
    myList2.add("D");
    myList2.add("E");
    myList2.removeConsonants();
    System.out.println(myList2.toString());

    SuperLinkedList myList3 = new SuperLinkedList();
    myList3.add("A");
    myList3.add("B");
    myList3.add("A");
    myList3.add("C");
    myList3.add("B");
    myList3.add("D");
    myList3.add("C");
    myList3.add("Z");
    myList3.add("E");
    myList3.add("E");
    System.out.println(myList3.toString());
    LinkedList<String> duplicates = myList3.removeDuplicates();
    System.out.println("List after removing duplicates: " + myList3.toString());
    System.out.println("List of duplicates removed: " + duplicates.toString());
    
  } // end main
} // end class