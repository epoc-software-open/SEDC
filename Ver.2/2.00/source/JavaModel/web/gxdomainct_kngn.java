/*
               File: CT_KNGN
        Description: CT_KNGN
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:55.2
       Program type: Callable routine
          Main DBMS: mysql
*/
public final  class gxdomainct_kngn
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"1"), "閲覧権限");
      domain.put(new String((String)"2"), "入力権限");
      domain.put(new String((String)"3"), "管理者権限");
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

