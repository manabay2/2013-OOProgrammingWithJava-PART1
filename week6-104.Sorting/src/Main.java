
public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {-1, 6, 9, 8, 12};
System.out.println(indexOfTheSmallestStartingFrom(values, 1));
System.out.println(indexOfTheSmallestStartingFrom(values, 2));
System.out.println(indexOfTheSmallestStartingFrom(values, 4));
    }
    
    public static int smallest(int[] array){
        int min = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min) min=array[i];
        }
        return min;
    }
    public static int indexOfTheSmallest(int[] array){
        int min = smallest(array);
        int i=0;
        for(;i<array.length;i++){
            if(array[i]==min) break;
        }
        return i;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        //finds smallest item in array based on provided index 
        int i=index;
        int min = array[index];
        for(;index<array.length;index++){
            if(array[index]<min) min = array[index];
        }
        //finds index of the smallest item        
        for(;i<array.length;i++){
            if(array[i]==min)break;
        }
        return i;
    }
    public static void swap(int[]array,int index1,int index2){
         int temp=array[index1];
         array[index1]=array[index2];
         array[index2]=temp;
         
    }
    public static void sort(int[] array){
        for(int i=0;i<array.length;i++){
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
        }
    }

}
