package com.example.testgeneratedoc
/**
 * # Module notktx-app
 * This class supports greeting people by name.
 *
 * @property name The name of the person to be greeted.
 */
class TestDoc(val name: String) {

    /**
     * Prints the greeting to the standard output.
     */
    fun testDoc1() {
        println("Hello $name!")
    }

    /**
     * Adds two integers together and returns the result.
     *
     * This function takes two integer values as input, adds them, and returns their sum.
     * It's a simple utility function for performing addition.
     *
     * @param value1 The first integer value to be added.
     * @param value2 The second integer value to be added.
     * @return The sum of `value1` and `value2`.
     *
     * @see [testDoc]
     *
     * Example usage: Testing sum function
     *
     */
    fun testDoc2(value1: Int, value2: Int): Int {
        return value1 + value2
    }
}
