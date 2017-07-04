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

