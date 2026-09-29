public class MaxSubArray {
	
	public static int meth(int arr[]) {
		
		int cs=0;
		int ms=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			cs+=arr[i];
			ms=Math.max(ms, cs);
			if(cs<0) {
				cs=0;
			}
			
		
		}
		return ms;
	}
	
	
	
	
	
	
public static int meth2(int k, int[] arr,int max) {
	
	if(arr==null||arr.length<k) {
		return 0;
	}
	int c=0;
	long sum=0;
	
	for(int i=0;i<k;i++) {
		
		sum+=arr[i];
		
	}
	
	if(sum<max) {
		c++;
	}
	for(int i = k;i<arr.length;i++) {
		
		sum+=arr[i]-arr[i-k];
		if(sum<max) {
			c++;
		}
	}
	
	return c;
	
}
	
	
	
	public static void main(String[] args) {
		int[] arr= {2, 1, 5, 1, 3, 2};
		int k=3,max=9;
		System.out.println(meth2(k,arr,max));
	}

}
