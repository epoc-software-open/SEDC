/*
               File: CryptoSignAlgorithm
        Description: CryptoSignAlgorithm
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:54.90
       Program type: Callable routine
          Main DBMS: mysql
*/
public final  class gxdomaincryptosignalgorithm
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"MD5 RSA"), "MD5 with RSA");
      domain.put(new String((String)"SHA1 RSA"), "SHA1with RSA");
      domain.put(new String((String)"SHA256 RSA"), "SHA256with RSA");
      domain.put(new String((String)"SHA512 RSA"), "SHA512with RSA");
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

