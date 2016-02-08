'use strict';
app.controller('homeCtrl', function($scope, loginService){
	$scope.txt = "Home";
	$scope.logout=function(){
	loginService.logout();
	}
});








