public class sequence
{
public static int search(int arr[],int x)
{
int n=arr.length;
for(int i=0;i<n;i++)
{
	if(arr[i]==x)
	return i;
}
return -1;
}
public static void main(String args[])
{
int arr[]={56,10,26,76,41};
int x=26;
int result=search(arr,x);
if(result==-1)
System.out.println("Element is not present");

else
System.out.println("Element is present at index"+result);
}
}