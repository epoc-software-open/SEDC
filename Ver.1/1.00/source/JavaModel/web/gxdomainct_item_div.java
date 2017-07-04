public final  class gxdomainct_item_div
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"TextBox"), "Text Box");
      domain.put(new String((String)"NumericTextBox"), "Numeric Text Box");
      domain.put(new String((String)"TextArea"), "Text Area");
      domain.put(new String((String)"Radio"), "Radio");
      domain.put(new String((String)"CheckBox"), "Check Box");
      domain.put(new String((String)"SelectBox"), "Select Box");
      domain.put(new String((String)"Label"), "Label");
      domain.put(new String((String)"Line"), "Line");
      domain.put(new String((String)"Rectangle"), "Rectangle");
      domain.put(new String((String)"Brackets"), "Brackets");
      domain.put(new String((String)"Image"), "Image");
      domain.put(new String((String)"Group"), "Group");
      domain.put(new String((String)"DateGroup"), "Date Group");
      domain.put(new String((String)"TimeGroup"), "Time Group");
      domain.put(new String((String)"RadioGroup"), "Radio Group");
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

