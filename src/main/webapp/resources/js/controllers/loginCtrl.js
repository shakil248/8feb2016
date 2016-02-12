'use strict';
app.controller('loginCtrl', function($scope,$location, loginService,sessionService){
	
	$scope.loginId=sessionService.get('loginId');
	$scope.password;
	$scope.generatedOTP;
	$scope.loginStats;
	
    $scope.login=function(){
	   loginService.login($scope);
	};
	
    $scope.generateotp=function(){
		 sessionService.set('loginId',$scope.loginId);
		 $location.path('/generatedotp');
	};
});








