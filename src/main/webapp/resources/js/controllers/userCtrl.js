'use strict';
app.controller('userCtrl', function($scope,userService){
	$scope.saveStatus = "";
	$scope.states = "";
	
	
    $scope.createUser=function(user){
	   userService.createUser(user,$scope);
	};
	
	 $scope.getStates=function(){
		   userService.getStates($scope);
	};
	
	$scope.getStates();
	
});
