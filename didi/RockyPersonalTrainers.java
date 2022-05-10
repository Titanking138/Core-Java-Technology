package didi;

import java.util.Scanner;

/**
 * RockyPersonalTrainers
 */
class Pair {

    private String name;
    private int session;

    Pair(String name, int session) {
        this.name = name;
        this.session = session;
    }

    int getSession() {
        return this.session;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSession(int session) {
        this.session = session;
    }
}

public class RockyPersonalTrainers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Rocky Personal Training Management System");
        System.out.print("\n\n\tEnter your Id Number : ");
        long id = scanner.nextInt();
        // finding max number in id ;
        //TODO: N = 3 if n < 3;
        int N = 0;
        try {
            while (id != 0) {

                int temp = Math.toIntExact(id % 10);
                N = Math.max(temp, N);
                id = id / 10;
            }
            if(N < 3)
            {
                N = 3;
            }
        } catch (ArithmeticException e) {
            System.out.println("Can't able to convert long to Int");
        }
        // running loop n times to take input;
        int total_session = 0;
        double charge, total_charge = 0;
        Pair max = new Pair("", Integer.MIN_VALUE);
        Pair min = new Pair("", Integer.MAX_VALUE);
        double[] price = { 62.25, 82.25, 102.25 };
        for (int i = 1; i <= N; i++) {

            scanner.nextLine(); // clearing buffer 
            String name = "";
            int member = 0, session = 0;
            System.out.print("\n\t\tPlease enter booking name ==> ");
            name = scanner.nextLine();
            while (!checkName(name)) {
                System.out.print("\n\t\tPlease enter booking name ==> ");
                name = scanner.nextLine();
            }
            //
            System.out.print("\t\t\t Enter Number of session ==> ");
            session = scanner.nextInt();
            while (!checkSession(session)) {
                System.out.print("\t\t\t Enter Number of session ==> ");
                session = scanner.nextInt();
            }
            //
            System.out.print("\t\t\t Enter number of member in 1 session ==> ");
            member = scanner.nextInt();
            while (!checkMembers(member)) {
                System.out.print("\t\t\t Enter number of member in 1 session ==> ");
                member = scanner.nextInt();
            }
            int m = (member > 2) ? 2 : (member - 1);
            charge = session * price[m];
            System.out.printf("\n\t ======= %s charge charge is ==> %.2f =======", name, charge);

            if (charge > max.getSession()) {
                max.setSession(session);
                max.setName(name);
            }
            if (session < min.getSession()) {
                min.setSession(session);
                min.setName(name);
            }
            total_charge += charge;
            total_session += session;
        }

        System.out.println("Statistical information for Rocky Personal Trainers");
        System.out.println("\n\t ======================================================================== \n");
        System.out.println(min.getName() + " has min number of session " + min.getSession() + " sessions");
        System.out.println(max.getName() + " has min number of session " + max.getSession() + " sessions");
        System.out.println("the avg . session book is : " + (total_session / N) + " Sessions");
        System.out.println("total collection is : " + total_charge);

        scanner.close();
    }


    static boolean checkName(String name) {
        if (name.isBlank()) {
            System.out.println("\t\t ERROR ===> Name can't be empty");
            return false;
        }
        return true;
    }

    static boolean checkSession(int session)
    {
        if((session == 0))
        {
            System.out.println("\t\t ERROR ===> session can't be 0");
            return false;
        }
        return true;
    }
    static boolean checkMembers(int member)
    {
        if(member == 0 || member > 5)
        {
            System.out.println("\t\t ERROR ===> member can't be 0 or greater than 5 ");
            return false;
        }
        return true;
    }

}



// Devloper code ::
// just for testing perpose 
// public static int safeLongToInt(long l) {
// int i = (int) l;
// if ((long) i != l) {
// throw new IllegalArgumentException(l + " cannot be cast to int without
// changing its value.");
// }
// return i;
// }