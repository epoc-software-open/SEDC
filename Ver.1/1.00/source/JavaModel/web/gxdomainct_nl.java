public final  class gxdomainct_nl
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new Byte((byte)0), "ŠÂ‹«ˆË‘¶");
      domain.put(new Byte((byte)1), "CR");
      domain.put(new Byte((byte)2), "LF");
      domain.put(new Byte((byte)3), "CRLF");
   }

   public static String getDescription( byte key )
   {
      return (String) domain.get(key);
   }

   public static GxObjectCollection getValues( )
   {
      GxObjectCollection value = new GxObjectCollection(Byte.class, "internal", "");
      java.util.Iterator itr = domain.keySet().iterator();
      while(itr.hasNext())
      {
         value.add((Byte) itr.next());
      }
      return value;
   }

}

