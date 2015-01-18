<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8" />
	<jsp:include page="webStd.jsp"></jsp:include>
	<title><tiles:getAsString name="title"/></title> 
    <link rel="stylesheet" href="css/common.css" />
    <link rel="stylesheet" href="css/index.css" />
    <link rel="stylesheet" href="css/main.css" />
</head>
 <body style='background-color: #121620;'>
    <table id='layout' style='background-color: #121620;'>
      <tr>
        <td colspan="2">
          <tiles:insertAttribute name="top" />
        </td>
      </tr>
       <tr>
        <td colspan="2">
          <tiles:insertAttribute name="menu" />
        </td>
      </tr>
      <tr>
      <%-- 	<td>
      		<tiles:insertAttribute name='side'/>
      	</td> --%>
        <td colspan="2">
          <tiles:insertAttribute name="content" />
        </td>
      </tr>
      <tr>
        <td colspan="2">
          <tiles:insertAttribute name="bottom" />
        </td>
      </tr>
    </table>
  </body>
</html>

<%-- <tiles:insertAttribute name="top" />
	<tiles:insertAttribute name="content"/>
	<tiles:insertAttribute name="bottom"/> --%>