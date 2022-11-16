public class Main {
    public static void main(String[] args) {

        //define an int variable called a and initialise it with the value 15
        //add 5 to a without repeating the a variable (e.g. a = a + 5 is not accepted)
        //then subtract 4 to a without repeating the a variable

        int a = 15; // a = 15
        a+=5; // a = 20
        a-=4; // a = 16

        //assign the value of a to int b and increment b by one without using a or int b = b + 1

        int b = a; // b = 16
        ++b; // b = 17

        int result = b*(b+1); // 17 * ( 17+1 ) = 306


        //check and prints if both the following statements are true:

        //statement 1: check if b is an odd number
        //statement 2: check if the result of (b multiplied for b + 1) is a multiple of 3


        System.out.println(b % 2 != 0); // Statement 1 = true
        System.out.println(result % 3 == 0); //Statement 2 = true


    }
}