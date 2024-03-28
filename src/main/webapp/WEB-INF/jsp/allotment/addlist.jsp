<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">


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

.container3 {
	display: grid;
	grid-template-columns: 1fr 1fr;
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
		<div>
			<h1
				style="margin-bottom: 30px; text-align: center; font-weight: 600; font-size: 30px">ADD
				LIST</h1>
			<div class="container2" style="margin-left: 20px; margin-right: 20px">
				<div style="display: flex; flex-direction: column;">
					<label style="font-size: 13px; margin-bottom: 7px">Select
						Course</label> <select id="myDropdown" name=""
						style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8;">
						<option>Select</option>
						<option value="1">Enrolled Students</option>
						<option value="2">Subscription Students</option>
					</select>
				</div>
			</div>
		</div>
		<div class="modal fade" id="myModal1">
			<div class="modal-dialog modal-dialog-scrollable">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title">Enrolled Students</h4>
					</div>
					<div class="modal-body">
						<div class="container3" style="">
							<div style="display: flex; flex-direction: column;">
								<label style="font-size: 13px; margin-bottom: 7px">Select
									Course</label> <select id="" name=""
									style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8;">
									<option>Select</option>
									<option>Permission</option>
									<option>Roles</option>
								</select>
							</div>
							<div style="display: flex; flex-direction: column;">
								<label style="font-size: 13px; margin-bottom: 7px">Select
									Batch</label> <select id="" name=""
									style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8;">
									<option>Select</option>
									<option>Permission</option>
									<option>Roles</option>
								</select>
							</div>
							<div style="display: flex; flex-direction: column;">
								<label style="font-size: 13px; margin-bottom: 7px">Select
									Study Material</label> <input id="" name="" type="text"
									required="required"
									style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
							</div>
							<div style="display: flex; flex-direction: column;">
								<label style="font-size: 13px; margin-bottom: 7px">Select
									Date</label> <input id="" name="" type="date" required="required"
									style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
							</div>

							<div style="display: flex; flex-direction: column;">
								<label style="font-size: 13px; margin-bottom: 7px">Select
									Starting Time</label> <input id="" name="" type="text"
									required="required"
									style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
							</div>
							<div style="display: flex; flex-direction: column;">
								<label style="font-size: 13px; margin-bottom: 7px">Select
									Expire Date and Time</label> <input id="" name="" type="text"
									required="required"
									style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
							</div>
						</div>
						<div
							style="display: flex; justify-content: center; gap: 50px; margin-top: 30px">
							<button
								style="cursor: pointer; background-color: #59f7f1; color: #ffffff; border-radius: 5px; padding: 10px; width: 100px; border: none">Submit</button>
							<a href="manageaddmaterial">
								<button type="button" data-dismiss="modal"
									style="cursor: pointer; background-color: red; color: #ffffff; border-radius: 5px; padding: 10px; width: 100px; border: none">Close</button>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="modal fade" id="myModal2">
			<div class="modal-dialog modal-dialog-scrollable">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title">Subscription Students</h4>
					</div>
					<div class="modal-body">
						<div class="container3" style="">
							<div style="display: flex; flex-direction: column;">
								<label style="font-size: 13px; margin-bottom: 7px">Select
									Course</label> <select id="" name=""
									style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8;">
									<option>Select</option>
									<option>Permission</option>
									<option>Roles</option>
								</select>
							</div>
							<div style="display: flex; flex-direction: column;">
								<label style="font-size: 13px; margin-bottom: 7px">Select
									Date</label> <input id="" name="" type="date" required="required"
									style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
							</div>

							<div style="display: flex; flex-direction: column;">
								<label style="font-size: 13px; margin-bottom: 7px">Select
									Starting Time</label> <input id="" name="" type="text"
									required="required"
									style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
							</div>
							<div style="display: flex; flex-direction: column;">
								<label style="font-size: 13px; margin-bottom: 7px">Select
									Expire Date and Time</label> <input id="" name="" type="text"
									required="required"
									style="padding: 10px; border-radius: 5px; border: 1px solid #bfb8b8">
							</div>
						</div>
						<div
							style="display: flex; justify-content: center; gap: 50px; margin-top: 30px">
							<button
								style="cursor: pointer; background-color: #59f7f1; color: #ffffff; border-radius: 5px; padding: 10px; width: 100px; border: none">Submit</button>
							<a href="manageaddmaterial">
								<button type="button" data-dismiss="modal"
									style="cursor: pointer; background-color: red; color: #ffffff; border-radius: 5px; padding: 10px; width: 100px; border: none">Close</button>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Include Bootstrap JS -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


	<script>
		$(document).ready(function() {
			// Handle dropdown change event
			$('#myDropdown').change(function() {
				var selectedOption = $(this).val();
				// Show respective modal based on the selected option
				if (selectedOption === "1") {
					$('#myModal1').modal('show');
				} else if (selectedOption === "2") {
					$('#myModal2').modal('show');
				} else {
					// Handle other options if needed
				}
			});
		});
	</script>
</body>
</html>