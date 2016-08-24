public class Printing {

    public static void printStars(int amount) {
        int iterator=1;
        while(iterator<=amount){
            System.out.print("*");
            iterator++;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        int iterator = 1;
        while(iterator<=sideSize){
            printStars(sideSize);            
            iterator++;
        }
    }

    public static void printRectangle(int width, int height) {
        int iterator = 1;
        while(iterator<=height){
            printStars(width);
            iterator++;
        }
    }

    public static void printTriangle(int size) {
        int iterator = 1;
        while(iterator<=size){
            printStars(iterator);
            iterator++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
