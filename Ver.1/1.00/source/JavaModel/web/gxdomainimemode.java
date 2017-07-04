public final  class gxdomainimemode
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"hiragana"), "Hiragana");
      domain.put(new String((String)"full width katakana"), "FullWidthKatakana");
      domain.put(new String((String)"full width alphanumeric"), "FullWidthAlphanumeric");
      domain.put(new String((String)"half width katakana"), "HalfWidthKatakana");
      domain.put(new String((String)"half width alphanumeric"), "HalfWidthAlphanumeric");
      domain.put(new String((String)"disabled"), "Disabled");
      domain.put(new String((String)"inactive"), "Inactive");
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

