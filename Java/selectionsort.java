public class selectionsort
{
public static void selsort(int []array)
{
for(int i=0;i<array.length-1;i++)
{
int index=i;
for(int j=i+1;j<array.length-1;j++)
{
if(array[j]<array[index])
{
index=j;
}
}
int smallnumber=array[index];
array[index]=i;
}
}
public static void main(String args[])
{
int array1[]={44,55,88,11,22};
System.out.println("before selection sort");
for(int i=0;i<array.length-1;i++)
{
System.out.println(i+" ");
}
System.out.println();
selsort(array1);
System.out.println("After selection sort");
for(int i=0;i<array.length-1;i++)
{
System.out.println(i+" ");
}
}
}