package day28_Recap;

public class MultiDArr_Practice {

    public static void main(String[] args) {

        String[] group1 = {"Eren","Arzum"};
        String[] group2 = {"Muhtar","Nadir"};
        String[] group3 = {"Mehmet","Suleyman"};
        String[] group4 = {"Hakan","Sevgi"};

        String[][] batch2022 = {group1,group2,group3,group4};

        for (String[] eachGroup : batch2022){       // each Array
            for (String eachStudent : eachGroup){
                if (eachStudent.toLowerCase().contains("e")){   // each Names
                    System.out.print(eachStudent+" ");
                }
            }
            System.out.println();
        }
    }
}
