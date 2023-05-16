import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ages {
    public static void main(String[] args) {
        ArrayList<Integer> ages = getAges();
        displayAges(ages);
        int maxAge = getMaxAge(ages);
        int minAge = getMinAge(ages);
        double avgAge = getAvgAge(ages);

        System.out.println("Maximum age: " + maxAge);
        System.out.println("Minimum age: " + minAge);
        System.out.println("Average age: " + avgAge);
    }

    public static ArrayList<Integer> getAges() {
        ArrayList<Integer> ages = new ArrayList<Integer>();

        while (true) {
            String input = JOptionPane.showInputDialog("Enter an age");
            int age = Integer.parseInt(input);
            ages.add(age);

            if (JOptionPane.showConfirmDialog(
                    null, "Enter more ages?", "Continue Dialog", JOptionPane.YES_NO_OPTION
            ) == JOptionPane.NO_OPTION) {
                break;
            }
        }
        return ages;
    }

    public static void displayAges(ArrayList<Integer> ages) {
        for (int age : ages) {
            System.out.println(age);
        }
    }

    public static int getMaxAge(ArrayList<Integer> ages) {
        int maxAge = Integer.MIN_VALUE;
        for (int age : ages) {
            if (age > maxAge) {
                maxAge = age;
            }
        }
        return maxAge;
    }

    public static int getMinAge(ArrayList<Integer> ages) {
        int minAge = Integer.MAX_VALUE;
        for (int age : ages) {
            if (age < minAge) {
                minAge = age;
            }
        }
        return minAge;
    }

    public static double getAvgAge(ArrayList<Integer> ages) {
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return (double) sum / ages.size();
    }
}
