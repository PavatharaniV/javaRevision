public class OneArrayElementsIntoAnother {
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
    int n = arr.length;
    int[] newarr = new int[n];

    for(int i = 0; i< arr.length; i++)
    {
        System.out.print(arr[i] + " ");
        newarr[i] = arr[i];
        
    }
    System.out.println(" ");
    for(int j = 0; j< arr.length; j++)
    {
        System.out.print(newarr[j]+ " ");
        
    }
    
  }    
}
