public class SecondLargest {

    static int find(int[] arr){
         int largest = 0;
        int secondLargest = 0;

        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }else if(num > secondLargest && num != secondLargest){
                secondLargest = num;
            }
        }

        System.out.println(secondLargest);


        return secondLargest;
    }
    public static void main(String[] args){
        int[] arr = {20,30,45,55,50};

       find(arr);
    }
}