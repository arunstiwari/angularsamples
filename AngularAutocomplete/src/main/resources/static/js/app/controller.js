'use strict';

angular.module('autocomplete.controller',[]).controller('autocompleteController',['$scope','$http', function($scope,$http){
	
	$http.get("/countries")
	   .success(function(data){
		   $scope.countries = data;
	   })
	   .error(function(data){
		   
	   });
}]);