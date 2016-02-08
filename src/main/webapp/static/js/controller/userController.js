'use strict';
 
upmApp.controller('userController', ['$scope', 'userService', function($scope, userService) {
	
//	 var self = this;
//     self.user={loginId:null,userName:'',emailId:'',password:''};
	
     $scope.createUser = function(user){
    	 userService.createUser(user);
//    	 userService.getUser();
//    	 userService.testPost();
               
     };

	
}]);
