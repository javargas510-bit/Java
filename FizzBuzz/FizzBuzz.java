public class FizzBuzz {
    public String fizzBuzz(int number) {
        // fizzbuzz logic here
        String answer = "Fizz";
        if(((number%3) == 0) && ((number%5) == 0 )) {
            System.out.println("FizzBuzz");
            answer = "FizzBuzz";
            return answer;
        } 
        else if((number%5)==0) {
            System.out.println("Buzz");
            return answer;

        }
        else if ((number%3)== 0) {
            System.out.println("Fizz");
            return answer;

        }  
        
        String str1 = Integer.toString(number);          

        return str1;
    
    }
}
