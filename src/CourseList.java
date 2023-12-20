/*
    File name: CourseList.java 
    Name: Jessica Gunawan
    Student number: 040861167
 	Course: CST8284
 	Assignment: Assignment3
 	Date: November 28 2023
 	Professor: Veda Vasavi Erukulla
 	Purpose: This is a program for course list that uses arrays. This involves some array modifications such as uppercase values, deletion of values, sort and reverse, 
 	as well as removal of duplicate values.
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * CourseList is a program for course list that uses arrays. This involves some array modifications such as uppercase values, deletion of values, sort and reverse, 
 	as well as removal of duplicate values.
 * 
 * @author Jessica Gunawan
 * @version 1.0
 * @since 17.0.7
 * @see java.util.Arrays
 * @see java.util.List
 * @see java.util.Collections
 * @see java.util.HashSet
 */
public class CourseList {
	/**
	 * main method
	 * 
	 * @param args arguments that go into the program.
	 */
    public static void main(String[] args) {
    	/**
    	 * Make 2 arrays of courses.
    	 */
        String[] courses1 = {"math", "english", "chemistry", "physics", "history", "geography"};
        String[] courses2 = {"religion", "arts", "accounting", "math", "programming", "biology"};
        /**
    	 * combine the 2 arrays into the array courses12[].
    	 */
        String[] courses12 = combineArrays(courses1, courses2);

        /**
    	 * display the combined array.
    	 */
        System.out.println("Welcome Everyone to My Assignment 3. My name is Jessica Gunawan.");
        displayCourses(courses12);

        /**
    	 * display the combined array in uppercase.
    	 */
        System.out.println("\nDisplaying names of courses in uppercase letters...");
        for (int i = 0; i < courses12.length; i++) {
            courses12[i] = courses12[i].toUpperCase();
        }
        displayCourses(courses12);

        /**
    	 * delete values with the index number 4, 5, 6.
    	 */
        System.out.println("\nDeleting courses 4 to 6...");
        courses12 = deleteCourses(courses12, 4, 6);
        displayCourses(courses12);

        /**
    	 * display the array after deleted values.
    	 */
        System.out.println("\nHere is the current list of courses...");
        displayCourses(courses12);

        /**
    	 * reverse the array.
    	 */
        System.out.println("\nReversed List...");
        reverseCourses(courses12);
        displayCourses(courses12);

        /**
    	 * sort the values of the array alphabetically.
    	 */
        System.out.println("\nSorted courses in alphabetical order...");
        Arrays.sort(courses12);
        displayCourses(courses12);

        /**
    	 * remove duplicate values in the array.
    	 */
        System.out.println("\nRemoving duplicate courses...");
        String[] uniqueCourse12 = removeDuplicates(courses12);
        Arrays.sort(uniqueCourse12);
        displayCourses(uniqueCourse12);
        //System.out.println("Non-duplicates are: " + Arrays.toString(uniqueCourses));
    }
    /**
	 * method to combine array.
	 * 
	 * @param array1 first array
	 * @param array2 second array
	 * @return combinedList new array consisting a combination of the two arrays
	 */
    private static String[] combineArrays(String[] array1, String[] array2) {
        List<String> combinedList = new ArrayList<>();
        combinedList.addAll(Arrays.asList(array1));
        combinedList.addAll(Arrays.asList(array2));
        return combinedList.toArray(new String[0]);
    }
    
    /**
	 * method to display courses.
	 * 
	 * @param courses values of the combined array
	 */
    // Method to display the list of courses
    private static void displayCourses(String[] courses) {
        System.out.print("The List is: ");
        for (String course : courses) {
            System.out.print(course + ", ");
        }
        System.out.println("\n");
    }

    /**
	 * method to delete some values in the array.
	 * 
	 * @param courses values of the combined array
	 * @param start first index of value to remove
	 * @param end last index of value to remove
	 * @return courseList new array consisting deleted values of the combined array
	 */
    private static String[] deleteCourses(String[] courses, int start, int end) {
        List<String> courseList = new ArrayList<>(Arrays.asList(courses));
        courseList.subList(start, end + 1).clear();
        return courseList.toArray(new String[0]);
    }

    /**
	 * method to reverse values in the array.
	 * 
	 * @param courses values of the combined array
	 */
    private static void reverseCourses(String[] courses) {
        List<String> courseList = Arrays.asList(courses);
        Collections.reverse(courseList);
        courseList.toArray(courses);
    }

    /**
	 * method to remove duplicate values in the array.
	 * 
	 * @param courses values of the combined array
	 * @return uniqueCourse12 new array consisting unique values of the combined array
	 */
    private static String[] removeDuplicates(String[] courses) {
        Set<String> uniqueCourse12 = new HashSet<>(Arrays.asList(courses));
        return uniqueCourse12.toArray(new String[0]);
    }
}
