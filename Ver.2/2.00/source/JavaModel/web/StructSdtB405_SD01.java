/*
               File: StructSdtB405_SD01
        Description: B405_SD01
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:56.76
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB405_SD01 implements Cloneable, java.io.Serializable
{
   public StructSdtB405_SD01( )
   {
      gxTv_SdtB405_SD01_Hikensha_id = "" ;
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

   public boolean getChk( )
   {
      return gxTv_SdtB405_SD01_Chk ;
   }

   public void setChk( boolean value )
   {
      gxTv_SdtB405_SD01_Chk = value ;
   }

   public boolean getChk_visbale( )
   {
      return gxTv_SdtB405_SD01_Chk_visbale ;
   }

   public void setChk_visbale( boolean value )
   {
      gxTv_SdtB405_SD01_Chk_visbale = value ;
   }

   public long getTbt01_study_id( )
   {
      return gxTv_SdtB405_SD01_Tbt01_study_id ;
   }

   public void setTbt01_study_id( long value )
   {
      gxTv_SdtB405_SD01_Tbt01_study_id = value ;
   }

   public int getTbt01_subject_id( )
   {
      return gxTv_SdtB405_SD01_Tbt01_subject_id ;
   }

   public void setTbt01_subject_id( int value )
   {
      gxTv_SdtB405_SD01_Tbt01_subject_id = value ;
   }

   public String getHikensha_id( )
   {
      return gxTv_SdtB405_SD01_Hikensha_id ;
   }

   public void setHikensha_id( String value )
   {
      gxTv_SdtB405_SD01_Hikensha_id = value ;
   }

   public java.util.Vector getCrf( )
   {
      return gxTv_SdtB405_SD01_Crf ;
   }

   public void setCrf( java.util.Vector value )
   {
      gxTv_SdtB405_SD01_Crf = value ;
   }

   protected int gxTv_SdtB405_SD01_Tbt01_subject_id ;
   protected long gxTv_SdtB405_SD01_Tbt01_study_id ;
   protected boolean gxTv_SdtB405_SD01_Chk ;
   protected boolean gxTv_SdtB405_SD01_Chk_visbale ;
   protected String gxTv_SdtB405_SD01_Hikensha_id ;
   protected java.util.Vector gxTv_SdtB405_SD01_Crf=null ;
}

