<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/admin.css" />
<script src="https://kit.fontawesome.com/ae73087723.js"
	crossorigin="anonymous"></script>
<title>Dashboard</title>
</head>
<style>
.container {
	width: 100%;
	height: 100vh;
}

.container2 {
	display: grid;
	grid-template-columns: 1fr 1fr 1fr 1fr;
	grid-gap: 50px;
	margin-left: 20px;
	margin-right: 20px;
	margin-top: 30px;
}

.smallCard {
	width: 100%;
	padding: 30px;
	border-radius: 20px;
	box-shadow: 0 7px 25px rgba(0, 0, 0, 0.08);
	display: flex;
	justify-content: space-between;
	align-items: center;
	cursor: pointer;
}

.smallCard:hover {
	background: #66e0ff;
	transition: .8s ease;
}

.smallCard:hover .cardContent h2 {
	color: white;
}

.smallCard:hover .cardContent span {
	color: white;
}

.smallCard:hover .icons {
	color: white;
}

.cardContent h2 {
	color: #66e0ff;
}

.cardContent span {
	color: gray;
	font-size: 13px;
}

.icons {
	font-size: 5rem;
	color: #66e0ff;
}
</style>
<body>
	<section id="sidebar">
		<div class="brandHead">
			<a href="/" class="brand" style="color: rgb(16, 8, 92);"><img
				src="uploadfiles/logo2.png" style="width: 50px; margin-right: 10px;" />Admin</a>
		</div>
		<ul class="side-menu">
			<li><a href="#" style="color: rgb(16, 8, 92); font-weight: 500"><i
					class="fa-solid fa-user icon"></i>Sub User <i
					class="fa-solid fa-caret-down icon-right"></i></a>
				<ul class="side-dropdown">
					<li><a href="userlist"
						style="color: rgb(16, 8, 92); font-weight: 500"><i
							class="fa-solid fa-list" style="margin-right: 15px"></i>User List</a></li>
					<li><a href="createroles"
						style="color: rgb(16, 8, 92); font-weight: 500"><i
							class="fa-regular fa-user" style="margin-right: 15px"></i>Create
							Roles</a></li>
					<li><a href="createuser"
						style="color: rgb(16, 8, 92); font-weight: 500"><i
							class="fa-solid fa-user-plus" style="margin-right: 15px"></i>Create
							User</a></li>
				</ul></li>
			<li><a href="#" style="color: rgb(16, 8, 92); font-weight: 500"><i
					class="fa-solid fa-clipboard-list icon"></i>Teacher <i
					class="fa-solid fa-caret-down icon-right"></i></a>
				<ul class="side-dropdown">
					<li><a href="addteacher"
						style="color: rgb(16, 8, 92); font-weight: 500"><i
							class="fa-solid fa-plus" style="margin-right: 15px"></i>Create
							Teacher</a></li>
					<li><a href="rolespermission"
						style="color: rgb(16, 8, 92); font-weight: 500"><i
							class="fa-solid fa-person" style="margin-right: 15px"></i>Role/Permission</a></li>
					<li><a href="attendanceofstudents"
						style="color: rgb(16, 8, 92); font-weight: 500"><i
							class="fa-solid fa-clipboard-user" style="margin-right: 15px"></i>Attendance
							of Students</a></li>
				</ul></li>
			<li><a href="#" style="color: rgb(16, 8, 92); font-weight: 500"><i
					class="fa-regular fa-user icon"></i>Student<i
					class="fa-solid fa-caret-down icon-right"></i></a>
				<ul class="side-dropdown">
					<li><a href="addstudents"
						style="color: rgb(16, 8, 92); font-weight: 500"><i
							class="fa-solid fa-person-circle-plus" style="margin-right: 15px"></i>Add
							Students</a></li>
				</ul></li>
			<li><a href="courses"
				style="color: rgb(16, 8, 92); font-weight: 500"><i
					class="fa-solid fa-book" style="margin-left: 12px; font-size: 15px"></i><span
					style="margin-left: 30px">Courses</span></a></li>
			<li><a href="batches"
				style="color: rgb(16, 8, 92); font-weight: 500"><i
					class="fa-solid fa-calendar-days"
					style="margin-left: 12px; font-size: 15px"></i><span
					style="margin-left: 30px">Batches</span></a></li>
			<li><a href="subscription"
				style="color: rgb(16, 8, 92); font-weight: 500"><i
					class="fa-solid fa-cart-plus"
					style="margin-left: 12px; font-size: 15px"></i><span
					style="margin-left: 30px">Subscription</span></a></li>
			<li><a href="#" style="color: rgb(16, 8, 92); font-weight: 500"><i
					class="fa-solid fa-user icon"></i>Study Material<i
					class="fa-solid fa-caret-down icon-right"></i></a>
				<ul class="side-dropdown">
					<li><a href="addcategory"
						style="color: rgb(16, 8, 92); font-weight: 500"><i
							class="fa-solid fa-plus" style="margin-right: 15px"></i>Add
							Category</a></li>
					<li><a href="studymaterial"
						style="color: rgb(16, 8, 92); font-weight: 500"><i
							class="fa-solid fa-book" style="margin-right: 15px"></i>Study
							Material</a></li>
					<li><a href="addmaterial"
						style="color: rgb(16, 8, 92); font-weight: 500"><i
							class="fa-solid fa-address-book" style="margin-right: 15px"></i>Add
							Material</a></li>
				</ul></li>
			<li><a href="#" style="color: rgb(16, 8, 92); font-weight: 500"><i
					class="fa-solid fa-user icon"></i>Allotment to Study Material <i
					class="fa-solid fa-caret-down icon-right"></i></a>
				<ul class="side-dropdown">
					<li><a href="allot"
						style="color: rgb(16, 8, 92); font-weight: 500"><i
							class="fa-regular fa-user" style="margin-right: 15px"></i>Add
							Allotment</a></li>
					<li><a href="addlist"
						style="color: rgb(16, 8, 92); font-weight: 500"><i
							class="fa-solid fa-list" style="margin-right: 15px"></i>Add List</a></li>
				</ul></li>
			<li><a href="attendance"
				style="color: rgb(16, 8, 92); font-weight: 500"><i
					class="fa-solid fa-clipboard-user"
					style="margin-left: 12px; font-size: 15px"></i><span
					style="margin-left: 30px">Attendance of Students</span></a></li>
			<li><a href="enquiry"
				style="color: rgb(16, 8, 92); font-weight: 500"><i
					class="fa-solid fa-phone"
					style="margin-left: 12px; font-size: 15px"></i><span
					style="margin-left: 30px">Enquiry</span></a></li>
			<li><a href="logs"
				style="color: rgb(16, 8, 92); font-weight: 500"><i
					class="fa-solid fa-database"
					style="margin-left: 12px; font-size: 15px"></i><span
					style="margin-left: 30px">Logs</span></a></li>
		</ul>
	</section>

	<section id="content">
		<nav class="navcont">
			<i class="fa-solid fa-bars toggle-sidebar"></i>
			<div class="subnav">
				<ul>
					<li><a href="#"><img src="uploadfiles/logo.png"
							style="width: 300px; margin-top: 10px;" /></a></li>
				</ul>
			</div>

			<div class="profile">
				<img src="uploadfiles/profile.jpg" class="profimg"
					alt="profile-photo">
				<div>
					<ul class="profile-link">
						<li
							style="text-transform: uppercase; font-size: 10.5px; margin-left: 10px; padding: .4rem; font-weight: 600;">
							Welcome!</li>
						<li><a href="#"><i
								class="fa-solid fa-person-running icon"></i>Logout</a></li>
					</ul>
				</div>
			</div>
		</nav>
		<main>
			<div class="container">
				<div class="container2">
					<div class='smallCard' onclick="navigateenroll()">
						<div class='cardContent'>
							<h2>250</h2>
							<span>Total Enrolled Students</span>
						</div>
						<div>
							<i class="fa-solid fa-clipboard-user icons"></i>
						</div>
					</div>
					<div class='smallCard' onclick="navigatetoSubs()">
						<div class='cardContent'>
							<h2>150</h2>
							<span>Total Subscription Students</span>
						</div>
						<div>
							<i class="fa-solid fa-credit-card icons"
								style="font-size: 4.5rem"></i>
						</div>
					</div>
					<div class='smallCard' onclick="navigatetoTeach()">
						<div class='cardContent'>
							<h2>72</h2>
							<span>No of Teachers</span>
						</div>
						<div>
							<i class="fa-solid fa-chalkboard-user icons"></i>
						</div>
					</div>
					<div class='smallCard' onclick="navigatetoCourse()">
						<div class='cardContent'>
							<h2>25</h2>
							<span>Total Courses</span>
						</div>
						<div>
							<i class="fa-solid fa-book-open icons"></i>
						</div>
					</div>
					<div class='smallCard' onclick="navigatetoBatch()">
						<div class='cardContent'>
							<h2>30</h2>
							<span>Total Batches</span>
						</div>
						<div>
							<i class="fa-solid fa-people-group icons"></i>
						</div>
					</div>
					<div class='smallCard' onclick="navigatetoTeach()">
						<div class='cardContent'>
							<h2>5</h2>
							<span>Subscriptions</span>
						</div>
						<div>
							<i class="fa-regular fa-money-bill-1 icons"></i>
						</div>
					</div>
				</div>
			</div>
		</main>
	</section>

	<script>
		function navigateenroll() {
			window.location.href = "enroll";
		}
		function navigatetoSubs() {
			window.location.href = "subs";
		}
		function navigatetoTeach() {
			window.location.href = "manageteacher";
		}
		function navigatetoCourse() {
			window.location.href = "managecourse";
		}
		function navigatetoBatch() {
			window.location.href = "managebatch";
		}
		function navigatetoTeach() {
			window.location.href = "manageteacher";
		}
	</script>
	<script src="js/adminscript.js"></script>
	<script>

	function asideMenu(){
		// Get references to the <li> elements
		
		
		var session = "<%=session.getAttribute("user")%>";
		
		
		const enquiryFormLi = document.getElementById('admin');
		const proposalOrderLi = document.getElementById('marketing');
		const designOrderLi = document.getElementById('Design');
		
	 	enquiryFormLi.style.display = 'none';
	 	proposalOrderLi.style.display = 'none';
	 	designOrderLi.style.display = 'none';
	 	
	   


		// Display the corresponding <li> based on the presence of the elements
		if (session.includes("User Create")) {
		    enquiryFormLi.style.display = 'block'; // Or use 'list-item' to display as a list item
		} 
		
		if (session.includes("Enquiry Form")){
			proposalOrderLi.style.display = 'block';		
		}
		
		if (session.includes("Team Task")){
			designOrderLi.style.display = 'block';
		}

	}



	</script>
</body>
</html>