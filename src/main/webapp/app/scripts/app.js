angular.module('webappApp')
	.controller('MainCtrl',['$scope','$http','$window','$location',
		function($scope, $http, $window, $location){

		$http({
	    	method: 'POST',
	    	data: {
	    		usuario: $scope.username,
	    		passwors: $scope.password,
	    		status:false
	    	},
	    	url: 'http://localhost:8080/restFull/services/usuario/nombre',
	    }).then(function(dataCP){
	    	console.log(dataCP)
	    });
	    $scope.cambiarPag = function(){
	    	$location.path("/paginaDos");
	    }
	}])