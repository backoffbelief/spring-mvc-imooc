<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/course/save" method="post">
title:<input type="text" name="title"><br/>
imgPath<input type="text" name="imgPath" hidden="hidden" value="/static/imgs/course-img.jpg"><br/>
learningNum:<input type="text" name="learningNum"><br/>
level:<input type="text" name=level><br/>
levelDesc:<input type="text" name="levelDesc"><br/>
duration:<input type="text" name="duration"><br/>
decsr:<input type="text" name="decsr"><br/>
<input type="submit" name="btn" id="btn" value="save"><br/>
</form>

</body>
</html>