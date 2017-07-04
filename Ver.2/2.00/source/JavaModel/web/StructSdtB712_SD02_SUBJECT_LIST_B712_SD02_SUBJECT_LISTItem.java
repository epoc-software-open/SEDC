/*
               File: StructSdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem
        Description: B712_SD02_SUBJECT_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:58.26
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem implements Cloneable, java.io.Serializable
{
   public StructSdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem( )
   {
      gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_site_id = "" ;
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

   public boolean getSel_flg( )
   {
      return gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg ;
   }

   public void setSel_flg( boolean value )
   {
      gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg = value ;
   }

   public int getTbt01_subject_id( )
   {
      return gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id ;
   }

   public void setTbt01_subject_id( int value )
   {
      gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id = value ;
   }

   public long getTbt01_study_id( )
   {
      return gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_study_id ;
   }

   public void setTbt01_study_id( long value )
   {
      gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_study_id = value ;
   }

   public String getTbt01_site_id( )
   {
      return gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_site_id ;
   }

   public void setTbt01_site_id( String value )
   {
      gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_site_id = value ;
   }

   protected int gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id ;
   protected long gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_study_id ;
   protected boolean gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg ;
   protected String gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_site_id ;
}

