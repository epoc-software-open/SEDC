/*
               File: APIAuthorizationStatus
        Description: APIAuthorizationStatus
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:38.31
       Program type: Callable routine
          Main DBMS: mysql
*/
public final  class gxdomainapiauthorizationstatus
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new Byte((byte)0), "Not Determined");
      domain.put(new Byte((byte)1), "Restricted");
      domain.put(new Byte((byte)2), "Denied");
      domain.put(new Byte((byte)3), "Authorized");
      domain.put(new Byte((byte)4), "Authorized When In Use");
   }

   public static String getDescription( com.genexus.internet.HttpContext httpContext ,
                                        byte key )
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
      GxObjectCollection value = new GxObjectCollection(Byte.class, "internal", "");
      java.util.Iterator itr = domain.keySet().iterator();
      while(itr.hasNext())
      {
         value.add((Byte) itr.next());
      }
      return value;
   }

}

