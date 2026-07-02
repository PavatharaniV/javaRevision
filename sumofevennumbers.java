public class sumofevennumbers {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};

        int even = 0;
        int odd = 0;

        for(int i =0; i< arr.length; i++){
            if(arr[i] %2 == 0)
            {
                even = arr[i] + even;
            }else{
                odd = arr[i] + odd;
            }
            
        }

        System.out.println("Sum of Even numbers : " + even);
        System.out.println("Sum of Odd numbers : " +odd);
    }
}
