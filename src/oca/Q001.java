package oca;

// What is the output of the following code?

public class Q001 {

    public static void main(String args[]) {
        byte foo = 120;
        switch (foo) {
            default:
                System.out.println("default");
                break;
            case 2:
                System.out.println("2");
                break;
            case 120:
                System.out.println("120");
            case 121:
                System.out.println("121");
            case 127:
                System.out.println("127");
                break;
        }
    }
}

// Answers:
//
// A: 120
//    121
//    127
//
// B: 120
//
// C: default
//    2
//
// D: 120
//    121
//    127
//    default