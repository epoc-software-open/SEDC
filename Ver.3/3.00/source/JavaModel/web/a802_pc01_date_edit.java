/*
               File: A802_PC01_DATE_EDIT
        Description: ���t�ҏW�����P�i���t���w��`���ցj
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:13.15
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a802_pc01_date_edit extends GXProcedure
{
   public a802_pc01_date_edit( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a802_pc01_date_edit.class ), "" );
   }

   public a802_pc01_date_edit( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( java.util.Date aP0 ,
                             String aP1 )
   {
      a802_pc01_date_edit.this.AV9P_DATE = aP0;
      a802_pc01_date_edit.this.AV11P_STYLE = aP1;
      a802_pc01_date_edit.this.aP2 = aP2;
      a802_pc01_date_edit.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( java.util.Date aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( java.util.Date aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      a802_pc01_date_edit.this.AV9P_DATE = aP0;
      a802_pc01_date_edit.this.AV11P_STYLE = aP1;
      a802_pc01_date_edit.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10W_MMDD_WEEK = "" ;
      if ( ( GXutil.strcmp(GXutil.trim( GXutil.str( GXutil.year( AV9P_DATE), 10, 0)), "1899") == 0 ) && ( GXutil.strcmp(GXutil.trim( GXutil.str( GXutil.month( AV9P_DATE), 10, 0)), "12") == 0 ) && ( GXutil.strcmp(GXutil.trim( GXutil.str( GXutil.day( AV9P_DATE), 10, 0)), "31") == 0 ) )
      {
         AV8W_DATE_TEXT = "NULL" ;
      }
      else
      {
         AV8W_DATE_TEXT = "NOTNULL" ;
      }
      if ( ! GXutil.nullDate().equals(AV9P_DATE) && ( GXutil.strcmp(AV8W_DATE_TEXT, "NOTNULL") == 0 ) )
      {
         if ( GXutil.strcmp(AV11P_STYLE, "YYYY/MM/DD(W)") == 0 )
         {
            AV10W_MMDD_WEEK = GXutil.padl( GXutil.str( GXutil.year( AV9P_DATE), 10, 0), (short)(4), "0") + "/" + GXutil.padl( GXutil.str( GXutil.month( AV9P_DATE), 10, 0), (short)(2), "0") + "/" + GXutil.padl( GXutil.str( GXutil.day( AV9P_DATE), 10, 0), (short)(2), "0") ;
            /* Execute user subroutine: S111 */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV11P_STYLE, "YYYY/MM/DD") == 0 )
         {
            AV10W_MMDD_WEEK = GXutil.padl( GXutil.str( GXutil.year( AV9P_DATE), 10, 0), (short)(4), "0") + "/" + GXutil.padl( GXutil.str( GXutil.month( AV9P_DATE), 10, 0), (short)(2), "0") + "/" + GXutil.padl( GXutil.str( GXutil.day( AV9P_DATE), 10, 0), (short)(2), "0") ;
         }
         else if ( GXutil.strcmp(AV11P_STYLE, "YYYY/MM") == 0 )
         {
            AV10W_MMDD_WEEK = GXutil.padl( GXutil.str( GXutil.year( AV9P_DATE), 10, 0), (short)(4), "0") + "/" + GXutil.padl( GXutil.str( GXutil.month( AV9P_DATE), 10, 0), (short)(2), "0") ;
         }
         else if ( GXutil.strcmp(AV11P_STYLE, "YY/MM/DD(W)") == 0 )
         {
            AV10W_MMDD_WEEK = GXutil.substring( GXutil.padl( GXutil.str( GXutil.year( AV9P_DATE), 10, 0), (short)(4), "0"), 3, 2) + "/" + GXutil.padl( GXutil.str( GXutil.month( AV9P_DATE), 10, 0), (short)(2), "0") + "/" + GXutil.padl( GXutil.str( GXutil.day( AV9P_DATE), 10, 0), (short)(2), "0") ;
            /* Execute user subroutine: S111 */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV11P_STYLE, "YY/MM/DD") == 0 )
         {
            AV10W_MMDD_WEEK = GXutil.substring( GXutil.padl( GXutil.str( GXutil.year( AV9P_DATE), 10, 0), (short)(4), "0"), 3, 2) + "/" + GXutil.padl( GXutil.str( GXutil.month( AV9P_DATE), 10, 0), (short)(2), "0") + "/" + GXutil.padl( GXutil.str( GXutil.day( AV9P_DATE), 10, 0), (short)(2), "0") ;
         }
         else if ( GXutil.strcmp(AV11P_STYLE, "YY/MM") == 0 )
         {
            AV10W_MMDD_WEEK = GXutil.substring( GXutil.padl( GXutil.str( GXutil.year( AV9P_DATE), 10, 0), (short)(4), "0"), 3, 2) + "/" + GXutil.padl( GXutil.str( GXutil.month( AV9P_DATE), 10, 0), (short)(2), "0") ;
         }
         else if ( GXutil.strcmp(AV11P_STYLE, "MM/DD(W)") == 0 )
         {
            AV10W_MMDD_WEEK = GXutil.padl( GXutil.str( GXutil.month( AV9P_DATE), 10, 0), (short)(2), "0") + "/" + GXutil.padl( GXutil.str( GXutil.day( AV9P_DATE), 10, 0), (short)(2), "0") ;
            /* Execute user subroutine: S111 */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV11P_STYLE, "MM/DD") == 0 )
         {
            AV10W_MMDD_WEEK = GXutil.padl( GXutil.str( GXutil.month( AV9P_DATE), 10, 0), (short)(2), "0") + "/" + GXutil.padl( GXutil.str( GXutil.day( AV9P_DATE), 10, 0), (short)(2), "0") ;
         }
         else if ( GXutil.strcmp(AV11P_STYLE, "YYYYEMMEDD(W)") == 0 )
         {
            AV10W_MMDD_WEEK = GXutil.padl( GXutil.str( GXutil.year( AV9P_DATE), 10, 0), (short)(4), "0") + "�N" + GXutil.padl( GXutil.str( GXutil.month( AV9P_DATE), 10, 0), (short)(2), "0") + "��" + GXutil.padl( GXutil.str( GXutil.day( AV9P_DATE), 10, 0), (short)(2), "0") + "��" ;
            /* Execute user subroutine: S111 */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV11P_STYLE, "YYYYEMMEDD") == 0 )
         {
            AV10W_MMDD_WEEK = GXutil.padl( GXutil.str( GXutil.year( AV9P_DATE), 10, 0), (short)(4), "0") + "�N" + GXutil.padl( GXutil.str( GXutil.month( AV9P_DATE), 10, 0), (short)(2), "0") + "��" + GXutil.padl( GXutil.str( GXutil.day( AV9P_DATE), 10, 0), (short)(2), "0") + "��" ;
         }
         else if ( GXutil.strcmp(AV11P_STYLE, "YYEMMEDD(W)") == 0 )
         {
            AV10W_MMDD_WEEK = GXutil.substring( GXutil.padl( GXutil.str( GXutil.year( AV9P_DATE), 10, 0), (short)(4), "0"), 3, 2) + "�N" + GXutil.padl( GXutil.str( GXutil.month( AV9P_DATE), 10, 0), (short)(2), "0") + "��" + GXutil.padl( GXutil.str( GXutil.day( AV9P_DATE), 10, 0), (short)(2), "0") + "��" ;
            /* Execute user subroutine: S111 */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV11P_STYLE, "YYEMMEDD") == 0 )
         {
            AV10W_MMDD_WEEK = GXutil.substring( GXutil.padl( GXutil.str( GXutil.year( AV9P_DATE), 10, 0), (short)(4), "0"), 3, 2) + "�N" + GXutil.padl( GXutil.str( GXutil.month( AV9P_DATE), 10, 0), (short)(2), "0") + "��" + GXutil.padl( GXutil.str( GXutil.day( AV9P_DATE), 10, 0), (short)(2), "0") + "��" ;
         }
         else if ( GXutil.strcmp(AV11P_STYLE, "YYEMM") == 0 )
         {
            AV10W_MMDD_WEEK = GXutil.substring( GXutil.padl( GXutil.str( GXutil.year( AV9P_DATE), 10, 0), (short)(4), "0"), 3, 2) + "�N" + GXutil.padl( GXutil.str( GXutil.month( AV9P_DATE), 10, 0), (short)(2), "0") + "��" ;
         }
         else if ( GXutil.strcmp(AV11P_STYLE, "MMEDD") == 0 )
         {
            AV10W_MMDD_WEEK = GXutil.padl( GXutil.str( GXutil.month( AV9P_DATE), 10, 0), (short)(2), "0") + "��" + GXutil.padl( GXutil.str( GXutil.day( AV9P_DATE), 10, 0), (short)(2), "0") + "��" ;
         }
         else if ( GXutil.strcmp(AV11P_STYLE, "YYYYMMDD") == 0 )
         {
            AV10W_MMDD_WEEK = GXutil.padl( GXutil.str( GXutil.year( AV9P_DATE), 10, 0), (short)(4), "0") + GXutil.padl( GXutil.str( GXutil.month( AV9P_DATE), 10, 0), (short)(2), "0") + GXutil.padl( GXutil.str( GXutil.day( AV9P_DATE), 10, 0), (short)(2), "0") ;
         }
         else if ( GXutil.strcmp(AV11P_STYLE, "YYYYMM") == 0 )
         {
            AV10W_MMDD_WEEK = GXutil.padl( GXutil.str( GXutil.year( AV9P_DATE), 10, 0), (short)(4), "0") + GXutil.padl( GXutil.str( GXutil.month( AV9P_DATE), 10, 0), (short)(2), "0") ;
         }
         else if ( GXutil.strcmp(AV11P_STYLE, "(W)") == 0 )
         {
            /* Execute user subroutine: S111 */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV11P_STYLE, "W") == 0 )
         {
            /* Execute user subroutine: S121 */
            S121 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV11P_STYLE, "DOW") == 0 )
         {
            AV10W_MMDD_WEEK = GXutil.trim( GXutil.str( GXutil.dow( AV9P_DATE), 10, 0)) ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_WEEK_GET' Routine */
      if ( GXutil.dow( AV9P_DATE) == 1 )
      {
         AV10W_MMDD_WEEK = AV10W_MMDD_WEEK + "�i���j" ;
      }
      else if ( GXutil.dow( AV9P_DATE) == 2 )
      {
         AV10W_MMDD_WEEK = AV10W_MMDD_WEEK + "�i���j" ;
      }
      else if ( GXutil.dow( AV9P_DATE) == 3 )
      {
         AV10W_MMDD_WEEK = AV10W_MMDD_WEEK + "�i�΁j" ;
      }
      else if ( GXutil.dow( AV9P_DATE) == 4 )
      {
         AV10W_MMDD_WEEK = AV10W_MMDD_WEEK + "�i���j" ;
      }
      else if ( GXutil.dow( AV9P_DATE) == 5 )
      {
         AV10W_MMDD_WEEK = AV10W_MMDD_WEEK + "�i�؁j" ;
      }
      else if ( GXutil.dow( AV9P_DATE) == 6 )
      {
         AV10W_MMDD_WEEK = AV10W_MMDD_WEEK + "�i���j" ;
      }
      else if ( GXutil.dow( AV9P_DATE) == 7 )
      {
         AV10W_MMDD_WEEK = AV10W_MMDD_WEEK + "�i�y�j" ;
      }
   }

   public void S121( )
   {
      /* 'SUB_WEEK_GET_2' Routine */
      if ( GXutil.dow( AV9P_DATE) == 1 )
      {
         AV10W_MMDD_WEEK = AV10W_MMDD_WEEK + "��" ;
      }
      else if ( GXutil.dow( AV9P_DATE) == 2 )
      {
         AV10W_MMDD_WEEK = AV10W_MMDD_WEEK + "��" ;
      }
      else if ( GXutil.dow( AV9P_DATE) == 3 )
      {
         AV10W_MMDD_WEEK = AV10W_MMDD_WEEK + "��" ;
      }
      else if ( GXutil.dow( AV9P_DATE) == 4 )
      {
         AV10W_MMDD_WEEK = AV10W_MMDD_WEEK + "��" ;
      }
      else if ( GXutil.dow( AV9P_DATE) == 5 )
      {
         AV10W_MMDD_WEEK = AV10W_MMDD_WEEK + "��" ;
      }
      else if ( GXutil.dow( AV9P_DATE) == 6 )
      {
         AV10W_MMDD_WEEK = AV10W_MMDD_WEEK + "��" ;
      }
      else if ( GXutil.dow( AV9P_DATE) == 7 )
      {
         AV10W_MMDD_WEEK = AV10W_MMDD_WEEK + "�y" ;
      }
   }

   protected void cleanup( )
   {
      this.aP2[0] = a802_pc01_date_edit.this.AV10W_MMDD_WEEK;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10W_MMDD_WEEK = "" ;
      AV8W_DATE_TEXT = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.util.Date AV9P_DATE ;
   private boolean returnInSub ;
   private String AV11P_STYLE ;
   private String AV10W_MMDD_WEEK ;
   private String AV8W_DATE_TEXT ;
   private String[] aP2 ;
}

