package com.javaassignments.assignment5.assignment.data;

/***
 * This code shows demo of unnecessity of declaring global variables.
 * Their default values is Zero if not initialised
 */
public class DefaultInitialization {
    int memberVariableOne;
    char memberVariableTwo;       //Initialization of Instance Variable is not Mandatory. Its default value is 0

    public void printMemberVariables() {
        System.out.println("variable one is " + memberVariableOne +
                "Variable two is " + memberVariableTwo);
    }

    public void printLocalVariables() {
        int localVariableOne;
        int localVariableTwo;  //We can't print local variables without initializing them
      //  System.out.println("Local variable one is " + localVariableOne +
        //        "Local variable two is" + localVariableTwo);
    }

}
