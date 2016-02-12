'use strict';
var app = angular.module('loginApp',['ngRoute']);
app.config(['$routeProvider', function($routeProvider) {
      $routeProvider.when('/login', {templateUrl:'resources/partials/login.html', controller: 'loginCtrl'});
      $routeProvider.when('/generatedotp', {templateUrl:'resources/partials/generatedotp.html', controller: 'otpCtrl'});
      $routeProvider.when('/user', {templateUrl:'resources/partials/user.html', controller: 'userCtrl'});
	  $routeProvider.when('/home', {templateUrl:'resources/partials/home.html', controller: 'homeCtrl'});
	  $routeProvider.otherwise({redirectTo:'/login'});
}]);
	







