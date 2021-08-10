/*
               File: GxFullTextSearchReindexer
        Description: No description for object
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:49.9
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.ui.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.uifactory.*;
import com.genexus.search.*;
import java.sql.*;

public final  class GxFullTextSearchReindexer
{
   public static int Reindex( int remoteHandle )
   {
      GxSilentTrnSdt obj ;
      IGxSilentTrn trn ;
      boolean result ;
      obj = new SdtTBM45_CRF_FILETR(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM44_CRF_VISIT(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM43_STUDY_CDISC_ITEM(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM42_STUDY_CDISC_DOMAIN(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBT16_IMPORT_HISTORY(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBW07_CRF_MEMO_LOC(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBW06_CRF_MEMO(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBW05_CRF_RESULT(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBW04_CRF(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBW03_CRF_SEARCH(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBW01_FREE_WORK(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM07_AUTH_BEHAVIOR(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM02_CDISC_DOMAIN(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBT13_CRF_RES_HIS(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM36_CRF_SELECT(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM35_CRF_ITEM_AUTH(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM34_CRF_AUTH(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM26_SEL_LIST_ITEM(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM25_SEL_LIST(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM24_MAP_ITEM(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM11_IMAGE(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBW02_ODM_WORK(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBT15_CRF_MEMO_LOC(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBT14_CRF_MEMO(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBT12_CRF_RESULT(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBT11_CRF_HISTORY(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBT02_CRF(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBT01_SUBJECT(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM37_CRF_DOM_MAP(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM41_CRF_NCM_MAP(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM33_CRF_COND(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM32_CRF_ITEM(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM31_CRF(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM23_STUDY_STAFF(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM22_STUDY_SITE(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM21_STUDY(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTBM03_CDISC_ITEM(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTAM08_SITE(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTAM04BC_KNGN(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTAW01_API_SDT_WORK(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTAM07_USER(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTAM05_APPLI_KNGN(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new SdtTAM04_KNGN(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      return 1 ;
   }

}

