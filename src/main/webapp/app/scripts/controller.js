var app = angular.module("app", ['ngRoute']);
 

app.controller("controlador1", function IndexController($scope, $http) {
    $http.get('http://localhost:8080/restFull/services/usuario').then(function (response) {
        console.log(response, 'res');
        data = response.data;
        console.log(data.usuario);
        console.log(data.password);

        $scope.submit=function(){
        
        }
    //enviamos los datos a la vista con el objeto
    },function(error){
        console.log(error, 'no recibo data');
    });
    
    
});

app.controller("controlador2", function IndexController($scope, $http, $location, $rootScope) {
	
	$scope.submit = function(){
		
	    $scope.parametros = {};
	    $scope.parametros.usuario = $scope.user;
	    $scope.parametros.password = $scope.password;
	    $scope.resultado = '';
	    $http({
	    	url: 'http://localhost:8080/restFull/services/usuario/personas',
	    	method: 'POST',
	    	data: $scope.parametros,
	    }).then(function(data){
	    	if(data.data.estado){
	    		$scope.resultado = "Credenciales correctas";
	    		$rootScope.loggedIn = true;
	    		$location.path('/dashboard');
	    	}else{
	    		
	    		alert("Hay datos invalidos");
	    		$scope.resultado = "Credenciales incorrectas";
	    		$location.path('/');
	    	}
	    	
	    });
	    
	}
});

app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "login2.html"
    })
    .when("/dashboard", {
    	resolve: {
    		"check": function($location, $rootScope){
    			if(!$rootScope.loggedIn){
    				$location.path('/');
    			}
    		}
    	},
    	templateUrl: 'dashboard.html'
    })
    .otherwise ({
        redirectTo: "/"
    });
});

app.config(['$locationProvider', function ($locationProvider) { 
	$locationProvider.html5Mode(false); 
	$locationProvider.hashPrefix(''); 
	}
]);

