(function () {
    'use strict';
    angular.module('itraproject', ['ui.router']).config(LoginConfiguration).controller('LoginController', LoginController);

    function LoginConfiguration($stateProvider) {
        $stateProvider.state('login', {
                url: '/login',
                templateUrl: 'scripts/templates/login.html',
                controller: 'LoginController',
                controllerAs: 'login'
            }
        )
    }

    function LoginController($scope, $state) {

    }
}) ();