/*
               File: Timezones
        Description: Timezones
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:55.15
       Program type: Callable routine
          Main DBMS: mysql
*/
public final  class gxdomaintimezones
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"Africa/Cairo"), "Africa/Cairo");
      domain.put(new String((String)"Africa/Johannesburg"), "Africa/Johannesburg");
      domain.put(new String((String)"Africa/Lagos"), "Africa/Lagos");
      domain.put(new String((String)"America/Anchorage"), "America/Anchorage");
      domain.put(new String((String)"America/Argentina/Buenos_Aires"), "America/Argentina/Buenos_Aires");
      domain.put(new String((String)"America/Asuncion"), "America/Asuncion");
      domain.put(new String((String)"America/Bogota"), "America/Bogota");
      domain.put(new String((String)"America/Caracas"), "America/Caracas");
      domain.put(new String((String)"America/Chicago"), "America/Chicago");
      domain.put(new String((String)"America/Denver"), "America/Denver");
      domain.put(new String((String)"America/Godthab"), "America/Godthab");
      domain.put(new String((String)"America/Guatemala"), "America/Guatemala");
      domain.put(new String((String)"America/Halifax"), "America/Halifax");
      domain.put(new String((String)"America/Los_Angeles"), "America/Los_Angeles");
      domain.put(new String((String)"America/Mexico_City"), "America/Mexico_City");
      domain.put(new String((String)"America/Montevideo"), "America/Montevideo");
      domain.put(new String((String)"America/New_York"), "America/New_York");
      domain.put(new String((String)"America/Noronha"), "America/Noronha");
      domain.put(new String((String)"America/Phoenix"), "America/Phoenix");
      domain.put(new String((String)"America/Santiago"), "America/Santiago");
      domain.put(new String((String)"America/Santo_Domingo"), "America/Santo_Domingo");
      domain.put(new String((String)"America/Sao_Paulo"), "America/Sao_Paulo");
      domain.put(new String((String)"America/St_Johns"), "America/St_Johns");
      domain.put(new String((String)"Asia/Baghdad"), "Asia/Baghdad");
      domain.put(new String((String)"Asia/Beirut"), "Asia/Beirut");
      domain.put(new String((String)"Asia/Damascus"), "Asia/Damascus");
      domain.put(new String((String)"Asia/Dhaka"), "Asia/Dhaka");
      domain.put(new String((String)"Asia/Dubai"), "Asia/Dubai");
      domain.put(new String((String)"Asia/Jerusalem"), "Asia/Jerusalem");
      domain.put(new String((String)"Asia/Kabul"), "Asia/Kabul");
      domain.put(new String((String)"Asia/Karachi"), "Asia/Karachi");
      domain.put(new String((String)"Asia/Katmandu"), "Asia/Katmandu");
      domain.put(new String((String)"Asia/Kolkata"), "Asia/Kolkata");
      domain.put(new String((String)"Asia/Rangoon"), "Asia/Rangoon");
      domain.put(new String((String)"Asia/Shanghai"), "Asia/Shanghai");
      domain.put(new String((String)"Asia/Tehran"), "Asia/Tehran");
      domain.put(new String((String)"Asia/Tokyo"), "Asia/Tokyo");
      domain.put(new String((String)"Asia/Yerevan"), "Asia/Yerevan");
      domain.put(new String((String)"Atlantic/Azores"), "Atlantic/Azores");
      domain.put(new String((String)"Atlantic/Cape_Verde"), "Atlantic/Cape_Verde");
      domain.put(new String((String)"Australia/Adelaide"), "Australia/Adelaide");
      domain.put(new String((String)"Australia/Brisbane"), "Australia/Brisbane");
      domain.put(new String((String)"Australia/Darwin"), "Australia/Darwin");
      domain.put(new String((String)"Australia/Sydney"), "Australia/Sydney");
      domain.put(new String((String)"Etc/GMT_12"), "Etc/GMT_12");
      domain.put(new String((String)"Etc/GMT_2"), "Etc/GMT_2");
      domain.put(new String((String)"Etc/UTC"), "Etc/UTC");
      domain.put(new String((String)"Europe/Berlin"), "Europe/Berlin");
      domain.put(new String((String)"Europe/Helsinki"), "Europe/Helsinki");
      domain.put(new String((String)"Europe/Istanbul"), "Europe/Istanbul");
      domain.put(new String((String)"Europe/London"), "Europe/London");
      domain.put(new String((String)"Pacific/Auckland"), "Pacific/Auckland");
      domain.put(new String((String)"Pacific/Honolulu"), "Pacific/Honolulu");
      domain.put(new String((String)"Pacific/Noumea"), "Pacific/Noumea");
      domain.put(new String((String)"Pacific/Tongatapu"), "Pacific/Tongatapu");
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

