<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="js/jquery.js"></script>
    <title>Title</title>
    <script type="text/javascript">
        $(function () {
            //导航切换
            $(".menuson li a").click(function () {
                $(".menuson li").removeClass("active");
                $(this).parent().addClass("active");
            });
            $('.title').click(function () {
                var $ul = $(this).next('ul');
                $('dd').find('ul').slideUp();
                var $dd = $(this).parent();
                if ($ul.is(':visible')) {
                    $(this).next('ul').slideUp();
                    $(this).removeClass("ddactive");
                }else {
                    $(this).next('ul').slideDown();
                    $(this).addClass("ddactive");
                    $(".title").not(this).removeClass("ddactive");
                }
            });
        })
    </script>

</head>
<body style="background: #f0f9fd;">
    <div class="bgcover"></div>
    <dl class="leftmenu">
        <dd>
            <a href="notice.jsp" target="rightFrame">
                <div class="title ddactive">
                    <span><img src="images/i09.png" width="28px" height="28px" /></span>公告
                    <div style="clear:both;"></div>
                </div>
            </a>
        </dd>
        <dd>
            <div class="title">
                <span>
                    <img src="images/i06.png" width="28px" />
                </span>行政部
                <div style="clear:both;"></div>
            </div>
            <ul class="menuson">
                <li><cite></cite><a href="hr.jsp" target="rightFrame">招聘管理</a><i></i></li>
                <li><cite></cite><a href="build_hr.jsp" target="rightFrame">新建员工</a><i></i></li>
            </ul>
        </dd>

    </dl>

</body>
</html>