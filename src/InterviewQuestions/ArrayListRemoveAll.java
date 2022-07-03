package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveAll {

    public static void main(String[] args) {

        /* a list that names of employees
        Remove the same name
         */

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmed","Eren","Ahmed","Asiya","Arzum","Ahmed"));
        System.out.println(employees);

        employees.removeAll(Arrays.asList("Ahmed"));
        System.out.println(employees);
    }
}
