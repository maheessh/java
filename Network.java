import java.util.Scanner;

public class Network {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Input validation for height
        int height = -1;
        do {
            System.out.print("Input your desired height: ");
            if (myScanner.hasNextInt()) {
                height = myScanner.nextInt();
                if (height <= 0) {
                    System.out.println("Error: please input a positive integer.");
                }
            } else {
                System.out.println("Error: please type in an integer.");
                myScanner.next(); // Clear invalid input
            }
        } while (height <= 0);

        // Input validation for width
        int width = -1;
        do {
            System.out.print("Input your desired width: ");
            if (myScanner.hasNextInt()) {
                width = myScanner.nextInt();
                if (width <= 0) {
                    System.out.println("Error: please input a positive integer.");
                }
            } else {
                System.out.println("Error: please type in an integer.");
                myScanner.next(); // Clear invalid input
            }
        } while (width <= 0);

        // Input validation for square size
        int square = -1;
        do {
            System.out.print("Input square size: ");
            if (myScanner.hasNextInt()) {
                square = myScanner.nextInt();
                if (square <= 0) {
                    System.out.println("Error: please input a positive integer.");
                }
            } else {
                System.out.println("Error: please type in an integer.");
                myScanner.next(); // Clear invalid input
            }
        } while (square <= 0);

        // Input validation for edge length
        int edge = -1;
        do {
            System.out.print("Input edge length: ");
            if (myScanner.hasNextInt()) {
                edge = myScanner.nextInt();
                if (edge <= 0) {
                    System.out.println("Error: please input a positive integer.");
                }
            } else {
                System.out.println("Error: please type in an integer.");
                myScanner.next(); // Clear invalid input
            }
        } while (edge <= 0);

        // Now draw the network grid
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                int r = row % (square + edge); // Determine row in the pattern
                int c = column % (square + edge); // Determine column in the pattern

                // Logic for within the square
                if (r < square) {
                    if (c < square) {
                        if (r == 0 || r == square - 1) {
                            if (c == 0 || c == square - 1) {
                                System.out.print("#"); // Corners of the square
                            } else {
                                System.out.print("-"); // Horizontal borders
                            }
                        } else {
                            if (c == 0 || c == square - 1) {
                                System.out.print("|"); // Vertical borders
                            } else {
                                System.out.print(" "); // Inside the square
                            }
                        }
                    } else {
                        // Horizontal edges between squares
                        if (r == square / 2 || r == (square - 1) / 2) {
                            System.out.print("-");
                        } else {
                            System.out.print(" ");
                        }
                    }
                } else {
                    // Between squares (vertical edges)
                    if (c < square) {
                        if (c == square / 2 || c == (square - 1) / 2) {
                            System.out.print("|");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print(" "); // Empty space between squares
                    }
                }
            }
            System.out.println(); // Move to the next row
        }

        myScanner.close(); // Close scanner
    }
}
