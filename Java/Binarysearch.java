class Binarysearch
{ int binarysearch(int arr[],int f,int l,int x)
{
if(l>=1)
{
int mid=f+(l-1)/2;
if(arr[mid]==x)
return mid;
if(arr[mid]>x)
return binarysearch(arr,f,mid-1,x);
return binarysearch(arr,mid+1,l,x);
}
return -1;
}
public static void main(String args[])
{
Binarysearch ob=new Binarysearch();
int arr[]={2,3,4,10,40};
int n=arr.length;
int x=4;
int result=ob.binarysearch(arr,0,n-1,x);
if(result==-1)
System.out.println("Element not found");
else
System.out.println("Element found at index"+result,+x);
}
}
