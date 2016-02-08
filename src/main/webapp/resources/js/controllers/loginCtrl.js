'use strict';
app.controller('loginCtrl', function($scope,$location, loginService,sessionService){
	$scope.loginStatus = "";
	$scope.pw = "";
    $scope.login=function(user){
	user.pass= $scope.pw;
	   loginService.login(user,$scope);
	};
});








