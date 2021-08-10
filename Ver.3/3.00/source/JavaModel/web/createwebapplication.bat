@echo off

md %1\webapps\%2
md %1\webapps\%2\static
md %1\webapps\%2\gxmetadata
md %1\webapps\%2\gxmetadata\images
md %1\webapps\%2\Metadata
md %1\webapps\%2\Metadata\TableAccess
md %1\webapps\%2\WEB-INF
md %1\webapps\%2\META-INF
md %1\webapps\%2\WEB-INF\classes
md %1\webapps\%2\WEB-INF\lib
md %1\webapps\%2\static\Metadata
md %1\webapps\%2\static\Metadata\Interfaces
md %1\webapps\%2\static\devmenu
md %1\webapps\%2\static\bootstrap
md %1\webapps\%2\%7

if %3 == "5.5" goto copyFiles
md %1\conf\catalina\localhost

if NOT %3 == "8.0" goto copyScanner7
md %1\webapps\%2\WEB-INF\classes\dummy
echo f | xcopy GXScanner8.jar %1\lib\GXScanner.jar /Y /D
goto :copyFiles

:copyScanner7
if NOT %3 == "7.0" goto copyFiles
md %1\webapps\%2\WEB-INF\classes\dummy
xcopy GXScanner.jar %1\lib /Y /D

:copyFiles
if %6 == "false" goto no_push_support
xcopy log4j-1.2.15.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy commons-lang-2.4.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy bcprov-jdk15-146.jar %1\webapps\%2\WEB-INF\lib /Y /D

:no_push_support
if %5 == "true" goto native_soap_support
if exist %1\webapps\%2\WEB-INF\web_native_ws.xml del %1\webapps\%2\WEB-INF\web*.xml
xcopy web.xml %1\webapps\%2\WEB-INF /Y /D
goto :ENDnative_soap_support

:native_soap_support
if exist %1\webapps\%2\WEB-INF\web_native_ws.xml goto native_soap_support_exist
if exist %1\webapps\%2\WEB-INF\web.xml del %1\webapps\%2\WEB-INF\web.xml
copy web.xml web_native_ws.xml
copy web_native_ws.xml %1\webapps\%2\WEB-INF
copy web_native_ws.xml %1\webapps\%2\WEB-INF\web.xml
xcopy sun-jaxws.xml %1\webapps\%2\WEB-INF /Y /D
goto :ENDnative_soap_support

:native_soap_support_exist
xcopy web_native_ws.xml %1\webapps\%2\WEB-INF\web.xml /Y /D
xcopy sun-jaxws.xml %1\webapps\%2\WEB-INF /Y /D

:ENDnative_soap_support
xcopy context.xml %1\webapps\%2\META-INF /Y /D
xcopy .\drivers\*.* %1\webapps\%2\WEB-INF\lib /Y /D
xcopy iText.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy iTextAsian.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy lucene-core-2.2.0.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy Tidy.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy lucene-highlighter-2.2.0.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy lucene-spellchecker-2.2.0.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy poi.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy poi-ooxml.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy poi-ooxml-schemas.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy xmlbeans.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy dom4j-1.6.1.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy tm-extractors-0.4.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy printingappletsigned.jar %1\webapps\%2 /Y /D
xcopy rbuildj.dll %1\webapps\%2 /Y /D
xcopy GXDIB32.DLL %1\webapps\%2 /Y /D
xcopy .\%7\*.rpt %1\webapps\%2\%7 /Y /D
xcopy .\gxmetadata\*.* %1\webapps\%2\gxmetadata /Y /D
xcopy .\gxmetadata\images\*.* %1\webapps\%2\gxmetadata\images /Y /D
xcopy .\Metadata\Interfaces\*.* %1\webapps\%2\static\Metadata\Interfaces /Y /D
xcopy .\Metadata\TableAccess\*.* %1\webapps\%2\Metadata\TableAccess /Y /D
xcopy .\devmenu\*.* %1\webapps\%2\static\devmenu /Y /D
xcopy .\bootstrap\*.* %1\webapps\%2\static\bootstrap /Y /D /S
xcopy jersey-core-1.4.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jersey-json-1.4.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jersey-server-1.4.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jackson-core-asl-1.5.5.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jackson-jaxrs-1.5.5.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jackson-mapper-asl-1.5.5.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy asm-3.1.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy GXWebSocket.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy bcprov-jdk15on-147.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy bcpkix-jdk15on-147.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy jdom-2.0.0.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy commons-logging.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy commons-io-2.2.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy xmlsec.jar %1\webapps\%2\WEB-INF\lib /Y /D
if exist .\blackberry md %1\webapps\%2\blackberry
if exist .\blackberry xcopy .\blackberry\*.* %1\webapps\%2\blackberry /Y /D

if %4 == "false" goto noDebug
if exist %1\webapps\%2\WEB-INF\lib\gxclassD.jar goto xcopyGXCLASSD
if exist %1\webapps\%2\WEB-INF\lib\gxclassR.jar del %1\webapps\%2\WEB-INF\lib\gxclassR.jar
copy gxclassD.zip %1\webapps\%2\WEB-INF\lib\gxclassD.jar
goto :ENDxcopyGXCLASSR

:xcopyGXCLASSD
xcopy gxclassD.zip %1\webapps\%2\WEB-INF\lib\gxclassD.jar /Y /D
goto :ENDxcopyGXCLASSR


:noDebug
if exist %1\webapps\%2\WEB-INF\lib\gxclassR.jar goto xcopyGXCLASSR
if exist %1\webapps\%2\WEB-INF\lib\gxclassD.jar del %1\webapps\%2\WEB-INF\lib\gxclassD.jar
copy gxclassR.zip %1\webapps\%2\WEB-INF\lib\gxclassR.jar
goto :ENDxcopyGXCLASSR

:xcopyGXCLASSR
xcopy gxclassR.zip %1\webapps\%2\WEB-INF\lib\gxclassR.jar /Y /D
:ENDxcopyGXCLASSR


if %3 == "5.5" goto end
if exist %1\conf\catalina\localhost\%2.xml goto xcopyCONTEXT
copy  context.xml %1\conf\catalina\localhost\%2.xml
goto :ENDxcopyCONTEXT

:xcopyCONTEXT
xcopy  context.xml %1\conf\catalina\localhost\%2.xml /Y /D
:ENDxcopyCONTEXT

if exist .\private\notifications.json md %1\webapps\%2\WEB-INF\private
if exist .\private\notifications.json xcopy .\private\*.* %1\webapps\%2\WEB-INF\private /Y /D

:end