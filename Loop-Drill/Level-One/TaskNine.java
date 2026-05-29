public class TaskNine{

    public static void main(String[] args){
        
        System.out.println("Print numbers divisible by both 2 and 5.\n\n");

        int size = 100;
        for(int count = 1; count <= size; count+=1 ){
            if(count % 2 == 0 && count % 5 == 0){
                System.out.print(count + ", ");
            }
        }

    }
}
