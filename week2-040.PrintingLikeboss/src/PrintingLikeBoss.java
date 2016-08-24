public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int iterator=1;
        while(iterator<=amount){
            System.out.print("*");
            iterator++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int iterator = 1;
        while(iterator<=amount){
            System.out.print(" ");
            iterator++;
        }
    }

    public static void printTriangle(int size) {
        int iterator = 1;
        while(iterator<=size){
            printWhitespaces(-(iterator-size));
            printStars(iterator);
            iterator++;
        }
    }

    public static void xmasTree(int height) {
        int line=1;        
        int white=height-1;
        int star = 1;
        int x=1;
        
        while(line<=height){
            printWhitespaces(white);
            printStars(star);
            star+=2;
            white--;
            line++;
        }
        while(x<3){
            printWhitespaces(height-2);
            printStars(3);
            x++;
        }
        
        
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
