<%@ page import="Models.News" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update News</title>
    <%@include file="/links/links.jsp"%>
</head>
<body>

<form action="/news-update" method="post">
    <div class="row justify-content-center">
        <div class="col-6">
            <%
                News news1 = (News) request.getAttribute("new");
                if (news1 != null) {
            %>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>id</label>
                </div>
                <div class="col-12 mt-3">
                    <input type="text" name="newsId" value="<%=news1.getId()%>" class="form-control">
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>name</label>
                </div>
                <div class="col-12 mt-3">
                    <input type="text" name="newsName" value="<%=news1.getName()%>" class="form-control">
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>content</label>
                </div>
                <div class="col-12 mt-3">
                    <input type="text" name="newsContent" value="<%=news1.getContent()%>" class="form-control">
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>date</label>
                </div>
                <div class="col-12 mt-3">
                    <input type="text" name="newsDate" value="<%=news1.getDate()%>" class="form-control">
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <button class="btn btn-sm btn-success">update</button>
                </div>
            </div>
            <%
                }
                assert news1 != null;%>
        </div>
    </div>
</form>

<form action="/news-delete" method="post">
    <div class="row justify-content-center">
        <div class="col-6">
                <input type="hidden" name="newsId" value="<%=news1.getId()%>">
                <button class="btn btn-danger btn-sm" style="width: 65px">delete</button>
        </div>
    </div>
</form>
</body>
</html>