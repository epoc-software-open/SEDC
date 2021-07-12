<?xml version='1.0'?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat" />

	<xsl:template match="/">
		<html>
			<head>
				<meta charset="utf-8" />
				<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
				<meta name="viewport" content="width=device-width"/>
				<title>GeneXus Developer Menu</title>
				<script src="devmenu/developermenu.js"></script>
				<link rel="stylesheet" href="devmenu/developermenu.css" type="text/css" media="screen" />
			</head>
			<body onload="DeveloperMenu.initialize();">
				<header id="header" class="main-layout">
					<img src="devmenu/logo.png" alt="GeneXus" />
				</header>
				<div id="main" class="main-layout">
					<div id="objs-box" class="box">
						<div class="box-title">
							<h1>Developer menu</h1>
						</div>
						<ul id="objs-list" class="link-list">
							<xsl:apply-templates select="/Objects"/>
						</ul>
					</div>
					<div id="kbn-box" class="box box-disabled">
						<div class="box-title">
							<h1>Smart Devices: Application QR code for Knowledge Base Navigator (All devices)</h1>
						</div>
						<div>
							<div class="qrcode-box">
								<img id="kbn-qrcode" class="qrcode" src="" alt="Application URL for Knowledge Base Navigator"/>
								<a id="kbn-qrcode-zoom" class="qrcode-zoom">
									<img src="devmenu/zoom.png" alt="Zoom QR code" title="Click to zoom QR code"/>
								</a>
							</div>
							<div class="download-box">
								<header>
									<h1>Get Knowledge Base Navigator for your iOS device:</h1>
								</header>
								<a href="https://itunes.apple.com/app/evolution-3-knowledge-base/id883338428" target="_blank">iOS</a>
							</div>
							<div id="kbn-qrcode-url"><strong>KBN Application Url:</strong></div>
						</div>
					</div>
					<div id="sdapps-box" class="box box-disabled">
						<div class="box-title">
							<h1>Smart Devices: QR code by device</h1>
						</div>
						<table id="apps-matrix">
							<thead>
								<tr>
									<th>
									</th>
									<th>
										<img src="devmenu/Android_logo.jpg" alt="Android"/>
									</th>
									<th>
										<img src="devmenu/blackberry_logo.png" alt="BlackBerry"/>
									</th>
								</tr>
							</thead>
							<tbody id="apps-matrix-body">
							</tbody>
						</table>
					</div>
				</div>
			</body>
		</html>
	</xsl:template>

	<xsl:template match="Objects">
		<xsl:apply-templates select="//Object"/>


	</xsl:template>

	<xsl:template match="Object">
		<li>
			<a>
				<xsl:attribute name="class">
					<xsl:text>obj-class-</xsl:text>
					<xsl:value-of select="ObjCls"/>
				</xsl:attribute>
				<xsl:attribute name="href">
					<xsl:value-of select="ObjLink"/>
				</xsl:attribute>
				<xsl:value-of select="ObjDesc"/>
			</a>
		</li>
	</xsl:template>

</xsl:stylesheet>
