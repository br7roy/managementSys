//网页加载后执行的方法

$(function () {
    $('#login_btn').click(loginAction);

    $('#user_name')
        .on('blur', checkName)
        .on('focus', function(){
            $('#user_name_msg').empty();
        }).focus();

    $('#password')
        .on('blur', checkPassword)
        .on('focus', function(){
            $('#password_msg').empty();
        });
});


function loginAction() {
    var name = $('#user_name').val();
    var pwd = $('#password').val();
    if (!checkName()||!checkPassword()) {
        return false;
    }
    $.ajax({
        url: 'account/login.do',
        type: 'POST',
        data: {'name': name, 'pwd': pwd},
        dataType: JSON,
        success: function (result) {
            if (result.responseCode===SUCCESS_CODE) {
                console.log(result.responseMsg);
                var user=result.objData;
                setCookie(USER_ID, user.id);

                window.location.href='edit.html';

            }

        },
        error:function(){
            alert("用户名密码不匹配");
        }
    });

}



function do_login() {
    var name = $('#user_name').val();
    var pwd = $('#password').val();
    if (!checkName()||!checkPassword()) {
        return false;
    }
    $.ajax({
        url: 'account/login.do',
        type: 'POST',
        data: {'name': name, 'pwd': pwd},
        dataType: JSON,
        success: function (result) {
            if (result.responseCode===SUCCESS_CODE) {
                console.log(result.responseMsg);
                var user=result.objData;
                setCookie(USER_ID, user.id);

                window.location.href='edit.html';

            }

        },
        error:function(){
            alert("用户名密码不匹配");
        }
    });

}


function checkName(){
    var name = $("#user_name").val();
    if(name===''){
        $('#user_name_msg').empty().append("用户名不能空");
        return false;
    }
    var reg = /^\w{3,10}$/;
    if(reg.test(name)){
        $('#user_name_msg').empty();
        return true;
    }
    $('#user_name_msg').empty().append("3~10字符");
    return false;
}

function checkPassword(){
    var password = $("#password").val();
    if(password===''){
        $("#password_msg").empty().append("不能空");
        return false;
    }
    var reg = /^\w{3,10}$/;
    if(reg.test(password)){
        $('#password_msg').empty();
        return true;
    }
    $('#password_msg').empty().append("3~10字符");
    return false;



}
function setCookie(name,value)//两个参数，一个是cookie的名子，一个是值

{

    var days = 30; //此 cookie 将被保存 30 天

    var exp = new Date();    //new Date("December 31, 9998");

    exp.setTime(exp.getTime() + days*24*60*60*1000);

    document.cookie = name + "="+ escape (value) + ";expires=" + exp.toGMTString();

}
