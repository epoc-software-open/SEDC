/*
               File: GxSilentTrnGridCollection
        Description: No description for object
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:21:0.88
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import java.util.*;

public final  class GxSilentTrnGridCollection extends GxObjectCollection
{
   public GxSilentTrnGridCollection( Class elementsType ,
                                     String elementsName ,
                                     String containedXmlNamespace )
   {
      super(elementsType, elementsName, containedXmlNamespace);
   }

   public GxSilentTrnGridCollection( Class elementsType ,
                                     String elementsName ,
                                     String containedXmlNamespace ,
                                     int remoteHandle )
   {
      super(elementsType, elementsName, containedXmlNamespace, remoteHandle);
   }

   public GxSilentTrnGridCollection( Class elementsType ,
                                     String elementsName ,
                                     String containedXmlNamespace ,
                                     Vector data )
   {
      super(elementsType, elementsName, containedXmlNamespace, data);
   }

   public GxSilentTrnGridCollection( Class elementsType ,
                                     String elementsName ,
                                     String containedXmlNamespace ,
                                     Vector data ,
                                     int remoteHandle )
   {
      super(elementsType, elementsName, containedXmlNamespace, data, remoteHandle);
   }

   public GxSilentTrnGridCollection( )
   {
   }

   public void add( Object item )
   {
      super.addElementTrn( item) ;
   }

   public byte remove( double idx )
   {
      return (byte)(super.removeElementTrn(idx)) ;
   }

   public void clear( )
   {
      int idx ;
      idx = this.getItemCount() ;
      while ( idx >= 0 )
      {
         this.remove( idx) ;
         idx = (int)(idx-1) ;
      }
   }

}

