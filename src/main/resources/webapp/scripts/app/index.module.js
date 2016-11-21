

var App = angular.module('itraproject',['ui.router']);

App.config(['$stateProvider', '$urlRouterProvider','$state', function($stateProvider, $urlRouterProvider){

    $urlRouterProvider.otherwise("/")

    $stateProvider
        .state('login', {
            url: '/login',
            templateUrl: 'scripts/templates/login.html',
            controller: 'LoginController'
        })
        .state('registration', {
            url: "/registration",
            templateUrl: "scripts/templates/registration.html",
            controller: 'RegisterController'

            })


}]);