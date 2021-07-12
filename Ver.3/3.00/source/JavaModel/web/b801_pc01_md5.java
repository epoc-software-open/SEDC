/*
               File: B801_PC01_MD5
        Description: MD5ïœä∑èàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:40.57
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b801_pc01_md5 extends GXProcedure
{
   public b801_pc01_md5( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b801_pc01_md5.class ), "" );
   }

   public b801_pc01_md5( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 )
   {
      b801_pc01_md5.this.AV9P_SOURCE = aP0;
      b801_pc01_md5.this.aP1 = aP1;
      b801_pc01_md5.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      b801_pc01_md5.this.AV9P_SOURCE = aP0;
      b801_pc01_md5.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8W_MD5_VAL = "" ;
      /* User Code */
      	try{
      /* User Code */
      		java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
      /* User Code */
      		md.update(AV9P_SOURCE.getBytes());
      /* User Code */
      		byte[] digest = md.digest();
      /* User Code */
      		StringBuilder sb = new StringBuilder();
      /* User Code */
      		for (int i = 0; i < digest.length; i++) {
      /* User Code */
      			sb.append(String.format("%02x", digest[i]));
      /* User Code */
      		}
      /* User Code */
      		AV8W_MD5_VAL = sb.toString();
      /* User Code */
      	}
      /* User Code */
      	catch(java.security.NoSuchAlgorithmException e){
      /* User Code */
      		e.printStackTrace();
      /* User Code */
      	}
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = b801_pc01_md5.this.AV8W_MD5_VAL;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8W_MD5_VAL = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV9P_SOURCE ;
   private String AV8W_MD5_VAL ;
   private String[] aP1 ;
}

