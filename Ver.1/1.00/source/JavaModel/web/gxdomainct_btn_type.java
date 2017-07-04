public final  class gxdomainct_btn_type
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"REG"), "新規・登録ボタン");
      domain.put(new String((String)"UPLOAD"), "アップロードボタン");
      domain.put(new String((String)"UPD"), "更新ボタン");
      domain.put(new String((String)"DLT"), "削除ボタン");
      domain.put(new String((String)"CPY"), "コピーボタン");
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

