<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
</head>
<body>
<form action="show">
    建议id :<input type="text" name="taiId" style="text-align: center;"><br>
    <input type="submit" />
</form><br>

<form action="updateInfo">
    建议id :<input type="text" name="taiId" style="text-align: center;"><br>
    建议内容 :<input type="text" name="desc" style="text-align: center;"><br>
    <input type="submit" />
</form><br>
<form action="login">
    <input type="submit" />
</form><br>

<form action="vuedemo">
    <input type="submit" value="跳转到vue页面" />
</form><br>
</body>
</html>