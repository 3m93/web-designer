public class ArrayExample{
public static void main(String[] args)
{
int[] arr={45,55,65,87,92,101,12,0,88,18};
int largeValue=0;
for(int i=0; i< arr.length;i++)
{
  if(arr[i]>largeValue)
{
largeValue=arr[i];
}
}
System.out.println("The Largest value in the array is =" +  largeValue);
}
}