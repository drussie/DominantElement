//package Assignment1;

/*Assignment 1, Problem 1
Purpose/Description: Find the dominant elements,
with a running time complexity of (O(N))

Panther ID:

Certification: I hereby certify that this work is my own,
 and none of it is the work of any other person.
 */

class DominantElement {

    static void dominantElement(int[] a) {
        // Arrange if a[0] is dominant
        if (a[0] > a[1]) {
            System.out.print(a[0] + " ");
        }
// work through array to check for dominant numbers
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                System.out.print(a[i + 1] + " ");
            }
        }
// dealing with second to last vs last index
        if (a[a.length -2] > a[a.length - 1]) {
            System.out.print(a[a.length - 1]);
        }
    }

    public static void main(String[] args) {
        int[] array = {16, 17, 4, 3, 5, 2};
        dominantElement(array);
        System.out.println();

        System.out.println("***********************");

        int[] array2 = {17, 19, 5, 4, 6, 1, 4};
        dominantElement(array2);
        System.out.println();

        System.out.println("***********************");
        int[] array3 = {21,19,15, 36, 3, 2, 55, 7};
        dominantElement(array3);
        System.out.println();

        System.out.println("***********************");
        int[] array4 = {35,22,18, 19, 3, 9, 5, 7};
        dominantElement(array4);
        System.out.println();
    }
}
