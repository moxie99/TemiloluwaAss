import javax.swing.*;
import java.util.ArrayList;

public class Names {
    public static void main (String []args) {
        ArrayList<String> names = getNames();
        displayNames(names);
    }

    public static ArrayList<String> getNames(){
        ArrayList<String> names = new ArrayList<String>();

        while (true) {
            String n = JOptionPane.showInputDialog("Enter a name");
            names.add(n);
            if(JOptionPane.showConfirmDialog(
                    null, "Read more names?", "Continue Dialog", JOptionPane.YES_NO_OPTION
            ) == JOptionPane.NO_OPTION
            ){
                break;
            }
        }
        return names;
    }

    public static void displayNames(ArrayList<String> n){
        for(String aName: n){
            System.out.println(aName);
        }
    }
}

//1. The add method on line 12 is used to add a name (represented by the variable n) to the ArrayList named names. It appends the specified element to the end of the list.
//2. The break statement on line 14 is used to exit the while loop. It is used in conjunction with the if statement on lines 9-13 that prompts the user with a dialog box asking if they want to enter more names. If the user selects "No," the JOptionPane.showConfirmDialog method will return JOptionPane.NO_OPTION, and the break statement will be executed, terminating the loop.The while loop on line 10 is preferred in this case because it allows for a dynamic number of inputs. It continues looping as long as the user wants to add more names, as determined by their response in the dialog box.
//
//The for loop on line 20 is used to iterate over the ArrayList and display each name. In this case, the number of iterations is known (the size of the ArrayList), so a for loop is more appropriate.

