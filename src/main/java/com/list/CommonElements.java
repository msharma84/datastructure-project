package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * Find common element in 3 different list objects
 * List 1 contains - [1, 5, 10, 20, 40]
 * List 2 contains - [6, 7, 20, 40, 100]
 * List 3 contains - [3, 4, 15, 20, 40, 70]
 *
 * Output: [20, 40]
 *
 * Method 1 : Use retainsAll() - the List interface provides a built-in method called retainAll().
 * It retains only the elements in the invoking list that are also contained in the specified collection
 *
 * Note: retainAll() modifies the list directly. Always create a copy of the first list if you need
 * to preserve your original data.
 *
 * Method 2 : Java 8+ Streams (Functional Style) If you prefer a clean, declarations-based approach
 * utilizing Java Streams, you can map out a filter that matches elements against the .contains()
 * checks of your other collections.
 * */
public class CommonElements {

    public static void main(String[] args) {

        // Method 1

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 5, 10, 20, 40));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 20, 40, 100));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(3, 4, 15, 20, 40, 70));

        // Create a copy of the first list to protect original data
        List<Integer> common = new ArrayList<>(list1);

        // Keep only elements present in list2, then list3
        common.retainAll(list2);
        common.retainAll(list3);

        System.out.println("Common elements: " + common);
        // Output: [20, 40]

        // Method 2

        List<Integer> common1 = list1.stream()
                .filter(list2::contains)
                .filter(list3::contains)
                .distinct()
                .toList();
        System.out.println("Common elements: " + common1);
    }
}
