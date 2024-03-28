<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheeet" href="css/admin.css" />
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
			<div class="Container">
				<h1
					style="margin-bottom: 30px; text-align: center; font-weight: 600; font-size: 30px">CREATE
					USER</h1>
				<div class="container2">
					<div
						style="display: flex; flex-direction: column; padding-left: 15px;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Name</label> <input id="" name="" type="text" required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8;">
					</div>
					<div
						style="display: flex; flex-direction: column; padding-left: 15px;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Email</label> <input id="" name="" type="email" required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8;">
					</div>
					<div
						style="display: flex; flex-direction: column; padding-left: 15px;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Password</label> <input id="" name="" type="password"
							style="padding: 10px; border: 2px solid black; border-radius: 5px; border: 1px solid #bfb8b8;">
					</div>
					<div
						style="display: flex; flex-direction: column; padding-left: 15px;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Confirm Password</label> <input id="" name="" type="password"
							required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8;">
					</div>
					<div
						style="display: flex; flex-direction: column; padding-left: 15px;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Mobile Number</label> <input id="" name="" type="number"
							required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8;">
					</div>
					<div
						style="display: flex; flex-direction: column; padding-left: 15px;">
						<label style="font-size: 13px; margin-bottom: 7px">Email
							Verification</label> <input id="" name="" type="text" readonly="readonly"
							required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8;">
					</div>
					<div
						style="display: flex; flex-direction: column; padding-left: 15px;">
						<label style="font-size: 13px; margin-bottom: 7px">Role</label> <input
							id="" name="" type="text" required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8;">
					</div>
				</div>
				<div
					style="display: flex; justify-content: center; margin-top: 30px">
					<button
						style="cursor: pointer; background-color: #59f7f1; color: #ffffff; border-radius: 5px; padding: 15px; width: 100px; border: none">Save</button>
				</div>
			</div>
		</main>
	</section>
</body>
</html>