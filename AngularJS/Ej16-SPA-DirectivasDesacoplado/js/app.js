var countryApp = angular.module('countryApp', [
  'ngRoute',
  'countryControllers',
  'countriesFactory',
  'countryDirective'
]);

countryApp.config(function($routeProvider) {
  $routeProvider.
    when('/', {
      templateUrl: 'pages/country-list.html',
      controller: 'CountryListCtrl'
    }).
    when('/:countryId', {
      templateUrl: 'pages/country-detail.html',
      controller: 'CountryDetailCtrl'
    }).
    otherwise({
      redirectTo: '/'
    });
});