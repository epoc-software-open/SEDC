/*
               File: A802_PC05_DATE_EDIT
        Description: 日付編集処理５（西暦→和暦へ）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:44.32
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a802_pc05_date_edit extends GXProcedure
{
   public a802_pc05_date_edit( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a802_pc05_date_edit.class ), "" );
   }

   public a802_pc05_date_edit( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      a802_pc05_date_edit.this.AV11P_DATE = aP0;
      a802_pc05_date_edit.this.AV13P_STYLE = aP1;
      a802_pc05_date_edit.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      a802_pc05_date_edit.this.AV11P_DATE = aP0;
      a802_pc05_date_edit.this.AV13P_STYLE = aP1;
      a802_pc05_date_edit.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12W_OUT_DATE = "" ;
      if ( ! (GXutil.strcmp("", AV11P_DATE)==0) )
      {
         /* Using cursor P000Q2 */
         pr_default.execute(0, new Object[] {AV11P_DATE, AV11P_DATE});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A25TAS02_DATE_END = P000Q2_A25TAS02_DATE_END[0] ;
            n25TAS02_DATE_END = P000Q2_n25TAS02_DATE_END[0] ;
            A24TAS02_DATE_START = P000Q2_A24TAS02_DATE_START[0] ;
            n24TAS02_DATE_START = P000Q2_n24TAS02_DATE_START[0] ;
            A26TAS02_HNKAN_NEN = P000Q2_A26TAS02_HNKAN_NEN[0] ;
            n26TAS02_HNKAN_NEN = P000Q2_n26TAS02_HNKAN_NEN[0] ;
            A23TAS02_GNGO_NM = P000Q2_A23TAS02_GNGO_NM[0] ;
            n23TAS02_GNGO_NM = P000Q2_n23TAS02_GNGO_NM[0] ;
            A22TAS02_GNGO_KBN = P000Q2_A22TAS02_GNGO_KBN[0] ;
            AV8W_COMP_NEN = (int)(GXutil.lval( GXutil.substring( AV11P_DATE, 1, 4))) ;
            AV9W_COMP_NEN_WAREKI = (byte)(AV8W_COMP_NEN-A26TAS02_HNKAN_NEN) ;
            if ( GXutil.strcmp(AV13P_STYLE, "GK_YY\\MM\\DD") == 0 )
            {
               AV12W_OUT_DATE = A23TAS02_GNGO_NM + GXutil.padl( GXutil.str( AV9W_COMP_NEN_WAREKI, 10, 0), (short)(2), "0") + "年" + GXutil.substring( AV11P_DATE, 5, 2) + "月" + GXutil.substring( AV11P_DATE, 7, 2) + "日" ;
            }
            else if ( GXutil.strcmp(AV13P_STYLE, "GA_YY\\MM\\DD") == 0 )
            {
               AV12W_OUT_DATE = A22TAS02_GNGO_KBN + GXutil.padl( GXutil.str( AV9W_COMP_NEN_WAREKI, 10, 0), (short)(2), "0") + "年" + GXutil.substring( AV11P_DATE, 5, 2) + "月" + GXutil.substring( AV11P_DATE, 7, 2) + "日" ;
            }
            else if ( GXutil.strcmp(AV13P_STYLE, "GK_YY/MM/DD") == 0 )
            {
               AV12W_OUT_DATE = A23TAS02_GNGO_NM + GXutil.padl( GXutil.str( AV9W_COMP_NEN_WAREKI, 10, 0), (short)(2), "0") + "/" + GXutil.substring( AV11P_DATE, 5, 2) + "/" + GXutil.substring( AV11P_DATE, 7, 2) ;
            }
            else if ( GXutil.strcmp(AV13P_STYLE, "GA_YY/MM/DD") == 0 )
            {
               AV12W_OUT_DATE = A22TAS02_GNGO_KBN + GXutil.padl( GXutil.str( AV9W_COMP_NEN_WAREKI, 10, 0), (short)(2), "0") + "/" + GXutil.substring( AV11P_DATE, 5, 2) + "/" + GXutil.substring( AV11P_DATE, 7, 2) ;
            }
            else if ( GXutil.strcmp(AV13P_STYLE, "GA_YY.MM.DD") == 0 )
            {
               AV12W_OUT_DATE = A22TAS02_GNGO_KBN + GXutil.padl( GXutil.str( AV9W_COMP_NEN_WAREKI, 10, 0), (short)(2), "0") + "." + GXutil.substring( AV11P_DATE, 5, 2) + "." + GXutil.substring( AV11P_DATE, 7, 2) ;
            }
            else if ( GXutil.strcmp(AV13P_STYLE, "YY.MM.DD") == 0 )
            {
               AV12W_OUT_DATE = GXutil.padl( GXutil.str( AV9W_COMP_NEN_WAREKI, 10, 0), (short)(2), "0") + "." + GXutil.substring( AV11P_DATE, 5, 2) + "." + GXutil.substring( AV11P_DATE, 7, 2) ;
            }
            else if ( GXutil.strcmp(AV13P_STYLE, "GK") == 0 )
            {
               AV12W_OUT_DATE = A23TAS02_GNGO_NM ;
            }
            else if ( GXutil.strcmp(AV13P_STYLE, "GA") == 0 )
            {
               AV12W_OUT_DATE = A22TAS02_GNGO_KBN ;
            }
            else if ( GXutil.strcmp(AV13P_STYLE, "GYY") == 0 )
            {
               AV12W_OUT_DATE = GXutil.padl( GXutil.str( AV9W_COMP_NEN_WAREKI, 10, 0), (short)(2), "0") ;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = a802_pc05_date_edit.this.AV12W_OUT_DATE;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12W_OUT_DATE = "" ;
      scmdbuf = "" ;
      P000Q2_A25TAS02_DATE_END = new String[] {""} ;
      P000Q2_n25TAS02_DATE_END = new boolean[] {false} ;
      P000Q2_A24TAS02_DATE_START = new String[] {""} ;
      P000Q2_n24TAS02_DATE_START = new boolean[] {false} ;
      P000Q2_A26TAS02_HNKAN_NEN = new short[1] ;
      P000Q2_n26TAS02_HNKAN_NEN = new boolean[] {false} ;
      P000Q2_A23TAS02_GNGO_NM = new String[] {""} ;
      P000Q2_n23TAS02_GNGO_NM = new boolean[] {false} ;
      P000Q2_A22TAS02_GNGO_KBN = new String[] {""} ;
      A25TAS02_DATE_END = "" ;
      A24TAS02_DATE_START = "" ;
      A23TAS02_GNGO_NM = "" ;
      A22TAS02_GNGO_KBN = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a802_pc05_date_edit__default(),
         new Object[] {
             new Object[] {
            P000Q2_A25TAS02_DATE_END, P000Q2_n25TAS02_DATE_END, P000Q2_A24TAS02_DATE_START, P000Q2_n24TAS02_DATE_START, P000Q2_A26TAS02_HNKAN_NEN, P000Q2_n26TAS02_HNKAN_NEN, P000Q2_A23TAS02_GNGO_NM, P000Q2_n23TAS02_GNGO_NM, P000Q2_A22TAS02_GNGO_KBN
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9W_COMP_NEN_WAREKI ;
   private short A26TAS02_HNKAN_NEN ;
   private short Gx_err ;
   private int AV8W_COMP_NEN ;
   private String scmdbuf ;
   private boolean n25TAS02_DATE_END ;
   private boolean n24TAS02_DATE_START ;
   private boolean n26TAS02_HNKAN_NEN ;
   private boolean n23TAS02_GNGO_NM ;
   private String AV11P_DATE ;
   private String AV13P_STYLE ;
   private String AV12W_OUT_DATE ;
   private String A25TAS02_DATE_END ;
   private String A24TAS02_DATE_START ;
   private String A23TAS02_GNGO_NM ;
   private String A22TAS02_GNGO_KBN ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P000Q2_A25TAS02_DATE_END ;
   private boolean[] P000Q2_n25TAS02_DATE_END ;
   private String[] P000Q2_A24TAS02_DATE_START ;
   private boolean[] P000Q2_n24TAS02_DATE_START ;
   private short[] P000Q2_A26TAS02_HNKAN_NEN ;
   private boolean[] P000Q2_n26TAS02_HNKAN_NEN ;
   private String[] P000Q2_A23TAS02_GNGO_NM ;
   private boolean[] P000Q2_n23TAS02_GNGO_NM ;
   private String[] P000Q2_A22TAS02_GNGO_KBN ;
}

final  class a802_pc05_date_edit__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000Q2", "SELECT `TAS02_DATE_END`, `TAS02_DATE_START`, `TAS02_HNKAN_NEN`, `TAS02_GNGO_NM`, `TAS02_GNGO_KBN` FROM `TAS02_GENG` WHERE (`TAS02_DATE_START` <= ?) AND (`TAS02_DATE_END` >= ?) ORDER BY `TAS02_GNGO_KBN` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5) ;
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 8);
               stmt.setVarchar(2, (String)parms[1], 8);
               break;
      }
   }

}

