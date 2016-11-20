

var app = angular.module('itraproject', ['ui.router']);




                  app.controller.('AppController',[$scope, $location, redirectToRegistrationPage()]);

                  $scope.redirectToRegistrationPage = function() {
                      $location.url('/registration');



          
        };

