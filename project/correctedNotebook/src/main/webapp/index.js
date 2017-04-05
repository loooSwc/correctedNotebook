  angular.module('notebookApp',['ngRoute'])
      .config(['$routeProvider', function($routeProvider){
        $routeProvider
            .when('/login',{
                templateUrl: 'views/sys/login/login.html',
                controller: 'LoginCtrl'
            })
            .otherwise({redirectTo:'/login'});
      }])
      .controller('LoginCtrl', function($http) {
          $http.post('customer/addCustomer.do').then(function (response) {
              console.info(response);
          })
      })