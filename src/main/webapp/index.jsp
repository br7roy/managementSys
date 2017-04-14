<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html title="上海南博贸易有限公司">
<head>
<title>上海南博贸易有限公司</title>
    <script src="js/jquery-3.2.1.js"></script>
    <style type="text/css">
        @import "css/nb.css";
    </style>
</head>
<body>
<!--顶部-->
<div class="nb_logo_log">
    <div class="nb_logo_c_log"></div>
</div>
<!--界面-->
<div class="nb_interface_log">
    <div class="nb_interface_c_log">
        <div class="nb_interface_1_log f1">
            <!--广告位1-->
            <div class="ad1">预留广告位</div>
            <!--广告位2-->
            <div class="ad2">预留广告位</div>
        </div>
        <div class="title" id="title">
            <h1>上海南博贸易有限公司员工管理平台</h1>
        </div>
        <div class="nb_interface_r_log fr">
            <div class="interface_info_log" >
                <h3>帐号登录</h3>
                <p class="user_log_info"></p>
                <div class="quc-main_log">
                    <form class="quc-form_log" id="log_form" method="post" enctype="multipart/form-data"
                          onsubmit="do_login();return false;">
                        <p class="user_log">
                            <span class="pep_log f1"></span>
                            <span class="pep_text_log f1">
                                 <input type="text" maxlength="20" id="user_name" name="user_name" placeholder="用户名" autocomplete="off">
                            </span>
                        </p>
                        <p class="pwd_log">
                            <span class="pwd_log f1"></span>
                            <span class="pwd_text_log f1">
                                <input type="password" id="password" name="password" placeholder="登录密码" autocomplete="off">
                            </span>
                        </p>
                        <p class="info_log">
                            <a class="forget_info_log f1" title="忘记密码？" href="main.html">忘记密码？</a>
                        </p>
                        <p class="nb_next_log">
                            <input class="sub_log" type="submit" value="登录" id="login_btn">
                        </p>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
