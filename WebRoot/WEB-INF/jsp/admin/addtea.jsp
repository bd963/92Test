<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>增加一名老师</title>
	<link rel="stylesheet" type="text/css" href="static/layui/css/layui.css">
	<style type="text/css">
		.layui-form{
			width: 50%;
			margin-left: 10%;
			margin-top: 5%;
		}
		.layui-input-block{
			margin-top: 50px;
		}
		.blank{
			margin-left: 50%;
		}
	</style>
</head>
<body>
	<form class="layui-form" action="addtea" method="post" id="from">
		<div class="layui-form-item">
	    	<label class="layui-form-label">姓名</label>
	    	<div class="layui-input-block">
	        	<input type="text" name="teaname" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input">
	    	</div>
	    </div>
		<div class="layui-form-item">
		    <label class="layui-form-label">用户名</label>
		    <div class="layui-input-block">
		        <input type="text" name="username" required lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
		    </div>
		</div>
	    <div class="layui-form-item">
	    	<label class="layui-form-label">密码</label>
	    	<div class="layui-input-inline">
	        	<input type="password" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
	   		</div>
	    </div>
	    <div class="layui-form-item">
	    	<div class="layui-input-block">
	    		<button class="layui-btn" lay-submit lay-filter="formDemo" onclick="checkPet()">立即提交</button>
	    		<span class="blank"></span>
	    		<button type="reset" class="layui-btn layui-btn-primary">重置</button>
	    	</div>
	    </div>
	</form>
 	<script type="text/javascript" src="static/layui/layui.js"></script>
 	<!-- <script type="text/javascript">
 		function checkPet(){
 			//姓名
 			var teaname = $("#teaname");
 			//用户名
 			var username = $("username");
 			//密码
 			var password = $("password");
 			
 			//非空判断
 			if(teaname == "" || teaname == null){
 				alert("姓名不能为空!");
 			}else if(username == "" || username == null) {
 				alert("用户名不能为空!")
 			}else if(password == "" || password == null) {
 				alert("密码不能为空!");
 			}else{
 				$("#from").submit();
 			}
 		}
 	</script> -->
	<script>
		//Demo
		layui.use('form', function(){
		  var form = layui.form;
		});
	</script>
</body>
</html>