'use strict';

angular
    .module('itraproject',['ui.router'])
    .config('homeConfiguration',['$stateProvider','$urlRouterProvider',homeConfiguration])
    .controller('HomeController', [ '$scope', HomeController]);

function homeConfiguration($stateProvider,$urlRouterProvider) {
    $urlRouterProvider.otherwise("/home");
    $stateProvider.state('home', {
            url: '/home',
            templateUrl: 'scripts/home/home.html',
            controller: 'HomeController',
            controllerAs: 'home'
        }
    )
}

function HomeController($scope, $state) {

   }

