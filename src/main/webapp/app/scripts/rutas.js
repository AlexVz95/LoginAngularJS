var app = angular
	.module('webappApp', [
		'ngResource',
		'ngSanitize',
		'ngRoute'
	]).config(function ($routeProvider, $provide, $httpProvider){
		$routeProvider
		.when('/', {
			templateUrl: 'welcome.html',
			controller: 'MainCtrl'
		})
		.when('/paginaDos', {
			templateUrl: 'paginaDos.html',
		})

		.otherwise({
			redirectTo: '/'
		});
	});