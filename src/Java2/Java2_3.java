package Java2;

public class Java2_3 {

    public static void main(String[] args)

    {
        try

        {
            Class.forName("TTN");
        }

        catch (ClassNotFoundException e)
        {

            e.printStackTrace();

        }
    }

}
