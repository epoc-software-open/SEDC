import com.genexus.*;

public final  class StructSdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem implements Cloneable, java.io.Serializable
{
   public StructSdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem( )
   {
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd = "" ;
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm = "" ;
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg = "" ;
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

   public boolean getCheck( )
   {
      return gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check ;
   }

   public void setCheck( boolean value )
   {
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check = value ;
   }

   public String getDom_cd( )
   {
      return gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd ;
   }

   public void setDom_cd( String value )
   {
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd = value ;
   }

   public String getDom_jnm( )
   {
      return gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm ;
   }

   public void setDom_jnm( String value )
   {
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm = value ;
   }

   public String getDel_flg( )
   {
      return gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg ;
   }

   public void setDel_flg( String value )
   {
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg = value ;
   }

   public boolean getBtn_disp_flg( )
   {
      return gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg ;
   }

   public void setBtn_disp_flg( boolean value )
   {
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg = value ;
   }

   protected boolean gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check ;
   protected boolean gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg ;
   protected String gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd ;
   protected String gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm ;
   protected String gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg ;
}

