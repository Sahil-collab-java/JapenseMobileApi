<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href = "css/admin.css"/>
<script src="https://kit.fontawesome.com/ae73087723.js" crossorigin="anonymous"></script>
</head>
<body>
<section id="sidebar">
        <div class="brandHead">
            <a href="#" class="brand" style=" color: rgb(16, 8, 92);"><img src="uploadfiles/logo2.png"
                    style="width: 50px; margin-right: 10px;" />Admin</a>
        </div>
        <ul class="side-menu">
            <li>
                <a href="#" style=" color: rgb(16, 8, 92);"><i
                        class="fa-solid fa-screwdriver-wrench icon"></i>Configuration <i
                        class="fa-solid fa-caret-down icon-right"></i></a>
                <ul class="side-dropdown">
                    <li><a href="#" style=" color: rgb(16, 8, 92);">Company Settings</a></li>
                    <li><a href="#" style=" color: rgb(16, 8, 92);">Add FY Master</a></li>
                    <li><a href="#" style=" color: rgb(16, 8, 92);">Branch Creation</a></li>
                </ul>
            </li>
            <li>
                <a href="#" style=" color: rgb(16, 8, 92);"><i class="fa-solid fa-clipboard-list icon"></i>Report <i
                        class="fa-solid fa-caret-down icon-right"></i></a>
                <ul class="side-dropdown">
                    <li><a href="#" style=" color: rgb(16, 8, 92);">NDH-1</a></li>
                    <li><a href="#" style=" color: rgb(16, 8, 92);">NDH-2</a></li>
                    <li><a href="#" style=" color: rgb(16, 8, 92);">NDH-3</a></li>
                </ul>
            </li>
            <li>
                <a href="#" style=" color: rgb(16, 8, 92);"><i class="fa-regular fa-user icon"></i>Client Section <i
                        class="fa-solid fa-caret-down icon-right"></i></a>
                <ul class="side-dropdown">
                    <li><a href="#" style=" color: rgb(16, 8, 92);">Add Client</a></li>
                    <li><a href="#" style=" color: rgb(16, 8, 92);">Add Client KYC</a></li>
                    <li><a href="#" style=" color: rgb(16, 8, 92);">Client Summary</a></li>
                </ul>
            </li>
        </ul>
    </section>
    <script src="js/adminscript.js"></script>
</body>
</html>