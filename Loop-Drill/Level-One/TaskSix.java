public class TaskSix{

    public static void main(String[] args){
        
        System.out.println("Calculate the sum of numbers from 1 to 100..\n\n");

        int size = 100;
        int total = 0;
        for(int count = 1; count <= size; count++ ){
            
            total += count;
        }
        System.out.println("Sum: "+ total);
    }
}
