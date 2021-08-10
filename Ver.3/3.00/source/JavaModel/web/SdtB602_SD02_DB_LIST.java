/*
               File: SdtB602_SD02_DB_LIST
        Description: B602_SD02_DB_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:43.1
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB602_SD02_DB_LIST extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB602_SD02_DB_LIST( )
   {
      this(  new ModelContext(SdtB602_SD02_DB_LIST.class));
   }

   public SdtB602_SD02_DB_LIST( ModelContext context )
   {
      super( context, "SdtB602_SD02_DB_LIST");
   }

   public SdtB602_SD02_DB_LIST( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtB602_SD02_DB_LIST");
   }

   public SdtB602_SD02_DB_LIST( StructSdtB602_SD02_DB_LIST struct )
   {
      this();
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "RESULT") )
            {
               if ( gxTv_SdtB602_SD02_DB_LIST_Result == null )
               {
                  gxTv_SdtB602_SD02_DB_LIST_Result = new SdtB602_SD02_DB_LIST_RESULT(remoteHandle, context);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtB602_SD02_DB_LIST_Result.readxml(oReader, "RESULT") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DB") )
            {
               if ( gxTv_SdtB602_SD02_DB_LIST_Db == null )
               {
                  gxTv_SdtB602_SD02_DB_LIST_Db = new GxObjectCollection(SdtB602_SD02_DB_LIST_DBItem.class, "B602_SD02_DB_LIST.DBItem", "tablet-EDC_GXXEV3U3", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtB602_SD02_DB_LIST_Db.readxmlcollection(oReader, "DB", "DBItem") ;
               }
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
         sName = "B602_SD02_DB_LIST" ;
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
      if ( gxTv_SdtB602_SD02_DB_LIST_Result != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "tablet-EDC_GXXEV3U3" ;
         }
         else
         {
            sNameSpace1 = "tablet-EDC_GXXEV3U3" ;
         }
         gxTv_SdtB602_SD02_DB_LIST_Result.writexml(oWriter, "RESULT", sNameSpace1);
      }
      if ( gxTv_SdtB602_SD02_DB_LIST_Db != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "tablet-EDC_GXXEV3U3" ;
         }
         else
         {
            sNameSpace1 = "tablet-EDC_GXXEV3U3" ;
         }
         gxTv_SdtB602_SD02_DB_LIST_Db.writexmlcollection(oWriter, "DB", sNameSpace1, "DBItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      if ( gxTv_SdtB602_SD02_DB_LIST_Result != null )
      {
         AddObjectProperty("RESULT", gxTv_SdtB602_SD02_DB_LIST_Result, false);
      }
      if ( gxTv_SdtB602_SD02_DB_LIST_Db != null )
      {
         AddObjectProperty("DB", gxTv_SdtB602_SD02_DB_LIST_Db, false);
      }
   }

   public SdtB602_SD02_DB_LIST_RESULT getgxTv_SdtB602_SD02_DB_LIST_Result( )
   {
      if ( gxTv_SdtB602_SD02_DB_LIST_Result == null )
      {
         gxTv_SdtB602_SD02_DB_LIST_Result = new SdtB602_SD02_DB_LIST_RESULT(remoteHandle, context);
      }
      return gxTv_SdtB602_SD02_DB_LIST_Result ;
   }

   public void setgxTv_SdtB602_SD02_DB_LIST_Result( SdtB602_SD02_DB_LIST_RESULT value )
   {
      gxTv_SdtB602_SD02_DB_LIST_Result = value;
   }

   public void setgxTv_SdtB602_SD02_DB_LIST_Result_SetNull( )
   {
      gxTv_SdtB602_SD02_DB_LIST_Result = (SdtB602_SD02_DB_LIST_RESULT)null;
   }

   public boolean getgxTv_SdtB602_SD02_DB_LIST_Result_IsNull( )
   {
      if ( gxTv_SdtB602_SD02_DB_LIST_Result == null )
      {
         return true ;
      }
      return false ;
   }

   public GxObjectCollection getgxTv_SdtB602_SD02_DB_LIST_Db( )
   {
      if ( gxTv_SdtB602_SD02_DB_LIST_Db == null )
      {
         gxTv_SdtB602_SD02_DB_LIST_Db = new GxObjectCollection(SdtB602_SD02_DB_LIST_DBItem.class, "B602_SD02_DB_LIST.DBItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      }
      return gxTv_SdtB602_SD02_DB_LIST_Db ;
   }

   public void setgxTv_SdtB602_SD02_DB_LIST_Db( GxObjectCollection value )
   {
      gxTv_SdtB602_SD02_DB_LIST_Db = value ;
   }

   public void setgxTv_SdtB602_SD02_DB_LIST_Db_SetNull( )
   {
      gxTv_SdtB602_SD02_DB_LIST_Db = null ;
   }

   public boolean getgxTv_SdtB602_SD02_DB_LIST_Db_IsNull( )
   {
      if ( gxTv_SdtB602_SD02_DB_LIST_Db == null )
      {
         return true ;
      }
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sTagName = "" ;
   }

   public SdtB602_SD02_DB_LIST Clone( )
   {
      return (SdtB602_SD02_DB_LIST)(clone()) ;
   }

   public void setStruct( StructSdtB602_SD02_DB_LIST struct )
   {
      setgxTv_SdtB602_SD02_DB_LIST_Result(new SdtB602_SD02_DB_LIST_RESULT(struct.getResult()));
      GxObjectCollection gxTv_SdtB602_SD02_DB_LIST_Db_aux = new GxObjectCollection();
      GxObjectCollection gxTv_SdtB602_SD02_DB_LIST_Db_aux1 = new GxObjectCollection();
      gxTv_SdtB602_SD02_DB_LIST_Db_aux1.setStruct(struct.getDb());
      for (int i = 0; i < gxTv_SdtB602_SD02_DB_LIST_Db_aux1.size(); i++)
      {
         gxTv_SdtB602_SD02_DB_LIST_Db_aux.add(new SdtB602_SD02_DB_LIST_DBItem((StructSdtB602_SD02_DB_LIST_DBItem)gxTv_SdtB602_SD02_DB_LIST_Db_aux1.elementAt(i)));
      }
      setgxTv_SdtB602_SD02_DB_LIST_Db(gxTv_SdtB602_SD02_DB_LIST_Db_aux);
   }

   public StructSdtB602_SD02_DB_LIST getStruct( )
   {
      StructSdtB602_SD02_DB_LIST struct = new StructSdtB602_SD02_DB_LIST ();
      struct.setResult(getgxTv_SdtB602_SD02_DB_LIST_Result().getStruct());
      Vector aux_vectorgxTv_SdtB602_SD02_DB_LIST_Db = getgxTv_SdtB602_SD02_DB_LIST_Db().getStruct();
      Vector aux_vector1gxTv_SdtB602_SD02_DB_LIST_Db = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtB602_SD02_DB_LIST_Db.size(); i++)
      {
         aux_vector1gxTv_SdtB602_SD02_DB_LIST_Db.addElement(((SdtB602_SD02_DB_LIST_DBItem)aux_vectorgxTv_SdtB602_SD02_DB_LIST_Db.elementAt(i)).getStruct());
      }
      struct.setDb(aux_vector1gxTv_SdtB602_SD02_DB_LIST_Db);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected GxObjectCollection gxTv_SdtB602_SD02_DB_LIST_Db=null ;
   protected SdtB602_SD02_DB_LIST_RESULT gxTv_SdtB602_SD02_DB_LIST_Result=null ;
}

