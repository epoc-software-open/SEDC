/*
               File: CT_DATA_KIND
        Description: CT_DATA_KIND
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:39.11
       Program type: Callable routine
          Main DBMS: mysql
*/
public final  class gxdomainct_data_kind
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"B01"), "���͌������x��");
      domain.put(new String((String)"B02"), "�t�H���g�T�C�Y");
      domain.put(new String((String)"B03"), "�J���[");
      domain.put(new String((String)"B04"), "���̑���");
      domain.put(new String((String)"B05"), "�p�x");
      domain.put(new String((String)"B06"), "CRF���ڋ敪");
      domain.put(new String((String)"B07"), "�ȈՌ����i���[�J���j");
      domain.put(new String((String)"B08"), "�ȈՌ����i�T�[�o�[�j");
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

