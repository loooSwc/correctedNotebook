  angular.module('notebookApp',['ngRoute'])
      .config(['$routeProvider', function($routeProvider){
        $routeProvider
        .otherwise({redirectTo:'/login'});
      }])
