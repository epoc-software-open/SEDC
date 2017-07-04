@echo off

md %1\webapps\%2
md %1\webapps\%2\static
md %1\webapps\%2\WEB-INF
md %1\webapps\%2\META-INF
md %1\webapps\%2\WEB-INF\classes
md %1\webapps\%2\WEB-INF\lib
md %1\webapps\%2\static\Metadata
md %1\webapps\%2\static\Metadata\Interfaces

copy web6.xml web.xml
if %3 == "7.0" copy web7.xml web.xml

if %3 == "5.5" goto copyFiles
md %1\conf\catalina\localhost

if NOT %3 == "7.0" goto copyFiles
md %1\webapps\%2\WEB-INF\classes\dummy

:copyFiles
if %5 == "true" goto native_soap_support
if exist %1\webapps\%2\WEB-INF\web_native_ws.xml del %1\webapps\%2\WEB-INF\web*.xml
xcopy web.xml %1\webapps\%2\WEB-INF /Y /D
goto :ENDnative_soap_support

:native_soap_support
if exist %1\webapps\%2\WEB-INF\web_native_ws.xml goto native_soap_support_exist
if exist %1\webapps\%2\WEB-INF\web.xml del %1\webapps\%2\WEB-INF\web.xml
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
xcopy tm-extractors-0.4.jar %1\webapps\%2\WEB-INF\lib /Y /D
xcopy printingappletsigned.jar %1\webapps\%2 /Y /D
xcopy rbuildj.dll %1\webapps\%2 /Y /D
xcopy GXDIB32.DLL %1\webapps\%2 /Y /D
xcopy .\Metadata\Interfaces\*.* %1\webapps\%2\static\Metadata\Interfaces /Y /D

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

:end