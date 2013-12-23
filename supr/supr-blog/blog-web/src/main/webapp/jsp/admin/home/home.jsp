<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../../../style/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../../../style/js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="../../../style/js/easyui/demo/demo.css">
<script type="text/javascript" src="../../../style/js/easyui/jquery.min.js"></script>
<script type="text/javascript" src="../../../style/js/easyui/jquery.easyui.min.js"></script>
</head>
<body class="easyui-layout">

	<div data-options="region:'north',title:'North Title',split:true,collapsed:true" style="height:100px;"></div>
	
	<!-- 
    <div data-options="region:'south',title:'South Title',split:true,collapsed:true" style="height:100px;"></div>
    <div data-options="region:'east',title:'East',split:true,collapsed:true" style="width:100px;"></div>
     -->
    
    <div data-options="region:'west',title:'菜单栏',split:true" style="width:200px;">
		<div id="functions" class="easyui-accordion" style="width: 200px;">
			<div title="系统管理" data-options="iconCls:'icon-save',selected:true" style="overflow:auto;padding: 10px;">
				<h3 style="color: #0099FF;">Accordion for jQuery</h3>
				<p>Content1</p>
			</div>
			<div title="日志管理" data-options="iconCls:'icon-reload',selected:true" style="overflow:auto;padding: 10px;">
				<h3 style="color: #0099FF;">Accordion for jQuery</h3>
				<p>Content2</p>
			</div>
		</div>
	</div>
	
    <div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;">
    	<div id="tt" class="easyui-tabs">
		    <div title="Tab1" data-options="closable:true" style="padding:20px">
		        tab1
		    </div>
		    <div title="Tab2" data-options="closable:true" style="overflow:auto;padding:20px;">
		        tab2
		    </div>
		    <div title="Tab3" data-options="iconCls:'icon-reload',closable:true" style="padding:20px;">
		        tab3
		    </div>
		</div>
    </div>

</body>
</html>