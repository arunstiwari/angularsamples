'use strict';

angular.module('myApp', ['ui.bootstrap', 'ngRoute', 'myApp.controllers']).config(function($routeProvider) {  
  $routeProvider.when('/issue/:issue', {templateUrl: 'js/app/views/view-issue.tpl'});
	$routeProvider.otherwise({redirectTo: '/'});
});