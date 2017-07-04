/*
               File: Encoding
        Description: Encoding
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:55.9
       Program type: Callable routine
          Main DBMS: mysql
*/
public final  class gxdomainencoding
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"US-ASCII"), "ASCII");
      domain.put(new String((String)"Big5"), "Big5");
      domain.put(new String((String)"Big5-HKSCS"), "Big5-HKSCS");
      domain.put(new String((String)"EUC-JP"), "EUC-JP");
      domain.put(new String((String)"EUC-KR"), "EUC-KR");
      domain.put(new String((String)"GB18030"), "GB18030");
      domain.put(new String((String)"GB2312"), "GB2312");
      domain.put(new String((String)"GBK"), "GBK");
      domain.put(new String((String)"IBM850"), "IBM850");
      domain.put(new String((String)"ISO-2022-JP"), "ISO-2022-JP");
      domain.put(new String((String)"ISO-8859-1"), "ISO-8859-1");
      domain.put(new String((String)"ISO-8859-10"), "ISO-8859-10");
      domain.put(new String((String)"ISO-8859-13"), "ISO-8859-13");
      domain.put(new String((String)"ISO-8859-15"), "ISO-8859-15");
      domain.put(new String((String)"ISO-8859-16"), "ISO-8859-16");
      domain.put(new String((String)"ISO-8859-2"), "ISO-8859-2");
      domain.put(new String((String)"ISO-8859-3"), "ISO-8859-3");
      domain.put(new String((String)"ISO-8859-4"), "ISO-8859-4");
      domain.put(new String((String)"ISO-8859-5"), "ISO-8859-5");
      domain.put(new String((String)"ISO-8859-6"), "ISO-8859-6");
      domain.put(new String((String)"ISO-8859-7"), "ISO-8859-7");
      domain.put(new String((String)"ISO-8859-8"), "ISO-8859-8");
      domain.put(new String((String)"ISO-8859-9"), "ISO-8859-9");
      domain.put(new String((String)"KOI8-R"), "KOI8-R");
      domain.put(new String((String)"KOI8-U"), "KOI8-U");
      domain.put(new String((String)"KS_C_5601-1987"), "KS_C_5601-1987");
      domain.put(new String((String)"Shift_JIS"), "Shift_JIS");
      domain.put(new String((String)"TIS-620"), "TIS-620");
      domain.put(new String((String)"UTF-32"), "UTF-32");
      domain.put(new String((String)"UTF-32 BOM"), "UTF-32 BOM");
      domain.put(new String((String)"UTF-32BE BOM"), "UTF-32BE BOM");
      domain.put(new String((String)"UTF-32LE BOM"), "UTF-32LE BOM");
      domain.put(new String((String)"UTF-8"), "UTF-8");
      domain.put(new String((String)"UTF-8 BOM"), "UTF-8 BOM");
      domain.put(new String((String)"Windows-1250"), "Windows-1250");
      domain.put(new String((String)"Windows-1251"), "Windows-1251");
      domain.put(new String((String)"Windows-1252"), "Windows-1252");
      domain.put(new String((String)"Windows-1253"), "Windows-1253");
      domain.put(new String((String)"Windows-1254"), "Windows-1254");
      domain.put(new String((String)"Windows-1255"), "Windows-1255");
      domain.put(new String((String)"Windows-1256"), "Windows-1256");
      domain.put(new String((String)"Windows-1257"), "Windows-1257");
      domain.put(new String((String)"Windows-1258"), "Windows-1258");
      domain.put(new String((String)"Windows-31J"), "Windows-31J");
      domain.put(new String((String)"Windows-874"), "Windows-874");
      domain.put(new String((String)"UTF-16BE BOM"), "UTF-16BE BOM");
      domain.put(new String((String)"UTF-16LE BOM"), "UTF-16LE BOM");
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

