(
    function () {
        var app = angular.module('modone', []);
        
        
        app.controller('plan_control', function($scope,$http){
            var demo = document.getElementById("demo");
            $scope.o = {};
            
            $scope.coordinates = function() {
                $scope.o = document.getElementById("demo");
            };
        });
    }        
)
();