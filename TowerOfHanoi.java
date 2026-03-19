import java.util.Scanner;

public class towerOfHanoi {
    // Main method
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number if disks: ");
        int n = input.nextInt();

        // Find the silution recursively
        System.out.println("The moves are: ");
            moveDisks(n, 'A', 'B', 'C');
            input.close();
    }
        // The method for finding the solution to move n disks from fromTower to toTower with auxTower
            public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
                if (n == 1) { // stopping condition
                    System.out.println("Move disk " + n + " from " + fromTower + " to "+toTower);
                }
                    else { 
                        moveDisks(n-1, fromTower, auxTower, toTower);
                            System.out.println(" Move disk " +n+ " from " +fromTower+ " to " +toTower);
                                moveDisks(n-1, auxTower, toTower, fromTower);
                    
                    
                    }   
            }   

}

