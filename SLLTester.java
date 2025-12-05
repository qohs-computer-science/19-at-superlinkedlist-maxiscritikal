import java.util.LinkedList;

class SLLTester {
  public static void main(String[] args) {
    SuperLinkedList removeVowelsTester = new SuperLinkedList();
    removeVowelsTester.add("A");
    removeVowelsTester.add("B");
    removeVowelsTester.add("A");
    removeVowelsTester.add("C");
    removeVowelsTester.add("D");
    removeVowelsTester.add("E");
    removeVowelsTester.add("I");
    removeVowelsTester.add("O");
    removeVowelsTester.add("U");
    removeVowelsTester.add("B");
    removeVowelsTester.add("Z");
    System.out.println("\nOriginal List: " + removeVowelsTester);
    removeVowelsTester.removeVowels();
    System.out.println("\nAfter removing vowels: " + removeVowelsTester);

    SuperLinkedList removeConsonantsTester = new SuperLinkedList();
    removeConsonantsTester.add("A");
    removeConsonantsTester.add("B");
    removeConsonantsTester.add("A");
    removeConsonantsTester.add("C");
    removeConsonantsTester.add("D");
    removeConsonantsTester.add("E");
    removeConsonantsTester.add("I");
    removeConsonantsTester.add("O");
    removeConsonantsTester.add("U");
    removeConsonantsTester.add("B");
    removeConsonantsTester.add("Z");
    System.out.println("\nOriginal List: " + removeConsonantsTester);
    removeConsonantsTester.removeConsonants();
    System.out.println("\nAfter removing consonants: " + removeConsonantsTester);

    SuperLinkedList removeDuplicatesTester = new SuperLinkedList();
    removeDuplicatesTester.add("A");
    removeDuplicatesTester.add("B");
    removeDuplicatesTester.add("A");
    removeDuplicatesTester.add("C");
    removeDuplicatesTester.add("D");
    removeDuplicatesTester.add("E");
    removeDuplicatesTester.add("I");
    removeDuplicatesTester.add("O");
    removeDuplicatesTester.add("U");
    removeDuplicatesTester.add("B");
    removeDuplicatesTester.add("Z");
    removeDuplicatesTester.add("Z");
    removeDuplicatesTester.add("Z");
    removeDuplicatesTester.add("Y");
    removeDuplicatesTester.add("Z");
    System.out.println("\nOriginal List: " + removeDuplicatesTester);
    System.out.println("\nDuplicates to be removed: " + removeDuplicatesTester.removeDuplicates());
    System.out.println("\nAfter removing duplicates: " + removeDuplicatesTester);

    SuperLinkedList concatenateStringsTester = new SuperLinkedList();
    concatenateStringsTester.add("A");
    concatenateStringsTester.add("B");
    concatenateStringsTester.add("C");
    concatenateStringsTester.add("A");
    concatenateStringsTester.add("D");
    concatenateStringsTester.add("E");
    System.out.println("\nOriginal List: " + concatenateStringsTester);
    System.out.println("\nAfter concatenating strings: " + concatenateStringsTester.concatenateStrings());

    SuperLinkedList mixTester = new SuperLinkedList();
    mixTester.add("A");
    mixTester.add("B");
    mixTester.add("C");
    mixTester.add("D");
    mixTester.add("E");
    mixTester.add("F");
    System.out.println("\nOriginal List 1: " + mixTester);
    SuperLinkedList mixTester2 = new SuperLinkedList();
    mixTester2.add("a");
    mixTester2.add("b");
    mixTester2.add("c");
    mixTester2.add("d");
    mixTester2.add("e");
    mixTester2.add("f");
    System.out.println("\nOriginal List 2: " + mixTester2);
    System.out.println("\nAfter mixing the two lists: " +  mixTester.mix(mixTester2));


  } // end main
} // end class