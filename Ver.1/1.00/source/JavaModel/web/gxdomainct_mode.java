public final  class gxdomainct_mode
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"INS"), "追加");
      domain.put(new String((String)"UPD"), "更新");
      domain.put(new String((String)"DLT"), "削除");
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

