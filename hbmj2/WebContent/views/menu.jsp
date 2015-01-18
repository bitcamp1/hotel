<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
	
</script>

<div id="main_header">
	<div class="center">
		<div id="main_menu">
			<ul>
				<li><a href="./index.jsp?page=mjhotel/m_mjhotel&list=about">MJ Hotel</a></li>
				<li><a href="./index.jsp?page=room/m_room&list=superior">Room</a></li>
				<li><a href="./index.jsp?page=facilities/m_facilities&list=banquet">Facilities</a></li>
				<li><a href="G_event.do?&pageType=now">Event</a></li>
				<li><a href="G_guest.do">Guest</a></li>
				<li><a href="./index.jsp?page=qna/m_qna&list=qna">Q&A</a></li>
			</ul>
		</div>
		<div id="login_menu">
			<ul>
				<li><a href='reservation.do'>Reservation</a></li>
			</ul>
		</div>
	</div>
</div>	

<style>
#main_header{
		background:#121620;
	/* 	position:fixed; */
		top:80px; left:0; right:0;
		line-height:20px;
		z-index:10;
		border-top:1px solid #FFF;
		border-bottom:1px solid #FFF;
    }
    #main_header a{
        display:block;
        padding:5px 20px;
        color:white;
    }
    #main_menu>ul>li{
        text-align:center;
        float:left;         
    }
    #main_menu>ul>li>a:hover {
        background-color: #DDD;
        color:black;
    }
    #login_menu>ul>li{
        float:right;
    }
    #login_menu>ul>li>a{
        background-color:#DDD;
        color:black;   
    }
    #login_menu>ul>li>a:hover {
        background-color: #6e6464;
        color:white;
    }

</style>