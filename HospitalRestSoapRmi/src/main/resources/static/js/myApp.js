var app = angular.module("hospitalApp", []);

app.factory("patientService", function($http) {
	var self = this;
	return {
		chargerPatients : function(pageCourante, size) {
			return $http
					.get("/patients?page=" + pageCourante + "&size=" + size);
		},
		ajouterPatient : function(dataObj) {
			return $http.post("/patient", dataObj);
		},
		rechercherPatient : function(codePatient) {
			return $http.get("/patients/" + codePatient);
		},
		supprimerPatient : function(codePatient) {
			return $http.get("/patients/deletePatient/" + codePatient);
		}
	}

});
app.directive('ngConfirmClick', [ function() {
	return {
		link : function(scope, element, attr) {
			var msg = attr.ngConfirmClick || "Are you sure?";
			var clickAction = attr.confirmedClick;
			element.bind('click', function(event) {
				if (window.confirm(msg)) {
					scope.$eval(clickAction)
				}
			});
		}
	};
} ])
app.controller("hospitalController", [
		"$scope",
		"$http",
		"patientService",
		function($scope, $http, patientService) {
			$scope.patient = null;
			$scope.codePatient = null;

			/* Add Patient */

			$scope.addPatients = function() {

				var today = new Date();
				var dd = today.getDate();
				var mm = today.getMonth() + 1;
				var yyyy = today.getFullYear();
				if (dd < 10) {
					dd = '0' + dd;
				}
				if (mm < 10) {
					mm = '0' + mm;
				}
				var today = dd + '-' + mm + '-' + yyyy;
				var dataObj = {
					namePerson : $scope.namePerson,
					birthDate : $scope.birthDate,
					sickness : $scope.sickness,
					entryDate : today,
					gender : $scope.gender
				};
				patientService.ajouterPatient(dataObj).success(function(data) {
					console.log("Ok :" + data);
					$scope.namePerson = '';
					$scope.birthDate = '';
					$scope.sickness = '';
					$scope.gender = '';
					$scope.loadAllPatients();
					if ($scope.nombrePatientPageCourante)
						$scope.goToPage($pageCourante)
				})
			};

			/* charger les patients */
			$scope.pageCourante = 0;
			$scope.pagePatients = [];
			$scope.pageSize = 4;
			
			$scope.nombrePatientPageCourante = 0;
			$scope.loadAllPatients = function() {
				$scope.pages = [];
				patientService.chargerPatients($scope.pageCourante,
						$scope.pageSize).success(function(data) {
					$scope.pagePatients = data;
					$scope.pages = new Array(data.totalPages);
					$scope.nombrePatientPageCourante = data.nombrePatients;
				});

			};
			$scope.loadAllPatients();

			/* rechercher Patient */

			$scope.loadPatient = function() {
				patientService.rechercherPatient($scope.codePatient).success(
						function(data) {
							$scope.patient = data;
						})
			};
			/* supprimer Patient */

			$scope.deletePatient = function(codePerson) {

				patientService.supprimerPatient(codePerson).success(
						function(data) {
							$scope.loadAllPatients();
						});
			};

			$scope.goToPage = function(p) {
				$scope.pageCourante = p;
				$scope.loadAllPatients();
							

			}

		} ]);
