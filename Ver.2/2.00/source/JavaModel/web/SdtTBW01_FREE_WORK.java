/*
               File: SdtTBW01_FREE_WORK
        Description: 汎用ワークテーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:9.14
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTBW01_FREE_WORK extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBW01_FREE_WORK( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBW01_FREE_WORK.class));
   }

   public SdtTBW01_FREE_WORK( int remoteHandle ,
                              ModelContext context )
   {
      super( context, "SdtTBW01_FREE_WORK");
      initialize( remoteHandle) ;
   }

   public SdtTBW01_FREE_WORK( int remoteHandle ,
                              StructSdtTBW01_FREE_WORK struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public void Load( String AV51TBW01_SESSION_ID ,
                     String AV52TBW01_APP_ID ,
                     String AV53TBW01_DISP_DATETIME ,
                     long AV54TBW01_LINE_NO )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV51TBW01_SESSION_ID,AV52TBW01_APP_ID,AV53TBW01_DISP_DATETIME,new Long(AV54TBW01_LINE_NO)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TBW01_SESSION_ID", String.class}, new Object[]{"TBW01_APP_ID", String.class}, new Object[]{"TBW01_DISP_DATETIME", String.class}, new Object[]{"TBW01_LINE_NO", long.class}}) ;
   }

   public GxObjectCollection GetMessages( )
   {
      short item = 1 ;
      GxObjectCollection msgs = new GxObjectCollection(SdtMessages_Message.class, "Messages.Message", "Genexus", remoteHandle) ;
      SdtMessages_Message m1 ;
      IGxSilentTrn trn = getTransaction() ;
      com.genexus.internet.MsgList msgList = trn.GetMessages() ;
      while ( item <= msgList.getItemCount() )
      {
         m1 = new SdtMessages_Message(remoteHandle, context) ;
         m1.setgxTv_SdtMessages_Message_Id( msgList.getItemValue(item) );
         m1.setgxTv_SdtMessages_Message_Description( msgList.getItemText(item) );
         m1.setgxTv_SdtMessages_Message_Type( (byte)(msgList.getItemType(item)) );
         msgs.add(m1, 0);
         item = (short)(item+1) ;
      }
      return msgs ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties() ;
      metadata.set("Name", "TBW01_FREE_WORK");
      metadata.set("BT", "TBW01_FREE_WORK");
      metadata.set("PK", "[ \"TBW01_SESSION_ID\",\"TBW01_APP_ID\",\"TBW01_DISP_DATETIME\",\"TBW01_LINE_NO\" ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1 ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW01_SESSION_ID") )
            {
               gxTv_SdtTBW01_FREE_WORK_Tbw01_session_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW01_APP_ID") )
            {
               gxTv_SdtTBW01_FREE_WORK_Tbw01_app_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW01_DISP_DATETIME") )
            {
               gxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW01_LINE_NO") )
            {
               gxTv_SdtTBW01_FREE_WORK_Tbw01_line_no = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW01_FREE_SAVE_1") )
            {
               gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1 = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW01_FREE_SAVE_2") )
            {
               gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2 = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBW01_FREE_WORK_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBW01_FREE_WORK_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW01_SESSION_ID_Z") )
            {
               gxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW01_APP_ID_Z") )
            {
               gxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW01_DISP_DATETIME_Z") )
            {
               gxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW01_LINE_NO_Z") )
            {
               gxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW01_FREE_SAVE_1_N") )
            {
               gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW01_FREE_SAVE_2_N") )
            {
               gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( readOk == 0 )
            {
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "TBW01_FREE_WORK" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "tablet-EDC_GXXEV3U3" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("TBW01_SESSION_ID", GXutil.rtrim( gxTv_SdtTBW01_FREE_WORK_Tbw01_session_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW01_APP_ID", GXutil.rtrim( gxTv_SdtTBW01_FREE_WORK_Tbw01_app_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW01_DISP_DATETIME", GXutil.rtrim( gxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW01_LINE_NO", GXutil.trim( GXutil.str( gxTv_SdtTBW01_FREE_WORK_Tbw01_line_no, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW01_FREE_SAVE_1", GXutil.rtrim( gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW01_FREE_SAVE_2", GXutil.rtrim( gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBW01_FREE_WORK_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBW01_FREE_WORK_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW01_SESSION_ID_Z", GXutil.rtrim( gxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW01_APP_ID_Z", GXutil.rtrim( gxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW01_DISP_DATETIME_Z", GXutil.rtrim( gxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW01_LINE_NO_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW01_FREE_SAVE_1_N", GXutil.trim( GXutil.str( gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW01_FREE_SAVE_2_N", GXutil.trim( GXutil.str( gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("TBW01_SESSION_ID", gxTv_SdtTBW01_FREE_WORK_Tbw01_session_id, false);
      AddObjectProperty("TBW01_APP_ID", gxTv_SdtTBW01_FREE_WORK_Tbw01_app_id, false);
      AddObjectProperty("TBW01_DISP_DATETIME", gxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime, false);
      AddObjectProperty("TBW01_LINE_NO", gxTv_SdtTBW01_FREE_WORK_Tbw01_line_no, false);
      AddObjectProperty("TBW01_FREE_SAVE_1", gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1, false);
      AddObjectProperty("TBW01_FREE_SAVE_2", gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTBW01_FREE_WORK_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTBW01_FREE_WORK_Initialized, false);
         AddObjectProperty("TBW01_SESSION_ID_Z", gxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z, false);
         AddObjectProperty("TBW01_APP_ID_Z", gxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z, false);
         AddObjectProperty("TBW01_DISP_DATETIME_Z", gxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z, false);
         AddObjectProperty("TBW01_LINE_NO_Z", gxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z, false);
         AddObjectProperty("TBW01_FREE_SAVE_1_N", gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_N, false);
         AddObjectProperty("TBW01_FREE_SAVE_2_N", gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_N, false);
      }
   }

   public String getgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id( )
   {
      return gxTv_SdtTBW01_FREE_WORK_Tbw01_session_id ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW01_FREE_WORK_Tbw01_session_id, value) != 0 )
      {
         gxTv_SdtTBW01_FREE_WORK_Mode = "INS" ;
         this.setgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z_SetNull( );
      }
      gxTv_SdtTBW01_FREE_WORK_Tbw01_session_id = value ;
   }

   public String getgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id( )
   {
      return gxTv_SdtTBW01_FREE_WORK_Tbw01_app_id ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW01_FREE_WORK_Tbw01_app_id, value) != 0 )
      {
         gxTv_SdtTBW01_FREE_WORK_Mode = "INS" ;
         this.setgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z_SetNull( );
      }
      gxTv_SdtTBW01_FREE_WORK_Tbw01_app_id = value ;
   }

   public String getgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime( )
   {
      return gxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime, value) != 0 )
      {
         gxTv_SdtTBW01_FREE_WORK_Mode = "INS" ;
         this.setgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z_SetNull( );
      }
      gxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime = value ;
   }

   public long getgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no( )
   {
      return gxTv_SdtTBW01_FREE_WORK_Tbw01_line_no ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no( long value )
   {
      if ( gxTv_SdtTBW01_FREE_WORK_Tbw01_line_no != value )
      {
         gxTv_SdtTBW01_FREE_WORK_Mode = "INS" ;
         this.setgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z_SetNull( );
      }
      gxTv_SdtTBW01_FREE_WORK_Tbw01_line_no = value ;
   }

   public String getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1( )
   {
      return gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1 ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1( String value )
   {
      gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_N = (byte)(0) ;
      gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1 = value ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_SetNull( )
   {
      gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_N = (byte)(1) ;
      gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1 = "" ;
   }

   public boolean getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2( )
   {
      return gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2 ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2( String value )
   {
      gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_N = (byte)(0) ;
      gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2 = value ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_SetNull( )
   {
      gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_N = (byte)(1) ;
      gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2 = "" ;
   }

   public boolean getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW01_FREE_WORK_Mode( )
   {
      return gxTv_SdtTBW01_FREE_WORK_Mode ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Mode( String value )
   {
      gxTv_SdtTBW01_FREE_WORK_Mode = value ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Mode_SetNull( )
   {
      gxTv_SdtTBW01_FREE_WORK_Mode = "" ;
   }

   public boolean getgxTv_SdtTBW01_FREE_WORK_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW01_FREE_WORK_Initialized( )
   {
      return gxTv_SdtTBW01_FREE_WORK_Initialized ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Initialized( short value )
   {
      gxTv_SdtTBW01_FREE_WORK_Initialized = value ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Initialized_SetNull( )
   {
      gxTv_SdtTBW01_FREE_WORK_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW01_FREE_WORK_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z( )
   {
      return gxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z( String value )
   {
      gxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z = value ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z_SetNull( )
   {
      gxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z( )
   {
      return gxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z( String value )
   {
      gxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z = value ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z_SetNull( )
   {
      gxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z( )
   {
      return gxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z( String value )
   {
      gxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z = value ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z_SetNull( )
   {
      gxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z = "" ;
   }

   public boolean getgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z( )
   {
      return gxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z( long value )
   {
      gxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z = value ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z_SetNull( )
   {
      gxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z = 0 ;
   }

   public boolean getgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_N( )
   {
      return gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_N ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_N( byte value )
   {
      gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_N = value ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_N_SetNull( )
   {
      gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_N( )
   {
      return gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_N ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_N( byte value )
   {
      gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_N = value ;
   }

   public void setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_N_SetNull( )
   {
      gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbw01_free_work_bc obj ;
      obj = new tbw01_free_work_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBW01_FREE_WORK_Tbw01_session_id = "" ;
      gxTv_SdtTBW01_FREE_WORK_Tbw01_app_id = "" ;
      gxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime = "" ;
      gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1 = "" ;
      gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2 = "" ;
      gxTv_SdtTBW01_FREE_WORK_Mode = "" ;
      gxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z = "" ;
      gxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z = "" ;
      gxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z = "" ;
      sTagName = "" ;
   }

   public SdtTBW01_FREE_WORK Clone( )
   {
      SdtTBW01_FREE_WORK sdt ;
      tbw01_free_work_bc obj ;
      sdt = (SdtTBW01_FREE_WORK)(clone()) ;
      obj = (tbw01_free_work_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBW01_FREE_WORK struct )
   {
      setgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id(struct.getTbw01_session_id());
      setgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id(struct.getTbw01_app_id());
      setgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime(struct.getTbw01_disp_datetime());
      setgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no(struct.getTbw01_line_no());
      setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1(struct.getTbw01_free_save_1());
      setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2(struct.getTbw01_free_save_2());
      setgxTv_SdtTBW01_FREE_WORK_Mode(struct.getMode());
      setgxTv_SdtTBW01_FREE_WORK_Initialized(struct.getInitialized());
      setgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z(struct.getTbw01_session_id_Z());
      setgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z(struct.getTbw01_app_id_Z());
      setgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z(struct.getTbw01_disp_datetime_Z());
      setgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z(struct.getTbw01_line_no_Z());
      setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_N(struct.getTbw01_free_save_1_N());
      setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_N(struct.getTbw01_free_save_2_N());
   }

   public StructSdtTBW01_FREE_WORK getStruct( )
   {
      StructSdtTBW01_FREE_WORK struct = new StructSdtTBW01_FREE_WORK ();
      struct.setTbw01_session_id(getgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id());
      struct.setTbw01_app_id(getgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id());
      struct.setTbw01_disp_datetime(getgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime());
      struct.setTbw01_line_no(getgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no());
      struct.setTbw01_free_save_1(getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1());
      struct.setTbw01_free_save_2(getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2());
      struct.setMode(getgxTv_SdtTBW01_FREE_WORK_Mode());
      struct.setInitialized(getgxTv_SdtTBW01_FREE_WORK_Initialized());
      struct.setTbw01_session_id_Z(getgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z());
      struct.setTbw01_app_id_Z(getgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z());
      struct.setTbw01_disp_datetime_Z(getgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z());
      struct.setTbw01_line_no_Z(getgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z());
      struct.setTbw01_free_save_1_N(getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_N());
      struct.setTbw01_free_save_2_N(getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_N());
      return struct ;
   }

   private byte gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_N ;
   private byte gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_N ;
   private short gxTv_SdtTBW01_FREE_WORK_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtTBW01_FREE_WORK_Tbw01_line_no ;
   private long gxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z ;
   private String gxTv_SdtTBW01_FREE_WORK_Mode ;
   private String sTagName ;
   private String gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1 ;
   private String gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2 ;
   private String gxTv_SdtTBW01_FREE_WORK_Tbw01_session_id ;
   private String gxTv_SdtTBW01_FREE_WORK_Tbw01_app_id ;
   private String gxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime ;
   private String gxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z ;
   private String gxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z ;
   private String gxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z ;
}

