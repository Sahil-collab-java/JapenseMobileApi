<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stysheet" href="css/admin.css" />
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
		<main class="mainCont">
			<div>
				<h1
					style="margin-bottom: 30px; text-align: center; font-weight: 600; font-size: 30px">USER
					LIST</h1>
				<div style="margin-bottom: 20px; margin-left: 20px">
					<label class="switch"> <input id="" name="" type="checkbox"
						checked> <span class="slider round"></span>
					</label>
				</div>
				<div class="container2"
					style="padding-left: 20px; padding-right: 20px">
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Name</label> <input id="" name="" type="text" required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8;">
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Email</label> <input id="" name="" type="email" required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8;">
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Mobile Number (Optional)</label> <input id="" name="" type="number"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Role</label> <input id="" name="" type="text" required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8;">
					</div>
				</div>
				<div
					style="display: flex; justify-content: center; margin-top: 40px; gap: 50px;">
					<a href="manageuserlist">
						<button
							style="width: 100px; cursor: pointer; background-color: #59f7f1; color: #ffffff; border-radius: 5px; padding: 12px; border: none">Save</button>
						<button
							style="margin-left: 30px; width: 100px; cursor: pointer; background-color: #20d42c; color: #ffffff; border-radius: 5px; padding: 12px; border: none">Manage</button>
					</a>
				</div>
			</div>
		</main>
	</section>
</body>
</html>