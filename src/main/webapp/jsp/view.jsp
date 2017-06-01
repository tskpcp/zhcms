<%--
  Created by IntelliJ IDEA.
  User: gongtuo
  Date: 2017/6/1
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
    <form action="${requestScope.contextPath}/countries/save" method="post">
        <input type="hidden" name="id" value="<#if country.id??>${country.id}</#if>">
        <table class="gridtable" style="width:800px;">
            <tr>
                <th colspan="5">国家(地区)信息 - [<a href="${request.contextPath}/countries">返回</a>]</th>
            </tr>
            <tr>
                <th>国家(地区)名称：</th>
                <td><input type="text" name="countryname" value="<#if country.countryname??>${country.countryname}</#if>"/>
                </td>
                <th>国家(地区)代码：</th>
                <td><input type="text" name="countrycode" value="<#if country.countrycode??>${country.countrycode}</#if>"/>
                </td>
                <td><input type="submit" value="保存"/></td>
            </tr>
            <#if msg??>
                <tr style="color:#00ba00;">
                    <th colspan="5">${msg}</th>
                </tr>
            </#if>
        </table>
    </form>
</body>
</html>
