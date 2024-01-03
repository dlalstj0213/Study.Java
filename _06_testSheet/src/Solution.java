import java.util.Arrays;

public class Solution {
    
	private static void bubbleSortAscending(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
    
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int target = commands[i][2];
            
            int[] newArr = new int[(end-start)+1];
            int index= 0;
            for(int j=(start-1); j<=(end-1); j++) {
            	newArr[index] = array[j];
            	index++;
            }
            
            bubbleSortAscending(newArr);
            
            answer[i] = newArr[target-1];
        }
        
        return answer;
    }
    


	public static void main(String[] args) {
    	int[] array = {1, 5, 2, 6, 3, 7, 4};
    	int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    	int[] result = Solution.solution(array, commands);
    	System.out.println(Arrays.toString(result));
	}
}