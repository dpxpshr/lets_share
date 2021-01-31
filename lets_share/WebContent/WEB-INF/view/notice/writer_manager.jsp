<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/include/head.jsp" %>
<head>
		<title>Let's Share</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="/resources/css/main.css" />
		<link rel="stylesheet" href="../../../resources/css/notice/writer_manager.css" />
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
		<h2>게시판</h2>
		
	<div class="content_wrap">
		<div class="content">
		
			<form id="insertForm">
        		<div class="form form_title">
        			<div class="title_wrap">
						<div class="form_space">제목</div>
					</div>
					<input type="text" placeholder="제목을 작성해주세요."/>
          		</div>
				<div class="form form_writer">
		            <div class="form_space">작성자</div>
		            <input type="text" placeholder="이름을 적어주세요."/>
				</div>
				<div class="form form_content">
		            <div class="form_space">내용</div>
		            <textarea name="contents" rows="10"></textarea>
				</div>
	    	</form>
		
			<!-- submit 버튼 -->
			<div class="submits">
				<button type="submit" class="write_btn">작성</button>
		        <button type="submit" class="save_btn">임시저장</button>
			</div>
			
			<!-- 파일선택 -->
			<div class="file_sel">
				<input type="file" name="files"/>
			</div>
			<br>
			<!-- 목록버튼 -->
			<div class="list_btn">
				<button>목록</button>
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