/*
               File: StructSdtB602_SD05_METACONTENT_LIST
        Description: B602_SD05_METACONTENT_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:43.50
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB602_SD05_METACONTENT_LIST implements Cloneable, java.io.Serializable
{
   public StructSdtB602_SD05_METACONTENT_LIST( )
   {
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

   public StructSdtB602_SD05_METACONTENT_LIST_RESULT getResult( )
   {
      return gxTv_SdtB602_SD05_METACONTENT_LIST_Result ;
   }

   public void setResult( StructSdtB602_SD05_METACONTENT_LIST_RESULT value )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_Result = value;
   }

   public StructSdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER getContent_header( )
   {
      return gxTv_SdtB602_SD05_METACONTENT_LIST_Content_header ;
   }

   public void setContent_header( StructSdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER value )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_Content_header = value;
   }

   public java.util.Vector getMetacontent( )
   {
      return gxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent ;
   }

   public void setMetacontent( java.util.Vector value )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent = value ;
   }

   protected StructSdtB602_SD05_METACONTENT_LIST_RESULT gxTv_SdtB602_SD05_METACONTENT_LIST_Result=null ;
   protected StructSdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER gxTv_SdtB602_SD05_METACONTENT_LIST_Content_header=null ;
   protected java.util.Vector gxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent=null ;
}

