public class numAppearOnce {

    public static int findSingle(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 5, 5 };

        System.out.print("Number Occured Once is : " + findSingle(arr));
    }
}
