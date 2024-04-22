package com.comp0103.verification;

//Test: CounterPropertiesTest.java

// Partial and Syntactically Correct

//C1
//public class Counter {
//    private int count;
//
//    public Counter() {
//    }
//
//    public Counter inc


//C1R1 for prompt "complete the java code." followed by C1 (Passed Infer analysis but not property-based tests)
//public class Counter {
//    private int count;
//
//    public Counter() {
//        this.count = 0; // Initializing count to 0 in the constructor
//    }
//
//    public void inc() {
//        count++; // Incrementing count by 1
//    }
//
//    public int getCount() {
//        return count; // Returning the current count value
//    }
//
//    public static void main(String[] args) {
//        Counter counter = new Counter(); // Creating an instance of Counter
//        System.out.println("Initial count: " + counter.getCount()); // Outputting initial count (0)
//
//        counter.inc(); // Incrementing count by 1
//        System.out.println("Count after increment: " + counter.getCount()); // Outputting count after increment (1)
//    }
//}

//C1R2 for prompt "Property Based tests showed the following error. Rewrite the java code." followed by error message. (Passed Infer analysis but not property-based tests)

//public class Counter {
//    private int count;
//
//    public Counter() {
//        this.count = 0; // Initializing count to 0 in the constructor
//    }
//
//    public void increment() {
//        count++; // Incrementing count by 1
//    }
//
//    public void decrement() {
//        count--; // Decrementing count by 1
//    }
//
//    public int count() {
//        return count; // Returning the current count value
//    }
//}

//C1R3 for prompt: "Property Based tests showed the following error." followed by the error stack and then some additional info on the code: "increment and decrement should return Counter." (Passed Infer analysis and property-based tests)

//public class Counter {
//    private int count;
//
//    public Counter() {
//        this.count = 0; // Initializing count to 0 in the constructor
//    }
//
//    public Counter increment() {
//        count++; // Incrementing count by 1
//        return this; // Returning the Counter object
//    }
//
//    public Counter decrement() {
//        count--; // Decrementing count by 1
//        return this; // Returning the Counter object
//    }
//
//    public int count() {
//        return count; // Returning the current count value
//    }
//}

/*============================================================================*/

//Partial and Syntactically Incorrect

//C4

//public Class Counter {
//    prite int count;
//
//    public Counter( {
//    }
//
//    public Counter inc


//C4R1 for prompt "Complete the java code" followed by C4 (Passed Infer analysis but not property-based tests)
//public class Counter {
//    private int count;
//
//    public Counter() {
//        count = 0;
//    }
//
//    public Counter(int initialValue) {
//        count = initialValue;
//    }
//
//    public int getCount() {
//        return count;
//    }
//
//    public void increment() {
//        count++;
//    }
//
//    public void decrement() {
//        count--;
//    }
//}

//C4R2 for prompt "Property Based tests showed the following error. Rewrite the java code." followed by the property based test error stack. (Passed Infer analysis but not property-based tests)
//public class Counter {
//    private int count;
//
//    public Counter() {
//        count = 0;
//    }
//
//    public Counter(int initialValue) {
//        count = initialValue;
//    }
//
//    public int getCount() {
//        return count;
//    }
//
//    public void increment() {
//        count++;
//    }
//
//    public void decrement() {
//        count--;
//    }
//}

//C4R3 for the prompt: "Property Based tests showed the following error." followed by the error stack and then some additional info on the code: "increment and decrement should return Counter." (Passed Infer analysis but not property-based tests)

//public class Counter {
//    private int count;
//
//    public Counter() {
//        count = 0;
//    }
//
//    public Counter(int initialValue) {
//        count = initialValue;
//    }
//
//    public int getCount() {
//        return count;
//    }
//
//    public Counter increment() {
//        count++;
//        return this;
//    }
//
//    public Counter decrement() {
//        count--;
//        return this;
//    }
//}

//C4R4 for prompt "Property based test gave the following error" followed by the error stack.  Additional information "Refactor getCount() to count()" (Passed Infer analysis and property-based tests)

public class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    public Counter(int initialValue) {
        count = initialValue;
    }

    public int count() {
        return count;
    }

    public Counter increment() {
        count++;
        return this;
    }

    public Counter decrement() {
        count--;
        return this;
    }
}