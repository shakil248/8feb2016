<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script> -->

<spring:url value="/static/js/lib/angular.js" var="angularJS" />
<spring:url value="/static/js/app.js" var="appJS" />
<spring:url value="/static/js/controller/userController.js" var="userControllerJS" />
<spring:url value="/static/js/service/userService.js" var="userServiceJS" />

<script src="${angularJS}"></script>
<script src="${appJS}"></script>
<script src="${userServiceJS}"></script>
<script src="${userControllerJS}"></script>


</head>
<body  ng-app="upmApp" >
<div ng-controller="userController">
${user.userName}
Name: <input type="text" ng-model="user.userName" />
Email: <input type="text" ng-model="user.emailId" />


<form novalidate class="simple-form">
<!-- LoginId: <input type="text" ng-model="user.loginId" /><br /> -->
    Name: <input type="text" ng-model="user.userName" /><br />
        Email: <input type="text" ng-model="user.emailId" /><br />
    Password: <input type="text" ng-model="user.password" /><br />
     Password: <input type="number" ng-model="user.houseNo" /><br />
      Password: <input type="text" ng-model="user.street" /><br />
       Password: <input type="text" ng-model="user.city" /><br />
        Password: <input type="text" ng-model="user.country" /><br />

    <input type="submit" ng-click="createUser(user)" value="Ok" />
  </form>
  
</div>

</body>
</html>