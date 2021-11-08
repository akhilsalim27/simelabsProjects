import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Students {

    private String name;
    private static int[] marks;

    public Students(String kiran, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public static int getNumberOfMarks() {

        return marks.length;
    }

    public static int getTotalSumOfMarks(){
        int sum = 0;
        for (int mark : marks){
            sum+=mark;
        }
        return sum;
    }

    public static int getMaximumMarks(){
        int maximum = MIN_VALUE;
        for(int mark : marks){
            if(mark>maximum){
                maximum=mark;
            }
        }
        return maximum;
    }

    public static int getMinimumMarks(){
        int minimum = MAX_VALUE;
        for(int mark : marks){
            if(mark<minimum){
                minimum=mark;
            }
        }
        return minimum;
    }

  public static BigDecimal getAverageMarks(){
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(number),3, RoundingMode.UP);
  }

}
