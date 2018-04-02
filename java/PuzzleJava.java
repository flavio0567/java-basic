import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
class PuzzleJava {
    public static void main(String[] args) {
        {
            int[] myArray = new int[] { 3,5,1,2,7,9,8,13,25,32 };
            ArrayList<Integer> y = new ArrayList<Integer>();
            int sum = 0;
            for( int i = 0; i < myArray.length; i++ ) 
            {
                sum = sum + myArray[i];
                if( myArray[i] > 10) 
                {
                    y.add(myArray[i]);
                }
            }
            System.out.println("Sum of an Array: " + sum ); 
            System.out.println("Num Greater than 10: " + y ); 
        }
        {
            String[] myArray = new String[] { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
            ArrayList<String> y = new ArrayList<String>();
            for( int i = 0; i < myArray.length; i++ ) 
            {
                System.out.println(myArray[i]);
                if( myArray[i].length() > 5 ) 
                {
                    y.add(myArray[i]);
                }
            }
            System.out.println(y);
        }
        {
            char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            for( int i = 0; i < alphabet.length; i++ ) 
            {
                if( i == 0 ) 
                {
                    if( "AEIOUaeiou".indexOf(alphabet[i]) != -1 )
                    {
                        System.out.println(alphabet[i] + " is a vowel!");
                    }
                }
            }
            System.out.println(alphabet[alphabet.length - 1]);
        }
        {
            ArrayList<Integer> y = new ArrayList<Integer>();
            for( int i = 1; i < 11; i++) 
            {
                Random rand = new Random();
                int randomNum = rand.nextInt((100 - 55) + 1) + 55;
                y.add(randomNum);
            }
            System.out.println(y);
        }
        {
            int[] myArray;
            myArray = new int[10]; 
            int temp;
            for( int i = 0; i < 10; i++) 
            {
                Random rand = new Random();
                int randomNum = rand.nextInt((100 - 55) + 1) + 55;
                // y.add(randomNum);
                myArray[i] = randomNum;
            }
            for ( int i = 0; i < myArray.length; i++ ) 
            {
                for ( int j = i + 1; j < myArray.length; j++ ) 
                {
                    if ( myArray[i] > myArray[j] ) 
                    {
                        temp = myArray[i];
                        myArray[i] = myArray[j];
                        myArray[j] = temp;
                    }
                }
            }
            System.out.println("Random sorted array: " + Arrays.toString(myArray));
            System.out.println("min: " + myArray[0]);
            System.out.println("max: " + myArray[myArray.length-1]);
        }
        {
            String CharSet = "abcdefghijkmnopqrstuvwxyzABCDEFGHJKLMNOPQRSTUVWXYZ";
            String str = new String();
            for (int a = 1; a <= 5; a++) 
            {
                str += CharSet.charAt(new Random().nextInt(CharSet.length()));
            }
                System.out.println("Random string: " + str);
        }
        {
            String[] myArray;
            myArray = new String[10];
            String CharSet = "abcdefghijkmnopqrstuvwxyzABCDEFGHJKLMNOPQRSTUVWXYZ";
            for ( int i = 0; i < 10; i++)
            {
                String str = new String();
                for (int a = 1; a <= 5; a++) 
                {
                str += CharSet.charAt(new Random().nextInt(CharSet.length()));
                }          
                myArray[i] = str;
            } 
            System.out.println("Array with 10 Random string: " + Arrays.toString(myArray)); 
        }
    }
}