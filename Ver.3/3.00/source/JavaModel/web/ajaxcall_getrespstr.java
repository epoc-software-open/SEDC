/*
               File: AjaxCall_GetRespStr
        Description: Ajax Call_Get Resp Str
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:20.25
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class ajaxcall_getrespstr extends GXProcedure
{
   public ajaxcall_getrespstr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ajaxcall_getrespstr.class ), "" );
   }

   public ajaxcall_getrespstr( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( short aP0 ,
                             String aP1 )
   {
      ajaxcall_getrespstr.this.AV8Type = aP0;
      ajaxcall_getrespstr.this.AV10ValuesTxt = aP1;
      ajaxcall_getrespstr.this.aP2 = aP2;
      ajaxcall_getrespstr.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( short aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( short aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      ajaxcall_getrespstr.this.AV8Type = aP0;
      ajaxcall_getrespstr.this.AV10ValuesTxt = aP1;
      ajaxcall_getrespstr.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV8Type == 1 )
      {
         AV11ResponseString = "[\"" + GXutil.trim( AV10ValuesTxt) + "\",\"[]\"]" ;
      }
      else
      {
         AV9Values.fromxml(AV10ValuesTxt, "");
         AV11ResponseString = "[\"OK\",\"" ;
         AV12i = (short)(1) ;
         while ( AV12i <= AV9Values.size() )
         {
            AV11ResponseString = AV11ResponseString + (String)AV9Values.elementAt(-1+AV12i) + "\",\"" ;
            AV12i = (short)(AV12i+1) ;
         }
         AV11ResponseString = AV11ResponseString + "[]\"]" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = ajaxcall_getrespstr.this.AV11ResponseString;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11ResponseString = "" ;
      AV9Values = new GxObjectCollection(String.class, "internal", "");
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8Type ;
   private short AV12i ;
   private short Gx_err ;
   private String AV10ValuesTxt ;
   private String AV11ResponseString ;
   private String[] aP2 ;
   private GxObjectCollection AV9Values ;
}

