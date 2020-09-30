package oca;

// Which are true of the following code? (Choose all that apply)
// Correct answers are in the bottom of the file!

import java.util.*;                                 // line 1
class Rectangle {                                   // line 2
    public Rectangle(String n) {                    // line 3
        name = n;                                   // line 4
    }                                               // line 5
    public static void main(String[] args) {        // line 6
        Rectangle one = new Rectangle("g1");     // line 7
        Rectangle two = new Rectangle("g2");     // line 8
        one = two;                                  // line 9
        two = null;                                 // line 10
        one = null;                                 // line 11
    }                                               // line 12
    private String name;                            // line 13
}                                                   // line 14

// A:   Immediately after line 9, no Rectangle objects are eligible for garbage collection.
// B:   Immediately after line 10, no Rectangle objects are eligible for garbage collection.
// C:   Immediately after line 9, only one Rectangle object is eligible for garbage collection.
// D:   Immediately after line 10, only one Rectangle object is eligible for garbage collection.
// E:   Immediately after line 11, only one Rectangle object is eligible for garbage collection.
// F:   The code compiles.
// G:   The code does not compile.
//
//
//
//
//
//
//
//
//
//
//
//
// Correct answers: C, D, F
//
// Note:
// The code above compiles without issues. So G is not correct. F is correct.
//
// Immediately after line 9, only Rectangle g1 is eligible for garbage collection since both one and two point to Rectangle g2.
//
// Immediately after line 10, there still only Rectangle g1 is eligible for garbage collection. Reference one points to g1 and reference two is null.
//
// Immediately after line 11, both Rectangle objects are eligible for garbage collection since both one and two point to null.
