package exceptions;

public class UncheckedException1 {
	static String st=null;
	static int[] arr= {1,2,3,4,5};

	public static void main(String[] args) {
		//int len=st.length();
		//System.out.println("Length of the string is "+len);//Null pointer exeception will show
		System.out.println("Element at the 6th position of array is " +arr[6]);//Array index out of bounds exception.

	}

}
