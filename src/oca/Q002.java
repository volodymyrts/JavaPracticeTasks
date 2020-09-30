package oca;

// What is the output of the following program?

public class Q002 {                             // line 1
    public static void main(String[] args) {    // line 2
        int x = 5, j = 0;                       // line 3
        for(int i=0; i<3; )                     // line 4
            INNER: do {                         // line 5
                i++; x++;                       // line 6
                if(x > 10) break INNER;         // line 7
                x += 4;                         // line 8
                j++;                            // line 9
            } while(j <= 2);                    // line 10
        System.out.println(x);                  // line 11
    }                                           // line 12
}                                               // line 13

// Answers:
//
// A:  10
// B:  12
// C:  13
// D:  17
// E:  The code will not compile because of line 4.
// F:  The code will not compile because of line 6.