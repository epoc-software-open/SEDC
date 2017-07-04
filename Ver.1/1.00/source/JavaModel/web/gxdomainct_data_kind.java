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

   public static String getDescription( String key )
   {
      return (String) domain.get(key);
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

