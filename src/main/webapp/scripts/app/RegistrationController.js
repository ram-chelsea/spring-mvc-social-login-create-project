
    angular.module('itraproject').config(RegisterConfiguration).controller('RegisterController', [ '$scope', '$state', RegisterController]);


    function RegisterConfiguration($stateProvider) {
        $stateProvider.state('registration', {
            url: 'registration',
            templateUrl: 'templates/registration.html',
            controller: 'RegisterController',
            controllerAs: 'register'
    }
    )}
    function RegisterController( $scope, $state){
        var viewModel = this;

        var userManagementService = $injector.get("UserManagementService", null);

        viewModel.userData = {};
        viewModel.registerUser = function() {
            checkName().then(function (response) {
                if (!response.result) {
                    registerUser();
                } else {
                    dialogs.notify("Warning!", "This username is already occupied!", {windowClass: "dialog-cc dialog-cc-notification"});
                }
            });
        };

        function registerUser() {
            viewModel.userData.selectedAuthorities = [];
            var addedUser = userRepository.(viewModel.userData);
            return userManagementService.signUp(addedUser).then(function () {
                $state.go('app.login');
            });
        }

        function checkName() {
            return userManagementService.checkName(viewModel.userData.userName);
        }
    }
    SignupController.prototype = Object.create(BaseController.prototype);
