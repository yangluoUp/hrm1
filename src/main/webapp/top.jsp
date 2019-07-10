<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <title>Title</title>
    <style type="text/css">
        .user {
            position: fixed;
            left: 60px;
            font-size: 16px;
            color: #ffffff;
        }

            .user:before {
                content: "";
                width: 50px;
                height: 50px;
                background: url(images/admin.png) no-repeat;
                display: inline-block;
                background-size: cover;
                vertical-align: middle;
            }

        .quit {
            position: fixed;
            top: 30px;
            right: 120px;
            width: 100px;
            height: 35px;
            background: #c4e6f4;
            border-radius: 5px;
            text-align: center;
            color: #33557a;
            font-size: 16px;
            line-height: 35px;
        }

    </style>
</head>
<body style=" width: 100%; height:90px;background-image: url('images/bg.png');background-size: cover;filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src='images/bg.png',sizingMethod='scale'); ">
<div class="bgcover"></div>
<div style="" class="user">${username}，欢迎登陆</div>
<div style="margin: 28px auto; width: 500px;"></div>
<a class="quit" href="login.jsp" target="_blank">退&nbsp;&nbsp;出</a>
<div style="clear: both"></div>
</body>
</html>