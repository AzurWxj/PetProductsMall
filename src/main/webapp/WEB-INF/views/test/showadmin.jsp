<%@ page language="java" import="java.util.*,com.azure.mall.models.Admin" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<body>
This is admin:<%= ((Admin)request.getAttribute("admin")).toString()%>
<br>
This is msg:<%= ((String)request.getAttribute("beanmsg"))%>
</body>