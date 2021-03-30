<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<c:set var = "page" value = "<%= request.getParameter(\"page\") %>"/>

<div class="nav">
    <a href="<%=request.getContextPath()%>?page=home">
        <div class="links<c:if test="${page=='home'}"> active</c:if>">My Profile</div>
    </a>
    <a href="<%=request.getContextPath()%>/register?page=register">
        <div class="links<c:if test="${page=='register'}"> active</c:if>">Add User</div>
    </a>
    <a href="<%=request.getContextPath()%>/employee?page=view">
        <div class="links<c:if test="${page=='view'}"> active</c:if>">View Users</div>
    </a>
</div>