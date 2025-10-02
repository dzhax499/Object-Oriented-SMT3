class Finally
{
    private static int j=0;

    public static void main(String[] args)
    {
        while(true)
        {
            try
            {
                System.out.print("pada saat i = " + j + ": ");
                if(j++ == 0)
                    throw new Exception();
                System.out.println("tidak terjadi eksepsi");
            }
            catch(Exception x)
            {
                System.out.println("terdapat eksepsi");
            }
            finally
            {
                System.out.println("statemen dalam blok finally");
                if(j == 3)
                {
                    break;
                }
            }
        }
    }
}