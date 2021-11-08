import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        int[] marks = {99,98,100,95,90};
        Students student = new Students ("Kiran",marks);

        int number = Students.getNumberOfMarks();
        System.out.println("Number of marks: " + number);

        int sum = Students.getTotalSumOfMarks();
        System.out.println("Sum of marks: " + sum);

        int maximumMark = Students.getMaximumMarks();
        System.out.println("Maximum marks: " + maximumMark);

        int minimumMark = Students.getMinimumMarks();
        System.out.println("Minimum marks: " + minimumMark);

        BigDecimal average = Students.getAverageMarks();
        System.out.println("Average of marks: " + average);

    }


}
