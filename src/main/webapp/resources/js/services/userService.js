'use strict';
app.factory('userService',['$http', function($http) {
    return {
    	createUser: function(user,scope) { 
    		
    			var res = $http.post('http://localhost:8080/upm/user', user);
    			res.success(function(data, status, headers, config) {
    				  console.log("Success", data);
    				  
    				  scope.saveStatus = "Saved Successfuly";
  					  sessionService.set('user','1001');
  					  $location.path('/home');
  					
    			});
    			res.error(function(data, status, headers, config) {
    				 console.log("Failure");
    				 
    				 scope.saveStatus = "Save UnSuccessful";
 					 $location.path('/login');
    			});	
    			
    			},
    	 getStates: function(scope) {
    		 var res = $http.get('http://localhost:8080/upm/states');
    		 res.success(function(data, status, headers, config) {
				  console.log("Success get States", data);
				  scope.states = data;
			});
			res.error(function(data, status, headers, config) {
				 console.log("Failure get States");
			});	

    	 }
    };
}]);







