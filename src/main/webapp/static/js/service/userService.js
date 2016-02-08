'use strict';
 
upmApp.factory('userService', ['$http', '$q', function($http, $q){
	
	   return {
	         
           getUser: function() {
                   return $http.get('http://localhost:8080/upm/user/')
                           .then(
                                   function(response){
                                       return response.data;
                                   }, 
                                   function(errResponse){
                                       console.error('Error while fetching users');
                                       return $q.reject(errResponse);
                                   }
                           );
           },
            
           createUser: function(user){
        	 
        	   
        	
        	   var res = $http.post('http://localhost:8080/upm/user',user);
       		res.success(function(data, status, headers, config) {
       				
       			  console.log("Success", data);
       		});
       		res.error(function(data, status, headers, config) {
       			 console.log(data);
       		});	
//                   return $http.post('http://localhost:8080/upm/user/', user)
//                           .then(
//                                   function(response){
//                                       return response.data;
//                                   }, 
//                                   function(errResponse){
//                                       console.error('Error while creating user');
//                                       return $q.reject(errResponse);
//                                   }
//                           );
           },
            
           updateUser: function(user, id){
                   return $http.put('http://localhost:8080/Spring4MVCAngularJSExample/user/'+id, user)
                           .then(
                                   function(response){
                                       return response.data;
                                   }, 
                                   function(errResponse){
                                       console.error('Error while updating user');
                                       return $q.reject(errResponse);
                                   }
                           );
           },
            
           deleteUser: function(id){
//                   return $http.delete('http://localhost:8080/Spring4MVCAngularJSExample/user/'+id)
//                           .then(
//                                   function(response){
//                                       return response.data;
//                                   }, 
//                                   function(errResponse){
//                                       console.error('Error while deleting user');
//                                       return $q.reject(errResponse);
//                                   }
//                           );
           }
           ,
           testPost: function(){
        	   var res = $http.post('http://localhost:8080/upm/poster', "abdul");
          		res.success(function(data, status, headers, config) {
          			  console.log("Success", data);
          		});
          		res.error(function(data, status, headers, config) {
          			 console.log(data);
          		});	
     }
        
   };
	
}]);
