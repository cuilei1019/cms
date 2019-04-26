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
	<input type="hidden" name="uid" value="${user.uid}" >
	<input type="hidden" name="nickname" value="${user.nickname}" >
	<span style="color:green">${user.nickname }好友列表</span><a href="<%=request.getContextPath() %>/views/exit.jsp">退出</a>
 	<table>
 		<tr>
 			<td>好友id</td>
 			<td>好友账号</td>
 			<td>好友昵称</td>
 			<td>操作</td>
 		</tr>
 		<c:forEach items="${list }" var="l" >
 		<tr>
 			<td>${l.uid }</td>
 			<td>${l.uname }</td>
 			<td>${l.nickname }</td>
 			<td>
 				<button type="button" onclick="ck(${l.uid})">查看留言</button>
 				<button type="button"  onclick="ly(${l.uid})">留言</button>
 			</td>
 		</tr>
 		
 		
 		</c:forEach>
 	</table>
		<script type="text/javascript">
		
				function ly(fid) {
					
					location.href="${pageContext.request.contextPath}/views/ly.jsp?fid="+fid+"&uid="+$("[name=uid]").val()+"&nickname="+$("[name=nickname]").val();
				}

		</script>
</body>
</html>