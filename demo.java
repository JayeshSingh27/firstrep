public class L6_mirror_image_no_pattern
{
    public static void main(String[] args)
    {
        int n=4;
        int i=1;
        while(i = n)
        {
            int spaces=1;
            while(spaces = n-i)
            {
                System.out.print(' ');
                spaces++;
            }
            int j=1;
            while(j = i)
            {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
