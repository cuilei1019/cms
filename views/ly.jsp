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

<link    rel="stylesheet"    href="<%=request.getContextPath() %>/css/index2.css"  type="text/css"  >
<script type="text/javascript"  src="<%=request.getContextPath() %>/js/My97DatePicker/WdatePicker.js"></script>
 
</head>
<body>
<script src="<%=request.getContextPath() %>/js/jquery-3.2.1.js"></script>
 <form action="<%=request.getContextPath() %>/addly" method="post" >
 			<fieldset>
 				<legend>登录页面</legend>
 				<table>
 					<tr>
 						<td>留言人</td>
 						<td>
 						<input type="text" name="uname" value="${param.nickname }" readonly="readonly">
 						<input type="hidden" name="uid" value="${param.uid }" >
 						<input type="hidden" name="fid" value="${param.fid }" >
 						
 						</td>
 				
 					</tr>
 					<tr>
 						<td>留言内容</td>
 						<td><input type="text" name="xx"></td>
 				
 					</tr>
 					<tr>
 							<td colspan="2"><button  >留言</button></td>
 					</tr>
 				
 				</table>
 			</fieldset>
 		
 		
 		</form>
		
</body>
</html>