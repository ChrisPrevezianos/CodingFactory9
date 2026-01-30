package gr.aueb.cf.cf9.ch4;

public class StarsHorizontalApp {

    public static void main(String[] args) {

        // Horizontal Stars
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }

        // Vertical Stars
        for (int i = 1; i <= 10; i++){
            System.out.println("*");
        }

        //Grid 10X10 - Nested for loops
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 1,2,3, ... stars
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //10,9,8, ... stars
        for (int i = 10; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
