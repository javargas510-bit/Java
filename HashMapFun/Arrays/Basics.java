public class Basics {
    
    static void printOneTo256() {
        System.out.println("Write a method that prints all the numbers from 1 to 255");
        for (int i = 1; i < 256; i++){
            System.out.println(i);
        }
      }
      static void printOdds() {
        System.out.println("Write a method that prints all ODDS the numbers from 1 to 255");
        for (int i = 1; i < 256; i++){
            if(i%2 != 0){
            System.out.println(i);
            }
        }
      }
      static void printSum() {
        System.out.println("SUM all numbers from  1- 255");
        int j = 0;
        for (int i = 0; i < 256; i++){
           
            j = i + j;

            System.out.println("New number:" + i + " Sum:"+ j);
            
        }
    }
        static void iterateArray(int [] array) {
                for(int i=0; i<array.length; i++ ) {
               System.out.println(array[i]);
                  
               
            }
        
        
         }

         public int max(int [] array) {
            int max = 0;
      
            for(int i=0; i<array.length; i++ ) {
               if(array[i]>max) {
                  max = array[i];
               }
            }
            return max;
         }
    

    public static void main(String[] args) {
    //    printOneTo256();
    //   printOdds();
    //    printSum();
    int[] myArray = {4, 8, 8, 5, 9};

    iterateArray(myArray);
    Basics m = new Basics();
    int maxNumber = m.max(myArray);
    System.out.println("======"+maxNumber+"======");

    }


}
