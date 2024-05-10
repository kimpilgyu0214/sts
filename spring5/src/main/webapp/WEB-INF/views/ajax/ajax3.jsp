<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path2" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>ajax01</title>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
 <script src="https://cdn.jsdelivr.net/npm/axios@1.6.8/dist/axios.min.js"></script>
</head>
<body>
<nav>
	<h2>04_Get 전송 + Parameter</h2>
	<hr>
	<ul>
		<li><a href="${paht2 }/ajax/">Home</a><li>
	</ul>
	<button type="button" id="btn3">Get 전송</button>
	<script>
	$(document).ready(function(){
		var fn3 = () =>$.ajax({
			type:"get"
			url:"${path2}/ajax/ajax3pro.do?msg=파라미터 Get 전송",
			success:function(rep) { console.log("성공", rep); },
			error:function(err) {console.log("실패", err); }
		});
		$("#btn3").on("click", function() { fn3(); });
	});
	</script>
	
</nav>
</body>
</html>