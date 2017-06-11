angular.module('webappApp')
	.controller('MainCtrl',['$scope','$http','$window','$location',
		function($scope, $http, $window, $location){
		console.log("Success");
		$scope.username = "Alex";
		$scope.password = "12345";
		$http({
	    	method: 'POST',
	    	data: {
	    		usuario: $scope.username,
	    		password: $scope.password,
	    	},
	    	url: 'http://localhost:8080/restFull/services/usuario/nombre',
	    }).then(function(dataCP){
	    	console.log(dataCP)
	    });
		
		$scope.cambiarPag = function(){
			$location.path("/paginaDos");
		}
	}])