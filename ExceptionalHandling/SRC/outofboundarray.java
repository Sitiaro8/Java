class outofboundarray
{
   public static void main(String args[])
   {
      try{
        int a[]=new int[10];
       
        a[12] = 11;
      }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println ("ArrayIndexOutOfBounds");
      }
   }
}