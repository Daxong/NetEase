public class Rotation
{
    public boolean chkRotation(String A, int lena, String B, int lenb)
    {
         if(lena != lenb)
             return false;
         String AB = A + A ;
        //String is already a CharSequence
         return AB.contains(B);

    }

    public static void main(String[] args) {


        System.out.println("ss");

        Rotation rotation = new Rotation();
        rotation .chkRotation("123",3,"234",3);
    }


}
