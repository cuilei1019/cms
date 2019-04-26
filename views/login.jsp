<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>

<link    rel="stylesheet"    href="../css/index2.css"  type="text/css"  >
<script type="text/javascript"  src="../js/My97DatePicker/WdatePicker.js"></script>
 
</head>
<body>
<script src="../js/jquery-3.2.1.js"></script>
 		<form >
 			<fieldset>
 				<legend>登录页面</legend>
 				<table>
 					<tr>
 						<td>用户名</td>
 						<td><input type="text" name="uname"></td>
 				
 					</tr>
 					<tr>
 						<td>密码</td>
 						<td><input type="password" name="upwd"></td>
 				
 					</tr>
 					<tr>
 						<td colspan="2"><button type="button" onclick="login()">登录</button></td>
 				
 					</tr>
 				
 				</table>
 			</fieldset>
 		
 		
 		</form>
		<script type="text/javascript">

		function login() {
			var uname=$("[name=uname]").val();
			var upwd=$("[name=upwd]").val();
			if(uname==""){
				alert("用户名不能为空");
				return;
			}
			
			if(upwd==""){
				alert("用户名不能为空");
				return;
			}
			$.post("${pageContext.request.contextPath}/login", {"uname":uname,"upwd":upwd}, function(data) {
				if(data==0){
					alert("用户不存在");
				}else if(data==1){
					alert("登录成功");
					location.href="${pageContext.request.contextPath}/list?uname="+uname;
				}else{
					alert("密码错误");
				}
				
			})
		}

		</script>
</body>
</html>