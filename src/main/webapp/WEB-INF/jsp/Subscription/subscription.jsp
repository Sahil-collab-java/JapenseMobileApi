<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.Container {
	width: 100%;
	height: 100vh;
}

.container2 {
	display: grid;
	grid-template-columns: 1fr 1fr 1fr 1fr;
	grid-gap: 30px;
}

@media screen and (max-width: 1000px) {
	.container2 {
		grid-template-columns: 1fr;
	}
}
</style>
<body>
	<jsp:include page="../sidenav.jsp" />
	<section id="content">
		<jsp:include page="../navbar.jsp" />
		<main>
			<div>
				<h1
					style="margin-bottom: 30px; text-align: center; font-weight: 600; font-size: 30px">SUBSCRIPTION</h1>
			</div>
		</main>
	</section>
</body>
</html>