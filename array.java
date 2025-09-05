public class array {
    public static void main(String[] args) {
        
        int[] list={5,10,22,3,48};
         int max=list[0];
            int min=list[0];
        

        for(int i=1;i<list.length;i++){
           
        if(list[i] > max){
            max=list[i];
            
        }
        if(list[i]<min){
            min=list[i];
        }
    }
        System.out.println("The largest no is: "+max);
        System.out.println("The smallest no is: "+min);
        
    }
    }
    

