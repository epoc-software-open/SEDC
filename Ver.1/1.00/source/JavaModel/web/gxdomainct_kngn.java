public final  class gxdomainct_kngn
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"1"), "‰{——Œ ŒÀ");
      domain.put(new String((String)"2"), "“ü—ÍŒ ŒÀ");
      domain.put(new String((String)"3"), "ŠÇ—ÒŒ ŒÀ");
   }

   public static String getDescription( String key )
   {
      return (String) domain.get(key);
   }

   public static GxObjectCollection getValues( )
   {
      GxObjectCollection value = new GxObjectCollection(String.class, "internal", "");
      java.util.Iterator itr = domain.keySet().iterator();
      while(itr.hasNext())
      {
         value.add((String) itr.next());
      }
      return value;
   }

}

