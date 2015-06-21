var Reminders = angular.module("Reminders", ["ngResource"]).
    config(function($routeProvider) {

        $routeProvider.
                    when('/', { controller: ListCtrl, templateUrl: 'list.html' }).
                    otherwise({ redirectTo: '/' });

        //$scope.templates =
        //    { name: 'navbar.html', url: '/reminders/resources/WEB-INF/pages/navbar.html'};
    });