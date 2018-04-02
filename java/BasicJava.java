import java.util.ArrayList;
import java.util.Arrays;
class BasicJava {
    public static void main(String[] args) {
        // print 1-255
        {
            for( int i = 1; i <= 255; i++ ) {
                System.out.println(i);
            }
            
        }
        // Print odd numbers between 1-255
        {
            for( int i = 1; i <= 255; i=i+2 ) {
                System.out.println(i);  
            }
        }
        // Print Sum
        {
            int sum = 0;
            for( int i = 0; i <= 255; i++ ) {
                sum = sum + i;
                System.out.println("New number: " + i +" Sum: " + sum ); 
            }
        }
        // Iterating through an array
        {
            int[] myArray = new int[] {1,3,5,7,9,13};
            for( int i=0; i < myArray.length; i++ ) {
                int element = myArray[i];
                System.out.println(element);
            }
        }
        // Find Max
        {
            int[] maxArray = new int[] {-10,13,15,0,-77,9,21};
            int max = maxArray[0];
            for( int i=1; i < maxArray.length; i++ ) {
                if( maxArray[i] > max ) {
                    max = maxArray[i];
                }
            }
            System.out.println("Max: " + max);  
        }
        // Get Average
        {
            int[] aveArray = new int[] {2, 10, 3};
            int sum = 0;
            for( int i = 0; i < aveArray.length; i++ ) {
                sum = sum + aveArray[i];
            }
            int ave = sum / aveArray.length;
            System.out.println("Average: " + ave); 
        }
        // Array with Odd Numbers
        {
            ArrayList < String > y =
                new ArrayList < String > (128);
            int j = 1;
            for( int i = 0; i < 128; i++ ) {
                y.add(String.valueOf(j));
                j=j+2; 
            }
            System.out.println("Array of odd: " + y);
        }
        // Greater Than Y
        {
            int[] greArray = new int[] {1, 3, 5, 7};
            int y = 3;
            int num = 0;
            for( int i = 0; i < greArray.length; i++ ) {
                if( greArray[i] > y) {
                    num++;
                }
            }
            System.out.println("Greater Than Y: " + num);
        }
        // Square the values
        {
            int[] myArray = {1, 5, 10, -2};
            ArrayList<Integer> y = new ArrayList<Integer>();
            for( int i = 0; i < myArray.length; i++ ) {
                int num = myArray[i] * myArray[i];
                y.add(num);
            }
            System.out.println("Squared Array: " + y);
        }
        // Eliminate Negative Numbers
        {
            int[] myArray = {1, 5, 10, -2, 0};
            ArrayList<Integer> y = new ArrayList<Integer>();
            for( int i = 0; i < myArray.length; i++ ) {
                if( myArray[i] >= 0 ) {
                    y.add(myArray[i]);
                }
            }
            System.out.println("Positive Array: " + y);  
        }
        // Max, Min, and Average
        {
            int[] myArray = {3, 10, 2};
            ArrayList<Integer> y = new ArrayList<Integer>();
            int max = myArray[0];
            int min = myArray[0];
            int avg = 0;        
            for( int i = 0; i < myArray.length; i++ ) {
                avg = avg + myArray[i];
                if( myArray[i] > max ) {
                    max = myArray[i];
                }
                if( myArray[i] < min ) {
                    min = myArray[i];
                }
            }
            y.add(max);
            y.add(min);
            y.add(avg/myArray.length);
            System.out.println("Max, Min, Avg Array: " + y);  
        }
        // Shifting the Values in the Array
        {
            int[] myArray = {1, 5, 10, 7, -2};
            ArrayList<Integer> y = new ArrayList<Integer>();
            for( int i = 1; i < myArray.length; i++ ) {
                y.add(myArray[i]);
            }
            y.add(0);
            System.out.println("Shifting values: " + y);
        }  
    }
}