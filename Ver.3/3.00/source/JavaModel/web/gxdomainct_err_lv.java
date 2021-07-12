/*
               File: CT_ERR_LV
        Description: CT_ERR_LV
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:39.23
       Program type: Callable routine
          Main DBMS: mysql
*/
public final  class gxdomainct_err_lv
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new Short((short)0), "ERR");
      domain.put(new Short((short)1), "DBG");
   }

   public static String getDescription( com.genexus.internet.HttpContext httpContext ,
                                        short key )
   {
      if (domain.containsKey( key ))
      {
         return (String)domain.get( key );
      }
      else
      {
         return "";
      }
   }

   public static GxObjectCollection getValues( )
   {
      GxObjectCollection value = new GxObjectCollection(Short.class, "internal", "");
      java.util.Iterator itr = domain.keySet().iterator();
      while(itr.hasNext())
      {
         value.add((Short) itr.next());
      }
      return value;
   }

}

