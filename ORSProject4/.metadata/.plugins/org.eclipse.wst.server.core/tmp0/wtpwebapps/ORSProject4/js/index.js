/*global angular window*/

var app = angular.module('720', [ '720kb.datepicker' ]).controller('TestController',["$scope", function TestController($scope) {

					$scope.minDate = new Date().toString();

					var b = new Date();
					var c = b.getFullYear() - 80;
					$scope.minDate1 = (new Date((new Date().setFullYear(c)))).toString();

					var a = new Date();
					var y = a.getFullYear() - 18;
					$scope.maxDate = (new Date((new Date().setFullYear(y)))).toString();

					// Timetable
					$scope.minDateTime = new Date().toString();

					var b = new Date();
					var c = b.getTime();
					$scope.minDateTime1 = (new Date((new Date().setTime(c)))).toString();

					var a = new Date();
					var y = a.getMonth() + 3;
					$scope.maxDateTime = (new Date((new Date().setMonth(y)))).toString();

				} ]);
