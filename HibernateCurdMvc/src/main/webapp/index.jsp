<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD APP</title>

<!-- Adding custom styles -->
<style>
    body {
        font-family: Arial, sans-serif;
        background-image: url('https://example.com/your-background-image.jpg'); /* Change to your image URL */
        background-size: cover;
        background-position: center;
        color: white;
        text-align: center;
        padding: 50px;
    }

    h1 {
        font-size: 48px;
        color: #f39c12;
        text-shadow: 2px 2px #000;
    }

    .welcome-message {
        font-size: 28px;
        color: #ecf0f1;
        margin-top: 20px;
        text-shadow: 1px 1px #000;
    }

    .custom-link {
        display: inline-block;
        background-color: #e74c3c;
        color: white;
        padding: 15px 30px;
        font-size: 20px;
        text-decoration: none;
        border-radius: 8px;
        margin-top: 30px;
        box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.3);
    }

    .custom-link:hover {
        background-color: #c0392b;
    }

    .custom-image {
        margin-top: 40px;
        width: 200px;
        height: auto;
        border-radius: 15px;
    }
</style>

</head>
<body>

<!-- Welcome Message -->
<h1>Welcome to the CRUD App</h1>
<p class="welcome-message">Manage your data easily and effectively</p>

<!-- Link to the Employee CRUD App -->
<a href="http://localhost:8080/HibernateCurdMvc/employees" class="custom-link">Click Here to View Employees</a>

<!-- Additional Image Section -->
<div>
    <img src="https://example.com/your-image.jpg" alt="CRUD App Image" class="custom-image"/> <!-- Change to your image URL -->
</div>

</body>
</html>
