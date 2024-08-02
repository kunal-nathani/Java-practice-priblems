/*write a function to find all peak element in an array.A peak element is an element that in an array.
A peak element is an array containing the squares of all element from the inpur array,ensuring that the output is also sorted.
The function should have a time complexity of O(n) & handle all possible input scenario's effectively.
*/
public class sortedSquares {
    public static int[] sortedSquares(int[] nums){
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n-1;
        int position = n-1;

        while(left<=right){
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];

            if(leftSquare>rightSquare){
                result[position] = leftSquare;
                left++;
            }else{
                result[position] = rightSquare;
                right--;
            }
            position--;
        }
        return result;
    }
    public static void main(String[]args){
        int[] array = {-7,-3,2,3,11};
        int[] sortedSquares = sortedSquares(array);

        for(int num : sortedSquares){
            System.out.println(num+"  ");
        }
    }
}

