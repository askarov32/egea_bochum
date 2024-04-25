<%@ page import="java.util.ArrayList" %>
<%@ page import="Models.Task" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/links/links.jsp" %>
</head>
<body>
<div class="container">
    <%@include file="navbar.jsp" %>

    <button type="button" class="btn btn-sm btn-success mt-3" data-bs-toggle="modal" data-bs-target="#addTask">
        + add task
    </button>

    <div class="modal fade" id="addTask" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1"
         aria-labelledby="staticBackdropLabel" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered">
            <div class="modal-content text-center">
                <form action="/add-task" method="post">
                    <div class="row">
                        <div class="col-6 text-md-start" >
                            <div class="row">
                                <div class="col-12 mt-3">
                                    <label>name</label>
                                </div>
                                <div class="col-12 mt-3">
                                    <input type='text' name = 'taskName' class='form-control'>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-12 mt-3">
                                    <label>description</label>
                                </div>
                                <div class="col-12 mt-3">
                                    <input type='text' name = 'taskDescription' class='form-control'>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-12 mt-3">
                                    <label>deadline</label>
                                </div>
                                <div class="col-12 mt-3">
                                    <input type='date' name = 'taskDeadline' class='form-control'>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-12 mt-3">
                                    <label>status</label>
                                </div>
                                <div class="col-12 mt-3">
                                    <input type="text" name = 'taskStatus' class='form-control'>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-12 mt-3">
                                    <button type="btn" class="btn btn-secondary">add task</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>


    <table class="table table-striped table-dark table-hover mt-3">
        <thead>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>description</th>
            <th>deadline</th>
            <th>status</th>
            <th style="width: 7%;">details</th>
        </tr>
        </thead>
        <tbody>
        <%
            ArrayList<Task> tasks = (ArrayList<Task>) request.getAttribute("tasks");
            if (tasks != null) {
                for (Task task : tasks) {
        %>
        <tr>
            <td><%=task.getId()%></td>
            <td><%=task.getName()%></td>
            <td><%=task.getDescription()%></td>
            <td><%=task.getDeadlineDate()%></td>
            <td><%=task.getStatus()%></td>
            <td><a href="/task-details?id=<%=task.getId()%>" class="btn btn-sm btn-success">details</a></td>
        </tr>
        <%
                }
            }
        %>
        </tbody>
    </table>
</div>
</body>
</html>
