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
<body>
	
	<div id="cc" class="easyui-layout" style="width:1300px;height:600px;">
        <div data-options="region:'north'" style="height:50px"></div>
        <div data-options="region:'south',split:true" style="height:50px;"></div>
        <div data-options="region:'east',split:true" title="East" style="width:100px;"></div>
        <div data-options="region:'west',split:true" title="West" style="width:100px;"></div>
        <div data-options="region:'center',title:'Center'"></div>
    </div>
	
</body>
</html>