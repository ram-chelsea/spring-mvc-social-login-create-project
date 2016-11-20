(function () {
    'use strict';
    angular.module('itraproject').config(LoginConfiguration).controller('LoginController', LoginController);

    function LoginConfiguration($stateProvider) {
        $stateProvider.state('login', {
                url: 'login',
                templateUrl: 'templates/login.html',
                controller: 'LoginController',
                controllerAs: 'login'
            }
        )
    }

    function LoginController($injector, $scope, $state, authenticationService) {
        var viewModel = this;
        BaseController.call(viewModel, $injector, $scope);
        viewModel.userCredentials = {userName: '', password: '', rememberMe: false};
        viewModel.login = function () {
            authenticationService.login(viewModel.userCredentials).then(function () {
                $state.go('app.home.products.overview.configuration');
            });
        };
    }
}) ();