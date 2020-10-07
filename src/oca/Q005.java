package oca;

// What is the output of the following program?

public class Q005 {
    public static void main(String[] args) {
        int i = 10;                                 // line 3
        if ((i > 10 ? i++ : --i) < 10) {            // line 4
            System.out.print("Foo");                // line 5
        } if (i < 10) System.out.print("Bar");      // line 6
    }
}

// Answers:
//
// A: Foo
// B: Bar
// C: FooBar
// D: The code will not compile because of line 4.
// E: The code will not compile because of line 6.
// F: The code compiles without issue but does not produce any output.