'use strict';

var App = angular.module('itraproject',['ui.router']);

App.config(['$stateProvider', '$urlRouterProvider','$state', function($stateProvider, $urlRouterProvider){

    $urlRouterProvider.otherwise("/")

    $stateProvider
        // .state('home', {
        //     url: '/',
        //     templateUrl: 'static/index.html',
        //     controller: 'HomeController'
        // })
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