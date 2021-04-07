<%--<%@page import="entity.Student"%> --%>
<%@page contentType="text/html ; charset=UTF-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="<c:url value='/resources/css/example.css'/> ">
        <meta charset="UTF-8">
        <title>Insert title here</title>

    </head>
    <body>
        <header>
            <img src="<c:url value='/resources/images/logo5b.png'/>" 
                 alt="Software Enginerring Logo" width="80">
            <h1>IT Department</h1>
            <h2>Software Engineering</h2>
        </header>
        <nav id="nav_bar">
            <ul>
                <li><a href="<c:url value='/admin'/>">
                        Admin</a></li>
                <li><a href="<c:url value='/user/deleteCookies'/>">
                        Delete Cookies</a></li>
                <li><a href="<c:url value='/order/Login'/>">
                        Login</a></li>
            </ul>
        </nav>
        <aside id="sidebarA">
            <div><a href="MessageServlet">List of Students</a></div><br>
            <div><a href="/GiuaKy/AddStudent">Add a new student</a></div><br>
        </aside>
        <section>
            <table>
<!--                <tr>
                    <th>MSSV</th>
                    <th>Họ Tên</th>
                    <th>Giới Tính</th>
                    <th>SDT</th>
                </tr>
                <tr>
                    <td>18040987</td>
                    <td>Trần Thành Hải</td>
                    <td>nam</td>
                    <td>09000056</td>
                </tr>
                <tr>
                    <td>18040314</td>
                    <td>Phùng Minh Thoại</td>
                    <td>nam</td>
                    <td>09000056</td>
                </tr>
                <tr>
                    <td>223456</td>
                    <td>Nguyễn Quốc Anh</td>
                    <td>nam</td>
                    <td>09000056</td>
                </tr>-->
                
<img src="<c:url value='/resources/images/logo5.jpg'>" width="width" height="height" alt="alt"/>
            </table>
        </section>
        <aside id="sidebarB">
            <h2>Midterm Information</h2>
        </aside> 
        <footer>
            <p>Student's name: Nguyễn Nhật Hào - 18040821</p>
        </footer>
    </body>
</html>