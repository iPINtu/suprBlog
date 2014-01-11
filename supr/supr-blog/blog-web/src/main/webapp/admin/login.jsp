<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<%@ page import="java.util.UUID"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String captchaId = UUID.randomUUID().toString();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="<%=basePath%>">
	<meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.3.5/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.3.5/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.3.5/demo/demo.css">
    <script type="text/javascript" src="js/jquery-easyui-1.3.5/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery-easyui-1.3.5/jquery.easyui.min.js"></script>
</head>

<script language="javascript"> 
function changeCaptcha(){
	$("#pic").attr("src","admin/captcha?captchaId=<%=captchaId%>");
}
</script>

<body>

	<div id="login" class="easyui-dialog" title="用户登录" style="width:245px;height:185px;padding:13px">
		<form id="dd" action="admin/login.jsp" method="post">    	
	        用户名：<input type="text" name="username" id="username"/></br>
	        密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="text" name="password" id="password"/></br>
	        验证码：<input type="text" name="captcha" id="captcha" style="width:40px;"/>
	        <input type="hidden" name="captchaId" value="<%=captchaId%>"/>
	       <img id="pic" src="admin/captcha?captchaId=<%=captchaId%>" onclick="changeCaptcha()"></br>
	       <input type="submit"/>
		</form>	       
	</div>

</body>
</html>