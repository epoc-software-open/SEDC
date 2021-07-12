/*
               File: CT_MODE
        Description: CT_MODE
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:39.86
       Program type: Callable routine
          Main DBMS: mysql
*/
public final  class gxdomainct_mode
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"INS"), "í«â¡");
      domain.put(new String((String)"UPD"), "çXêV");
      domain.put(new String((String)"DLT"), "çÌèú");
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

