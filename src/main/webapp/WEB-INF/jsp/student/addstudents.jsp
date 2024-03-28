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
					style="margin-bottom: 30px; text-align: center; font-weight: 600; font-size: 30px">ADD
					STUDENT</h1>
				<div style="margin-bottom: 30px; margin-left: 30px">
					<label class="switch"> <input id="" name="" type="checkbox"
						checked> <span class="slider round"></span>
					</label>
				</div>
				<div class="container2"
					style="margin-left: 20px; margin-right: 20px">
					<div
						style="display: flex; flex-direction: column; margin-bottom: 20px">
						<label style="font-size: 13px; margin-bottom: 7px">Select
							Category</label> <select id="" name=""
							style="padding: 10px; border-radius: 5px; border-color: #bfb8b8">
							<option>Select</option>
							<option>Kids</option>
							<option>Professional</option>
							<option>Others</option>
						</select>
					</div>
					<div
						style="display: flex; flex-direction: column; margin-bottom: 20px">
						<label style="font-size: 13px; margin-bottom: 7px">Select
							Title</label> <select id="" name=""
							style="padding: 10px; border-radius: 5px; border-color: #bfb8b8">
							<option>Select</option>
							<option>Mr.</option>
							<option>Mrs</option>
							<option>Miss</option>
						</select>
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							First Name</label> <input id="" name="" type="text" required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8;">
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Last Name</label> <input id="" name="" type="email" required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Birth Date</label> <input id="" name="" type="date" required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Mobile No. with Country Code</label> <input id="" name="" type="number"
							required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							WhatsApp with Country Code</label> <input id="" name="" type="number"
							required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Current Location Country </label> <input id="" name="" type="text"
							required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Nationality</label> <input id="" name="" type="text" required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Current Japanese Skill</label> <input id="" name="" type="text"
							required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Nationality</label> <input id="" name="" type="text" required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Current Japanese Skill</label> <input id="" name="" type="text"
							required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Note </label> <input id="" name="" type="text" required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Preferable Course</label> <input id="" name="" type="text"
							required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Select
							Course</label> <select id="" name=""
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
							<option>Select</option>
							<option>Course1</option>
							<option>Course2</option>
							<option>Course3</option>
						</select>
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Select
							Batch</label> <select id="" name=""
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
							<option>Select</option>
							<option>Batch1</option>
							<option>Batch2</option>
							<option>Batch3</option>
						</select>
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Email Id</label> <input id="" name="" type="email" required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
					</div>
					<div style="display: flex; flex-direction: column;">
						<label style="font-size: 13px; margin-bottom: 7px">Enter
							Password</label> <input id="" name="" type="password" required="required"
							style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
					</div>
				</div>
				<div
					style="display: flex; justify-content: center; gap: 50px; margin-top: 30px">
					<button
						style="cursor: pointer; background-color: #59f7f1; color: #ffffff; border-radius: 5px; padding: 15px; width: 100px; border: none">Save</button>
					<a href="managestudents">
						<button
							style="cursor: pointer; background-color: #12e068; color: #ffffff; border-radius: 5px; padding: 15px; width: 100px; border: none">Manage</button>
					</a>
				</div>
			</div>
		</main>
	</section>
</body>
</html>