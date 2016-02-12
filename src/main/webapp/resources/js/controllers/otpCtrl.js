'use strict';
app.controller('otpCtrl', function($scope,$location, loginService,sessionService){
	
	$scope.lId = sessionService.get('loginId');
	loginService.generateotp($scope.lId).then(function(obj) {
        $scope.otp=obj;
    });
	
});








