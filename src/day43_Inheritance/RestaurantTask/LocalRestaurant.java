package day43_Inheritance.RestaurantTask;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Eren");
        Server[] servers  = {
                new Server("Hasan",23,'M',12,"Server","S001"),
                new Server("Ali",30,'M',10,"Server","S002"),
                new Server("Karim", 27, 'M', 25, "Server1", "S003"),
                new Server("Aysel", 26, 'F', 20, "Server2", "S004"),
                new Server("Kamal", 25, 'M', 15, "Server3", "S005"),
        };

        Chef[] chefs = {
                new Chef("Halim", 23, 'M', 25, "Head Cook", "C003"),
                new Chef("Habib", 22, 'M', 20, "Line Cook1", "C004"),
                new Chef("Bojan", 21, 'M', 15, "Line Cook2", "C005"),
        };

        restaurant1.hireServer(new Server("Mehmet Ali",19,'M',11,"Server1","S006"));
        restaurant1.hireServer(servers);

        restaurant1.hireChef(new Chef("Muhtar", 45, 'M',19,"Chef","C001"));
        restaurant1.hireChef(chefs);

        System.out.println(restaurant1);

        double budget = 0 ;

        for (Server eachServer : restaurant1.servers ){
            System.out.println( eachServer.name );
            budget += eachServer.calcSalary();
        }

        for (Chef eachChef : restaurant1.chefs){
            System.out.println(eachChef.name);
            budget+= eachChef.calcSalary();
        }

        System.out.println(budget);

    }
}

/*
   Create a class LocalRestaurant that has a main method with the following:
            - Make a Restaurant object
            - Create an array of servers with their information set. Add those initial servers to the ArrayList of the Restaurant object
            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of the Restaurant object
            - Print your whole restaurants information
 */
