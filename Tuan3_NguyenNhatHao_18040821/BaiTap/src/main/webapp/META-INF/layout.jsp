<%-- 
    Document   : layout
    Created on : Mar 23, 2021, 1:19:31 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="<c:url value="'/resources/css/example.css'">"/>
        <title> Insert title here </title>
            
    </head>
    <body>
        <header>
            <<img src="<c:url value='/resources/images/logo5b.png'/>" alt="alt"/>
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
                                <tr>
                                        <th>MSSV</th>
                                        <th>Họ Tên</th>
                                        <th>Giới Tính</th>
                                        <th>SDT</th>
                                </tr>
                                <tr>
                                        <td>123456</td>
                                        <td>Trân Minh Tuấn</td>
                                        <td>nam</td>
                                        <td>09000056</td>
                                </tr>
                                <tr>
                                        <td>223456</td>
                                        <td>Nguyễn Quốc An</td>
                                        <td>nam</td>
                                        <td>09000056</td>
                                </tr>
                                 <tr>
                                        <td>223456</td>
                                        <td>Nguyễn Quốc Anh</td>
                                        <td>nam</td>
                                        <td>09000056</td>
                                </tr>
                    </table>
            </section>
        <aside id="sidebarB">
                      <h2>Midterm Information</h2>
        </aside> 
                    <footer>
                    <p>Student's name: Lam Minh Anh - 1900000</p>
                    </footer>
    </body>
</html>
