function Hello($scope, $http) {
    $http.get('/Spring4-1/data/person').
        success(function(data) {
            $scope.greeting = data;
        });
}