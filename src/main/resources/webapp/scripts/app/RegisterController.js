(function () {
    'use strict';
    angular.module('itraproject', ['ui.router']).config(RegisterConfiguration).controller('RegisterController', [ '$scope', '$state', RegisterController]);


    function RegisterConfiguration($stateProvider) {
        $stateProvider.state('registration', {
            url: '/registration',
            templateUrl: 'scripts/templates/registration.html',
            controller: 'RegisterController',
            controllerAs: 'register'
    }
    )}
    function RegisterController( $scope, $state){

        $scope.addUser = function () {
            $http.post('user', $scope.user).success(function (data) {
                $scope.user = data;
                $scope.user = {};
            });
        };

                };

}) ();
