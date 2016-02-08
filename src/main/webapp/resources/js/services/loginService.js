'use strict';
app.factory('loginService', function($location,$http,sessionService) {
    return {
        login: function(user,scope) { 
		if(user.mail=="a" && user.pass=="a"){
			var s = {stateId:"stateId", stateName:"stateName"};
		var res = $http.post('http://localhost:8080/upm/pop', s);
		res.success(function(data, status, headers, config) {
			  console.log("Success", data);
		});
		res.error(function(data, status, headers, config) {
			 console.log("Failure");
		});	
				scope.loginStatus = "Login Successful";
				sessionService.set('user','1001');
				$location.path('/home');
				
		}else{
				scope.loginStatus = "Login UnSuccessful";
				$location.path('/login');
				
		}
		},
		logout: function(){
				if(sessionService.get('user')){
					sessionService.destroy('user');
					$location.path('/login');
				}
		},
		isLogged: function() {
			if(sessionService.get('user')) {return true;} else {return false;}
		}
		
    };
});







