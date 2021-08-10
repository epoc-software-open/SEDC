/*
               File: GxObjectCollection
        Description: No description for object
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:48.59
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import java.util.*;

public  class GxObjectCollection extends GXObjectCollectionBase
{
   public GxObjectCollection( Class elementsType ,
                              String elementsName ,
                              String containedXmlNamespace )
   {
      super(elementsType, elementsName, containedXmlNamespace);
   }

   public GxObjectCollection( Class elementsType ,
                              String elementsName ,
                              String containedXmlNamespace ,
                              int remoteHandle )
   {
      super(elementsType, elementsName, containedXmlNamespace, remoteHandle);
   }

   public GxObjectCollection( Class elementsType ,
                              String elementsName ,
                              String containedXmlNamespace ,
                              Vector data )
   {
      super(elementsType, elementsName, containedXmlNamespace, data);
   }

   public GxObjectCollection( Class elementsType ,
                              String elementsName ,
                              String containedXmlNamespace ,
                              Vector data ,
                              int remoteHandle )
   {
      super(elementsType, elementsName, containedXmlNamespace, data, remoteHandle);
   }

   public GxObjectCollection( )
   {
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short currError ;
      String arrayType ;
      short gxi ;
      currError = (short)(1) ;
      arrayType = "" ;
      gxi = (short)(0) ;
      while ( gxi <= oReader.getAttributeCount() )
      {
         if ( GXutil.strcmp(oReader.getAttributeLocalName(gxi), "arrayType") == 0 )
         {
            arrayType = oReader.getAttributeByIndex(gxi) ;
         }
         gxi = (short)(gxi+1) ;
      }
      if ( GXutil.strcmp(arrayType, "") != 0 )
      {
         currError = readEncodedArray(arrayType,oReader) ;
      }
      else
      {
         currError = readxmlcollection(oReader,sName,"") ;
      }
      return currError ;
   }

   public short readEncodedArray( String arrayType ,
                                  com.genexus.xml.XMLReader oReader )
   {
      short currError ;
      int arrayLength ;
      int arraySizeStartPos ;
      int arraySizeLength ;
      short gxi ;
      arraySizeStartPos = (int)(GXutil.strSearch( arrayType, "[", 1)+1) ;
      arraySizeLength = (int)(GXutil.len( arrayType)-arraySizeStartPos) ;
      if ( ( arraySizeStartPos == 1 ) || ( arraySizeLength == 0 ) )
      {
         throw new RuntimeException("GxObjectCollectionBase error: Could not read encoded array size" + "(" + 0+ ")");
      }
      arrayLength = (int)(GXutil.lval( GXutil.substring( arrayType, arraySizeStartPos, arraySizeLength))) ;
      currError = oReader.read() ;
      gxi = (short)(0) ;
      while ( ( gxi < arrayLength ) && ( currError > 0 ) )
      {
         currError = AddObjectInstance(oReader) ;
         oReader.read();
         gxi = (short)(gxi+1) ;
      }
      return currError ;
   }

   public short readxmlcollection( com.genexus.xml.XMLReader oReader ,
                                   String sName ,
                                   String itemName )
   {
      short currError ;
      String sTagName ;
      String itemName1 ;
      currError = (short)(1) ;
      itemName1 = GetContainedName() ;
      if ( ! (GXutil.strcmp("", itemName)==0) )
      {
         itemName1 = itemName ;
      }
      if ( ( GXutil.strcmp(oReader.getLocalName(), itemName1) != 0 ) || ( GXutil.strcmp(sName, itemName1) == 0 ) )
      {
         currError = oReader.read() ;
      }
      sTagName = oReader.getName() ;
      if ( ! (GXutil.strcmp("", sName)==0) )
      {
         this.clearCollection();
      }
      while ( ( GXutil.strcmp(oReader.getName(), sTagName) == 0 ) && ( oReader.getNodeType() == 1 ) && ( currError > 0 ) )
      {
         if ( IsSimpleCollection() || ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
         {
            currError = AddObjectInstance(oReader) ;
         }
         oReader.read();
      }
      return currError ;
   }

   public GxObjectCollection Clone( )
   {
      return (GxObjectCollection)(clone()) ;
   }

}

