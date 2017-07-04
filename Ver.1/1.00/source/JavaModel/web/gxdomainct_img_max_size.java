public final  class gxdomainct_img_max_size
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new Long((long)512), "’l");
   }

   public static String getDescription( long key )
   {
      return (String) domain.get(key);
   }

   public static GxObjectCollection getValues( )
   {
      GxObjectCollection value = new GxObjectCollection(Long.class, "internal", "");
      java.util.Iterator itr = domain.keySet().iterator();
      while(itr.hasNext())
      {
         value.add((Long) itr.next());
      }
      return value;
   }

}

