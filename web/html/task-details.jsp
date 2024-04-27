<%@ page import="Models.Task" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/links/links.jsp"%>
</head>
<body>
<%@include file="navbar.jsp" %>
<form action="/task-update" method="post">
    <div class="row justify-content-center">
        <div class="col-6">
            <%
                Task task = (Task) request.getAttribute("task");
                if (task != null) {
            %>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>name</label>
                </div>
                <div class="col-12 mt-3">
                    <input type="text" name="taskName" value="<%=task.getName()%>" class="form-control">
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>description</label>
                </div>
                <div class="col-12 mt-3">
                    <input type="text" name="taskDescription" value="<%=task.getDescription()%>" class="form-control">
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>deadline date</label>
                </div>
                <div class="col-12 mt-3">
                    <select class="form-control" name="taskDeadline">

                        <% ArrayList<Task> tasks = (ArrayList<Task>) request.getAttribute("taski");
                            if (tasks != null) {
                                for (Task task1 : tasks) {
                        %>
                        <option value="<%=task1.getId()%>"><%=task.getName()%></option>
                        <%
                                }
                            }
                        %>
                    </select>
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>status</label>
                </div>
                <div class="col-12 mt-3">
                    <input type="text" name="taskStatus" value="<%=task.getStatus()%>" class="form-control">
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <button class="btn btn-sm btn-success">update</button>
                </div>
            </div>
            <%
                }
                assert task != null;%>
        </div>
    </div>
</form>
<form action="/task-delete" method="post">
    <input type="hidden" name="taskId" value="<%=task.getId()%>">
    <button class="btn btn-danger btn-sm"style="margin-left: 390px; width: 60px" >delete</button>
</form>
</body>
</html>