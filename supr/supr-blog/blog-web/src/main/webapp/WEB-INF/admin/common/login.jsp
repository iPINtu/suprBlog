<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="<%=basePath%>">
	<meta charset="UTF-8">
    <link rel="stylesheet" href="css/assets/js/jquery-ui/css/no-theme/jquery-ui-1.10.3.custom.min.css"  id="style-resource-1">
	<link rel="stylesheet" href="css/assets/css/font-icons/entypo/css/entypo.css"  id="style-resource-2">
	<link rel="stylesheet" href="css/assets/css/font-icons/entypo/css/animation.css"  id="style-resource-3">
	<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Noto+Sans:400,700,400italic"  id="style-resource-4">
	<link rel="stylesheet" href="css/assets/css/neon.css"  id="style-resource-5">
	<link rel="stylesheet" href="css/assets/css/custom.css"  id="style-resource-6">
    
</head>

<body class="page-body login-page login-form-fall">

<div class="login-container">
	
	<div class="login-header login-caret">
		
		<div class="login-content">
			
			<a class="logo">
				<img src="css/assets/images/logo.png"/>
			</a>
			
			<p class="description">Dear user, log in to access the admin area!</p>
			
			<!-- progress bar indicator -->
			<div class="login-progressbar-indicator">
				<h3>33%</h3>
				<span>正在登陆...</span>
			</div>
		</div>
		
	</div>
	
	<div class="login-progressbar">
		<div></div>
	</div>
	
	<div class="login-form">
		
		<div class="login-content">
		
			<form id="form_login" method="post" role="form">
		
				<div class="form-group">
					
					<div class="input-group">
						<div class="input-group-addon">
							<i class="entypo-user"></i>
						</div>
						
						<input type="text" class="form-control" name="username" id="username" placeholder="用户名" autocomplete="off" />
					</div>
					
				</div>
				
				<div class="form-group">
					
					<div class="input-group">
						<div class="input-group-addon">
							<i class="entypo-key"></i>
						</div>
						
						<input type="password" class="form-control" name="password" id="password" placeholder="密码" autocomplete="off" />
					</div>
				
				</div>
				
				<div class="form-group">
					
					<div class="input-group">
						<div class="input-group-addon">
							<i class="entypo-signal"></i>
						</div>
						
						<input type="text" class="form-control" name="captcha" id="captcha" placeholder="验证码" autocomplete="off" />
					
						<div class="input-group-addon">
							<a href="javascript:captcha()">
								<img style="height:21px" id="generatorCaptcha" src="captcha"/>
							</a>
						</div>
					</div>
					
				</div>
				
				<div class="form-group">
					<button type="submit" class="btn btn-primary btn-block btn-login">
							登陆
						<!-- <i class="entypo-login"></i> -->
					</button>
				</div>
				
			</form>
			
			<div class="login-bottom-links">
				
				<!-- <a href="#" class="link">Forgot your password?</a> -->
				
				<a>Supr</a>  - <a>Privacy Policy</a>
				
			</div>
			
		</div>
		
	</div>
	
</div>
	<script src="css/assets/js/jquery-1.10.2.min.js"></script>
    <script src="js/supr.js"></script>
	<script src="css/assets/js/gsap/main-gsap.js" id="script-resource-1"></script>
	<script src="css/assets/js/jquery-ui/js/jquery-ui-1.10.3.minimal.min.js" id="script-resource-2"></script>
	<script src="css/assets/js/bootstrap.min.js" id="script-resource-3"></script>
	<script src="css/assets/js/joinable.js" id="script-resource-4"></script>
	<script src="css/assets/js/resizeable.js" id="script-resource-5"></script>
	<script src="css/assets/js/neon-api.js" id="script-resource-6"></script>
	<script src="css/assets/js/jquery.validate.min.js" id="script-resource-7"></script>
	<script src="css/assets/js/neon-login.js" id="script-resource-8"></script>
	<script src="css/assets/js/neon-custom.js" id="script-resource-9"></script>
	<script src="css/assets/js/neon-demo.js" id="script-resource-10"></script>
</body>
</html>
