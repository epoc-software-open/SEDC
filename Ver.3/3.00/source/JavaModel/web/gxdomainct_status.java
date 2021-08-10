/*
               File: CT_STATUS
        Description: CT_STATUS
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:40.6
       Program type: Callable routine
          Main DBMS: mysql
*/
public final  class gxdomainct_status
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"0"), "èÄîıíÜ");
      domain.put(new String((String)"1"), "ééå±íÜ");
      domain.put(new String((String)"2"), "èIóπ");
      domain.put(new String((String)"9"), "íÜé~");
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

