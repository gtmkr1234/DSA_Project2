public class BubbleShorting {
    int arr[]={2,5,7,9,1,3,0,4,6,8};
    public void sort()
    {
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
    }

    public void print()
    {
        for (int a:arr) {
            System.out.print(a+" ");
        }
    }

    public static void main(String args[])
    {
        BubbleShorting obj=new BubbleShorting();
        obj.sort();
        obj.print();
    }
}
