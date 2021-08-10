/*
               File: CT_BTN_TYPE
        Description: CT_BTN_TYPE
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:38.76
       Program type: Callable routine
          Main DBMS: mysql
*/
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

