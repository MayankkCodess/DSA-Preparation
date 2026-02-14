public class linearsearchkey {

    public static int linear_Search(int numbers[],int key){
        //To find the  index of key in given array
     for(int i = 0; i<numbers.length; i++){
        if(key==numbers[i]){
            return i;
        }
        
     }
     return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2, 3 ,4 ,8 , 10, 80, 12};
        int key = 10;
        linear_Search(numbers,key);
        int index = linear_Search(numbers,  key);
        if(index== -1){
            System.out.println("Not Found");
        }else {
            System.out.println("key is at index = " + index);
        }
    }
}
