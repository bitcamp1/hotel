<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<!-- 슬라이드 -->
    <div>
		<jsp:include page="contentSlide.jsp" flush="false" /> 
    </div>
	<!-- 예약 --> 
	<div style="margin-top:10px;">    
		<jsp:include page="contentCalendar.jsp" flush="false" />
	</div>
	<!-- 공지사항 -->	
	<div class="center2">
		<ul>
			<li class=center2F><jsp:include page="contentTab.jsp" flush="false" /></li>		
			<li class=center2F><jsp:include page="contentEvent.jsp" flush="false" /></li>
		</ul>
	</div>		
