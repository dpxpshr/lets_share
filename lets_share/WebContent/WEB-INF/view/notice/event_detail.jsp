<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/include/head.jsp" %>
<head>
		<title>Let's Share</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="/resources/css/main.css" />
		<link rel="stylesheet" href="../../../resources/css/notice/event_detail.css" />
		<noscript><link rel="stylesheet" href="/resources/css/noscript.css" /></noscript>
</head>
<body class="no-sidebar is-preload">
	
	<div id="page-wrapper">
	
	<!-- Header -->
	<div id="header">

		<!-- Inner -->
		<div class="inner">
			<header>
				<h1><a href="index.html" id="logo">Let's Share</a></h1>
			</header>
		</div>

		<!-- Nav -->
		<nav id="nav">
			<ul>
				<li><a href="index.html">Home</a></li>
				<li><a href="#">구매자 모집</a></li>
				<li><a href="left-sidebar.html">구매 참여</a></li>
				<li><a href="right-sidebar.html">신고 게시판</a></li>
				<li><a href="no-sidebar.html">공지 사항</a></li>
			</ul>
		</nav>

	</div>

<!-- Main -->
<!-- <div class="wrapper style1"> -->
<div id="main">
	<div class="section">
		<h2>이벤트</h2>
			
			<!-- tab_menu 시작 -->
			<ul class="tab_menu">
				<li class="n_menu">
					<a href="">공지사항</a>
				</li>
				<li class="e_menu">
					<a href="">이벤트</a>
				</li>
			</ul>
			<!-- tab_menu 끝 -->
			
			<!-- 내용 시작 -->
			<div class="content_wrap">
				<div class="content">
					<div class="content_header">
						<h3>홈페이지 점검 안내드립니다.</h3>
						<span class="date">2021-01-30</span>
					</div>
					<div class="content_body">
						<pre id="text">
							세상의 모서리 구부정하게 커버린 골칫거리 outsider
							걸음걸이, 옷차림, 이어폰 너머 play list 음악까지 다 minor
							넌 모르지 떨군 고개 위 환한 빛 조명이 어딜 비추는지 느려도 좋으니 결국 알게 되길
							The one and only You are my celebrity 잊지마 넌 흐린 어둠 사이
							왼손으로 그린 별 하나 보이니 그 유일함이 얼마나 아름다운지 말야
							You are my celebrity celebrity You are my celebrity
							지쳐버린 표정 마치 전원을 꺼놓은 듯이 심장소린 too quiet
							네가 가진 반짝거림, 상상력, identity 까지 모조리 diet
							넌 모르지 아직 못다 핀 널 위해 쓰여진 오래된 사랑시 헤매도 좋으니 웃음 짓게 되길
							The one and only You are my celebrity 잊지마 넌 흐린 어둠 사이
							왼손으로 그린 별 하나 보이니 그 유일함이 얼마나
							아름다운지 말야 You are my celebrity 발자국마다 이어진 별자리	
						</pre>
					</div>
					<div class="prevNext">
						<div class="prev_next">
							<span class="next_sel">이전글</span>
							<h4 onclick="Nextmove">공지사항입니다.</h4>
							<span class="date_bottom">2021-01-31</span>
						</div>
						
						<div class="prev_next">
							<span class="next_sel">다음글</span>
							<h4 onclick="Nextmove">등급 관련 안내</h4>
							<span class="date_bottom">2021-01-31</span>
						</div>
					</div>
					
					<!-- 목록버튼 -->
					<div class="list_btn">
						<button onclick="goList()">목록</button>
					</div>
					
					<!-- 수정 버튼 -->
            		<div class="update_btn">
		           	 <button>수정</button>
		           	 <button>삭제</button>
		            </div>
					
					
				
				</div>
		
		</div>			
	</div>
</div>
		
<!-- </div> -->

			<!-- Footer -->
				<div id="footer">
					<div style="text-align: center;">Copyright © 1998-2021 KH Information Educational Institute All Right Reserved</div>
				</div>

		</div>

		<!-- Scripts -->
			<script src="/resources/js/jquery.min.js"></script>
			<script src="/resources/js/jquery.dropotron.min.js"></script>
			<script src="/resources/js/jquery.scrolly.min.js"></script>
			<script src="/resources/js/jquery.scrollex.min.js"></script>
			<script src="/resources/js/browser.min.js"></script>
			<script src="/resources/js/breakpoints.min.js"></script>
			<script src="/resources/js/util.js"></script>
			<script src="/resources/js/main.js"></script>

	</body>
</html>