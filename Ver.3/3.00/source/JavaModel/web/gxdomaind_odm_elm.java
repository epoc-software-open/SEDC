/*
               File: D_ODM_ELM
        Description: D_ODM_ELM
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:40.21
       Program type: Callable routine
          Main DBMS: mysql
*/
public final  class gxdomaind_odm_elm
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"ODM"), "ODM");
      domain.put(new String((String)"Study"), "Study");
      domain.put(new String((String)"AdminData"), "AdminData");
      domain.put(new String((String)"ReferenceData"), "ReferenceData");
      domain.put(new String((String)"ClinicalData"), "ClinicalData");
      domain.put(new String((String)"Association"), "Association");
      domain.put(new String((String)"ds:Signature"), "ds:Signature");
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

