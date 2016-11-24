(function () {
    'use strict';
    angular
        .module('itraproject',[])
        .config('registrationConfiguration',registrationConfiguration)
        .controller('RegistrationController', RegistrationController);

    function registrationConfiguration($stateProvider) {
        $stateProvider.state('registration', {
                url: '/registration',
                templateUrl: 'scripts/registration/registration.html',
                controller: 'RegistrationController',
                controllerAs: 'reg'
            }
        )
    }

    function RegistrationController($scope, $state, $http) {
        var vm = this;
        vm.user = {};

        vm.addUser = function () {
            $http({
                method: 'POST',
                url: 'http://localhost:8080/registration/add',
                data: vm.user
            }).then(function (response) {

            });
        };

    }

})();
