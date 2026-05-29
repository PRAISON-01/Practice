public class TaskSeven{

    public static void main(String[] args){
        
        System.out.println("Calculate the product of numbers from 1 to 5.\n\n");

        int size = 5;
        int total = 1;
        for(int count = 1; count <= size; count++ ){
            
            total *= count;
        }
        System.out.println("Product of numbers from 1 to five: "+ total);
    }
}
