import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//          1as

        int speed = -2;
        if (speed > 0) {
            System.out.println("Car is moving");
        } else {
            System.out.println("Car is not moving or going backwards");
        }

        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Normal");
                break;
        }

//          2as

        int carSpeed = 20;

        while(carSpeed > 18){
            System.out.println("Slow down bro");
            carSpeed--;
        }

        int carSpeed1 = 20;
        do {
            System.out.println("I'm super fast");
            carSpeed1--;
        } while(carSpeed1 > 18);

        for (int i = 1; i < 3; i++){
            System.out.println("For cycle goes");
        }

//        3as

        for (int i = 1; i < 5; i++){
            if(i == 2) {
                System.out.println("Radom");
                break;
            }
        }

        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            if( x == 30 ) {
                continue;
            }
            System.out.println( x );
        }

        String password = "ltar";

        System.out.println("Password: " + password);
            if (password.length() >= 5) {
                return;
            }
            System.out.println("Password too short!");


//            5as

        int result = sum(5,2);
        System.out.println(result);


//            6as

        double math = sum(2,4) + sum1(5.5, 1.5);
        System.out.println(math);



//            7as


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Type something");
//        String input = scan.nextLine();
//        if (input instanceof String){
//            System.out.println("Its a string");
//        } else {
//            System.out.println("yo");
//        }

    }

    private static int sum(int a, int b) {  //tas pats 5as
        return a+b;                         //tas pats 5as
    }

    private static double sum1(double aa, double bb){       //6as
        return aa*bb;                                       //6as
    }



}
