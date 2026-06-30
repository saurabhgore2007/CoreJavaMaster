package Day17;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Integer>{
	private int[] arr;
	private int start;
	private int end;
	
    private static final int THRESHOLD = 2;

    public SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }
    
    @Override
    protected Integer compute() {
    	if(end - start + 1 <=THRESHOLD) {
    		
    		int sum = 0;

            for (int i = start; i <= end; i++) {
                sum += arr[i];
            }
            
            System.out.println(Thread.currentThread().getName() + " computed [" + start + "," + end + "] = " + sum);
            
            return sum;
    	}
    	
    	int mid = start + (end - start) / 2;
    	SumTask left = new SumTask(arr, start, mid);
        SumTask right = new SumTask(arr, mid + 1, end);
        
        // Fork left task
        left.fork();

        // Compute right task
        int rightResult = right.compute();

        // Wait for left task
        int leftResult = left.join();

        // Combine
        return leftResult + rightResult;
    }
   
}

public class ForkJoinEx1 {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8};
		
		ForkJoinPool pool = new ForkJoinPool();
		
		SumTask task = new SumTask(arr,0,arr.length-1);
		
		int result = pool.invoke(task);
		
		System.out.println("Total Sum = " + result);
	}

}
