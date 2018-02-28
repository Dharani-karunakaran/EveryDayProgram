import java.util.Arrays;

public class Feb28
{
    public static void main(String[] args)
    {
        
        int[] array={1,4,5,6,7,9,11,13,15};
        System.out.println((Arrays.toString(array)));
        int lvalue=array[array.length-1];
        int array1[]=new int[lvalue];
        for(int i=0;i<lvalue;i++)
        {
            array1[i]=i+1;
            
        }
            for(int i=0; i<array1.length;i++)
            {
                            int count=0;
             for(int j=0; j<array.length;j++)
             {
                 if(array1[i]==array[j])
                 {
                     count++;
                     
                 
                 }
             }
             if(count==0)
                     {

                     System.out.println(array1[i]);
                 }
                 
                 }
             }
              }
