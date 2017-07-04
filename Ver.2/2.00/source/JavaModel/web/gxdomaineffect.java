/*
               File: Effect
        Description: Effect
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:55.7
       Program type: Callable routine
          Main DBMS: mysql
*/
public final  class gxdomaineffect
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"gx_default"), "Default");
      domain.put(new String((String)"gx_curl_up"), "Curl Up (iOS Only)");
      domain.put(new String((String)"gx_curl_down"), "Curl Down (iOS Only)");
      domain.put(new String((String)"gx_flip_from_left"), "Flip From Left (iOS only)");
      domain.put(new String((String)"gx_flip_from_right"), "Flip From Right (iOS only)");
      domain.put(new String((String)"gx_slide_down"), "Slide Down");
      domain.put(new String((String)"gx_slide_up"), "Slide Up");
      domain.put(new String((String)"gx_slide_left"), "Slide Left");
      domain.put(new String((String)"gx_slide_right"), "Slide Right");
      domain.put(new String((String)"gx_push_down"), "Push Down");
      domain.put(new String((String)"gx_push_up"), "Push Up");
      domain.put(new String((String)"gx_push_left"), "Push Left");
      domain.put(new String((String)"gx_push_right"), "Push Right");
      domain.put(new String((String)"gx_fade"), "Fade");
      domain.put(new String((String)"gx_none"), "None");
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

