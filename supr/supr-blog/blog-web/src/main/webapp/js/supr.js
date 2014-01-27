/** 验证码 **/
function captcha(){
	$("#generatorCaptcha").attr("src","captcha?number="+Math.random());
}

/** 后台登陆校验 **/
function login(){
	neonLogin.$container = $("#form_login");
	neonLogin.$container
	.validate({
		rules : {
			username : {
				required : true
			},
			password : {
				required : true
			},
			captcha : {
				required : true
			},
		},
		highlight : function(element) {
			$(element).closest('.input-group').addClass('validate-has-error');
		},
		unhighlight : function(element) {
			$(element).closest('.input-group').removeClass('validate-has-error');
		}
	});
	
	$("#form_login").attr("action","admin/login");
	$("#form_login").submit();
}