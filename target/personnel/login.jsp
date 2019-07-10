<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>

<link href="./bootstrap-3.3.4/css/bootstrap.css" type="text/css"
	rel="stylesheet">
<link href="./bootstrap-3.3.4/css/bootstrap-theme.css" type="text/css"
	rel="stylesheet">

<script src="./jquery/jquery-1.11.2.js"></script>
<script src="./bootstrap-3.3.4/js/bootstrap.js"></script>

<style>
#div1 {
	height: 30px;
	background-color: #abc;
}

#menu {
	background-color: #9ab;
	height: 100%;
}

#content {
	background-color: orange;
	height: 100%;
}
</style>

<script type="text/javascript">
	$(function(){
		$("#btnLogin").click(function(){
			$("form").submit();
		});
	});
</script>
</head>
<body>
	<div class="container">
		<div class="row">

			<div class="col-md-4 col-md-offset-4">

				<form action="${pageContext.request.contextPath}/user/login" method="post">
					<div class="form-group">
						<label for="account">账号:</label> <input type="text" name="account"
							id="account" class="form-control">
					</div>

					<div class="form-group">
						<label for="pwd">密码:</label> <input type="password" name="pwd"
							id="pwd" class="form-control">

					</div>
					<div class="form-group">
						<input id="btnLogin" type="button" value="登录" class="btn btn-primary">
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>