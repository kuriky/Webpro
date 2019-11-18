<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせ受付完了</title>
</head>
<body>
<br>
<s:property value="name" />さん、お問い合わせ有難うございました。
<br>
<br>お問い合わせの種類:<br>
<s:if test='qtype=="company"'>
会社について
</s:if>
<s:if test='qtype=="product"'>
製品について
</s:if>
<s:if test='qtyoe=="support"'>
アフターサポートについて
</s:if>
<br>
<br>お問い合わせ内容:<br>
<s:property value="body" />

</body>
</html>