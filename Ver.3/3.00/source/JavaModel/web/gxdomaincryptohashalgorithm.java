/*
               File: CryptoHashAlgorithm
        Description: CryptoHashAlgorithm
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:38.64
       Program type: Callable routine
          Main DBMS: mysql
*/
public final  class gxdomaincryptohashalgorithm
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"MD5"), "MD5");
      domain.put(new String((String)"SHA1"), "SHA1");
      domain.put(new String((String)"SHA256"), "SHA256");
      domain.put(new String((String)"SHA384"), "SHA384");
      domain.put(new String((String)"SHA512"), "SHA512");
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

