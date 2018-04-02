import java.util.ArrayList;
class GenericList{
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        System.out.println(myList);

        for (int i = 1; i < myList.size(); i++ ) {
            try{
                String num = myList(i);
                System.out.println("OK!");
            } catch (Exception e){
                System.out.println("NOK!");
            }
            // int num = myList;
            System.out.println(myList.size()); 
            // System.out.println(num); 
        }

        // Integer castedValue = (Integer) value;

        // casteValue = 
        // UnreliableFriend friend = new UnreliableFriend();
        // try{
        //     friend.deliverMessage();
        //     System.out.println("The message was delivered!");
        // } catch (OutOfGasException e){
        //     System.out.println("Hey, uh, so, I ran out of gas..");
        //     // back-up plan here.
        // }
    }
}
