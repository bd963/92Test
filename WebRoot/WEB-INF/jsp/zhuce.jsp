<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>增加一个管理员</title>
	<link rel="stylesheet" type="text/css" href="static/layui/css/layui.css">
	<style type="text/css">
		.layui-form{
			width: 50%;
			margin-left: 20%;
			margin-top: 10%;
		}
		.layui-input-block{
			margin-top: 50px;
		}
		.blank{
			margin-left:215px;
		}
		.blank2{
			margin-left: 215px;
		}
	</style>
</head>
<body style=" background: url(static/img/1001408.jpg) no-repeat center center fixed; background-size:100%;">
	<div class="modal-dialog" style="margin-top: 10%;">
		<form class="layui-form" action="addAdmin" method="post" >
			<h2><p style="margin-left:400px;color:white;font-weight:bold">欢迎注册!</p></h2>
			<div class="layui-form-item">
		    <label class="layui-form-label" style="color: White;font-weight:bold;">姓名:</label>
		    <div class="layui-input-block">
		      <input type="text" name="name" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input">
		    </div>
		  </div>
		  <div class="layui-form-item">
		    <label class="layui-form-label" style="color:White;font-weight:bold;">用户名:</label>
		    <div class="layui-input-block">
		      <input type="text" name="username" required  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
		    </div>
		  </div>
		  <div class="layui-form-item">
		    <label class="layui-form-label" style="color:White;font-weight:bold;">密码:</label>
		    <!-- <div class="layui-input-inline"> -->
		    <div class="layui-input-block">
		      <input type="password" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
		   	</div>
		  </div>
		  <div class="layui-form-item">
		    <div class="layui-input-block">
		        <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
		        <span class="blank"></span>
		        <button type="reset" class="layui-btn" layui-btn-primary>重置</button>
		        <span class="blank2"></span>
		        <input type="button" class="layui-btn" value="返回" onclick="javascript:history.go(-1);"/>
		    </div>
		  </div>
		</form>
	</div>
	<script type="text/javascript" src="static/layui/layui.js"></script>
	<script>
		//Demo
		layui.use('form', function(){
		  var form = layui.form;
		});
	</script>
</body>
</html>