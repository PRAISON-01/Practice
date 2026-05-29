public class TaskThree{

     public static void main(String[] args){


        System.out.println("Print all even numbers from 1 to 20.\n\n");
        int size = 20;
        for(int count = 1; count <= size; count+=1){
            
            if(count % 2 == 0){
                System.out.print(count + ", ");
            }
        }
    }
}
