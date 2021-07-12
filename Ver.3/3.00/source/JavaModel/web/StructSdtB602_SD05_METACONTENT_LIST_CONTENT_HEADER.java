/*
               File: StructSdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER
        Description: B602_SD05_METACONTENT_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:43.56
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER implements Cloneable, java.io.Serializable
{
   public StructSdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER( )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Hospital = "" ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public String getHospital( )
   {
      return gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Hospital ;
   }

   public void setHospital( String value )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Hospital = value ;
   }

   public long getContent_no( )
   {
      return gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Content_no ;
   }

   public void setContent_no( long value )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Content_no = value ;
   }

   protected long gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Content_no ;
   protected String gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Hospital ;
}

