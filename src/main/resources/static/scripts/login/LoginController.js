angular
    .module('itraproject',[])
    .config(loginConfiguration)
    .controller('LoginController', LoginController);

function loginConfiguration($stateProvider) {
    $stateProvider.state('login', {
            url: '/login',
            templateUrl: 'scripts/login/login.html',
            controller: 'LoginController',
            controllerAs: 'log'
        }
    )
}

    function LoginController($scope, $rootScope, $location, AuthenticationService) {
        AuthenticationService.ClearCredentials();

        $scope.login = function () {
            $scope.dataLoading = true;
            AuthenticationService.Login($scope.username, $scope.password, function(response) {
                if(response.success) {
                    AuthenticationService.SetCredentials($scope.username, $scope.password);
                    $location.path('/');
                } else {
                    $scope.error = response.message;
                    $scope.dataLoading = false;
                }
            });
        };
    }


