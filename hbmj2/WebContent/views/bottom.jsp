<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<style type="text/css">
    #link>ul>li>a.facebook {
  		display:block; 
		width:25px;
		height:25px;
		background:url(img/facebook_off.png) no-repeat;
    }
    #link>ul>li>a:hover.facebook {
  		background:url(img/facebook_on.png) no-repeat;
    }
    #link>ul>li>a.twitter {
 		display:block; 
		width:25px;
		height:25px;
		background:url(img/twitter_off.png) no-repeat;
    }
    #link>ul>li>a:hover.twitter {
   		background:url(img/twitter_on.png) no-repeat;
    }
    #link>ul>li>a.map {
 		display:block; 
		width:25px;
		height:25px;
		background:url(img/map_off.png) no-repeat;
    }
    #link>ul>li>a:hover.map {
   		background:url(img/map_on.png) no-repeat;
    }
    #link>ul>li>a span {
   		display:none;
    } 
</style>   
<div id="adress">
		    <ul>
		        <li>MJ HOTEL</li>
		        <li>TEL 02-1234-1234</li>
		        <li style="padding-left:100px;">Copyright ⓒ 2014 MJHOTLE All Rights Reserved.</li>
		    </ul>
		</div>
		<div id="link">
		    <ul>
		        <li><a href="https://ko-kr.facebook.com/" class="facebook"><span>페이스북</span></a></li>
		        <li><a href="https://twitter.com/" class="twitter"><span>트위터</span></a></li>
		        <li><a href="index.jsp?page=mjhotel/m_mjhotel&list=findhotel" class="map"><span>지도</span></a></li>
		    </ul>
		</div>

