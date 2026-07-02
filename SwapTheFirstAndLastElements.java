import java.util.*;

public class SwapTheFirstAndLastElements {

    public static void main(String[] args)
    {
        Integer[] arr = {1,2,3,4};
        List<Integer> list = Arrays.asList(arr);

        Collections.swap(list,0,list.size()-1);
        
        System.out.print(list);
    }
}
