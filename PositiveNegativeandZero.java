public class PositiveNegativeandZero {
    public static void main(String[] args){
        int[] arr = {10, -5, 0, 8, -2, 0, 15};

        int a= 0;
        int b = 0;
        int c = 0;

        for (int i = 0 ; i< arr.length; i++){
            if(arr[i]>0){
                a = a + 1;
            }else if(arr[i]<0){
                b = b + 1;
            }else{
                c = c+1;
            }
        }
        System.out.println("Positive : " + a);
        System.out.println("Negative : " + b);
        System.out.println("Zero : " + c);
    }
}
