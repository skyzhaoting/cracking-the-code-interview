package sortandsearch;

public class MergeSortedArray
{
	/**
	 * 两个排好序的数组A和B A有足够的空间 将B纳入A中
	 * 从数组的末端开始
	 */
    public void merge(int A[], int m, int B[], int n) {
        int indexA = m-1;
        int indexB = n-1;
        int index = m+n-1;
        while(indexA >= 0 && indexB >=0)
        {
            if(A[indexA] >= B[indexB])
                A[index--] = A[indexA--];
            else
                A[index--] = B[indexB--];
        }
        while(indexB>=0)
        {
            A[index--] = B[indexB--];
        }
    }
}
