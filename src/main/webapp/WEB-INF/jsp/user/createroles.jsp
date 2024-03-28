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
		<main class="mainCont">
			<div>
				<h1
					style="margin-bottom: 30px; text-align: center; font-weight: 600; font-size: 30px">CREATE
					ROLE</h1>
				<div class="container2">
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Name of
							the Role</label> <input id="" name="" type="text" required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8;">
					</div>
					<div></div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Permissions</label>
						<select id="" name=""
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8;">
							<option>Select</option>
							<option>Permission</option>
							<option>Roles</option>
						</select>
					</div>
					<div></div>
				</div>
				<div
					style="margin-top: 50px; display: flex; justify-content: center; gap: 50px;">
					<button
						style="cursor: pointer; background-color: #59f7f1; color: #ffffff; border-radius: 5px; padding: 15px; width: 100px; border: none">Save</button>
					<a href="managecreaterole">
						<button
							style="cursor: pointer; background-color: #12e068; color: #ffffff; border-radius: 5px; padding: 15px; width: 100px; border: none">Manage</button>
					</a>
				</div>
			</div>
		</main>
	</section>
</body>
</html>