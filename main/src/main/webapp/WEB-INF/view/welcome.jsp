<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Angular 6 Spring Mvc Example</title>

    <!-- AngularJs Javascript File -->
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>

    <!-- Bootstrap Css -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script type="text/javascript">
        var app = angular.module("app", []);

        app.controller("ctrl", ['$scope', '$http', function($scope, $http) {
            $scope.err_state = false; // Set the default error message state
            var fetch_usr_app_url = 'http://localhost:8080/userlist'; // Set the application url to fetch the user details

            // Fetches the data from the Spring controller
            $scope.getData = function() {
                $http({
                    method: "GET",
                    url: fetch_usr_app_url
                }).then(function(response) {
                    $scope.users = response.data;
                    console.log("Success");
                }, function(response) {
                    $scope.err_state = true;
                    console.log("Failure");
                });
            };
        }]);
    </script>
</head>
<body>
<div id="angularSpring" class="container">
    <h1 align="center" class="text-primary">Angular - Spring Mvc Example</h1>
    <hr />

    <!------ AngularJs and Spring Mvc Example ------>
    <div ng-app="app" ng-controller="ctrl">
        <button id="submit_btn" class="btn btn-primary" ng-click="getData()">Get Users</button>
        <div> </div>

        <!-- Success Response -->
        <div class="user_details" ng-repeat="user in users" ng-show="user != null">
            <p>Name: {{ user.name }} <br> E-Mail: {{ user.email }}</p>
        </div>
        <!-- Error Response -->
        <div id="showError" ng-show="err_state">
            <span class="text-danger">Error in retrieving data!</span>
        </div>
    </div>
</div>
</body>
</html>
