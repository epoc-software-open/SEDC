/*
               File: CT_NL
        Description: CT_NL
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:55.4
       Program type: Callable routine
          Main DBMS: mysql
*/
public final  class gxdomainct_nl
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new Byte((byte)0), "ŠÂ‹«ˆË‘¶");
      domain.put(new Byte((byte)1), "CR");
      domain.put(new Byte((byte)2), "LF");
      domain.put(new Byte((byte)3), "CRLF");
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

