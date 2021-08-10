/*
               File: IMEMode
        Description: IMEMode
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:40.42
       Program type: Callable routine
          Main DBMS: mysql
*/
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

   public static String getDescription( com.genexus.internet.HttpContext httpContext ,
                                        String key )
   {
      if (domain.containsKey( key.trim() ))
      {
         return (String)domain.get( key.trim() );
      }
      else
      {
         return "";
      }
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

