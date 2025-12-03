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
    
  } // end main
} // end class