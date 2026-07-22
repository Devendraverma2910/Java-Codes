public class Int_literal {
    public static void main(String[] args) {
        int a = 104, b = 0150, c = 0b1101000, d = 0x68;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        char c1 = 104, c2 = '\u0068';

        System.err.println(c1);
        System.err.println(c2);
    }
}
// Decimal: - nothing
// Octal: - 0
// Binary: - 0b
// Hexadecimal: - 0x

// ascii value's:
// enter: -  10
// space: - 32      
// a: - 97
// A: - 65