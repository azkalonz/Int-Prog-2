<jsp:include page="/WEB-INF/layout/header.jsp" />
  <div class="formCon">
     <form action="<%= request.getContextPath() %>/register" method="post">
         <h1>User Registration</h1>
         <br>
         <div class="inputCon">
             <span>First Name: </span>
             <input type="text" name="firstname" required>
         </div>
         <div class="inputCon">
             <span>Last Name:</span>
             <input type="text" name="lastname" required>
         </div>
         <div class="inputCon">
             <span>Middle Initial: </span>
             <input type="text" name="mi" required>
         </div>
         <div class="inputCon">
             <span>Email: </span>
             <input type="email" name="email" required>
         </div>
         <div class="inputCon">
             <span>Username: </span>
             <input type="text" name="username" required>
         </div>
         <div class="inputCon">
             <span>Password: </span>
             <input type="password" name="password" required>
         </div>
         <br>
         <button>Register</button>
     </form>
 </div>
<jsp:include page="/WEB-INF/layout/footer.jsp" />