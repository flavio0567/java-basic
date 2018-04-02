class FizzBuzz {
    public String fizzBuzz(int number) {
        String result;
        int fizz = (number % 3);
        if(fizz == 0) {
            double buzz = (number % 5);
            if(buzz != 0) {
                result = "Fizz";
                return result;
            } else {
                result = "FizzBuzz";
                return result;
            }
        } else {
            double buzz = (number % 5);
            if(buzz == 0) {
                result = "Buzz";
                return result;
            } else {
                result = String.valueOf(number);
                return result;
            }
        }
    }
}