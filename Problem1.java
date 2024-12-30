

//Binary search if the difference between element in mid-1 index and mid index, retrun mid+1
//else if the mid element is not in mid+1 index look left, else look right.

// space complexity: O(1)
// time complexity: O(logn)


class Main {

    static int search(int ar[], int size)
    {
        int low = 0, high = size - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (mid > 0 && ar[mid] - ar[mid-1] > 1) {
              return mid + 1;
            } else if (ar[mid] != mid+1) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return -1;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int ar[] = { 1,2, 3, 4, 5, 6, 8 };
        int size = ar.length;
        System.out.println("Missing number: "
                           + search(ar, 7));
    }
}
