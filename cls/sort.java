public class sort{
	public static void main(String args[]){
		int[] arr={17,23,34,78,12,3,4};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;i<arr.length-i;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int t=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
				}
			}
		}
		for(int k=0;k<arr.length;k++)
			System.out.println(arr[k]);
}}