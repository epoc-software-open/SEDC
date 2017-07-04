/*
               File: CT_DATA_KIND
        Description: CT_DATA_KIND
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:54.94
       Program type: Callable routine
          Main DBMS: mysql
*/
public final  class gxdomainct_data_kind
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"B01"), "入力権限レベル");
      domain.put(new String((String)"B02"), "フォントサイズ");
      domain.put(new String((String)"B03"), "カラー");
      domain.put(new String((String)"B04"), "線の太さ");
      domain.put(new String((String)"B05"), "角度");
      domain.put(new String((String)"B06"), "CRF項目区分");
      domain.put(new String((String)"B07"), "簡易検索（ローカル）");
      domain.put(new String((String)"B08"), "簡易検索（サーバー）");
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

