'use strict';
var upmApp = angular.module('upmApp',[]);

upmApp.config(
        function( $routeProvider ) {
            $routeProvider
                .when(
                    "/test",
                    {
                    	 redirectTo: "/test"
                    }
                )
        } );
