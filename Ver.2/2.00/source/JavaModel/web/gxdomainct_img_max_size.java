/*
               File: CT_IMG_MAX_SIZE
        Description: CT_IMG_MAX_SIZE
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:54.99
       Program type: Callable routine
          Main DBMS: mysql
*/
public final  class gxdomainct_img_max_size
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new Long((long)512), "’l");
   }

   public static String getDescription( com.genexus.internet.HttpContext httpContext ,
                                        long key )
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
      GxObjectCollection value = new GxObjectCollection(Long.class, "internal", "");
      java.util.Iterator itr = domain.keySet().iterator();
      while(itr.hasNext())
      {
         value.add((Long) itr.next());
      }
      return value;
   }

}

