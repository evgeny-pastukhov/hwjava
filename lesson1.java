 class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    
    static void checkSumSign() {
        int a = -10;
        int b = 2;
        if (a+b >=0) {
            System.out.println("Summa polozhitelnaja");
        }   else {
            System.out.println("Summa otritzatelnaja");
            }
            
    }
    
    static void printColor() {
        int value = 5;
        if (value <= 0) {
            System.out.println("Red");
        }   else {
                if (value <= 100) {
                    System.out.println("Yellow");
                }   else {
                    System.out.println("Green");
                    }
            }
	}
    
    static void compareNumbers() {
        int a = -10;
        int b = 2;
        if (a >= b) {
            System.out.println ("a >= b");
        }   else {
                System.out.println("a < b");
            }
    }
}