/*
               File: CT_CSV_OUTPUT_TYPE
        Description: CT_CSV_OUTPUT_TYPE
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:38.96
       Program type: Callable routine
          Main DBMS: mysql
*/
public final  class gxdomainct_csv_output_type
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new Short((short)1), "�S�f�[�^");
      domain.put(new Short((short)2), "DM��");
      domain.put(new Short((short)3), "����");
      domain.put(new Short((short)4), "�f�[�^�Œ�");
   }

   public static String getDescription( com.genexus.internet.HttpContext httpContext ,
                                        short key )
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
      GxObjectCollection value = new GxObjectCollection(Short.class, "internal", "");
      java.util.Iterator itr = domain.keySet().iterator();
      while(itr.hasNext())
      {
         value.add((Short) itr.next());
      }
      return value;
   }

}

