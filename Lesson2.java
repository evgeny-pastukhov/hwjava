 class Lesson2 {
    public static void main(String[] args) {
            System.out.println(numComp(10,2));
            isPositive(-2);
            System.out.println(isNegative(-2));
            printWordNTimes("Privet!", 5);
            System.out.println(isLeapYear (1984));
    }
    
    static boolean numComp(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }
    
    static void isPositive(int a) {
        System.out.println(a >= 0 ? "Positive" : "Negative");
    }
    
    static boolean isNegative(int a) {
            return a < 0;
    }
    
    static void printWordNTimes(String a, int b) {
        for (int i = 1; i <= b; i++) {
            System.out.println(a);
        }
    }
    
    static boolean isLeapYear (int a) {
        boolean b = true;
        if (a%400 == 0) {
            b=true;
        }   else if (a%100 == 0) {
            b=false;
        }   else if (a%4 == 0) {
            b=true;
        }
        return b;
    }
}