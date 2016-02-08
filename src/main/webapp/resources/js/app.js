'use strict';
var app = angular.module('loginApp',['ngRoute']);
app.config(['$routeProvider', function($routeProvider) {
        
		
      $routeProvider.when('/login', {templateUrl:'resources/partials/login.html', controller: 'loginCtrl'});
      $routeProvider.when('/user', {templateUrl:'resources/partials/user.html', controller: 'userCtrl'});
	   $routeProvider.when('/home', {templateUrl:'resources/partials/home.html', controller: 'homeCtrl'});
	  $routeProvider.otherwise({redirectTo:'/login'});
    }]);
	
app.run(function($rootScope, $location, loginService){
	var routepermission=['/home'];
	
	$rootScope.$on('$routeChangeStart', function(){
		if(routepermission.indexOf($location.path())!=-1 && !loginService.isLogged()){
			$location.path='/login';
		}
	});
});







