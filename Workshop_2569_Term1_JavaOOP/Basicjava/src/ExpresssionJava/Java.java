package ExpresssionJava;

public class Java {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic Expression
        System.out.println("ผลบวก = " + (a + b));
        System.out.println("ผลลบ = " + (a - b));
        System.out.println("ผลคูณ = " + (a * b));
        System.out.println("ผลหาร = " + (a / b));

        // Relational Expression
        System.out.println("a > b = " + (a > b));
        System.out.println("a == b = " + (a == b));

        // Logical Expression
        System.out.println("(a > b && b > 0) = " + (a > b && b > 0));

        // Assignment Expression
        int c = 20;
        c += 10;
        System.out.println("ค่า c = " + c);

        // Increment Expression
        int d = 5;
        System.out.println("d++ = " + d++);
        System.out.println("หลัง d++ = " + d);
    }
}
