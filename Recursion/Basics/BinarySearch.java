package Data_Structures_Algorithms.Recursion.Basics;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();

        int[] arr = {1,2,3,4,5,6};

        boolean result = b.BinarySearch(arr,4);

        System.out.println(result);
    }

    public boolean BinarySearch(int[] arr,int element){

        return binary(arr,element, 0, arr.length-1);

    }

    public boolean binary(int[] arr,int element, int low, int high){

        if(low>high)
            return false;
        
        int mid = (low+high)/2;

        if(arr[mid]==element)
            return true;
        else if(arr[mid]>element)
            high = mid-1;
        else
            low = mid+1;

        return binary(arr, element, low, high);
    }
}
